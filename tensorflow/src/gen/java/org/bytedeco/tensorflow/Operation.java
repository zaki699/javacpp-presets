// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** \addtogroup core
 *  \{
 <p>
 *  Represents a node in the computation graph. */
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Operation extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Operation(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Operation(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Operation position(long position) {
        return (Operation)super.position(position);
    }
    @Override public Operation getPointer(long i) {
        return new Operation((Pointer)this).offsetAddress(i);
    }

  public Operation() { super((Pointer)null); allocate(); }
  private native void allocate();
  public Operation(Node n) { super((Pointer)null); allocate(n); }
  private native void allocate(Node n);

  public native int num_inputs();
  public native @Cast("tensorflow::DataType") int input_type(int o);
  public native @ByVal Output input(int i);

  public native int num_outputs();
  public native @Cast("tensorflow::DataType") int output_type(int o);
  public native @ByVal Output output(int i);

  public native Node node();

  public native @Cast("tensorflow::uint64") long hash(int index);

  public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef Operation other);
}
