// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Slice a {@code SparseTensor} based on the {@code start} and {@code size}.
 * 
 *  For example, if the input is
 * 
 *      input_tensor = shape = [2, 7]
 *      [    a   d e  ]
 *      [b c          ]
 * 
 *  Graphically the output tensors are:
 * 
 *      sparse_slice([0, 0], [2, 4]) = shape = [2, 4]
 *      [    a  ]
 *      [b c    ]
 * 
 *      sparse_slice([0, 4], [2, 3]) = shape = [2, 3]
 *      [ d e  ]
 *      [      ]
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * indices: 2-D tensor represents the indices of the sparse tensor.
 *  * values: 1-D tensor represents the values of the sparse tensor.
 *  * shape: 1-D. tensor represents the shape of the sparse tensor.
 *  * start: 1-D. tensor represents the start of the slice.
 *  * size: 1-D. tensor represents the size of the slice.
 *  output indices: A list of 1-D tensors represents the indices of the output
 *  sparse tensors.
 * 
 *  Returns:
 *  * {@code Output} output_indices
 *  * {@code Output} output_values: A list of 1-D tensors represents the values of the output sparse
 *  tensors.
 *  * {@code Output} output_shape: A list of 1-D tensors represents the shape of the output sparse
 *  tensors. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SparseSlice extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SparseSlice(Pointer p) { super(p); }

  public SparseSlice(@Const @ByRef Scope scope, @ByVal Input indices,
              @ByVal Input values, @ByVal Input shape,
              @ByVal Input start, @ByVal Input size) { super((Pointer)null); allocate(scope, indices, values, shape, start, size); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input indices,
              @ByVal Input values, @ByVal Input shape,
              @ByVal Input start, @ByVal Input size);

  public native @ByRef Operation operation(); public native SparseSlice operation(Operation setter);
  public native @ByRef Output output_indices(); public native SparseSlice output_indices(Output setter);
  public native @ByRef Output output_values(); public native SparseSlice output_values(Output setter);
  public native @ByRef Output output_shape(); public native SparseSlice output_shape(Output setter);
}
