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
public class MemoryDataParameter extends Message {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MemoryDataParameter(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MemoryDataParameter(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public MemoryDataParameter position(long position) {
        return (MemoryDataParameter)super.position(position);
    }
    @Override public MemoryDataParameter getPointer(long i) {
        return new MemoryDataParameter((Pointer)this).offsetAddress(i);
    }

  public MemoryDataParameter() { super((Pointer)null); allocate(); }
  private native void allocate();

  public MemoryDataParameter(@Const @ByRef MemoryDataParameter from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef MemoryDataParameter from);

  public native @ByRef @Name("operator =") MemoryDataParameter put(@Const @ByRef MemoryDataParameter from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Const Descriptor descriptor();
  public static native @Const @ByRef MemoryDataParameter default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const MemoryDataParameter internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(MemoryDataParameter other);
  

  // implements Message ----------------------------------------------

  public native final MemoryDataParameter New();

  public native final MemoryDataParameter New(Arena arena);
  public native final void CopyFrom(@Const @ByRef Message from);
  public native final void MergeFrom(@Const @ByRef Message from);
  public native void CopyFrom(@Const @ByRef MemoryDataParameter from);
  public native void MergeFrom(@Const @ByRef MemoryDataParameter from);
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

  // accessors -------------------------------------------------------

  // optional uint32 batch_size = 1;
  public native @Cast("bool") boolean has_batch_size();
  public native void clear_batch_size();
  @MemberGetter public static native int kBatchSizeFieldNumber();
  public static final int kBatchSizeFieldNumber = kBatchSizeFieldNumber();
  public native @Cast("google::protobuf::uint32") int batch_size();
  public native void set_batch_size(@Cast("google::protobuf::uint32") int value);

  // optional uint32 channels = 2;
  public native @Cast("bool") boolean has_channels();
  public native void clear_channels();
  @MemberGetter public static native int kChannelsFieldNumber();
  public static final int kChannelsFieldNumber = kChannelsFieldNumber();
  public native @Cast("google::protobuf::uint32") int channels();
  public native void set_channels(@Cast("google::protobuf::uint32") int value);

  // optional uint32 height = 3;
  public native @Cast("bool") boolean has_height();
  public native void clear_height();
  @MemberGetter public static native int kHeightFieldNumber();
  public static final int kHeightFieldNumber = kHeightFieldNumber();
  public native @Cast("google::protobuf::uint32") int height();
  public native void set_height(@Cast("google::protobuf::uint32") int value);

  // optional uint32 width = 4;
  public native @Cast("bool") boolean has_width();
  public native void clear_width();
  @MemberGetter public static native int kWidthFieldNumber();
  public static final int kWidthFieldNumber = kWidthFieldNumber();
  public native @Cast("google::protobuf::uint32") int width();
  public native void set_width(@Cast("google::protobuf::uint32") int value);
}
