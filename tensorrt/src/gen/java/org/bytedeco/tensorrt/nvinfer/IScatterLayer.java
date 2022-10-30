// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

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

import static org.bytedeco.tensorrt.global.nvinfer.*;


/**
 *  \class IScatterLayer
 * 
 *  \brief A scatter layer in a network definition. Supports several kinds of scattering.
 * 
 *  The Scatter layer has three input tensors: Data, Indices, and Updates, one output tensor
 *  Output, and a scatter mode. When kELEMENT mode is used an optional axis parameter is available.
 *  * Data is a tensor of rank r >= 1 that stores the values to be duplicated in Output.
 *  * Indices is a tensor of rank q that determines which locations in Output to write new
 *    values to. Constraints on the rank of q depend on the mode:
 *        ScatterMode::kND: q >= 1
 *        ScatterMode::kELEMENT: q must be the same as r
 *  * Updates is atensor of rank s >=1 that provides the data
 *    to write to Output specified by its corresponding location in Index. Constraints the rank of Updates depend on the
 *    mode:
 *        ScatterMode::kND: s = r + q - shape(Indices)[-1] - 1
 *        Scattermode::kELEMENT: s = q = r
 *  * Output is a tensor with the same dimensions as Data that stores the resulting values of the
 *    transformation. It must not be a shape tensor.
 *  The types of Data, Update, and Output shall be the same, and Indices shall be DataType::kINT32.
 * 
 *  The output is computed by copying the data, and then updating elements of it based on indices.
 *  How Indices are interpreted depends upon the ScatterMode.
 * 
 *  ScatterMode::kND
 * 
 *      The indices are interpreted as a tensor of rank q-1 of indexing tuples.
 *      The axis parameter is ignored.
 * 
 *      Given that data dims are {d_0,...,d_{r-1}} and indices dims are {i_0,...,i_{q-1}},
 *      define k = indices[q-1], it follows that updates dims are {i_0,...,i_{q-2},d_k,...,d_{r-1}}
 *      The updating can be computed by:
 *          foreach slice in indices[i_0,...i_{q-2}]
 *              output[indices[slice]] = updates[slice]
 * 
 *  ScatterMode::kELEMENT
 * 
 *      Here "axis" denotes the result of getAxis().
 * 
 *      For each element X of indices:
 *          Let J denote a sequence for the subscripts of X
 *          Let K = sequence J with element [axis] replaced by X
 *          output[K] = updates[J]
 * 
 *      For example, if indices has dimensions [N,C,H,W] and axis is 2, then the updates happen as:
 * 
 *          for n in [0,n)
 *              for c in [0,n)
 *                  for h in [0,n)
 *                      for w in [0,n)
 *                          output[n,c,indices[n,c,h,w],w] = updates[n,c,h,w]]
 * 
 *  Writes to the same output element cause undefined behavior.
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @NoOffset @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IScatterLayer extends ILayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IScatterLayer(Pointer p) { super(p); }

    /**
     *  \brief Set the scatter mode.
     * 
     *  @see getMode()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setMode(ScatterMode mode);
    public native @NoException(true) void setMode(@Cast("nvinfer1::ScatterMode") int mode);

    /**
     *  \brief Get the scatter mode.
     * 
     *  @see setMode()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) ScatterMode getMode();

    /**
     *  \brief Set the axis used by ScatterMode::kELEMENTS.
     * 
     *  The axis defaults to 0.
     *  */
    
    
    //!
    //!
    public native @NoException(true) void setAxis(int axis);

    /**
     *  \brief Get the axis.
     *  */
    public native @NoException(true) int getAxis();
}
