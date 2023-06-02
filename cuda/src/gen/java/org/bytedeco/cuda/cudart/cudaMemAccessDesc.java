// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Memory access descriptor
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaMemAccessDesc extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaMemAccessDesc() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaMemAccessDesc(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaMemAccessDesc(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaMemAccessDesc position(long position) {
        return (cudaMemAccessDesc)super.position(position);
    }
    @Override public cudaMemAccessDesc getPointer(long i) {
        return new cudaMemAccessDesc((Pointer)this).offsetAddress(i);
    }

    /** Location on which the request is to change it's accessibility */
    public native @ByRef cudaMemLocation location(); public native cudaMemAccessDesc location(cudaMemLocation setter);
    /** ::CUmemProt accessibility flags to set on the request */
    public native @Cast("cudaMemAccessFlags") int flags(); public native cudaMemAccessDesc flags(int setter);
}
