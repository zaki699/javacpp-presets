// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow::ipc::internal") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class FieldPosition extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FieldPosition(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FieldPosition(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public FieldPosition position(long position) {
        return (FieldPosition)super.position(position);
    }
    @Override public FieldPosition getPointer(long i) {
        return new FieldPosition((Pointer)this).offsetAddress(i);
    }

  public FieldPosition() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native @ByVal FieldPosition child(int index);

  public native @StdVector IntPointer path();
}
