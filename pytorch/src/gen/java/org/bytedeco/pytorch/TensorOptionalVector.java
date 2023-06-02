// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;

@Name("std::vector<c10::optional<torch::autograd::Variable> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TensorOptionalVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorOptionalVector(Pointer p) { super(p); }
    public TensorOptionalVector(TensorOptional value) { this(1); put(0, value); }
    public TensorOptionalVector(TensorOptional ... array) { this(array.length); put(array); }
    public TensorOptionalVector()       { allocate();  }
    public TensorOptionalVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef TensorOptionalVector put(@ByRef TensorOptionalVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @ByRef TensorOptional get(@Cast("size_t") long i);
    public native TensorOptionalVector put(@Cast("size_t") long i, TensorOptional value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @ByRef TensorOptional value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @ByRef @Const TensorOptional get();
    }

    public TensorOptional[] get() {
        TensorOptional[] array = new TensorOptional[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public TensorOptional pop_back() {
        long size = size();
        TensorOptional value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public TensorOptionalVector push_back(TensorOptional value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public TensorOptionalVector put(TensorOptional value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public TensorOptionalVector put(TensorOptional ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

