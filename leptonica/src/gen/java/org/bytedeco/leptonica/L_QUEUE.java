// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.leptonica.global.leptonica.*;


/**
 * \file queue.h
 *
 * <pre>
 *      Expandable pointer queue for arbitrary void* data.
 *
 *      The L_Queue is a fifo that implements a queue of void* pointers.
 *      It can be used to hold a queue of any type of struct.
 *
 *      Internally, it maintains two counters:
 *          nhead:  location of head (in ptrs) from the beginning
 *                  of the array.
 *          nelem:  number of ptr elements stored in the queue.
 *
 *      The element at the head of the queue, which is the next to
 *      be removed, is array[nhead].  The location at the tail of the
 *      queue to which the next element will be added is
 *      array[nhead + nelem].
 *
 *      As items are added to the queue, nelem increases.
 *      As items are removed, nhead increases and nelem decreases.
 *      Any time the tail reaches the end of the allocated array,
 *      all the pointers are shifted to the left, so that the head
 *      is at the beginning of the array.
 *      If the array becomes more than 3/4 full, it doubles in size.
 *
 *      The auxiliary stack can be used in a wrapper for re-using
 *      items popped from the queue.  It is not made by default.
 *
 *      For further implementation details, see queue.c.
 * </pre>
 */

/** Expandable pointer queue for arbitrary void* data */
@Name("L_Queue") @Properties(inherit = org.bytedeco.leptonica.presets.leptonica.class)
public class L_QUEUE extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public L_QUEUE() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public L_QUEUE(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public L_QUEUE(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public L_QUEUE position(long position) {
        return (L_QUEUE)super.position(position);
    }
    @Override public L_QUEUE getPointer(long i) {
        return new L_QUEUE((Pointer)this).offsetAddress(i);
    }

    /** size of allocated ptr array            */
    public native @Cast("l_int32") int nalloc(); public native L_QUEUE nalloc(int setter);
    /** location of head (in ptrs) from the    */
    /** beginning of the array                 */
    public native @Cast("l_int32") int nhead(); public native L_QUEUE nhead(int setter);
    /** number of elements stored in the queue */
    public native @Cast("l_int32") int nelem(); public native L_QUEUE nelem(int setter);
    /** ptr array                              */
    public native Pointer array(int i); public native L_QUEUE array(int i, Pointer setter);
    public native @Cast("void**") PointerPointer array(); public native L_QUEUE array(PointerPointer setter);
    /** auxiliary stack                        */
    public native L_STACK stack(); public native L_QUEUE stack(L_STACK setter);

}
