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
 *  \class ILRNLayer
 * 
 *  \brief A LRN layer in a network definition.
 * 
 *  The output size is the same as the input size.
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @NoOffset @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class ILRNLayer extends ILayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ILRNLayer(Pointer p) { super(p); }

    /**
     *  \brief Set the LRN window size.
     * 
     *  The window size must be odd and in the range of [1, 15].
     * 
     *  If executing this layer on the DLA, only values in the set, [3, 5, 7, 9], are valid.
     * 
     *  @see setWindowStride()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setWindowSize(int windowSize);

    /**
     *  \brief Get the LRN window size.
     * 
     *  @see getWindowStride()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) int getWindowSize();

    /**
     *  \brief Set the LRN alpha value.
     * 
     *  The valid range is [-1e20, 1e20].
     *  @see getAlpha()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setAlpha(float alpha);

    /**
     *  \brief Get the LRN alpha value.
     * 
     *  @see setAlpha()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) float getAlpha();

    /**
     *  \brief Set the LRN beta value.
     * 
     *  The valid range is [0.01, 1e5f].
     *  @see getBeta()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setBeta(float beta);

    /**
     *  \brief Get the LRN beta value.
     * 
     *  @see setBeta()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) float getBeta();

    /**
     *  \brief Set the LRN K value.
     * 
     *  The valid range is [1e-5, 1e10].
     *  @see getK()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setK(float k);

    /**
     *  \brief Get the LRN K value.
     * 
     *  @see setK()
     *  */
    public native @NoException(true) float getK();
}
