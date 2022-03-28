// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

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


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.Bullet3OpenCL.class)
public class b3PrefixScanFloat4CL extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3PrefixScanFloat4CL(Pointer p) { super(p); }

	public b3PrefixScanFloat4CL(@Cast("cl_context") Pointer ctx, @Cast("cl_device_id") Pointer device, @Cast("cl_command_queue") Pointer queue, int size/*=0*/) { super((Pointer)null); allocate(ctx, device, queue, size); }
	private native void allocate(@Cast("cl_context") Pointer ctx, @Cast("cl_device_id") Pointer device, @Cast("cl_command_queue") Pointer queue, int size/*=0*/);
	public b3PrefixScanFloat4CL(@Cast("cl_context") Pointer ctx, @Cast("cl_device_id") Pointer device, @Cast("cl_command_queue") Pointer queue) { super((Pointer)null); allocate(ctx, device, queue); }
	private native void allocate(@Cast("cl_context") Pointer ctx, @Cast("cl_device_id") Pointer device, @Cast("cl_command_queue") Pointer queue);

	public native void execute(@ByRef b3Vector3OCLArray src, @ByRef b3Vector3OCLArray dst, int n, b3Vector3 sum/*=0*/);
	public native void execute(@ByRef b3Vector3OCLArray src, @ByRef b3Vector3OCLArray dst, int n);
	public native void executeHost(@ByRef b3Vector3Array src, @ByRef b3Vector3Array dst, int n, b3Vector3 sum);
}
