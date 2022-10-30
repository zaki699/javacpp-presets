// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.clang;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;

import static org.bytedeco.llvm.global.clang.*;


@Properties(inherit = org.bytedeco.llvm.presets.clang.class)
public class CXIdxObjCProtocolRefListInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXIdxObjCProtocolRefListInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CXIdxObjCProtocolRefListInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIdxObjCProtocolRefListInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CXIdxObjCProtocolRefListInfo position(long position) {
        return (CXIdxObjCProtocolRefListInfo)super.position(position);
    }
    @Override public CXIdxObjCProtocolRefListInfo getPointer(long i) {
        return new CXIdxObjCProtocolRefListInfo((Pointer)this).offsetAddress(i);
    }

  @MemberGetter public native @Const CXIdxObjCProtocolRefInfo protocols(int i);
  @MemberGetter public native @Cast("const CXIdxObjCProtocolRefInfo*const*") PointerPointer protocols();
  public native @Cast("unsigned") int numProtocols(); public native CXIdxObjCProtocolRefListInfo numProtocols(int setter);
}
