// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class NestedType extends DataType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NestedType(Pointer p) { super(p); }
    public ParametricType asParametricType() { return asParametricType(this); }
    @Namespace public static native @Name("static_cast<arrow::ParametricType*>") ParametricType asParametricType(NestedType pointer);

}
