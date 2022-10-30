// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

@Name("std::map<tensorflow::TensorHandle*,TF_Output>") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TF_OutputTensorHandleMap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TF_OutputTensorHandleMap(Pointer p) { super(p); }
    public TF_OutputTensorHandleMap()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef TF_OutputTensorHandleMap put(@ByRef TF_OutputTensorHandleMap x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native @ByRef TF_Output get(TensorHandle i);
    public native TF_OutputTensorHandleMap put(TensorHandle i, TF_Output value);

    public native void erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *().first") @MemberGetter @Const TensorHandle first();
        public native @Name("operator *().second") @MemberGetter @ByRef @Const TF_Output second();
    }
}

