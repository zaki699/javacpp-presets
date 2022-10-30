// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

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

@Name("std::vector<c10::QEngine>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class QEngineVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QEngineVector(Pointer p) { super(p); }
    public QEngineVector(QEngine value) { this(1); put(0, value); }
    public QEngineVector(QEngine ... array) { this(array.length); put(array); }
    public QEngineVector()       { allocate();  }
    public QEngineVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef QEngineVector put(@ByRef QEngineVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @ByRef QEngine get(@Cast("size_t") long i);
    public native QEngineVector put(@Cast("size_t") long i, QEngine value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @ByRef QEngine value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @ByRef @Const QEngine get();
    }

    public QEngine[] get() {
        QEngine[] array = new QEngine[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public QEngine pop_back() {
        long size = size();
        QEngine value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public QEngineVector push_back(QEngine value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public QEngineVector put(QEngine value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public QEngineVector put(QEngine ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

