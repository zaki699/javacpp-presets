// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;

@Name("std::vector<std::shared_ptr<arrow::Schema> >") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class SchemaVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SchemaVector(Pointer p) { super(p); }
    public SchemaVector(Schema value) { this(1); put(0, value); }
    public SchemaVector(Schema ... array) { this(array.length); put(array); }
    public SchemaVector()       { allocate();  }
    public SchemaVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef SchemaVector put(@ByRef SchemaVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @SharedPtr Schema get(@Cast("size_t") long i);
    public native SchemaVector put(@Cast("size_t") long i, Schema value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @SharedPtr Schema value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @SharedPtr @Const Schema get();
    }

    public Schema[] get() {
        Schema[] array = new Schema[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public Schema pop_back() {
        long size = size();
        Schema value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public SchemaVector push_back(Schema value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public SchemaVector put(Schema value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public SchemaVector put(Schema ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

