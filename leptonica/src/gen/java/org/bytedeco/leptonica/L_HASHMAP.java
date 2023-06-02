// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.leptonica.global.leptonica.*;


/*
 * \file hashmap.h
 *
 * <pre>
 *  Contains the following structs:
 *      struct L_Hashmap
 *      struct L_Hashitem
 *
 *  Goal:
 *      You have a set of objects (integers, strings, pts, whatever),
 *      and you want to store them in a data structure (L_Hashmap) that allows
 *      O(1) to find, insert and count the occurrences of such an object.
 *      The tool is a hash map.  This is not ordered, unlike the O(log n)
 *      ordered map (L_Amap), which is implemented by an rbtree.
 *
 *  In slightly more detail:
 *      Store the set of objects in an array, which in general can be
 *      held in a pointer array (L_Ptra).  You need a hash function that
 *      will generate a unique uint64 key from each object.  For our simple
 *      built-in arrays, such as float, double and Pta (points), these hash
 *      functions are in utils1.c.  Then for each object in the array,
 *      you store the key and the index to the array of objects (the val)
 *      in a list of hashitems in the hash table, where the specific
 *      list is determined by the key (specifically, the mod of the key
 *      with the size of the hashtable).
 *
 *  In yet more detail:
 *  (1) The design loosely follows the design of a hashmap in "The Practice
 *      of Programming by Brian Kernighan and Rob Pike, Addison Wesley, 1999.
 *  (2) The L_Hashmap contains a hashtable with a prime number of pointers
 *      to lists of hashitems.  The lookup function takes a key and a value,
 *      which are both 64-bit unsigned integers.  The key has been generated
 *      by hashing the input object in a way that avoids collisions between
 *      different objects. The value is an integer that identifies the
 *      object; typically it is the index into an array of objects.
 *      The hashtable size is a prime number, and an index into the table
 *      is made from the key by taking its mod with the hashtable size.
 *      The index points to a list of hashitems, which have all been hashed
 *      by the mod function into the same index in the table.
 *      Because the key is expected to be randomly distributed in uint64,
 *      the table indices should be uniformly distributed, resulting in
 *      approximately the same number of items being placed in each of
 *      these lists.  The list of hashitems is traversed, comparing the
 *      input uint64 key in the lookup() function with the key stored in
 *      each hashitem.  If a hashitem is found with a matching key,
 *      return a pointer to that hashitem.  If not found and the op is
 *      L_HASH_CREATE, make a new hash item, add it to the list, and
 *      return a pointer to it.
 *  (3) The count field in the hashitem gives the number of times the
 *      key has been seen when storing key/value pairs.
 *  (4) The val field is the index into an array of the objects.  When
 *      the hashmap is initially made, it is the index of the first item
 *      seen with its key.
 *  (5) For the hashmap to work efficiently, the lists must not become too
 *      long.  Because in general you do not know the number of objects
 *      in advance, it is important to be able to dynamically resize
 *      the hashtable as it grows.  The hashmap is initialized with
 *      room for some number of hashitems and the maximum average list
 *      size.  These two numbers determine the size of the hashtable,
 *      which is constrained to be a prime number.  As the hashtable grows,
 *      if the average occupancy exceeds the input %maxocc, the hashtable
 *      size is approximately doubled and the existing items are re-hashed
 *      into it, mod the new (prime number) table size.
 * </pre>
 */

/*------------------------------------------------------------------------*
 *                           Hash map structs                             *
 *------------------------------------------------------------------------*/
/** General hash map */
@Name("L_Hashmap") @Properties(inherit = org.bytedeco.leptonica.presets.leptonica.class)
public class L_HASHMAP extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public L_HASHMAP() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public L_HASHMAP(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public L_HASHMAP(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public L_HASHMAP position(long position) {
        return (L_HASHMAP)super.position(position);
    }
    @Override public L_HASHMAP getPointer(long i) {
        return new L_HASHMAP((Pointer)this).offsetAddress(i);
    }

    /** number of stored items              */
    public native @Cast("l_int32") int nitems(); public native L_HASHMAP nitems(int setter);
    /** number of items to be stored        */
    /** before resizing the hashmap         */
    public native @Cast("l_int32") int ntogo(); public native L_HASHMAP ntogo(int setter);
    /** max average occupancy allowed       */
    public native @Cast("l_int32") int maxocc(); public native L_HASHMAP maxocc(int setter);
    /** array of hash item ptrs             */
    public native L_HASHITEM hashtab(int i); public native L_HASHMAP hashtab(int i, L_HASHITEM setter);
    public native @Cast("L_Hashitem**") PointerPointer hashtab(); public native L_HASHMAP hashtab(PointerPointer setter);
    /** size of array of hash item ptrs     */
    public native @Cast("l_int32") int tabsize(); public native L_HASHMAP tabsize(int setter);
}
