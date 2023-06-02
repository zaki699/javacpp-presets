// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


@Namespace("cv::ocl") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class Device extends Pointer {
    static { Loader.load(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Device(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Device position(long position) {
        return (Device)super.position(position);
    }
    @Override public Device getPointer(long i) {
        return new Device((Pointer)this).offsetAddress(i);
    }

    public Device() { super((Pointer)null); allocate(); }
    @NoException private native void allocate();
    public Device(Pointer d) { super((Pointer)null); allocate(d); }
    private native void allocate(Pointer d);
    public Device(@Const @ByRef Device d) { super((Pointer)null); allocate(d); }
    private native void allocate(@Const @ByRef Device d);
    public native @ByRef @Name("operator =") Device put(@Const @ByRef Device d);

    public native void set(Pointer d);

    /** enum cv::ocl::Device:: */
    public static final int
        TYPE_DEFAULT     = (1 << 0),
        TYPE_CPU         = (1 << 1),
        TYPE_GPU         = (1 << 2),
        TYPE_ACCELERATOR = (1 << 3),
        TYPE_DGPU        = TYPE_GPU + (1 << 16),
        TYPE_IGPU        = TYPE_GPU + (1 << 17),
        TYPE_ALL         = 0xFFFFFFFF;

    public native @Str BytePointer name();
    public native @Str BytePointer extensions();
    public native @Cast("bool") boolean isExtensionSupported(@Str BytePointer extensionName);
    public native @Cast("bool") boolean isExtensionSupported(@Str String extensionName);
    public native @Str BytePointer version();
    public native @Str BytePointer vendorName();
    public native @Str BytePointer OpenCL_C_Version();
    public native @Str BytePointer OpenCLVersion();
    public native int deviceVersionMajor();
    public native int deviceVersionMinor();
    public native @Str BytePointer driverVersion();
    public native Pointer ptr();

    public native int type();

    public native int addressBits();
    public native @Cast("bool") boolean available();
    public native @Cast("bool") boolean compilerAvailable();
    public native @Cast("bool") boolean linkerAvailable();

    /** enum cv::ocl::Device:: */
    public static final int
        FP_DENORM = (1 << 0),
        FP_INF_NAN = (1 << 1),
        FP_ROUND_TO_NEAREST = (1 << 2),
        FP_ROUND_TO_ZERO = (1 << 3),
        FP_ROUND_TO_INF = (1 << 4),
        FP_FMA = (1 << 5),
        FP_SOFT_FLOAT = (1 << 6),
        FP_CORRECTLY_ROUNDED_DIVIDE_SQRT = (1 << 7);
    public native int doubleFPConfig();
    public native int singleFPConfig();
    public native int halfFPConfig();

    public native @Cast("bool") boolean endianLittle();
    public native @Cast("bool") boolean errorCorrectionSupport();

    /** enum cv::ocl::Device:: */
    public static final int
        EXEC_KERNEL = (1 << 0),
        EXEC_NATIVE_KERNEL = (1 << 1);
    public native int executionCapabilities();

    public native @Cast("size_t") long globalMemCacheSize();

    /** enum cv::ocl::Device:: */
    public static final int
        NO_CACHE = 0,
        READ_ONLY_CACHE = 1,
        READ_WRITE_CACHE = 2;
    public native int globalMemCacheType();
    public native int globalMemCacheLineSize();
    public native @Cast("size_t") long globalMemSize();

    public native @Cast("size_t") long localMemSize();
    /** enum cv::ocl::Device:: */
    public static final int
        NO_LOCAL_MEM = 0,
        LOCAL_IS_LOCAL = 1,
        LOCAL_IS_GLOBAL = 2;
    public native int localMemType();
    public native @Cast("bool") boolean hostUnifiedMemory();

    public native @Cast("bool") boolean imageSupport();

    public native @Cast("bool") boolean imageFromBufferSupport();
    public native @Cast("uint") int imagePitchAlignment();
    public native @Cast("uint") int imageBaseAddressAlignment();

    /** deprecated, use isExtensionSupported() method (probably with "cl_khr_subgroups" value) */
    public native @Cast("bool") boolean intelSubgroupsSupport();

    public native @Cast("size_t") long image2DMaxWidth();
    public native @Cast("size_t") long image2DMaxHeight();

    public native @Cast("size_t") long image3DMaxWidth();
    public native @Cast("size_t") long image3DMaxHeight();
    public native @Cast("size_t") long image3DMaxDepth();

    public native @Cast("size_t") long imageMaxBufferSize();
    public native @Cast("size_t") long imageMaxArraySize();

    /** enum cv::ocl::Device:: */
    public static final int
        UNKNOWN_VENDOR = 0,
        VENDOR_AMD = 1,
        VENDOR_INTEL = 2,
        VENDOR_NVIDIA = 3;
    public native int vendorID();
    // FIXIT
    // dev.isAMD() doesn't work for OpenCL CPU devices from AMD OpenCL platform.
    // This method should use platform name instead of vendor name.
    // After fix restore code in arithm.cpp: ocl_compare()
    public native @Cast("bool") boolean isAMD();
    public native @Cast("bool") boolean isIntel();
    public native @Cast("bool") boolean isNVidia();

    public native int maxClockFrequency();
    public native int maxComputeUnits();
    public native int maxConstantArgs();
    public native @Cast("size_t") long maxConstantBufferSize();

    public native @Cast("size_t") long maxMemAllocSize();
    public native @Cast("size_t") long maxParameterSize();

    public native int maxReadImageArgs();
    public native int maxWriteImageArgs();
    public native int maxSamplers();

    public native @Cast("size_t") long maxWorkGroupSize();
    public native int maxWorkItemDims();
    public native void maxWorkItemSizes(@Cast("size_t*") SizeTPointer arg0);

    public native int memBaseAddrAlign();

    public native int nativeVectorWidthChar();
    public native int nativeVectorWidthShort();
    public native int nativeVectorWidthInt();
    public native int nativeVectorWidthLong();
    public native int nativeVectorWidthFloat();
    public native int nativeVectorWidthDouble();
    public native int nativeVectorWidthHalf();

    public native int preferredVectorWidthChar();
    public native int preferredVectorWidthShort();
    public native int preferredVectorWidthInt();
    public native int preferredVectorWidthLong();
    public native int preferredVectorWidthFloat();
    public native int preferredVectorWidthDouble();
    public native int preferredVectorWidthHalf();

    public native @Cast("size_t") long printfBufferSize();
    public native @Cast("size_t") long profilingTimerResolution();

    public static native @Const @ByRef Device getDefault();

    /**
     * @param d OpenCL handle (cl_device_id). clRetainDevice() is called on success.
     *
     * \note Ownership of the passed device is passed to OpenCV on success.
     * The caller should additionally call {@code clRetainDevice} on it if it intends
     * to continue using the device.
      */
    public static native @ByVal Device fromHandle(Pointer d);

    @Opaque public static class Impl extends Pointer {
        /** Empty constructor. Calls {@code super((Pointer)null)}. */
        public Impl() { super((Pointer)null); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Impl(Pointer p) { super(p); }
    }
    public native Impl getImpl();
    public native @Cast("bool") boolean empty();
}
