// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_dnn;

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

import static org.bytedeco.opencv.global.opencv_dnn.*;

@Name("std::vector<cv::Mat*>") @Properties(inherit = org.bytedeco.opencv.presets.opencv_dnn.class)
public class MatPointerVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MatPointerVector(Pointer p) { super(p); }
    public MatPointerVector(Mat value) { this(1); put(0, value); }
    public MatPointerVector(Mat ... array) { this(array.length); put(array); }
    public MatPointerVector()       { allocate();  }
    public MatPointerVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef MatPointerVector put(@ByRef MatPointerVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native Mat get(@Cast("size_t") long i);
    public native MatPointerVector put(@Cast("size_t") long i, Mat value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, Mat value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @Const Mat get();
    }

    public Mat[] get() {
        Mat[] array = new Mat[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public Mat pop_back() {
        long size = size();
        Mat value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public MatPointerVector push_back(Mat value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public MatPointerVector put(Mat value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public MatPointerVector put(Mat ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

