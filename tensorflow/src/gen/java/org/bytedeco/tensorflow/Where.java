// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Returns locations of nonzero / true values in a tensor.
 * 
 *  This operation returns the coordinates of true elements in {@code condition}. The
 *  coordinates are returned in a 2-D tensor where the first dimension (rows)
 *  represents the number of true elements, and the second dimension (columns)
 *  represents the coordinates of the true elements. Keep in mind, the shape of
 *  the output tensor can vary depending on how many true values there are in
 *  {@code condition}. Indices are output in row-major order.
 * 
 *  For example:
 * 
 *  <pre>{@code
 *  # 'input' tensor is [[True, False]
 *  #                    [True, False]]
 *  # 'input' has two true values, so output has two coordinates.
 *  # 'input' has rank of 2, so coordinates have two indices.
 *  where(input) ==> [[0, 0],
 *                    [1, 0]]
 * 
 *  # `condition` tensor is [[[True, False]
 *  #                     [True, False]]
 *  #                    [[False, True]
 *  #                     [False, True]]
 *  #                    [[False, False]
 *  #                     [False, True]]]
 *  # 'input' has 5 true values, so output has 5 coordinates.
 *  # 'input' has rank of 3, so coordinates have three indices.
 *  where(input) ==> [[0, 0, 0],
 *                    [0, 1, 0],
 *                    [1, 0, 1],
 *                    [1, 1, 1],
 *                    [2, 1, 1]]
 * 
 *  # `condition` tensor is [[[1.5,  0.0]
 *  #                     [-0.5, 0.0]]
 *  #                    [[0.0,  0.25]
 *  #                     [0.0,  0.75]]
 *  #                    [[0.0,  0.0]
 *  #                     [0.0,  0.01]]]
 *  # 'input' has 5 nonzero values, so output has 5 coordinates.
 *  # 'input' has rank of 3, so coordinates have three indices.
 *  where(input) ==> [[0, 0, 0],
 *                    [0, 1, 0],
 *                    [1, 0, 1],
 *                    [1, 1, 1],
 *                    [2, 1, 1]]
 * 
 *  # `condition` tensor is [[[1.5 + 0.0j, 0.0  + 0.0j]
 *  #                     [0.0 + 0.5j, 0.0  + 0.0j]]
 *  #                    [[0.0 + 0.0j, 0.25 + 1.5j]
 *  #                     [0.0 + 0.0j, 0.75 + 0.0j]]
 *  #                    [[0.0 + 0.0j, 0.0  + 0.0j]
 *  #                     [0.0 + 0.0j, 0.01 + 0.0j]]]
 *  # 'input' has 5 nonzero magnitude values, so output has 5 coordinates.
 *  # 'input' has rank of 3, so coordinates have three indices.
 *  where(input) ==> [[0, 0, 0],
 *                    [0, 1, 0],
 *                    [1, 0, 1],
 *                    [1, 1, 1],
 *                    [2, 1, 1]]
 *  }</pre>
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The index tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Where extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Where(Pointer p) { super(p); }

  public Where(@Const @ByRef Scope scope, @ByVal Input condition) { super((Pointer)null); allocate(scope, condition); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input condition);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native Where operation(Operation setter);
  public native @ByRef Output index(); public native Where index(Output setter);
}
