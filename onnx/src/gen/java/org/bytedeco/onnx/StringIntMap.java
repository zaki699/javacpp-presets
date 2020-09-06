// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

@Name("std::unordered_map<std::string,int>") @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class StringIntMap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringIntMap(Pointer p) { super(p); }
    public StringIntMap()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef StringIntMap put(@ByRef StringIntMap x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native int get(@StdString BytePointer i);
    public native StringIntMap put(@StdString BytePointer i, int value);

    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *().first") @MemberGetter @StdString BytePointer first();
        public native @Name("operator *().second") @MemberGetter int second();
    }
}

