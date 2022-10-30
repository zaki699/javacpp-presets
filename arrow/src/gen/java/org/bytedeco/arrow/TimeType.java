// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** Base type class for time data */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class TimeType extends TemporalType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TimeType(Pointer p) { super(p); }
    public ParametricType asParametricType() { return asParametricType(this); }
    @Namespace public static native @Name("static_cast<arrow::ParametricType*>") ParametricType asParametricType(TimeType pointer);

  public native TimeUnit.type unit();
}
