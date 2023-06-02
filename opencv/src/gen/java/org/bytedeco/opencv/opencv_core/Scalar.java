// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;
 // namespace


//////////////////////////////// Scalar_ ///////////////////////////////

/** \brief Template class for a 4-element vector derived from Vec.
<p>
Being derived from Vec\<_Tp, 4\> , Scalar\_ and Scalar can be used just as typical 4-element
vectors. In addition, they can be converted to/from CvScalar . The type Scalar is widely used in
OpenCV to pass pixel values.
*/
@Name("cv::Scalar_<double>") @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class Scalar extends AbstractScalar {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Scalar(Pointer p) { super(p); }

    /** default constructor */
    public Scalar() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Scalar(double v0, double v1, double v2/*=0*/, double v3/*=0*/) { super((Pointer)null); allocate(v0, v1, v2, v3); }
    private native void allocate(double v0, double v1, double v2/*=0*/, double v3/*=0*/);
    public Scalar(double v0, double v1) { super((Pointer)null); allocate(v0, v1); }
    private native void allocate(double v0, double v1);
    public Scalar(double v0) { super((Pointer)null); allocate(v0); }
    private native void allocate(double v0);

    public Scalar(@Const @ByRef Scalar s) { super((Pointer)null); allocate(s); }
    private native void allocate(@Const @ByRef Scalar s);

    public native @ByRef @Name("operator =") Scalar put(@Const @ByRef Scalar s);

    /** returns a scalar with all elements set to v0 */
    public static native @ByVal Scalar all(double v0);

    /** conversion to another data type */

    /** per-element product */
    public native @ByVal Scalar mul(@Const @ByRef Scalar a, double scale/*=1*/ );
    public native @ByVal Scalar mul(@Const @ByRef Scalar a );

    /** returns (v0, -v1, -v2, -v3) */
    public native @ByVal Scalar conj();

    /** returns true iff v1 == v2 == v3 == 0 */
    public native @Cast("bool") boolean isReal();
}
