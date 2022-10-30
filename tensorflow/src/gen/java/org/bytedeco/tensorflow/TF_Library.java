// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TF_Library extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TF_Library() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TF_Library(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TF_Library(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TF_Library position(long position) {
        return (TF_Library)super.position(position);
    }
    @Override public TF_Library getPointer(long i) {
        return new TF_Library((Pointer)this).offsetAddress(i);
    }

  public native Pointer lib_handle(); public native TF_Library lib_handle(Pointer setter);
  public native @ByRef TF_Buffer op_list(); public native TF_Library op_list(TF_Buffer setter);
}
