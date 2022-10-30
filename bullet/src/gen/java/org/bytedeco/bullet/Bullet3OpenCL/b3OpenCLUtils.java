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


/**C++ API for OpenCL utilities: convenience functions */
@Properties(inherit = org.bytedeco.bullet.presets.Bullet3OpenCL.class)
public class b3OpenCLUtils extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b3OpenCLUtils() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3OpenCLUtils(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3OpenCLUtils(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b3OpenCLUtils position(long position) {
        return (b3OpenCLUtils)super.position(position);
    }
    @Override public b3OpenCLUtils getPointer(long i) {
        return new b3OpenCLUtils((Pointer)this).offsetAddress(i);
    }

	/** CL Context optionally takes a GL context. This is a generic type because we don't really want this code
	 *  to have to understand GL types. It is a HGLRC in _WIN32 or a GLXContext otherwise. */
	public static native @Cast("cl_context") Pointer createContextFromType(@Cast("cl_device_type") long deviceType, @Cast("cl_int*") IntPointer pErrNum, Pointer pGLCtx/*=0*/, Pointer pGLDC/*=0*/, int preferredDeviceIndex/*=-1*/, int preferredPlatformIndex/*=-1*/, @Cast("cl_platform_id*") PointerPointer platformId/*=0*/);
	public static native @Cast("cl_context") Pointer createContextFromType(@Cast("cl_device_type") long deviceType, @Cast("cl_int*") IntPointer pErrNum);
	public static native @Cast("cl_context") Pointer createContextFromType(@Cast("cl_device_type") long deviceType, @Cast("cl_int*") IntBuffer pErrNum, Pointer pGLCtx/*=0*/, Pointer pGLDC/*=0*/, int preferredDeviceIndex/*=-1*/, int preferredPlatformIndex/*=-1*/, @Cast("cl_platform_id*") PointerPointer platformId/*=0*/);
	public static native @Cast("cl_context") Pointer createContextFromType(@Cast("cl_device_type") long deviceType, @Cast("cl_int*") IntBuffer pErrNum);
	public static native @Cast("cl_context") Pointer createContextFromType(@Cast("cl_device_type") long deviceType, @Cast("cl_int*") int[] pErrNum, Pointer pGLCtx/*=0*/, Pointer pGLDC/*=0*/, int preferredDeviceIndex/*=-1*/, int preferredPlatformIndex/*=-1*/, @Cast("cl_platform_id*") PointerPointer platformId/*=0*/);
	public static native @Cast("cl_context") Pointer createContextFromType(@Cast("cl_device_type") long deviceType, @Cast("cl_int*") int[] pErrNum);

	public static native int getNumDevices(@Cast("cl_context") Pointer cxMainContext);
	public static native @Cast("cl_device_id") Pointer getDevice(@Cast("cl_context") Pointer cxMainContext, int nr);

	public static native void getDeviceInfo(@Cast("cl_device_id") Pointer device, b3OpenCLDeviceInfo info);

	public static native void printDeviceInfo(@Cast("cl_device_id") Pointer device);

	public static native @Cast("cl_kernel") Pointer compileCLKernelFromString(@Cast("cl_context") Pointer clContext, @Cast("cl_device_id") Pointer device, @Cast("const char*") BytePointer kernelSource, @Cast("const char*") BytePointer kernelName, @Cast("cl_int*") IntPointer pErrNum/*=0*/, @Cast("cl_program") Pointer prog/*=0*/, @Cast("const char*") BytePointer additionalMacros/*=""*/);
	public static native @Cast("cl_kernel") Pointer compileCLKernelFromString(@Cast("cl_context") Pointer clContext, @Cast("cl_device_id") Pointer device, @Cast("const char*") BytePointer kernelSource, @Cast("const char*") BytePointer kernelName);
	public static native @Cast("cl_kernel") Pointer compileCLKernelFromString(@Cast("cl_context") Pointer clContext, @Cast("cl_device_id") Pointer device, String kernelSource, String kernelName, @Cast("cl_int*") IntBuffer pErrNum/*=0*/, @Cast("cl_program") Pointer prog/*=0*/, String additionalMacros/*=""*/);
	public static native @Cast("cl_kernel") Pointer compileCLKernelFromString(@Cast("cl_context") Pointer clContext, @Cast("cl_device_id") Pointer device, String kernelSource, String kernelName);
	public static native @Cast("cl_kernel") Pointer compileCLKernelFromString(@Cast("cl_context") Pointer clContext, @Cast("cl_device_id") Pointer device, @Cast("const char*") BytePointer kernelSource, @Cast("const char*") BytePointer kernelName, @Cast("cl_int*") int[] pErrNum/*=0*/, @Cast("cl_program") Pointer prog/*=0*/, @Cast("const char*") BytePointer additionalMacros/*=""*/);
	public static native @Cast("cl_kernel") Pointer compileCLKernelFromString(@Cast("cl_context") Pointer clContext, @Cast("cl_device_id") Pointer device, String kernelSource, String kernelName, @Cast("cl_int*") IntPointer pErrNum/*=0*/, @Cast("cl_program") Pointer prog/*=0*/, String additionalMacros/*=""*/);
	public static native @Cast("cl_kernel") Pointer compileCLKernelFromString(@Cast("cl_context") Pointer clContext, @Cast("cl_device_id") Pointer device, @Cast("const char*") BytePointer kernelSource, @Cast("const char*") BytePointer kernelName, @Cast("cl_int*") IntBuffer pErrNum/*=0*/, @Cast("cl_program") Pointer prog/*=0*/, @Cast("const char*") BytePointer additionalMacros/*=""*/);
	public static native @Cast("cl_kernel") Pointer compileCLKernelFromString(@Cast("cl_context") Pointer clContext, @Cast("cl_device_id") Pointer device, String kernelSource, String kernelName, @Cast("cl_int*") int[] pErrNum/*=0*/, @Cast("cl_program") Pointer prog/*=0*/, String additionalMacros/*=""*/);

	//optional
	public static native @Cast("cl_program") Pointer compileCLProgramFromString(@Cast("cl_context") Pointer clContext, @Cast("cl_device_id") Pointer device, @Cast("const char*") BytePointer kernelSource, @Cast("cl_int*") IntPointer pErrNum/*=0*/, @Cast("const char*") BytePointer additionalMacros/*=""*/, @Cast("const char*") BytePointer srcFileNameForCaching/*=0*/, @Cast("bool") boolean disableBinaryCaching/*=false*/);
	public static native @Cast("cl_program") Pointer compileCLProgramFromString(@Cast("cl_context") Pointer clContext, @Cast("cl_device_id") Pointer device, @Cast("const char*") BytePointer kernelSource);
	public static native @Cast("cl_program") Pointer compileCLProgramFromString(@Cast("cl_context") Pointer clContext, @Cast("cl_device_id") Pointer device, String kernelSource, @Cast("cl_int*") IntBuffer pErrNum/*=0*/, String additionalMacros/*=""*/, String srcFileNameForCaching/*=0*/, @Cast("bool") boolean disableBinaryCaching/*=false*/);
	public static native @Cast("cl_program") Pointer compileCLProgramFromString(@Cast("cl_context") Pointer clContext, @Cast("cl_device_id") Pointer device, String kernelSource);
	public static native @Cast("cl_program") Pointer compileCLProgramFromString(@Cast("cl_context") Pointer clContext, @Cast("cl_device_id") Pointer device, @Cast("const char*") BytePointer kernelSource, @Cast("cl_int*") int[] pErrNum/*=0*/, @Cast("const char*") BytePointer additionalMacros/*=""*/, @Cast("const char*") BytePointer srcFileNameForCaching/*=0*/, @Cast("bool") boolean disableBinaryCaching/*=false*/);
	public static native @Cast("cl_program") Pointer compileCLProgramFromString(@Cast("cl_context") Pointer clContext, @Cast("cl_device_id") Pointer device, String kernelSource, @Cast("cl_int*") IntPointer pErrNum/*=0*/, String additionalMacros/*=""*/, String srcFileNameForCaching/*=0*/, @Cast("bool") boolean disableBinaryCaching/*=false*/);
	public static native @Cast("cl_program") Pointer compileCLProgramFromString(@Cast("cl_context") Pointer clContext, @Cast("cl_device_id") Pointer device, @Cast("const char*") BytePointer kernelSource, @Cast("cl_int*") IntBuffer pErrNum/*=0*/, @Cast("const char*") BytePointer additionalMacros/*=""*/, @Cast("const char*") BytePointer srcFileNameForCaching/*=0*/, @Cast("bool") boolean disableBinaryCaching/*=false*/);
	public static native @Cast("cl_program") Pointer compileCLProgramFromString(@Cast("cl_context") Pointer clContext, @Cast("cl_device_id") Pointer device, String kernelSource, @Cast("cl_int*") int[] pErrNum/*=0*/, String additionalMacros/*=""*/, String srcFileNameForCaching/*=0*/, @Cast("bool") boolean disableBinaryCaching/*=false*/);

	//the following optional APIs provide access using specific platform information
	public static native int getNumPlatforms(@Cast("cl_int*") IntPointer pErrNum/*=0*/);
	public static native int getNumPlatforms();
	public static native int getNumPlatforms(@Cast("cl_int*") IntBuffer pErrNum/*=0*/);
	public static native int getNumPlatforms(@Cast("cl_int*") int[] pErrNum/*=0*/);
	/**get the nr'th platform, where nr is in the range [0..getNumPlatforms) */
	public static native @Cast("cl_platform_id") Pointer getPlatform(int nr, @Cast("cl_int*") IntPointer pErrNum/*=0*/);
	public static native @Cast("cl_platform_id") Pointer getPlatform(int nr);
	public static native @Cast("cl_platform_id") Pointer getPlatform(int nr, @Cast("cl_int*") IntBuffer pErrNum/*=0*/);
	public static native @Cast("cl_platform_id") Pointer getPlatform(int nr, @Cast("cl_int*") int[] pErrNum/*=0*/);

	public static native void getPlatformInfo(@Cast("cl_platform_id") Pointer platform, b3OpenCLPlatformInfo platformInfo);

	public static native void printPlatformInfo(@Cast("cl_platform_id") Pointer platform);

	public static native @Cast("const char*") BytePointer getSdkVendorName();
	public static native @Cast("cl_context") Pointer createContextFromPlatform(@Cast("cl_platform_id") Pointer platform, @Cast("cl_device_type") long deviceType, @Cast("cl_int*") IntPointer pErrNum, Pointer pGLCtx/*=0*/, Pointer pGLDC/*=0*/, int preferredDeviceIndex/*=-1*/, int preferredPlatformIndex/*=-1*/);
	public static native @Cast("cl_context") Pointer createContextFromPlatform(@Cast("cl_platform_id") Pointer platform, @Cast("cl_device_type") long deviceType, @Cast("cl_int*") IntPointer pErrNum);
	public static native @Cast("cl_context") Pointer createContextFromPlatform(@Cast("cl_platform_id") Pointer platform, @Cast("cl_device_type") long deviceType, @Cast("cl_int*") IntBuffer pErrNum, Pointer pGLCtx/*=0*/, Pointer pGLDC/*=0*/, int preferredDeviceIndex/*=-1*/, int preferredPlatformIndex/*=-1*/);
	public static native @Cast("cl_context") Pointer createContextFromPlatform(@Cast("cl_platform_id") Pointer platform, @Cast("cl_device_type") long deviceType, @Cast("cl_int*") IntBuffer pErrNum);
	public static native @Cast("cl_context") Pointer createContextFromPlatform(@Cast("cl_platform_id") Pointer platform, @Cast("cl_device_type") long deviceType, @Cast("cl_int*") int[] pErrNum, Pointer pGLCtx/*=0*/, Pointer pGLDC/*=0*/, int preferredDeviceIndex/*=-1*/, int preferredPlatformIndex/*=-1*/);
	public static native @Cast("cl_context") Pointer createContextFromPlatform(@Cast("cl_platform_id") Pointer platform, @Cast("cl_device_type") long deviceType, @Cast("cl_int*") int[] pErrNum);
	public static native void setCachePath(@Cast("const char*") BytePointer path);
	public static native void setCachePath(String path);
}
