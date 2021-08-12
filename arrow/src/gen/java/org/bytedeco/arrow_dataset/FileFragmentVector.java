// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;

@Name("std::vector<std::shared_ptr<arrow::dataset::FileFragment> >") @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class FileFragmentVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FileFragmentVector(Pointer p) { super(p); }
    public FileFragmentVector(FileFragment value) { this(1); put(0, value); }
    public FileFragmentVector(FileFragment ... array) { this(array.length); put(array); }
    public FileFragmentVector()       { allocate();  }
    public FileFragmentVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef FileFragmentVector put(@ByRef FileFragmentVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @SharedPtr FileFragment get(@Cast("size_t") long i);
    public native FileFragmentVector put(@Cast("size_t") long i, FileFragment value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @SharedPtr FileFragment value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @SharedPtr @Const FileFragment get();
    }

    public FileFragment[] get() {
        FileFragment[] array = new FileFragment[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public FileFragment pop_back() {
        long size = size();
        FileFragment value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public FileFragmentVector push_back(FileFragment value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public FileFragmentVector put(FileFragment value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public FileFragmentVector put(FileFragment ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

