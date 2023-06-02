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


@Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class XLinkHandler_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public XLinkHandler_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public XLinkHandler_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public XLinkHandler_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public XLinkHandler_t position(long position) {
        return (XLinkHandler_t)super.position(position);
    }
    @Override public XLinkHandler_t getPointer(long i) {
        return new XLinkHandler_t((Pointer)this).offsetAddress(i);
    }

    public native @Cast("char*") BytePointer devicePath(); public native XLinkHandler_t devicePath(BytePointer setter);
    public native @Cast("char*") BytePointer devicePath2(); public native XLinkHandler_t devicePath2(BytePointer setter);
    public native int linkId(); public native XLinkHandler_t linkId(int setter);
    public native @Cast("XLinkProtocol_t") int protocol(); public native XLinkHandler_t protocol(int setter);
}
