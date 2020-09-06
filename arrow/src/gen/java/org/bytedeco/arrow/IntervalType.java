// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


// Base class for the different kinds of calendar intervals.
@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class IntervalType extends TemporalType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IntervalType(Pointer p) { super(p); }
    public ParametricType asParametricType() { return asParametricType(this); }
    @Namespace public static native @Name("static_cast<arrow::ParametricType*>") ParametricType asParametricType(IntervalType pointer);

  public enum type { MONTHS(0), DAY_TIME(1);

      public final int value;
      private type(int v) { this.value = v; }
      private type(type e) { this.value = e.value; }
      public type intern() { for (type e : values()) if (e.value == value) return e; return this; }
      @Override public String toString() { return intern().name(); }
  }

  public native type interval_type();
}
