// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;
 /* namespace google */

// Internal implementation detail -- do not use these members.
@Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class TableStruct_onnx_2fonnx_2ddata_2eproto extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TableStruct_onnx_2fonnx_2ddata_2eproto() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TableStruct_onnx_2fonnx_2ddata_2eproto(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TableStruct_onnx_2fonnx_2ddata_2eproto(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TableStruct_onnx_2fonnx_2ddata_2eproto position(long position) {
        return (TableStruct_onnx_2fonnx_2ddata_2eproto)super.position(position);
    }
    @Override public TableStruct_onnx_2fonnx_2ddata_2eproto getPointer(long i) {
        return new TableStruct_onnx_2fonnx_2ddata_2eproto((Pointer)this).offsetAddress(i);
    }

  @MemberGetter public static native @Cast("const google::protobuf::uint32") int offsets(int i);
  @MemberGetter public static native @Cast("const google::protobuf::uint32*") IntPointer offsets();
}
