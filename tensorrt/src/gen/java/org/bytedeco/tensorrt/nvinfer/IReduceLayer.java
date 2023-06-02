// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

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
 *  \class IReduceLayer
 * 
 *  \brief Layer that represents a reduction across a non-bool tensor.
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @NoOffset @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IReduceLayer extends ILayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IReduceLayer(Pointer p) { super(p); }

    /**
     *  \brief Set the reduce operation for the layer.
     * 
     *  @see getOperation(), ReduceOperation
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setOperation(ReduceOperation op);
    public native @NoException(true) void setOperation(@Cast("nvinfer1::ReduceOperation") int op);

    /**
     *  \brief Get the reduce operation for the layer.
     * 
     *  @see setOperation(), ReduceOperation
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) ReduceOperation getOperation();

    /**
     *  \brief Set the axes over which to reduce.
     * 
     *  @see getReduceAxes
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setReduceAxes(@Cast("uint32_t") int reduceAxes);

    /**
     *  \brief Get the axes over which to reduce for the layer.
     * 
     *  @see setReduceAxes
     *  */
    
    
    //!
    //!
    //!
    public native @Cast("uint32_t") @NoException(true) int getReduceAxes();

    /**
     *  \brief Set the boolean that specifies whether or not to keep the reduced dimensions for the layer.
     * 
     *  @see getKeepDimensions
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setKeepDimensions(@Cast("bool") boolean keepDimensions);

    /**
     *  \brief Get the boolean that specifies whether or not to keep the reduced dimensions for the layer.
     * 
     *  @see setKeepDimensions
     *  */
    public native @Cast("bool") @NoException(true) boolean getKeepDimensions();
}
