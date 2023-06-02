// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

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


@Name("b3OpenCLArray<b3RayInfo>") @NoOffset @Properties(inherit = org.bytedeco.bullet.presets.Bullet3OpenCL.class)
public class b3RayInfoOCLArray extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3RayInfoOCLArray(Pointer p) { super(p); }

	public b3RayInfoOCLArray(@Cast("cl_context") Pointer ctx, @Cast("cl_command_queue") Pointer queue, @Cast("size_t") long initialCapacity/*=0*/, @Cast("bool") boolean allowGrowingCapacity/*=true*/) { super((Pointer)null); allocate(ctx, queue, initialCapacity, allowGrowingCapacity); }
	private native void allocate(@Cast("cl_context") Pointer ctx, @Cast("cl_command_queue") Pointer queue, @Cast("size_t") long initialCapacity/*=0*/, @Cast("bool") boolean allowGrowingCapacity/*=true*/);
	public b3RayInfoOCLArray(@Cast("cl_context") Pointer ctx, @Cast("cl_command_queue") Pointer queue) { super((Pointer)null); allocate(ctx, queue); }
	private native void allocate(@Cast("cl_context") Pointer ctx, @Cast("cl_command_queue") Pointer queue);

	/**this is an error-prone method with no error checking, be careful! */
	public native void setFromOpenCLBuffer(@Cast("cl_mem") Pointer buffer, @Cast("size_t") long sizeInElements);

	// we could enable this assignment, but need to make sure to avoid accidental deep copies
	//	b3OpenCLArray<T>& operator=(const b3AlignedObjectArray<T>& src)
	//	{
	//		copyFromArray(src);
	//		return *this;
	//	}

	public native @Cast("cl_mem") Pointer getBufferCL();

	public native @Cast("bool") boolean push_back(@Const @ByRef b3RayInfo _Val, @Cast("bool") boolean waitForCompletion/*=true*/);
	public native @Cast("bool") boolean push_back(@Const @ByRef b3RayInfo _Val);

	public native @ByVal b3RayInfo forcedAt(@Cast("size_t") long n);

	public native @ByVal b3RayInfo at(@Cast("size_t") long n);

	public native @Cast("bool") boolean resize(@Cast("size_t") long newsize, @Cast("bool") boolean copyOldContents/*=true*/);
	public native @Cast("bool") boolean resize(@Cast("size_t") long newsize);

	public native @Cast("size_t") long size();

	public native @Cast("size_t") @Name("capacity") long _capacity();

	public native @Cast("bool") boolean reserve(@Cast("size_t") long _Count, @Cast("bool") boolean copyOldContents/*=true*/);
	public native @Cast("bool") boolean reserve(@Cast("size_t") long _Count);

	public native void copyToCL(@Cast("cl_mem") Pointer destination, @Cast("size_t") long numElements, @Cast("size_t") long firstElem/*=0*/, @Cast("size_t") long dstOffsetInElems/*=0*/);
	public native void copyToCL(@Cast("cl_mem") Pointer destination, @Cast("size_t") long numElements);

	public native void copyFromHost(@Const @ByRef b3RayInfoArray srcArray, @Cast("bool") boolean waitForCompletion/*=true*/);
	public native void copyFromHost(@Const @ByRef b3RayInfoArray srcArray);

	public native void copyFromHostPointer(@Const b3RayInfo src, @Cast("size_t") long numElems, @Cast("size_t") long destFirstElem/*=0*/, @Cast("bool") boolean waitForCompletion/*=true*/);
	public native void copyFromHostPointer(@Const b3RayInfo src, @Cast("size_t") long numElems);

	public native void copyToHost(@ByRef b3RayInfoArray destArray, @Cast("bool") boolean waitForCompletion/*=true*/);
	public native void copyToHost(@ByRef b3RayInfoArray destArray);

	public native void copyToHostPointer(b3RayInfo destPtr, @Cast("size_t") long numElem, @Cast("size_t") long srcFirstElem/*=0*/, @Cast("bool") boolean waitForCompletion/*=true*/);
	public native void copyToHostPointer(b3RayInfo destPtr, @Cast("size_t") long numElem);

	public native void copyFromOpenCLArray(@Const @ByRef b3RayInfoOCLArray src);
}
