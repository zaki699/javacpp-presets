// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Add a {@code SparseTensor} to a {@code SparseTensorsMap} return its handle.
 * 
 *  A {@code SparseTensor} is represented by three tensors: {@code sparse_indices},
 *  {@code sparse_values}, and {@code sparse_shape}.
 * 
 *  This operator takes the given {@code SparseTensor} and adds it to a container
 *  object (a {@code SparseTensorsMap}).  A unique key within this container is generated
 *  in the form of an {@code int64}, and this is the value that is returned.
 * 
 *  The {@code SparseTensor} can then be read out as part of a minibatch by passing
 *  the key as a vector element to {@code TakeManySparseFromTensorsMap}.  To ensure
 *  the correct {@code SparseTensorsMap} is accessed, ensure that the same
 *  {@code container} and {@code shared_name} are passed to that Op.  If no {@code shared_name}
 *  is provided here, instead use the *name* of the Operation created by calling
 *  {@code AddSparseToTensorsMap} as the {@code shared_name} passed to
 *  {@code TakeManySparseFromTensorsMap}.  Ensure the Operations are colocated.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * sparse_indices: 2-D.  The {@code indices} of the {@code SparseTensor}.
 *  * sparse_values: 1-D.  The {@code values} of the {@code SparseTensor}.
 *  * sparse_shape: 1-D.  The {@code shape} of the {@code SparseTensor}.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * container: The container name for the {@code SparseTensorsMap} created by this op.
 *  * shared_name: The shared name for the {@code SparseTensorsMap} created by this op.
 *  If blank, the new Operation's unique name is used.
 * 
 *  Returns:
 *  * {@code Output}: 0-D.  The handle of the {@code SparseTensor} now stored in the
 *  {@code SparseTensorsMap}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class AddSparseToTensorsMap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AddSparseToTensorsMap(Pointer p) { super(p); }

  /** Optional attribute setters for AddSparseToTensorsMap */
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
          return new Attrs(this).position(position + i);
      }
  
    /** The container name for the {@code SparseTensorsMap} created by this op.
     * 
     *  Defaults to "" */
    
    ///
    public native @ByVal Attrs Container(@StringPiece BytePointer x);
    public native @ByVal Attrs Container(@StringPiece String x);

    /** The shared name for the {@code SparseTensorsMap} created by this op.
     *  If blank, the new Operation's unique name is used.
     * 
     *  Defaults to "" */
    public native @ByVal Attrs SharedName(@StringPiece BytePointer x);
    public native @ByVal Attrs SharedName(@StringPiece String x);

    public native @StringPiece BytePointer container_(); public native Attrs container_(BytePointer setter);
    public native @StringPiece BytePointer shared_name_(); public native Attrs shared_name_(BytePointer setter);
  }
  public AddSparseToTensorsMap(@Const @ByRef Scope scope, @ByVal Input sparse_indices, @ByVal Input sparse_values,
                        @ByVal Input sparse_shape) { super((Pointer)null); allocate(scope, sparse_indices, sparse_values, sparse_shape); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input sparse_indices, @ByVal Input sparse_values,
                        @ByVal Input sparse_shape);
  public AddSparseToTensorsMap(@Const @ByRef Scope scope, @ByVal Input sparse_indices, @ByVal Input sparse_values,
                        @ByVal Input sparse_shape, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, sparse_indices, sparse_values, sparse_shape, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input sparse_indices, @ByVal Input sparse_values,
                        @ByVal Input sparse_shape, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Container(@StringPiece BytePointer x);
  public static native @ByVal Attrs Container(@StringPiece String x);
  public static native @ByVal Attrs SharedName(@StringPiece BytePointer x);
  public static native @ByVal Attrs SharedName(@StringPiece String x);

  public native @ByRef Operation operation(); public native AddSparseToTensorsMap operation(Operation setter);
  public native @ByRef Output sparse_handle(); public native AddSparseToTensorsMap sparse_handle(Output setter);
}
