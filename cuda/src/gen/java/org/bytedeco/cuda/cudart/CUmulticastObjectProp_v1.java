// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
* Specifies the properties for a multicast object.
*/
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUmulticastObjectProp_v1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUmulticastObjectProp_v1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUmulticastObjectProp_v1(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUmulticastObjectProp_v1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUmulticastObjectProp_v1 position(long position) {
        return (CUmulticastObjectProp_v1)super.position(position);
    }
    @Override public CUmulticastObjectProp_v1 getPointer(long i) {
        return new CUmulticastObjectProp_v1((Pointer)this).offsetAddress(i);
    }

    /**
     * The number of devices in the multicast team that will bind memory to this
     * object
     */
    public native @Cast("unsigned int") int numDevices(); public native CUmulticastObjectProp_v1 numDevices(int setter);
    /** 
     * The maximum amount of memory that can be bound to this multicast object
     * per device
     */
    public native @Cast("size_t") long size(); public native CUmulticastObjectProp_v1 size(long setter);
    /**
     * Bitmask of exportable handle types (see ::CUmemAllocationHandleType) for
     * this object
     */
    public native @Cast("unsigned long long") long handleTypes(); public native CUmulticastObjectProp_v1 handleTypes(long setter);
    /** 
     * Flags for future use, must be zero now
     */
    public native @Cast("unsigned long long") long flags(); public native CUmulticastObjectProp_v1 flags(long setter);
}
