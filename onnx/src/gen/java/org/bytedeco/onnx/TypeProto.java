// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

// -------------------------------------------------------------------

@Namespace("onnx") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class TypeProto extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TypeProto(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TypeProto(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TypeProto position(long position) {
        return (TypeProto)super.position(position);
    }
    @Override public TypeProto getPointer(long i) {
        return new TypeProto((Pointer)this).offsetAddress(i);
    }

  public TypeProto() { super((Pointer)null); allocate(); }
  private native void allocate();

  public TypeProto(@Const @ByRef TypeProto from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef TypeProto from);

  public native @ByRef @Name("operator =") TypeProto put(@Const @ByRef TypeProto from);

  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Const Reflection GetReflection();
  public static native @Const @ByRef TypeProto default_instance();

  /** enum onnx::TypeProto::ValueCase */
  public static final int
    kTensorType = 1,
    kSequenceType = 4,
    kMapType = 5,
    kOptionalType = 9,
    kSparseTensorType = 8,
    kOpaqueType = 7,
    VALUE_NOT_SET = 0;

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const TypeProto internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  
  public native void Swap(TypeProto other);

  // implements Message ----------------------------------------------

  public native TypeProto New();

  public native TypeProto New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef TypeProto from);
  public native void MergeFrom(@Const @ByRef TypeProto from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
  public native @Cast("const char*") BytePointer _InternalParse(@Cast("const char*") BytePointer ptr, ParseContext ctx);
  public native String _InternalParse(String ptr, ParseContext ctx);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  /** enum onnx::TypeProto:: */
  public static final int
    kDenotationFieldNumber = 6,
    kTensorTypeFieldNumber = 1,
    kSequenceTypeFieldNumber = 4,
    kMapTypeFieldNumber = 5,
    kOptionalTypeFieldNumber = 9,
    kSparseTensorTypeFieldNumber = 8,
    kOpaqueTypeFieldNumber = 7;
  // optional string denotation = 6;
  public native @Cast("bool") boolean has_denotation();
  public native void clear_denotation();
  public native @StdString BytePointer denotation();
  public native void set_denotation(@StdString BytePointer value);
  public native void set_denotation(@StdString String value);
  public native void set_denotation(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_denotation(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_denotation();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_denotation();
  public native void set_allocated_denotation(@StdString @Cast({"char*", "std::string*"}) BytePointer denotation);

  // optional .onnx.TypeProto.Tensor tensor_type = 1;
  public native @Cast("bool") boolean has_tensor_type();
  public native void clear_tensor_type();
  public native @Const @ByRef TypeProto_Tensor tensor_type();
  public native TypeProto_Tensor release_tensor_type();
  public native TypeProto_Tensor mutable_tensor_type();
  public native void set_allocated_tensor_type(TypeProto_Tensor tensor_type);

  // optional .onnx.TypeProto.Sequence sequence_type = 4;
  public native @Cast("bool") boolean has_sequence_type();
  public native void clear_sequence_type();
  public native @Const @ByRef TypeProto_Sequence sequence_type();
  public native TypeProto_Sequence release_sequence_type();
  public native TypeProto_Sequence mutable_sequence_type();
  public native void set_allocated_sequence_type(TypeProto_Sequence sequence_type);

  // optional .onnx.TypeProto.Map map_type = 5;
  public native @Cast("bool") boolean has_map_type();
  public native void clear_map_type();
  public native @Const @ByRef TypeProto_Map map_type();
  public native TypeProto_Map release_map_type();
  public native TypeProto_Map mutable_map_type();
  public native void set_allocated_map_type(TypeProto_Map map_type);

  // optional .onnx.TypeProto.Optional optional_type = 9;
  public native @Cast("bool") boolean has_optional_type();
  public native void clear_optional_type();
  public native @Const @ByRef TypeProto_Optional optional_type();
  public native TypeProto_Optional release_optional_type();
  public native TypeProto_Optional mutable_optional_type();
  public native void set_allocated_optional_type(TypeProto_Optional optional_type);

  // optional .onnx.TypeProto.SparseTensor sparse_tensor_type = 8;
  public native @Cast("bool") boolean has_sparse_tensor_type();
  public native void clear_sparse_tensor_type();
  public native @Const @ByRef TypeProto_SparseTensor sparse_tensor_type();
  public native TypeProto_SparseTensor release_sparse_tensor_type();
  public native TypeProto_SparseTensor mutable_sparse_tensor_type();
  public native void set_allocated_sparse_tensor_type(TypeProto_SparseTensor sparse_tensor_type);

  // optional .onnx.TypeProto.Opaque opaque_type = 7;
  public native @Cast("bool") boolean has_opaque_type();
  public native void clear_opaque_type();
  public native @Const @ByRef TypeProto_Opaque opaque_type();
  public native TypeProto_Opaque release_opaque_type();
  public native TypeProto_Opaque mutable_opaque_type();
  public native void set_allocated_opaque_type(TypeProto_Opaque opaque_type);

  public native void clear_value();
  public native @Cast("onnx::TypeProto::ValueCase") int value_case();
}
