// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.numpy;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.cpython.*;
import static org.bytedeco.cpython.global.python.*;

import static org.bytedeco.numpy.global.numpy.*;


@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyArrayNeighborhoodIterObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyArrayNeighborhoodIterObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyArrayNeighborhoodIterObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyArrayNeighborhoodIterObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyArrayNeighborhoodIterObject position(long position) {
        return (PyArrayNeighborhoodIterObject)super.position(position);
    }
    @Override public PyArrayNeighborhoodIterObject getPointer(long i) {
        return new PyArrayNeighborhoodIterObject(this).position(position + i);
    }

    public native @ByRef PyObject ob_base(); public native PyArrayNeighborhoodIterObject ob_base(PyObject setter);

    /*
     * PyArrayIterObject part: keep this in this exact order
     */
    public native int nd_m1(); public native PyArrayNeighborhoodIterObject nd_m1(int setter);            /* number of dimensions - 1 */
    public native @Cast("npy_intp") long index(); public native PyArrayNeighborhoodIterObject index(long setter);
    public native @Cast("npy_intp") long size(); public native PyArrayNeighborhoodIterObject size(long setter);
    public native @Cast("npy_intp") long coordinates(int i); public native PyArrayNeighborhoodIterObject coordinates(int i, long setter);
    @MemberGetter public native @Cast("npy_intp*") SizeTPointer coordinates();/* N-dimensional loop */
    public native @Cast("npy_intp") long dims_m1(int i); public native PyArrayNeighborhoodIterObject dims_m1(int i, long setter);
    @MemberGetter public native @Cast("npy_intp*") SizeTPointer dims_m1();    /* ao->dimensions - 1 */
    public native @Cast("npy_intp") long strides(int i); public native PyArrayNeighborhoodIterObject strides(int i, long setter);
    @MemberGetter public native @Cast("npy_intp*") SizeTPointer strides();    /* ao->strides or fake */
    public native @Cast("npy_intp") long backstrides(int i); public native PyArrayNeighborhoodIterObject backstrides(int i, long setter);
    @MemberGetter public native @Cast("npy_intp*") SizeTPointer backstrides();/* how far to jump back */
    public native @Cast("npy_intp") long factors(int i); public native PyArrayNeighborhoodIterObject factors(int i, long setter);
    @MemberGetter public native @Cast("npy_intp*") SizeTPointer factors();     /* shape factors */
    public native PyArrayObject ao(); public native PyArrayNeighborhoodIterObject ao(PyArrayObject setter);
    public native @Cast("char*") BytePointer dataptr(); public native PyArrayNeighborhoodIterObject dataptr(BytePointer setter);        /* pointer to current item*/
    public native @Cast("npy_bool") byte contiguous(); public native PyArrayNeighborhoodIterObject contiguous(byte setter);

    public native @Cast("npy_intp") long bounds(int i, int j); public native PyArrayNeighborhoodIterObject bounds(int i, int j, long setter);
    @MemberGetter public native @Cast("npy_intp(*)[2]") SizeTPointer bounds();
    public native @Cast("npy_intp") long limits(int i, int j); public native PyArrayNeighborhoodIterObject limits(int i, int j, long setter);
    @MemberGetter public native @Cast("npy_intp(*)[2]") SizeTPointer limits();
    public native @Cast("npy_intp") long limits_sizes(int i); public native PyArrayNeighborhoodIterObject limits_sizes(int i, long setter);
    @MemberGetter public native @Cast("npy_intp*") SizeTPointer limits_sizes();
    public native npy_iter_get_dataptr_t translate(); public native PyArrayNeighborhoodIterObject translate(npy_iter_get_dataptr_t setter);

    /*
     * New members
     */
    public native @Cast("npy_intp") long nd(); public native PyArrayNeighborhoodIterObject nd(long setter);

    /* Dimensions is the dimension of the array */
    public native @Cast("npy_intp") long dimensions(int i); public native PyArrayNeighborhoodIterObject dimensions(int i, long setter);
    @MemberGetter public native @Cast("npy_intp*") SizeTPointer dimensions();

    /*
     * Neighborhood points coordinates are computed relatively to the
     * point pointed by _internal_iter
     */
    public native PyArrayIterObject _internal_iter(); public native PyArrayNeighborhoodIterObject _internal_iter(PyArrayIterObject setter);
    /*
     * To keep a reference to the representation of the constant value
     * for constant padding
     */
    public native @Cast("char*") BytePointer constant(); public native PyArrayNeighborhoodIterObject constant(BytePointer setter);

    public native int mode(); public native PyArrayNeighborhoodIterObject mode(int setter);
}
