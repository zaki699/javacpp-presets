// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// This struct is isomorphic to TF_Output, but we cannot use the latter here due
// to layering concerns (TF_Output is defined at the C API layer).
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class OutputGraphNode extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public OutputGraphNode() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OutputGraphNode(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OutputGraphNode(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public OutputGraphNode position(long position) {
        return (OutputGraphNode)super.position(position);
    }
    @Override public OutputGraphNode getPointer(long i) {
        return new OutputGraphNode(this).position(position + i);
    }

  public native TF_Operation oper(); public native OutputGraphNode oper(TF_Operation setter);
  public native int index(); public native OutputGraphNode index(int setter);  // The index of the output within oper.
}
