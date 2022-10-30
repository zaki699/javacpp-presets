// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

// -------------------------------------------------------------------

@Namespace("onnx") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class MapProto extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MapProto(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MapProto(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public MapProto position(long position) {
        return (MapProto)super.position(position);
    }
    @Override public MapProto getPointer(long i) {
        return new MapProto((Pointer)this).offsetAddress(i);
    }

  public MapProto() { super((Pointer)null); allocate(); }
  private native void allocate();

  public MapProto(@Const @ByRef MapProto from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef MapProto from);

  public native @ByRef @Name("operator =") MapProto put(@Const @ByRef MapProto from);

  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Const Reflection GetReflection();
  public static native @Const @ByRef MapProto default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const MapProto internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  
  public native void Swap(MapProto other);

  // implements Message ----------------------------------------------

  public native MapProto New();

  public native MapProto New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef MapProto from);
  public native void MergeFrom(@Const @ByRef MapProto from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
  public native @Cast("const char*") BytePointer _InternalParse(@Cast("const char*") BytePointer ptr, ParseContext ctx);
  public native String _InternalParse(String ptr, ParseContext ctx);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  /** enum onnx::MapProto:: */
  public static final int
    kKeysFieldNumber = 3,
    kStringKeysFieldNumber = 4,
    kNameFieldNumber = 1,
    kValuesFieldNumber = 5,
    kKeyTypeFieldNumber = 2;
  // repeated int64 keys = 3;
  public native int keys_size();
  public native void clear_keys();
  public native @Cast("google::protobuf::int64") long keys(int index);
  public native void set_keys(int index, @Cast("google::protobuf::int64") long value);
  public native void add_keys(@Cast("google::protobuf::int64") long value);

  // repeated bytes string_keys = 4;
  public native int string_keys_size();
  public native void clear_string_keys();
  public native @StdString BytePointer string_keys(int index);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_string_keys(int index);
  public native void set_string_keys(int index, @StdString BytePointer value);
  public native void set_string_keys(int index, @StdString String value);
  public native void set_string_keys(int index, @Const Pointer value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer add_string_keys();
  public native void add_string_keys(@StdString BytePointer value);
  public native void add_string_keys(@StdString String value);
  public native void add_string_keys(@Const Pointer value, @Cast("size_t") long size);

  // optional string name = 1;
  public native @Cast("bool") boolean has_name();
  public native void clear_name();
  public native @StdString BytePointer name();
  public native void set_name(@StdString BytePointer value);
  public native void set_name(@StdString String value);
  public native void set_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_name();
  public native void set_allocated_name(@StdString @Cast({"char*", "std::string*"}) BytePointer name);

  // optional .onnx.SequenceProto values = 5;
  public native @Cast("bool") boolean has_values();
  public native void clear_values();
  public native @Const @ByRef SequenceProto values();
  public native SequenceProto release_values();
  public native SequenceProto mutable_values();
  public native void set_allocated_values(SequenceProto values);

  // optional int32 key_type = 2;
  public native @Cast("bool") boolean has_key_type();
  public native void clear_key_type();
  public native @Cast("google::protobuf::int32") int key_type();
  public native void set_key_type(@Cast("google::protobuf::int32") int value);
}
