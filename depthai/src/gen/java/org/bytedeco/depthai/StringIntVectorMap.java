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

@Name("std::map<std::string,std::vector<int> >") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class StringIntVectorMap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringIntVectorMap(Pointer p) { super(p); }
    public StringIntVectorMap()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef StringIntVectorMap put(@ByRef StringIntVectorMap x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native @StdVector IntPointer get(@StdString BytePointer i);
    public native StringIntVectorMap put(@StdString BytePointer i, IntPointer value);
    @ValueSetter @Index public native StringIntVectorMap put(@StdString BytePointer i, @StdVector IntBuffer value);
    @ValueSetter @Index public native StringIntVectorMap put(@StdString BytePointer i, @StdVector int[] value);

    public native void erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *().first") @MemberGetter @StdString BytePointer first();
        public native @Name("operator *().second") @MemberGetter @StdVector @Const IntPointer second();
    }
}

