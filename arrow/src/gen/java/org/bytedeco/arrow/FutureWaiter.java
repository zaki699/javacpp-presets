// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


// An object that waits on multiple futures at once.  Only one waiter
// can be registered for each future at any time.
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class FutureWaiter extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FutureWaiter(Pointer p) { super(p); }

  public enum Kind { ANY((byte)(0)), ALL((byte)(1)), ALL_OR_FIRST_FAILED((byte)(2)), ITERATE((byte)(3));

      public final byte value;
      private Kind(byte v) { this.value = v; }
      private Kind(Kind e) { this.value = e.value; }
      public Kind intern() { for (Kind e : values()) if (e.value == value) return e; return this; }
      @Override public String toString() { return intern().name(); }
  }

  // HUGE_VAL isn't constexpr on Windows
  // https://social.msdn.microsoft.com/Forums/vstudio/en-US/47e8b9ff-b205-4189-968e-ee3bc3e2719f/constexpr-compile-error?forum=vclanguage
  @MemberGetter public static native double kInfinity();
  public static final double kInfinity = kInfinity();

  public native @Cast("bool") boolean Wait(double seconds/*=arrow::FutureWaiter::kInfinity*/);
  public native @Cast("bool") boolean Wait();
  public native int WaitAndFetchOne();

  public native @StdVector IntPointer MoveFinishedFutures();
}
