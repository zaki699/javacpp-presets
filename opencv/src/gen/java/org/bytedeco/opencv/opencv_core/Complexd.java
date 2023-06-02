// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;

@Name("cv::Complex<double>") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class Complexd extends DoublePointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Complexd(Pointer p) { super(p); }


    /** default constructor */
    public Complexd() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Complexd( double _re, double _im/*=0*/ ) { super((Pointer)null); allocate(_re, _im); }
    private native void allocate( double _re, double _im/*=0*/ );
    public Complexd( double _re ) { super((Pointer)null); allocate(_re); }
    private native void allocate( double _re );

    /** conversion to another data type */
    /** conjugation */
    public native @ByVal Complexd conj();

    public native double re(); public native Complexd re(double setter);
    public native double im(); public native Complexd im(double setter); //< the real and the imaginary parts
}
