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

@Name("std::unordered_map<dai::CameraBoardSocket,std::string>") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class CameraBoardSocketStringMap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CameraBoardSocketStringMap(Pointer p) { super(p); }
    public CameraBoardSocketStringMap()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef CameraBoardSocketStringMap put(@ByRef CameraBoardSocketStringMap x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native @StdString BytePointer get(@ByRef CameraBoardSocket i);
    public native CameraBoardSocketStringMap put(@ByRef CameraBoardSocket i, BytePointer value);
    @ValueSetter @Index public native CameraBoardSocketStringMap put(@ByRef CameraBoardSocket i, @StdString ByteBuffer value);
    @ValueSetter @Index public native CameraBoardSocketStringMap put(@ByRef CameraBoardSocket i, @StdString String value);

    public native void erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *().first") @MemberGetter @ByRef @Const CameraBoardSocket first();
        public native @Name("operator *().second") @MemberGetter @StdString BytePointer second();
    }
}

