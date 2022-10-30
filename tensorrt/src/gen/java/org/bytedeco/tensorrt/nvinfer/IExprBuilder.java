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
 *  \class IExprBuilder
 * 
 *  Object for constructing IDimensionExpr.
 * 
 *  There is no public way to construct an IExprBuilder.  It appears as an argument to
 *  method IPluginV2DynamicExt::getOutputDimensions().  Overrides of that method can use
 *  that IExprBuilder argument to construct expressions that define output dimensions
 *  in terms of input dimensions.
 * 
 *  Clients should assume that any values constructed by the IExprBuilder are destroyed
 *  after IPluginV2DynamicExt::getOutputDimensions() returns.
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 * 
 *  @see IDimensionExpr
 *  */
@Namespace("nvinfer1") @NoOffset @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IExprBuilder extends INoCopy {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IExprBuilder(Pointer p) { super(p); }

    /** Return pointer to IDimensionExp for given value. */
    public native @Const @NoException(true) IDimensionExpr constant(int value);

    /** Return pointer to IDimensionExp that represents the given operation applied to first and second.
     *  Returns nullptr if op is not a valid DimensionOperation. */
    public native @Const @NoException(true) IDimensionExpr operation(
            DimensionOperation op, @Const @ByRef IDimensionExpr first, @Const @ByRef IDimensionExpr second);
    public native @Const @NoException(true) IDimensionExpr operation(
            @Cast("nvinfer1::DimensionOperation") int op, @Const @ByRef IDimensionExpr first, @Const @ByRef IDimensionExpr second);
}
