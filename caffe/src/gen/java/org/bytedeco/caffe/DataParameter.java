// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.caffe;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.hdf5.*;
import static org.bytedeco.hdf5.global.hdf5.*;

import static org.bytedeco.caffe.global.caffe.*;

// -------------------------------------------------------------------

@Namespace("caffe") @NoOffset @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class DataParameter extends Message {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DataParameter(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DataParameter(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public DataParameter position(long position) {
        return (DataParameter)super.position(position);
    }
    @Override public DataParameter getPointer(long i) {
        return new DataParameter((Pointer)this).offsetAddress(i);
    }

  public DataParameter() { super((Pointer)null); allocate(); }
  private native void allocate();

  public DataParameter(@Const @ByRef DataParameter from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef DataParameter from);

  public native @ByRef @Name("operator =") DataParameter put(@Const @ByRef DataParameter from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Const Descriptor descriptor();
  public static native @Const @ByRef DataParameter default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const DataParameter internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(DataParameter other);
  

  // implements Message ----------------------------------------------

  public native final DataParameter New();

  public native final DataParameter New(Arena arena);
  public native final void CopyFrom(@Const @ByRef Message from);
  public native final void MergeFrom(@Const @ByRef Message from);
  public native void CopyFrom(@Const @ByRef DataParameter from);
  public native void MergeFrom(@Const @ByRef DataParameter from);
  public native final void Clear();
  public native @Cast("bool") final boolean IsInitialized();

  public native @Cast("size_t") final long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") final boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native final void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") final BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") final ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") final byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native final int GetCachedSize();

  public native @ByVal final Metadata GetMetadata();

  // nested types ----------------------------------------------------
  @MemberGetter public static native @Cast("const caffe::DataParameter::DB") int LEVELDB();
  public static final int LEVELDB = LEVELDB();
  @MemberGetter public static native @Cast("const caffe::DataParameter::DB") int LMDB();
  public static final int LMDB = LMDB();
  public static native @Cast("bool") boolean DB_IsValid(int value);
  @MemberGetter public static native @Cast("const caffe::DataParameter::DB") int DB_MIN();
  public static final int DB_MIN = DB_MIN();
  @MemberGetter public static native @Cast("const caffe::DataParameter::DB") int DB_MAX();
  public static final int DB_MAX = DB_MAX();
  @MemberGetter public static native int DB_ARRAYSIZE();
  public static final int DB_ARRAYSIZE = DB_ARRAYSIZE();
  public static native @Const EnumDescriptor DB_descriptor();
  public static native @StdString BytePointer DB_Name(@Cast("caffe::DataParameter::DB") int value);
  public static native @Cast("bool") boolean DB_Parse(@StdString BytePointer name,
        @Cast("caffe::DataParameter::DB*") IntPointer value);
  public static native @Cast("bool") boolean DB_Parse(@StdString String name,
        @Cast("caffe::DataParameter::DB*") IntBuffer value);
  public static native @Cast("bool") boolean DB_Parse(@StdString BytePointer name,
        @Cast("caffe::DataParameter::DB*") int[] value);
  public static native @Cast("bool") boolean DB_Parse(@StdString String name,
        @Cast("caffe::DataParameter::DB*") IntPointer value);
  public static native @Cast("bool") boolean DB_Parse(@StdString BytePointer name,
        @Cast("caffe::DataParameter::DB*") IntBuffer value);
  public static native @Cast("bool") boolean DB_Parse(@StdString String name,
        @Cast("caffe::DataParameter::DB*") int[] value);

  // accessors -------------------------------------------------------

  // optional string source = 1;
  public native @Cast("bool") boolean has_source();
  public native void clear_source();
  @MemberGetter public static native int kSourceFieldNumber();
  public static final int kSourceFieldNumber = kSourceFieldNumber();
  public native @StdString BytePointer source();
  public native void set_source(@StdString BytePointer value);
  public native void set_source(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_source(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_source(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_source();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_source();
  public native void set_allocated_source(@StdString @Cast({"char*", "std::string*"}) BytePointer source);

  // optional string mean_file = 3;
  public native @Cast("bool") boolean has_mean_file();
  public native void clear_mean_file();
  @MemberGetter public static native int kMeanFileFieldNumber();
  public static final int kMeanFileFieldNumber = kMeanFileFieldNumber();
  public native @StdString BytePointer mean_file();
  public native void set_mean_file(@StdString BytePointer value);
  public native void set_mean_file(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_mean_file(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_mean_file(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_mean_file();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_mean_file();
  public native void set_allocated_mean_file(@StdString @Cast({"char*", "std::string*"}) BytePointer mean_file);

  // optional uint32 batch_size = 4;
  public native @Cast("bool") boolean has_batch_size();
  public native void clear_batch_size();
  @MemberGetter public static native int kBatchSizeFieldNumber();
  public static final int kBatchSizeFieldNumber = kBatchSizeFieldNumber();
  public native @Cast("google::protobuf::uint32") int batch_size();
  public native void set_batch_size(@Cast("google::protobuf::uint32") int value);

  // optional uint32 crop_size = 5 [default = 0];
  public native @Cast("bool") boolean has_crop_size();
  public native void clear_crop_size();
  @MemberGetter public static native int kCropSizeFieldNumber();
  public static final int kCropSizeFieldNumber = kCropSizeFieldNumber();
  public native @Cast("google::protobuf::uint32") int crop_size();
  public native void set_crop_size(@Cast("google::protobuf::uint32") int value);

  // optional uint32 rand_skip = 7 [default = 0];
  public native @Cast("bool") boolean has_rand_skip();
  public native void clear_rand_skip();
  @MemberGetter public static native int kRandSkipFieldNumber();
  public static final int kRandSkipFieldNumber = kRandSkipFieldNumber();
  public native @Cast("google::protobuf::uint32") int rand_skip();
  public native void set_rand_skip(@Cast("google::protobuf::uint32") int value);

  // optional bool mirror = 6 [default = false];
  public native @Cast("bool") boolean has_mirror();
  public native void clear_mirror();
  @MemberGetter public static native int kMirrorFieldNumber();
  public static final int kMirrorFieldNumber = kMirrorFieldNumber();
  public native @Cast("bool") boolean mirror();
  public native void set_mirror(@Cast("bool") boolean value);

  // optional bool force_encoded_color = 9 [default = false];
  public native @Cast("bool") boolean has_force_encoded_color();
  public native void clear_force_encoded_color();
  @MemberGetter public static native int kForceEncodedColorFieldNumber();
  public static final int kForceEncodedColorFieldNumber = kForceEncodedColorFieldNumber();
  public native @Cast("bool") boolean force_encoded_color();
  public native void set_force_encoded_color(@Cast("bool") boolean value);

  // optional .caffe.DataParameter.DB backend = 8 [default = LEVELDB];
  public native @Cast("bool") boolean has_backend();
  public native void clear_backend();
  @MemberGetter public static native int kBackendFieldNumber();
  public static final int kBackendFieldNumber = kBackendFieldNumber();
  public native @Cast("caffe::DataParameter_DB") int backend();
  public native void set_backend(@Cast("caffe::DataParameter_DB") int value);

  // optional float scale = 2 [default = 1];
  public native @Cast("bool") boolean has_scale();
  public native void clear_scale();
  @MemberGetter public static native int kScaleFieldNumber();
  public static final int kScaleFieldNumber = kScaleFieldNumber();
  public native float scale();
  public native void set_scale(float value);

  // optional uint32 prefetch = 10 [default = 4];
  public native @Cast("bool") boolean has_prefetch();
  public native void clear_prefetch();
  @MemberGetter public static native int kPrefetchFieldNumber();
  public static final int kPrefetchFieldNumber = kPrefetchFieldNumber();
  public native @Cast("google::protobuf::uint32") int prefetch();
  public native void set_prefetch(@Cast("google::protobuf::uint32") int value);
}
