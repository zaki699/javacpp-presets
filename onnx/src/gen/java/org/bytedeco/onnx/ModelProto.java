// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

// -------------------------------------------------------------------

@Namespace("onnx") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class ModelProto extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ModelProto(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ModelProto(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ModelProto position(long position) {
        return (ModelProto)super.position(position);
    }
    @Override public ModelProto getPointer(long i) {
        return new ModelProto((Pointer)this).offsetAddress(i);
    }

  public ModelProto() { super((Pointer)null); allocate(); }
  private native void allocate();

  public ModelProto(@Const @ByRef ModelProto from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef ModelProto from);

  public native @ByRef @Name("operator =") ModelProto put(@Const @ByRef ModelProto from);

  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Const Reflection GetReflection();
  public static native @Const @ByRef ModelProto default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const ModelProto internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  
  public native void Swap(ModelProto other);

  // implements Message ----------------------------------------------

  public native ModelProto New();

  public native ModelProto New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef ModelProto from);
  public native void MergeFrom(@Const @ByRef ModelProto from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
  public native @Cast("const char*") BytePointer _InternalParse(@Cast("const char*") BytePointer ptr, ParseContext ctx);
  public native String _InternalParse(String ptr, ParseContext ctx);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  /** enum onnx::ModelProto:: */
  public static final int
    kOpsetImportFieldNumber = 8,
    kMetadataPropsFieldNumber = 14,
    kTrainingInfoFieldNumber = 20,
    kFunctionsFieldNumber = 25,
    kProducerNameFieldNumber = 2,
    kProducerVersionFieldNumber = 3,
    kDomainFieldNumber = 4,
    kDocStringFieldNumber = 6,
    kGraphFieldNumber = 7,
    kIrVersionFieldNumber = 1,
    kModelVersionFieldNumber = 5;
  // repeated .onnx.OperatorSetIdProto opset_import = 8;
  public native int opset_import_size();
  public native void clear_opset_import();
  public native OperatorSetIdProto mutable_opset_import(int index);
  public native @Const @ByRef OperatorSetIdProto opset_import(int index);
  public native OperatorSetIdProto add_opset_import();

  // repeated .onnx.StringStringEntryProto metadata_props = 14;
  public native int metadata_props_size();
  public native void clear_metadata_props();
  public native StringStringEntryProto mutable_metadata_props(int index);
  public native @Const @ByRef StringStringEntryProto metadata_props(int index);
  public native StringStringEntryProto add_metadata_props();

  // repeated .onnx.TrainingInfoProto training_info = 20;
  public native int training_info_size();
  public native void clear_training_info();
  public native TrainingInfoProto mutable_training_info(int index);
  public native @Const @ByRef TrainingInfoProto training_info(int index);
  public native TrainingInfoProto add_training_info();

  // repeated .onnx.FunctionProto functions = 25;
  public native int functions_size();
  public native void clear_functions();
  public native FunctionProto mutable_functions(int index);
  public native @Const @ByRef FunctionProto functions(int index);
  public native FunctionProto add_functions();

  // optional string producer_name = 2;
  public native @Cast("bool") boolean has_producer_name();
  public native void clear_producer_name();
  public native @StdString BytePointer producer_name();
  public native void set_producer_name(@StdString BytePointer value);
  public native void set_producer_name(@StdString String value);
  public native void set_producer_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_producer_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_producer_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_producer_name();
  public native void set_allocated_producer_name(@StdString @Cast({"char*", "std::string*"}) BytePointer producer_name);

  // optional string producer_version = 3;
  public native @Cast("bool") boolean has_producer_version();
  public native void clear_producer_version();
  public native @StdString BytePointer producer_version();
  public native void set_producer_version(@StdString BytePointer value);
  public native void set_producer_version(@StdString String value);
  public native void set_producer_version(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_producer_version(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_producer_version();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_producer_version();
  public native void set_allocated_producer_version(@StdString @Cast({"char*", "std::string*"}) BytePointer producer_version);

  // optional string domain = 4;
  public native @Cast("bool") boolean has_domain();
  public native void clear_domain();
  public native @StdString BytePointer domain();
  public native void set_domain(@StdString BytePointer value);
  public native void set_domain(@StdString String value);
  public native void set_domain(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_domain(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_domain();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_domain();
  public native void set_allocated_domain(@StdString @Cast({"char*", "std::string*"}) BytePointer domain);

  // optional string doc_string = 6;
  public native @Cast("bool") boolean has_doc_string();
  public native void clear_doc_string();
  public native @StdString BytePointer doc_string();
  public native void set_doc_string(@StdString BytePointer value);
  public native void set_doc_string(@StdString String value);
  public native void set_doc_string(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_doc_string(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_doc_string();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_doc_string();
  public native void set_allocated_doc_string(@StdString @Cast({"char*", "std::string*"}) BytePointer doc_string);

  // optional .onnx.GraphProto graph = 7;
  public native @Cast("bool") boolean has_graph();
  public native void clear_graph();
  public native @Const @ByRef GraphProto graph();
  public native GraphProto release_graph();
  public native GraphProto mutable_graph();
  public native void set_allocated_graph(GraphProto graph);

  // optional int64 ir_version = 1;
  public native @Cast("bool") boolean has_ir_version();
  public native void clear_ir_version();
  public native @Cast("google::protobuf::int64") long ir_version();
  public native void set_ir_version(@Cast("google::protobuf::int64") long value);

  // optional int64 model_version = 5;
  public native @Cast("bool") boolean has_model_version();
  public native void clear_model_version();
  public native @Cast("google::protobuf::int64") long model_version();
  public native void set_model_version(@Cast("google::protobuf::int64") long value);
}
