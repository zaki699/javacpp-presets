// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3OpenCL;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;
import org.bytedeco.bullet.Bullet3Collision.*;
import static org.bytedeco.bullet.global.Bullet3Collision.*;
import org.bytedeco.bullet.Bullet3Dynamics.*;
import static org.bytedeco.bullet.global.Bullet3Dynamics.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.Bullet3OpenCL.*;

@Name("b3AlignedObjectArray<b3OptimizedBvh*>") @NoOffset @Properties(inherit = org.bytedeco.bullet.presets.Bullet3OpenCL.class)
public class b3OptimizedBvhArray extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3OptimizedBvhArray(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3OptimizedBvhArray(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public b3OptimizedBvhArray position(long position) {
        return (b3OptimizedBvhArray)super.position(position);
    }
    @Override public b3OptimizedBvhArray getPointer(long i) {
        return new b3OptimizedBvhArray((Pointer)this).offsetAddress(i);
    }

	public native @ByRef @Name("operator =") b3OptimizedBvhArray put(@Const @ByRef b3OptimizedBvhArray other);
	public b3OptimizedBvhArray() { super((Pointer)null); allocate(); }
	private native void allocate();

	/**Generally it is best to avoid using the copy constructor of an b3AlignedObjectArray, and use a (const) reference to the array instead. */
	public b3OptimizedBvhArray(@Const @ByRef b3OptimizedBvhArray otherArray) { super((Pointer)null); allocate(otherArray); }
	private native void allocate(@Const @ByRef b3OptimizedBvhArray otherArray);

	/** return the number of elements in the array */
	public native int size();

	public native @ByPtrRef b3OptimizedBvh at(int n);

	public native @ByPtrRef @Name("operator []") b3OptimizedBvh get(int n);

	/**clear the array, deallocated memory. Generally it is better to use array.resize(0), to reduce performance overhead of run-time memory (de)allocations. */
	public native void clear();

	public native void pop_back();

	/**resize changes the number of elements in the array. If the new size is larger, the new elements will be constructed using the optional second argument.
	 * when the new number of elements is smaller, the destructor will be called, but memory will not be freed, to reduce performance overhead of run-time memory (de)allocations. */
	public native void resizeNoInitialize(int newsize);

	public native void resize(int newsize, @ByPtrRef b3OptimizedBvh fillData/*=b3OptimizedBvh*()*/);
	public native void resize(int newsize);
	public native @ByPtrRef b3OptimizedBvh expandNonInitializing();

	public native @ByPtrRef b3OptimizedBvh expand(@ByPtrRef b3OptimizedBvh fillValue/*=b3OptimizedBvh*()*/);
	public native @ByPtrRef b3OptimizedBvh expand();

	public native void push_back(@ByPtrRef b3OptimizedBvh _Val);

	/** return the pre-allocated (reserved) elements, this is at least as large as the total number of elements,see size() and reserve() */
	public native @Name("capacity") int _capacity();

	public native void reserve(int _Count);

	/**heap sort from http://www.csse.monash.edu.au/~lloyd/tildeAlgDS/Sort/Heap/ */ /*downHeap*/

	public native void swap(int index0, int index1);

	/**non-recursive binary search, assumes sorted array */
	public native int findBinarySearch(@ByPtrRef b3OptimizedBvh key);

	public native int findLinearSearch(@ByPtrRef b3OptimizedBvh key);

	public native int findLinearSearch2(@ByPtrRef b3OptimizedBvh key);

	public native void remove(@ByPtrRef b3OptimizedBvh key);

	//PCK: whole function
	public native void initializeFromBuffer(Pointer buffer, int size, int _capacity);

	public native void copyFromArray(@Const @ByRef b3OptimizedBvhArray otherArray);

	public native void removeAtIndex(int index);
}
