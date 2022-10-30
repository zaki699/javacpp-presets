// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class InstantiationResult extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public InstantiationResult() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public InstantiationResult(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public InstantiationResult(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public InstantiationResult position(long position) {
        return (InstantiationResult)super.position(position);
    }
    @Override public InstantiationResult getPointer(long i) {
        return new InstantiationResult((Pointer)this).offsetAddress(i);
    }

  public native @ByRef DataTypeVector arg_types(); public native InstantiationResult arg_types(DataTypeVector setter);
  public native @ByRef DataTypeVector ret_types(); public native InstantiationResult ret_types(DataTypeVector setter);
  public native @StdVector NodeDef nodes(); public native InstantiationResult nodes(NodeDef setter);
}
