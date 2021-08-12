// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

// -------------------------------------------------------------------

@Namespace("onnx") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class TypeProto_Optional extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TypeProto_Optional(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TypeProto_Optional(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TypeProto_Optional position(long position) {
        return (TypeProto_Optional)super.position(position);
    }
    @Override public TypeProto_Optional getPointer(long i) {
        return new TypeProto_Optional((Pointer)this).offsetAddress(i);
    }

  public TypeProto_Optional() { super((Pointer)null); allocate(); }
  private native void allocate();

  public TypeProto_Optional(@Const @ByRef TypeProto_Optional from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef TypeProto_Optional from);

  public native @ByRef @Name("operator =") TypeProto_Optional put(@Const @ByRef TypeProto_Optional from);

  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Const Reflection GetReflection();
  public static native @Const @ByRef TypeProto_Optional default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const TypeProto_Optional internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  
  public native void Swap(TypeProto_Optional other);

  // implements Message ----------------------------------------------

  public native TypeProto_Optional New();

  public native TypeProto_Optional New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef TypeProto_Optional from);
  public native void MergeFrom(@Const @ByRef TypeProto_Optional from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
  public native @Cast("const char*") BytePointer _InternalParse(@Cast("const char*") BytePointer ptr, ParseContext ctx);
  public native String _InternalParse(String ptr, ParseContext ctx);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  /** enum onnx::TypeProto_Optional:: */
  public static final int
    kElemTypeFieldNumber = 1;
  // optional .onnx.TypeProto elem_type = 1;
  public native @Cast("bool") boolean has_elem_type();
  public native void clear_elem_type();
  public native @Const @ByRef TypeProto elem_type();
  public native TypeProto release_elem_type();
  public native TypeProto mutable_elem_type();
  public native void set_allocated_elem_type(TypeProto elem_type);
}
