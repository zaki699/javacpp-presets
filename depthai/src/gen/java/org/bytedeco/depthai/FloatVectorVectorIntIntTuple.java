// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.depthai.global.depthai.*;

@NoOffset @Name("std::tuple<std::vector<std::vector<float> >,int,int>") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class FloatVectorVectorIntIntTuple extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FloatVectorVectorIntIntTuple(Pointer p) { super(p); }
    public FloatVectorVectorIntIntTuple(@ByRef FloatVectorVector value0, int value1, int value2) { allocate(value0, value1, value2); }
    private native void allocate(@ByRef FloatVectorVector value0, int value1, int value2);
    public FloatVectorVectorIntIntTuple()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef FloatVectorVectorIntIntTuple put(@ByRef FloatVectorVectorIntIntTuple x);

    public @ByRef FloatVectorVector get0() { return get0(this); }
    @Namespace @Name("std::get<0>") public static native @ByRef FloatVectorVector get0(@ByRef FloatVectorVectorIntIntTuple container);
    public int get1() { return get1(this); }
    @Namespace @Name("std::get<1>") public static native int get1(@ByRef FloatVectorVectorIntIntTuple container);
    public int get2() { return get2(this); }
    @Namespace @Name("std::get<2>") public static native int get2(@ByRef FloatVectorVectorIntIntTuple container);
}

