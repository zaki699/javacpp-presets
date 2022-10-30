// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tesseract;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.leptonica.*;
import static org.bytedeco.leptonica.global.leptonica.*;

import static org.bytedeco.tesseract.global.tesseract.*;

@Name("std::vector<char>") @Properties(inherit = org.bytedeco.tesseract.presets.tesseract.class)
public class ByteVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ByteVector(Pointer p) { super(p); }
    public ByteVector(byte value) { this(1); put(0, value); }
    public ByteVector(byte ... array) { this(array.length); put(array); }
    public ByteVector()       { allocate();  }
    public ByteVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef ByteVector put(@ByRef ByteVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @Cast("char") byte get(@Cast("size_t") long i);
    public native ByteVector put(@Cast("size_t") long i, byte value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @Cast("char") byte value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @Cast("char") byte get();
    }

    public byte[] get() {
        byte[] array = new byte[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public byte pop_back() {
        long size = size();
        byte value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public ByteVector push_back(byte value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public ByteVector put(byte value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public ByteVector put(byte ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

