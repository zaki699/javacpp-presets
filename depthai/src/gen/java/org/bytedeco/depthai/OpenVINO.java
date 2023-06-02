// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.depthai.global.depthai.*;


/** Support for basic OpenVINO related actions like version identification of neural network blobs,... */
@Namespace("dai") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class OpenVINO extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public OpenVINO() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OpenVINO(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OpenVINO(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public OpenVINO position(long position) {
        return (OpenVINO)super.position(position);
    }
    @Override public OpenVINO getPointer(long i) {
        return new OpenVINO((Pointer)this).offsetAddress(i);
    }

    /** OpenVINO Version supported version information */
    /** enum dai::OpenVINO::Version */
    public static final int VERSION_2020_3 = 0, VERSION_2020_4 = 1, VERSION_2021_1 = 2, VERSION_2021_2 = 3, VERSION_2021_3 = 4, VERSION_2021_4 = 5, VERSION_2022_1 = 6, VERSION_UNIVERSAL = 7;

    /** OpenVINO Blob */
    @NoOffset public static class Blob extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Blob(Pointer p) { super(p); }
    
        /**
         * \brief Construct a new Blob from data in memory
         *
         * @param data In memory blob
         */
        public Blob(@ByVal ByteVector data) { super((Pointer)null); allocate(data); }
        private native void allocate(@ByVal ByteVector data);
        /**
         * \brief Construct a new Blob by loading from a filesystem path
         *
         * @param path Filesystem path to the blob
         */
        public Blob(@Const @ByRef Path path) { super((Pointer)null); allocate(path); }
        private native void allocate(@Const @ByRef Path path);

        /** OpenVINO version */
        public native @Cast("dai::OpenVINO::Version") int version(); public native Blob version(int setter);
        /** Map of input names to additional information */
        public native @ByRef StringTensorInfoMap networkInputs(); public native Blob networkInputs(StringTensorInfoMap setter);
        /** Map of output names to additional information */
        public native @ByRef StringTensorInfoMap networkOutputs(); public native Blob networkOutputs(StringTensorInfoMap setter);
        /** Number of network stages */
        public native @Cast("uint32_t") int stageCount(); public native Blob stageCount(int setter);
        /** Number of shaves the blob was compiled for */
        public native @Cast("uint32_t") int numShaves(); public native Blob numShaves(int setter);
        /** Number of CMX slices the blob was compiled for */
        public native @Cast("uint32_t") int numSlices(); public native Blob numSlices(int setter);
        /** Blob data */
        public native @ByRef ByteVector data(); public native Blob data(ByteVector setter);
    }

    /** Main OpenVINO version */
    @MemberGetter public static native @Cast("const dai::OpenVINO::Version") int DEFAULT_VERSION();
    public static final int DEFAULT_VERSION = DEFAULT_VERSION();

    /**
     * @return Supported versions
     */
    public static native @Cast("dai::OpenVINO::Version*") @StdVector IntPointer getVersions();

    /**
     * Returns string representation of a given version
     * @param version OpenVINO version
     * @return Name of a given version
     */
    public static native @StdString BytePointer getVersionName(@Cast("dai::OpenVINO::Version") int version);

    /**
     * Creates Version from string representation.
     * Throws if not possible.
     * @param versionString Version as string
     * @return Version object if successful
     */
    public static native @Cast("dai::OpenVINO::Version") int parseVersionName(@StdString BytePointer versionString);
    public static native @Cast("dai::OpenVINO::Version") int parseVersionName(@StdString ByteBuffer versionString);
    public static native @Cast("dai::OpenVINO::Version") int parseVersionName(@StdString String versionString);

    /**
     * Returns a list of potentially supported versions for a specified blob major and minor versions.
     * @param majorVersion Major version from OpenVINO blob
     * @param minorVersion Minor version from OpenVINO blob
     * @return Vector of potentially supported versions
     */
    public static native @Cast("dai::OpenVINO::Version*") @StdVector IntPointer getBlobSupportedVersions(@Cast("std::uint32_t") int majorVersion, @Cast("std::uint32_t") int minorVersion);

    /**
     * Returns latest potentially supported version by a given blob version.
     * @param majorVersion Major version from OpenVINO blob
     * @param minorVersion Minor version from OpenVINO blob
     * @return Latest potentially supported version
     */
    public static native @Cast("dai::OpenVINO::Version") int getBlobLatestSupportedVersion(@Cast("std::uint32_t") int majorVersion, @Cast("std::uint32_t") int minorVersion);

    /**
     * Returns OpenVINO version of a given blob minor/major revision.
     * @param majorVersion Major version from OpenVINO blob
     * @param minorVersion Minor version from OpenVINO blob
     * @return Latest potentially supported version
     */
    public static native @Cast("dai::OpenVINO::Version") int getBlobVersion(@Cast("std::uint32_t") int majorVersion, @Cast("std::uint32_t") int minorVersion);

    /**
     * Checks whether two blob versions are compatible
     */
    public static native @Cast("bool") boolean areVersionsBlobCompatible(@Cast("dai::OpenVINO::Version") int v1, @Cast("dai::OpenVINO::Version") int v2);
}
