// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;


@Namespace("onnx::shape_inference") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class SymbolTableImpl extends SymbolTable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SymbolTableImpl(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SymbolTableImpl(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SymbolTableImpl position(long position) {
        return (SymbolTableImpl)super.position(position);
    }
    @Override public SymbolTableImpl getPointer(long i) {
        return new SymbolTableImpl((Pointer)this).offsetAddress(i);
    }

  public SymbolTableImpl() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native void addFromGraph(@Const @ByRef GraphProto g);
  // Creates a new unique symbol with the given prefix and adds it to the SymbolTable
  // Returns the newly created symbol
  public native @StdString BytePointer createNew(@StdString BytePointer symbol_prefix/*="unk__"*/);
  public native @StdString BytePointer createNew();
  public native @StdString String createNew(@StdString String symbol_prefix/*="unk__"*/);
}
