// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

// ===================================================================

@Namespace("onnx") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class AttributeProto extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AttributeProto(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AttributeProto(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public AttributeProto position(long position) {
        return (AttributeProto)super.position(position);
    }
    @Override public AttributeProto getPointer(long i) {
        return new AttributeProto(this).position(position + i);
    }

  public AttributeProto() { super((Pointer)null); allocate(); }
  private native void allocate();

  public AttributeProto(@Const @ByRef AttributeProto from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef AttributeProto from);

  public native @ByRef @Name("operator =") AttributeProto put(@Const @ByRef AttributeProto from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef AttributeProto default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const AttributeProto internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(AttributeProto other);
  

  // implements Message ----------------------------------------------

  public native AttributeProto New();

  public native AttributeProto New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef AttributeProto from);
  public native void MergeFrom(@Const @ByRef AttributeProto from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------
  @MemberGetter public static native @Cast("const onnx::AttributeProto::AttributeType") int UNDEFINED();
  public static final int UNDEFINED = UNDEFINED();
  @MemberGetter public static native @Cast("const onnx::AttributeProto::AttributeType") int FLOAT();
  public static final int FLOAT = FLOAT();
  @MemberGetter public static native @Cast("const onnx::AttributeProto::AttributeType") int INT();
  public static final int INT = INT();
  @MemberGetter public static native @Cast("const onnx::AttributeProto::AttributeType") int STRING();
  public static final int STRING = STRING();
  @MemberGetter public static native @Cast("const onnx::AttributeProto::AttributeType") int TENSOR();
  public static final int TENSOR = TENSOR();
  @MemberGetter public static native @Cast("const onnx::AttributeProto::AttributeType") int GRAPH();
  public static final int GRAPH = GRAPH();
  @MemberGetter public static native @Cast("const onnx::AttributeProto::AttributeType") int SPARSE_TENSOR();
  public static final int SPARSE_TENSOR = SPARSE_TENSOR();
  @MemberGetter public static native @Cast("const onnx::AttributeProto::AttributeType") int FLOATS();
  public static final int FLOATS = FLOATS();
  @MemberGetter public static native @Cast("const onnx::AttributeProto::AttributeType") int INTS();
  public static final int INTS = INTS();
  @MemberGetter public static native @Cast("const onnx::AttributeProto::AttributeType") int STRINGS();
  public static final int STRINGS = STRINGS();
  @MemberGetter public static native @Cast("const onnx::AttributeProto::AttributeType") int TENSORS();
  public static final int TENSORS = TENSORS();
  @MemberGetter public static native @Cast("const onnx::AttributeProto::AttributeType") int GRAPHS();
  public static final int GRAPHS = GRAPHS();
  @MemberGetter public static native @Cast("const onnx::AttributeProto::AttributeType") int SPARSE_TENSORS();
  public static final int SPARSE_TENSORS = SPARSE_TENSORS();
  public static native @Cast("bool") boolean AttributeType_IsValid(int value);
  @MemberGetter public static native @Cast("const onnx::AttributeProto::AttributeType") int AttributeType_MIN();
  public static final int AttributeType_MIN = AttributeType_MIN();
  @MemberGetter public static native @Cast("const onnx::AttributeProto::AttributeType") int AttributeType_MAX();
  public static final int AttributeType_MAX = AttributeType_MAX();
  @MemberGetter public static native int AttributeType_ARRAYSIZE();
  public static final int AttributeType_ARRAYSIZE = AttributeType_ARRAYSIZE();
  public static native @Const EnumDescriptor AttributeType_descriptor();
  public static native @StdString BytePointer AttributeType_Name(@Cast("onnx::AttributeProto::AttributeType") int value);
  public static native @Cast("bool") boolean AttributeType_Parse(@StdString BytePointer name,
        @Cast("onnx::AttributeProto::AttributeType*") IntPointer value);
  public static native @Cast("bool") boolean AttributeType_Parse(@StdString String name,
        @Cast("onnx::AttributeProto::AttributeType*") IntBuffer value);
  public static native @Cast("bool") boolean AttributeType_Parse(@StdString BytePointer name,
        @Cast("onnx::AttributeProto::AttributeType*") int... value);
  public static native @Cast("bool") boolean AttributeType_Parse(@StdString String name,
        @Cast("onnx::AttributeProto::AttributeType*") IntPointer value);
  public static native @Cast("bool") boolean AttributeType_Parse(@StdString BytePointer name,
        @Cast("onnx::AttributeProto::AttributeType*") IntBuffer value);
  public static native @Cast("bool") boolean AttributeType_Parse(@StdString String name,
        @Cast("onnx::AttributeProto::AttributeType*") int... value);

  // accessors -------------------------------------------------------

  // repeated float floats = 7;
  public native int floats_size();
  public native void clear_floats();
  @MemberGetter public static native int kFloatsFieldNumber();
  public static final int kFloatsFieldNumber = kFloatsFieldNumber();
  public native float floats(int index);
  public native void set_floats(int index, float value);
  public native void add_floats(float value);

  // repeated int64 ints = 8;
  public native int ints_size();
  public native void clear_ints();
  @MemberGetter public static native int kIntsFieldNumber();
  public static final int kIntsFieldNumber = kIntsFieldNumber();
  public native @Cast("google::protobuf::int64") long ints(int index);
  public native void set_ints(int index, @Cast("google::protobuf::int64") long value);
  public native void add_ints(@Cast("google::protobuf::int64") long value);

  // repeated bytes strings = 9;
  public native int strings_size();
  public native void clear_strings();
  @MemberGetter public static native int kStringsFieldNumber();
  public static final int kStringsFieldNumber = kStringsFieldNumber();
  public native @StdString BytePointer strings(int index);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_strings(int index);
  public native void set_strings(int index, @StdString BytePointer value);
  public native void set_strings(int index, @StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_strings(int index, @Const Pointer value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer add_strings();
  public native void add_strings(@StdString BytePointer value);
  public native void add_strings(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void add_strings(@Const Pointer value, @Cast("size_t") long size);

  // repeated .onnx.TensorProto tensors = 10;
  public native int tensors_size();
  public native void clear_tensors();
  @MemberGetter public static native int kTensorsFieldNumber();
  public static final int kTensorsFieldNumber = kTensorsFieldNumber();
  public native TensorProto mutable_tensors(int index);
  public native @Const @ByRef TensorProto tensors(int index);
  public native TensorProto add_tensors();

  // repeated .onnx.GraphProto graphs = 11;
  public native int graphs_size();
  public native void clear_graphs();
  @MemberGetter public static native int kGraphsFieldNumber();
  public static final int kGraphsFieldNumber = kGraphsFieldNumber();
  public native GraphProto mutable_graphs(int index);
  public native @Const @ByRef GraphProto graphs(int index);
  public native GraphProto add_graphs();

  // repeated .onnx.SparseTensorProto sparse_tensors = 23;
  public native int sparse_tensors_size();
  public native void clear_sparse_tensors();
  @MemberGetter public static native int kSparseTensorsFieldNumber();
  public static final int kSparseTensorsFieldNumber = kSparseTensorsFieldNumber();
  public native SparseTensorProto mutable_sparse_tensors(int index);
  public native @Const @ByRef SparseTensorProto sparse_tensors(int index);
  public native SparseTensorProto add_sparse_tensors();

  // optional string name = 1;
  public native @Cast("bool") boolean has_name();
  public native void clear_name();
  @MemberGetter public static native int kNameFieldNumber();
  public static final int kNameFieldNumber = kNameFieldNumber();
  public native @StdString BytePointer name();
  public native void set_name(@StdString BytePointer value);
  public native void set_name(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_name();
  public native void set_allocated_name(@StdString @Cast({"char*", "std::string*"}) BytePointer name);

  // optional bytes s = 4;
  public native @Cast("bool") boolean has_s();
  public native void clear_s();
  @MemberGetter public static native int kSFieldNumber();
  public static final int kSFieldNumber = kSFieldNumber();
  public native @StdString BytePointer s();
  public native void set_s(@StdString BytePointer value);
  public native void set_s(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_s(@Const Pointer value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_s();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_s();
  public native void set_allocated_s(@StdString @Cast({"char*", "std::string*"}) BytePointer s);

  // optional string doc_string = 13;
  public native @Cast("bool") boolean has_doc_string();
  public native void clear_doc_string();
  @MemberGetter public static native int kDocStringFieldNumber();
  public static final int kDocStringFieldNumber = kDocStringFieldNumber();
  public native @StdString BytePointer doc_string();
  public native void set_doc_string(@StdString BytePointer value);
  public native void set_doc_string(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_doc_string(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_doc_string(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_doc_string();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_doc_string();
  public native void set_allocated_doc_string(@StdString @Cast({"char*", "std::string*"}) BytePointer doc_string);

  // optional string ref_attr_name = 21;
  public native @Cast("bool") boolean has_ref_attr_name();
  public native void clear_ref_attr_name();
  @MemberGetter public static native int kRefAttrNameFieldNumber();
  public static final int kRefAttrNameFieldNumber = kRefAttrNameFieldNumber();
  public native @StdString BytePointer ref_attr_name();
  public native void set_ref_attr_name(@StdString BytePointer value);
  public native void set_ref_attr_name(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_ref_attr_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_ref_attr_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_ref_attr_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_ref_attr_name();
  public native void set_allocated_ref_attr_name(@StdString @Cast({"char*", "std::string*"}) BytePointer ref_attr_name);

  // optional .onnx.TensorProto t = 5;
  public native @Cast("bool") boolean has_t();
  public native void clear_t();
  @MemberGetter public static native int kTFieldNumber();
  public static final int kTFieldNumber = kTFieldNumber();
  public native @Const @ByRef TensorProto t();
  public native TensorProto release_t();
  public native TensorProto mutable_t();
  public native void set_allocated_t(TensorProto t);

  // optional .onnx.GraphProto g = 6;
  public native @Cast("bool") boolean has_g();
  public native void clear_g();
  @MemberGetter public static native int kGFieldNumber();
  public static final int kGFieldNumber = kGFieldNumber();
  public native @Const @ByRef GraphProto g();
  public native GraphProto release_g();
  public native GraphProto mutable_g();
  public native void set_allocated_g(GraphProto g);

  // optional .onnx.SparseTensorProto sparse_tensor = 22;
  public native @Cast("bool") boolean has_sparse_tensor();
  public native void clear_sparse_tensor();
  @MemberGetter public static native int kSparseTensorFieldNumber();
  public static final int kSparseTensorFieldNumber = kSparseTensorFieldNumber();
  public native @Const @ByRef SparseTensorProto sparse_tensor();
  public native SparseTensorProto release_sparse_tensor();
  public native SparseTensorProto mutable_sparse_tensor();
  public native void set_allocated_sparse_tensor(SparseTensorProto sparse_tensor);

  // optional int64 i = 3;
  public native @Cast("bool") boolean has_i();
  public native void clear_i();
  @MemberGetter public static native int kIFieldNumber();
  public static final int kIFieldNumber = kIFieldNumber();
  public native @Cast("google::protobuf::int64") long i();
  public native void set_i(@Cast("google::protobuf::int64") long value);

  // optional float f = 2;
  public native @Cast("bool") boolean has_f();
  public native void clear_f();
  @MemberGetter public static native int kFFieldNumber();
  public static final int kFFieldNumber = kFFieldNumber();
  public native float f();
  public native void set_f(float value);

  // optional .onnx.AttributeProto.AttributeType type = 20;
  public native @Cast("bool") boolean has_type();
  public native void clear_type();
  @MemberGetter public static native int kTypeFieldNumber();
  public static final int kTypeFieldNumber = kTypeFieldNumber();
  public native @Cast("onnx::AttributeProto_AttributeType") int type();
  public native void set_type(@Cast("onnx::AttributeProto_AttributeType") int value);
}
