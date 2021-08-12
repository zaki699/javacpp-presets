// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

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


/**
 * Specifies a connection between nodes IOs
 */
@Namespace("dai") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class NodeConnectionSchema extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NodeConnectionSchema() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NodeConnectionSchema(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NodeConnectionSchema(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NodeConnectionSchema position(long position) {
        return (NodeConnectionSchema)super.position(position);
    }
    @Override public NodeConnectionSchema getPointer(long i) {
        return new NodeConnectionSchema((Pointer)this).offsetAddress(i);
    }

    public native @Cast("int64_t") long node1Id(); public native NodeConnectionSchema node1Id(long setter);
    public native @StdString BytePointer node1Output(); public native NodeConnectionSchema node1Output(BytePointer setter);
    public native @Cast("int64_t") long node2Id(); public native NodeConnectionSchema node2Id(long setter);
    public native @StdString BytePointer node2Input(); public native NodeConnectionSchema node2Input(BytePointer setter);
}
