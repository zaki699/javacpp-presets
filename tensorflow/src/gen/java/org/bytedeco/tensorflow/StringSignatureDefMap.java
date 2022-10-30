// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

@Name("google::protobuf::Map<std::string,tensorflow::SignatureDef>") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class StringSignatureDefMap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringSignatureDefMap(Pointer p) { super(p); }
    public StringSignatureDefMap()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef StringSignatureDefMap put(@ByRef StringSignatureDefMap x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native @ByRef SignatureDef get(@StdString BytePointer i);
    public native StringSignatureDefMap put(@StdString BytePointer i, SignatureDef value);

    public native void erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *().first") @MemberGetter @StdString BytePointer first();
        public native @Name("operator *().second") @MemberGetter @ByRef @Const SignatureDef second();
    }
}

