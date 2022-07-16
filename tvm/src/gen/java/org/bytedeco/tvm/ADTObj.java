// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tvm;

import org.bytedeco.tvm.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;
import static org.bytedeco.mkl.global.mkl_rt.*;

import static org.bytedeco.tvm.global.tvm_runtime.*;


/** \brief An object representing a structure or enumeration. */
@Namespace("tvm::runtime") @NoOffset @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class ADTObj extends TVMObject {
    static { Loader.load(); }
    /** Default native constructor. */
    public ADTObj() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ADTObj(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ADTObj(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ADTObj position(long position) {
        return (ADTObj)super.position(position);
    }
    @Override public ADTObj getPointer(long i) {
        return new ADTObj((Pointer)this).offsetAddress(i);
    }
    public ADTObjBase asADTObjBase() { return asADTObjBase(this); }
    @Namespace public static native @Name("static_cast<tvm::runtime::InplaceArrayBase<tvm::runtime::ADTObj,tvm::runtime::ObjectRef>*>") ADTObjBase asADTObjBase(ADTObj pointer);

  /** \brief The tag representing the constructor used. */
  public native int tag(); public native ADTObj tag(int setter);
  /** \brief Number of fields in the ADT object. */
  public native @Cast("uint32_t") int size(); public native ADTObj size(int setter);
  // The fields of the structure follows directly in memory.

  @MemberGetter public static native @Cast("const uint32_t") int _type_index();
  public static final int _type_index = _type_index();
  @MemberGetter public static native @Cast("const char*") BytePointer _type_key();
  @MemberGetter public static native @Cast("const bool") boolean _type_final();
  public static final boolean _type_final = _type_final();
  @MemberGetter public static native int _type_child_slots();
  public static final int _type_child_slots = _type_child_slots();
  public static native @Cast("uint32_t") int RuntimeTypeIndex();
  public static native @Cast("uint32_t") int _GetOrAllocRuntimeTypeIndex();
}
