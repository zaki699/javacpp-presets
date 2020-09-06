// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;

@Name("std::vector<cv::Point2f>") @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class Point2fVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Point2fVector(Pointer p) { super(p); }
    public Point2fVector(Point2f value) { this(1); put(0, value); }
    public Point2fVector(Point2f ... array) { this(array.length); put(array); }
    public Point2fVector()       { allocate();  }
    public Point2fVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef Point2fVector put(@ByRef Point2fVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @ByRef Point2f get(@Cast("size_t") long i);
    public native Point2fVector put(@Cast("size_t") long i, Point2f value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @ByRef Point2f value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @ByRef @Const Point2f get();
    }

    public Point2f[] get() {
        Point2f[] array = new Point2f[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public Point2f pop_back() {
        long size = size();
        Point2f value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public Point2fVector push_back(Point2f value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public Point2fVector put(Point2f value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public Point2fVector put(Point2f ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

