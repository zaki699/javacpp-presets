// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class RPCOptions extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RPCOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RPCOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public RPCOptions position(long position) {
        return (RPCOptions)super.position(position);
    }
    @Override public RPCOptions getPointer(long i) {
        return new RPCOptions((Pointer)this).offsetAddress(i);
    }

  public RPCOptions() { super((Pointer)null); allocate(); }
  private native void allocate();

  public RPCOptions(@Const @ByRef RPCOptions from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef RPCOptions from);

  public native @ByRef @Name("operator =") RPCOptions put(@Const @ByRef RPCOptions from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef RPCOptions default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const RPCOptions internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(RPCOptions other);
  public native void Swap(RPCOptions other);
  

  // implements Message ----------------------------------------------

  public native RPCOptions New();

  public native RPCOptions New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef RPCOptions from);
  public native void MergeFrom(@Const @ByRef RPCOptions from);
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

  // accessors -------------------------------------------------------

  // string compression_algorithm = 2;
  public native void clear_compression_algorithm();
  @MemberGetter public static native int kCompressionAlgorithmFieldNumber();
  public static final int kCompressionAlgorithmFieldNumber = kCompressionAlgorithmFieldNumber();
  public native @StdString BytePointer compression_algorithm();
  public native void set_compression_algorithm(@StdString BytePointer value);
  public native void set_compression_algorithm(@StdString String value);
  public native void set_compression_algorithm(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_compression_algorithm(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_compression_algorithm();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_compression_algorithm();
  public native void set_allocated_compression_algorithm(@StdString @Cast({"char*", "std::string*"}) BytePointer compression_algorithm);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_compression_algorithm();
  public native void unsafe_arena_set_allocated_compression_algorithm(
        @StdString @Cast({"char*", "std::string*"}) BytePointer compression_algorithm);

  // int32 compression_level = 3;
  public native void clear_compression_level();
  @MemberGetter public static native int kCompressionLevelFieldNumber();
  public static final int kCompressionLevelFieldNumber = kCompressionLevelFieldNumber();
  public native @Cast("google::protobuf::int32") int compression_level();
  public native void set_compression_level(@Cast("google::protobuf::int32") int value);

  // bool use_rpc_for_inprocess_master = 1;
  public native void clear_use_rpc_for_inprocess_master();
  @MemberGetter public static native int kUseRpcForInprocessMasterFieldNumber();
  public static final int kUseRpcForInprocessMasterFieldNumber = kUseRpcForInprocessMasterFieldNumber();
  public native @Cast("bool") boolean use_rpc_for_inprocess_master();
  public native void set_use_rpc_for_inprocess_master(@Cast("bool") boolean value);

  // bool cache_rpc_response = 4;
  public native void clear_cache_rpc_response();
  @MemberGetter public static native int kCacheRpcResponseFieldNumber();
  public static final int kCacheRpcResponseFieldNumber = kCacheRpcResponseFieldNumber();
  public native @Cast("bool") boolean cache_rpc_response();
  public native void set_cache_rpc_response(@Cast("bool") boolean value);

  // bool disable_session_connection_sharing = 5;
  public native void clear_disable_session_connection_sharing();
  @MemberGetter public static native int kDisableSessionConnectionSharingFieldNumber();
  public static final int kDisableSessionConnectionSharingFieldNumber = kDisableSessionConnectionSharingFieldNumber();
  public native @Cast("bool") boolean disable_session_connection_sharing();
  public native void set_disable_session_connection_sharing(@Cast("bool") boolean value);
}
