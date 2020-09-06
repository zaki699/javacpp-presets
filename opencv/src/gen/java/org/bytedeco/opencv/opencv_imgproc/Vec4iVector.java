// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_imgproc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;

import static org.bytedeco.opencv.global.opencv_imgproc.*;

@Name("std::vector<cv::Vec4i>") @Properties(inherit = org.bytedeco.opencv.presets.opencv_imgproc.class)
public class Vec4iVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Vec4iVector(Pointer p) { super(p); }
    public Vec4iVector(Scalar4i value) { this(1); put(0, value); }
    public Vec4iVector(Scalar4i ... array) { this(array.length); put(array); }
    public Vec4iVector()       { allocate();  }
    public Vec4iVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef Vec4iVector put(@ByRef Vec4iVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @Cast("cv::Vec4i*") @ByRef Scalar4i get(@Cast("size_t") long i);
    public native Vec4iVector put(@Cast("size_t") long i, Scalar4i value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @Cast("cv::Vec4i*") @ByRef Scalar4i value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @Cast("cv::Vec4i*") @ByRef @Const Scalar4i get();
    }

    public Scalar4i[] get() {
        Scalar4i[] array = new Scalar4i[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public Scalar4i pop_back() {
        long size = size();
        Scalar4i value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public Vec4iVector push_back(Scalar4i value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public Vec4iVector put(Scalar4i value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public Vec4iVector put(Scalar4i ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

