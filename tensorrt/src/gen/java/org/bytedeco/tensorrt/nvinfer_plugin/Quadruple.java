// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer_plugin;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.nvrtc.*;
import static org.bytedeco.cuda.global.nvrtc.*;
import org.bytedeco.tensorrt.nvinfer.*;
import static org.bytedeco.tensorrt.global.nvinfer.*;

import static org.bytedeco.tensorrt.global.nvinfer_plugin.*;


/**
 *  \brief The Permute plugin layer permutes the input tensor by changing the memory order of the data.
 *  Quadruple defines a structure that contains an array of 4 integers. They can represent the permute orders or the
 *  strides in each dimension.
 *  */
@Namespace("nvinfer1::plugin") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer_plugin.class)
public class Quadruple extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Quadruple() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Quadruple(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Quadruple(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Quadruple position(long position) {
        return (Quadruple)super.position(position);
    }
    @Override public Quadruple getPointer(long i) {
        return new Quadruple((Pointer)this).offsetAddress(i);
    }

    public native int data(int i); public native Quadruple data(int i, int setter);
    @MemberGetter public native IntPointer data();
}
