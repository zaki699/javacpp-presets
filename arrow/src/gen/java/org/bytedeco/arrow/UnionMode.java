// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class UnionMode extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public UnionMode() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public UnionMode(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UnionMode(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public UnionMode position(long position) {
        return (UnionMode)super.position(position);
    }
    @Override public UnionMode getPointer(long i) {
        return new UnionMode((Pointer)this).offsetAddress(i);
    }

  public enum type { SPARSE(0), DENSE(1);

      public final int value;
      private type(int v) { this.value = v; }
      private type(type e) { this.value = e.value; }
      public type intern() { for (type e : values()) if (e.value == value) return e; return this; }
      @Override public String toString() { return intern().name(); }
  }
}
