// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

// -------------------------------------------------------------------

@Namespace("onnx") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class TensorShapeProto extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorShapeProto(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TensorShapeProto(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TensorShapeProto position(long position) {
        return (TensorShapeProto)super.position(position);
    }
    @Override public TensorShapeProto getPointer(long i) {
        return new TensorShapeProto((Pointer)this).offsetAddress(i);
    }

  public TensorShapeProto() { super((Pointer)null); allocate(); }
  private native void allocate();

  public TensorShapeProto(@Const @ByRef TensorShapeProto from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef TensorShapeProto from);

  public native @ByRef @Name("operator =") TensorShapeProto put(@Const @ByRef TensorShapeProto from);

  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Const Reflection GetReflection();
  public static native @Const @ByRef TensorShapeProto default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const TensorShapeProto internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  
  public native void Swap(TensorShapeProto other);

  // implements Message ----------------------------------------------

  public native TensorShapeProto New();

  public native TensorShapeProto New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef TensorShapeProto from);
  public native void MergeFrom(@Const @ByRef TensorShapeProto from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
  public native @Cast("const char*") BytePointer _InternalParse(@Cast("const char*") BytePointer ptr, ParseContext ctx);
  public native String _InternalParse(String ptr, ParseContext ctx);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  /** enum onnx::TensorShapeProto:: */
  public static final int
    kDimFieldNumber = 1;
  // repeated .onnx.TensorShapeProto.Dimension dim = 1;
  public native int dim_size();
  public native void clear_dim();
  public native Dimension mutable_dim(int index);
  public native @Const @ByRef Dimension dim(int index);
  public native Dimension add_dim();
}
