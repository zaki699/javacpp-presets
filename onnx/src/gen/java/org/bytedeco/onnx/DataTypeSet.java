// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

@Name("std::unordered_set<onnx::DataType>") @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class DataTypeSet extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DataTypeSet(Pointer p) { super(p); }
    public DataTypeSet()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef DataTypeSet put(@ByRef DataTypeSet x);

    public boolean empty() { return size() == 0; }
    public native long size();

    public native void insert(@StdString @Cast({"char*", "std::string*"}) BytePointer value);
    public native void erase(@StdString @Cast({"char*", "std::string*"}) BytePointer value);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @StdString @Const @Cast({"char*", "std::string*"}) BytePointer get();
    }
}

