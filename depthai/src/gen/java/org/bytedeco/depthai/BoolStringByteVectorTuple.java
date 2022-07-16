// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

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

@NoOffset @Name("std::tuple<bool,std::string,std::vector<uint8_t> >") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class BoolStringByteVectorTuple extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BoolStringByteVectorTuple(Pointer p) { super(p); }
    public BoolStringByteVectorTuple(@Cast("bool") boolean value0, @StdString BytePointer value1, @ByRef ByteVector value2) { allocate(value0, value1, value2); }
    private native void allocate(@Cast("bool") boolean value0, @StdString BytePointer value1, @ByRef ByteVector value2);
    public BoolStringByteVectorTuple()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef BoolStringByteVectorTuple put(@ByRef BoolStringByteVectorTuple x);

    public @Cast("bool") boolean get0() { return get0(this); }
    @Namespace @Name("std::get<0>") public static native @Cast("bool") boolean get0(@ByRef BoolStringByteVectorTuple container);
    public @StdString BytePointer get1() { return get1(this); }
    @Namespace @Name("std::get<1>") public static native @StdString BytePointer get1(@ByRef BoolStringByteVectorTuple container);
    public @ByRef ByteVector get2() { return get2(this); }
    @Namespace @Name("std::get<2>") public static native @ByRef ByteVector get2(@ByRef BoolStringByteVectorTuple container);
}

