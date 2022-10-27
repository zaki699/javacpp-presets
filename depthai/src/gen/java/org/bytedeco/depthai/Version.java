// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

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


/** Version structure */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class Version extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Version(Pointer p) { super(p); }

    /** Construct Version from string */
    public Version(@StdString BytePointer v) { super((Pointer)null); allocate(v); }
    private native void allocate(@StdString BytePointer v);
    public Version(@StdString ByteBuffer v) { super((Pointer)null); allocate(v); }
    private native void allocate(@StdString ByteBuffer v);
    public Version(@StdString String v) { super((Pointer)null); allocate(v); }
    private native void allocate(@StdString String v);
    /** Construct Version major, minor and patch numbers */
    public Version(@Cast("unsigned") int major, @Cast("unsigned") int minor, @Cast("unsigned") int patch) { super((Pointer)null); allocate(major, minor, patch); }
    private native void allocate(@Cast("unsigned") int major, @Cast("unsigned") int minor, @Cast("unsigned") int patch);
    /** Construct Version major, minor and patch numbers with buildInfo */
    public Version(@Cast("unsigned") int major, @Cast("unsigned") int minor, @Cast("unsigned") int patch, @StdString BytePointer buildInfo) { super((Pointer)null); allocate(major, minor, patch, buildInfo); }
    private native void allocate(@Cast("unsigned") int major, @Cast("unsigned") int minor, @Cast("unsigned") int patch, @StdString BytePointer buildInfo);
    public Version(@Cast("unsigned") int major, @Cast("unsigned") int minor, @Cast("unsigned") int patch, @StdString ByteBuffer buildInfo) { super((Pointer)null); allocate(major, minor, patch, buildInfo); }
    private native void allocate(@Cast("unsigned") int major, @Cast("unsigned") int minor, @Cast("unsigned") int patch, @StdString ByteBuffer buildInfo);
    public Version(@Cast("unsigned") int major, @Cast("unsigned") int minor, @Cast("unsigned") int patch, @StdString String buildInfo) { super((Pointer)null); allocate(major, minor, patch, buildInfo); }
    private native void allocate(@Cast("unsigned") int major, @Cast("unsigned") int minor, @Cast("unsigned") int patch, @StdString String buildInfo);
    public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef Version other);
    public native @Cast("bool") @Name("operator <") boolean lessThan(@Const @ByRef Version other);
    public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef Version rhs);
    public native @Cast("bool") @Name("operator >") boolean greaterThan(@Const @ByRef Version rhs);
    public native @Cast("bool") @Name("operator <=") boolean lessThanEquals(@Const @ByRef Version rhs);
    public native @Cast("bool") @Name("operator >=") boolean greaterThanEquals(@Const @ByRef Version rhs);
    /** Convert Version to string */
    public native @StdString String toString();
    /** Convert Version to semver (no build information) string */
    public native @StdString BytePointer toStringSemver();
    /** Get build info */
    public native @StdString BytePointer getBuildInfo();
    /** Retrieves semver version (no build information) */
    public native @ByVal Version getSemver();
}
