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


@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class XLinkError extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public XLinkError(Pointer p) { super(p); }

    @MemberGetter public native @Cast("const XLinkError_t") int status();
    @MemberGetter public native @StdString BytePointer streamName();

    public XLinkError(@Cast("XLinkError_t") int statusID, @StdString BytePointer stream, @StdString BytePointer message) { super((Pointer)null); allocate(statusID, stream, message); }
    private native void allocate(@Cast("XLinkError_t") int statusID, @StdString BytePointer stream, @StdString BytePointer message);
    public XLinkError(@Cast("XLinkError_t") int statusID, @StdString ByteBuffer stream, @StdString ByteBuffer message) { super((Pointer)null); allocate(statusID, stream, message); }
    private native void allocate(@Cast("XLinkError_t") int statusID, @StdString ByteBuffer stream, @StdString ByteBuffer message);
    public XLinkError(@Cast("XLinkError_t") int statusID, @StdString String stream, @StdString String message) { super((Pointer)null); allocate(statusID, stream, message); }
    private native void allocate(@Cast("XLinkError_t") int statusID, @StdString String stream, @StdString String message);
}
