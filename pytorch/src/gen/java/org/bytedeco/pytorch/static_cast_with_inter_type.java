// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


// Partial template instantiation for casting to uint8.
// Note: Converting from negative float values to unsigned integer types is
// undefined behavior in C++, and current CPU and GPU compilers exhibit
// divergent behavior. Casting from negative float values to signed
// integer types and then to unsigned integer types is not undefined,
// however, so this cast improves the consistency of type conversions
// to uint8 across compilers.
// Further note: Type conversions across compilers still have other undefined
// and divergent behavior.

@Name("c10::static_cast_with_inter_type<c10::complex<c10::Half>,c10::BFloat16>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class static_cast_with_inter_type extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public static_cast_with_inter_type() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public static_cast_with_inter_type(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public static_cast_with_inter_type(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public static_cast_with_inter_type position(long position) {
        return (static_cast_with_inter_type)super.position(position);
    }
    @Override public static_cast_with_inter_type getPointer(long i) {
        return new static_cast_with_inter_type((Pointer)this).offsetAddress(i);
    }

}
