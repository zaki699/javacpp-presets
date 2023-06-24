// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.numpy;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.cpython.*;
import static org.bytedeco.cpython.global.python.*;

import static org.bytedeco.numpy.global.numpy.*;


/*
 * Memory handler structure for array data.
 */
/* The declaration of free differs from PyMemAllocatorEx */
@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyDataMemAllocator extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyDataMemAllocator() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyDataMemAllocator(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyDataMemAllocator(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyDataMemAllocator position(long position) {
        return (PyDataMemAllocator)super.position(position);
    }
    @Override public PyDataMemAllocator getPointer(long i) {
        return new PyDataMemAllocator((Pointer)this).offsetAddress(i);
    }

    public native Pointer ctx(); public native PyDataMemAllocator ctx(Pointer setter);
    public static class Malloc_Pointer_long extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Malloc_Pointer_long(Pointer p) { super(p); }
        protected Malloc_Pointer_long() { allocate(); }
        private native void allocate();
        public native Pointer call(Pointer ctx, @Cast("size_t") long size);
    }
    public native Malloc_Pointer_long malloc(); public native PyDataMemAllocator malloc(Malloc_Pointer_long setter);
    public static class Calloc_Pointer_long_long extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Calloc_Pointer_long_long(Pointer p) { super(p); }
        protected Calloc_Pointer_long_long() { allocate(); }
        private native void allocate();
        public native Pointer call(Pointer ctx, @Cast("size_t") long nelem, @Cast("size_t") long elsize);
    }
    public native Calloc_Pointer_long_long calloc(); public native PyDataMemAllocator calloc(Calloc_Pointer_long_long setter);
    public static class Realloc_Pointer_Pointer_long extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Realloc_Pointer_Pointer_long(Pointer p) { super(p); }
        protected Realloc_Pointer_Pointer_long() { allocate(); }
        private native void allocate();
        public native Pointer call(Pointer ctx, Pointer ptr, @Cast("size_t") long new_size);
    }
    public native Realloc_Pointer_Pointer_long realloc(); public native PyDataMemAllocator realloc(Realloc_Pointer_Pointer_long setter);
    public static class Free_Pointer_Pointer_long extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Free_Pointer_Pointer_long(Pointer p) { super(p); }
        protected Free_Pointer_Pointer_long() { allocate(); }
        private native void allocate();
        public native void call(Pointer ctx, Pointer ptr, @Cast("size_t") long size);
    }
    public native @Name("free") Free_Pointer_Pointer_long _free(); public native PyDataMemAllocator _free(Free_Pointer_Pointer_long setter);
    /*
     * This is the end of the version=1 struct. Only add new fields after
     * this line
     */
}
