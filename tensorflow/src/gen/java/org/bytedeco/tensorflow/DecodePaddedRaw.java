// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Reinterpret the bytes of a string as a vector of numbers.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input_bytes: Tensor of string to be decoded.
 *  * fixed_length: Length in bytes for each element of the decoded output. Must be a multiple
 *  of the size of the output type.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * little_endian: Whether the input {@code input_bytes} is in little-endian order. Ignored for
 *  {@code out_type} values that are stored in a single byte, like {@code uint8}
 * 
 *  Returns:
 *  * {@code Output}: A Tensor with one more dimension than the input {@code bytes}. The added dimension
 *  will have size equal to the length of the elements of {@code bytes} divided by the
 *  number of bytes to represent {@code out_type}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class DecodePaddedRaw extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DecodePaddedRaw(Pointer p) { super(p); }

  /** Optional attribute setters for DecodePaddedRaw */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
      @Override public Attrs getPointer(long i) {
          return new Attrs((Pointer)this).offsetAddress(i);
      }
  
    /** Whether the input {@code input_bytes} is in little-endian order. Ignored for
     *  {@code out_type} values that are stored in a single byte, like {@code uint8}
     * 
     *  Defaults to true */
    public native @ByVal Attrs LittleEndian(@Cast("bool") boolean x);

    public native @Cast("bool") boolean little_endian_(); public native Attrs little_endian_(boolean setter);
  }
  public DecodePaddedRaw(@Const @ByRef Scope scope, @ByVal Input input_bytes, @ByVal Input fixed_length, @Cast("tensorflow::DataType") int out_type) { super((Pointer)null); allocate(scope, input_bytes, fixed_length, out_type); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input_bytes, @ByVal Input fixed_length, @Cast("tensorflow::DataType") int out_type);
  public DecodePaddedRaw(@Const @ByRef Scope scope, @ByVal Input input_bytes, @ByVal Input fixed_length, @Cast("tensorflow::DataType") int out_type, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input_bytes, fixed_length, out_type, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input_bytes, @ByVal Input fixed_length, @Cast("tensorflow::DataType") int out_type, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs LittleEndian(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native DecodePaddedRaw operation(Operation setter);
  public native @ByRef Output output(); public native DecodePaddedRaw output(Output setter);
}
