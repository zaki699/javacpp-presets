// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

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

@NoOffset @Name("tl::optional<int>") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class IntOptional extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IntOptional(Pointer p) { super(p); }
    public IntOptional(int value) { this(); put(value); }
    public IntOptional()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef IntOptional put(@ByRef IntOptional x);


    @Name("value") public native int get();
    @ValueSetter public native IntOptional put(int value);
}

