// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

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


@Name("c10::detail::getTypePtr_<at::IValue>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class getTypePtr_ extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public getTypePtr_() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public getTypePtr_(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public getTypePtr_(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public getTypePtr_ position(long position) {
        return (getTypePtr_)super.position(position);
    }
    @Override public getTypePtr_ getPointer(long i) {
        return new getTypePtr_((Pointer)this).offsetAddress(i);
    }

  public static native @ByVal Type.TypePtr call();
}
