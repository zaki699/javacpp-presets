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


@Properties(inherit = org.bytedeco.bullet.presets.Bullet3OpenCL.class)
public class b3OpenCLDeviceInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b3OpenCLDeviceInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3OpenCLDeviceInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3OpenCLDeviceInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b3OpenCLDeviceInfo position(long position) {
        return (b3OpenCLDeviceInfo)super.position(position);
    }
    @Override public b3OpenCLDeviceInfo getPointer(long i) {
        return new b3OpenCLDeviceInfo((Pointer)this).offsetAddress(i);
    }

	public native @Cast("char") byte m_deviceName(int i); public native b3OpenCLDeviceInfo m_deviceName(int i, byte setter);
	@MemberGetter public native @Cast("char*") BytePointer m_deviceName();
	public native @Cast("char") byte m_deviceVendor(int i); public native b3OpenCLDeviceInfo m_deviceVendor(int i, byte setter);
	@MemberGetter public native @Cast("char*") BytePointer m_deviceVendor();
	public native @Cast("char") byte m_driverVersion(int i); public native b3OpenCLDeviceInfo m_driverVersion(int i, byte setter);
	@MemberGetter public native @Cast("char*") BytePointer m_driverVersion();
	public native @Cast("char") byte m_deviceExtensions(int i); public native b3OpenCLDeviceInfo m_deviceExtensions(int i, byte setter);
	@MemberGetter public native @Cast("char*") BytePointer m_deviceExtensions();

	public native @Cast("cl_device_type") long m_deviceType(); public native b3OpenCLDeviceInfo m_deviceType(long setter);
	public native @Cast("cl_uint") int m_computeUnits(); public native b3OpenCLDeviceInfo m_computeUnits(int setter);
	public native @Cast("size_t") long m_workitemDims(); public native b3OpenCLDeviceInfo m_workitemDims(long setter);
	public native @Cast("size_t") long m_workItemSize(int i); public native b3OpenCLDeviceInfo m_workItemSize(int i, long setter);
	@MemberGetter public native @Cast("size_t*") SizeTPointer m_workItemSize();
	public native @Cast("size_t") long m_image2dMaxWidth(); public native b3OpenCLDeviceInfo m_image2dMaxWidth(long setter);
	public native @Cast("size_t") long m_image2dMaxHeight(); public native b3OpenCLDeviceInfo m_image2dMaxHeight(long setter);
	public native @Cast("size_t") long m_image3dMaxWidth(); public native b3OpenCLDeviceInfo m_image3dMaxWidth(long setter);
	public native @Cast("size_t") long m_image3dMaxHeight(); public native b3OpenCLDeviceInfo m_image3dMaxHeight(long setter);
	public native @Cast("size_t") long m_image3dMaxDepth(); public native b3OpenCLDeviceInfo m_image3dMaxDepth(long setter);
	public native @Cast("size_t") long m_workgroupSize(); public native b3OpenCLDeviceInfo m_workgroupSize(long setter);
	public native @Cast("cl_uint") int m_clockFrequency(); public native b3OpenCLDeviceInfo m_clockFrequency(int setter);
	public native @Cast("cl_ulong") long m_constantBufferSize(); public native b3OpenCLDeviceInfo m_constantBufferSize(long setter);
	public native @Cast("cl_ulong") long m_localMemSize(); public native b3OpenCLDeviceInfo m_localMemSize(long setter);
	public native @Cast("cl_ulong") long m_globalMemSize(); public native b3OpenCLDeviceInfo m_globalMemSize(long setter);
	public native @Cast("cl_bool") int m_errorCorrectionSupport(); public native b3OpenCLDeviceInfo m_errorCorrectionSupport(int setter);
	public native @Cast("cl_device_local_mem_type") int m_localMemType(); public native b3OpenCLDeviceInfo m_localMemType(int setter);
	public native @Cast("cl_uint") int m_maxReadImageArgs(); public native b3OpenCLDeviceInfo m_maxReadImageArgs(int setter);
	public native @Cast("cl_uint") int m_maxWriteImageArgs(); public native b3OpenCLDeviceInfo m_maxWriteImageArgs(int setter);

	public native @Cast("cl_uint") int m_addressBits(); public native b3OpenCLDeviceInfo m_addressBits(int setter);
	public native @Cast("cl_ulong") long m_maxMemAllocSize(); public native b3OpenCLDeviceInfo m_maxMemAllocSize(long setter);
	public native @Cast("cl_command_queue_properties") long m_queueProperties(); public native b3OpenCLDeviceInfo m_queueProperties(long setter);
	public native @Cast("cl_bool") int m_imageSupport(); public native b3OpenCLDeviceInfo m_imageSupport(int setter);
	public native @Cast("cl_uint") int m_vecWidthChar(); public native b3OpenCLDeviceInfo m_vecWidthChar(int setter);
	public native @Cast("cl_uint") int m_vecWidthShort(); public native b3OpenCLDeviceInfo m_vecWidthShort(int setter);
	public native @Cast("cl_uint") int m_vecWidthInt(); public native b3OpenCLDeviceInfo m_vecWidthInt(int setter);
	public native @Cast("cl_uint") int m_vecWidthLong(); public native b3OpenCLDeviceInfo m_vecWidthLong(int setter);
	public native @Cast("cl_uint") int m_vecWidthFloat(); public native b3OpenCLDeviceInfo m_vecWidthFloat(int setter);
	public native @Cast("cl_uint") int m_vecWidthDouble(); public native b3OpenCLDeviceInfo m_vecWidthDouble(int setter);

}
