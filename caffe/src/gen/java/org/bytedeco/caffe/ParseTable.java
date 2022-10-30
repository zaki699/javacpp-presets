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


@Namespace("google::protobuf::internal") @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class ParseTable extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ParseTable() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ParseTable(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ParseTable(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ParseTable position(long position) {
        return (ParseTable)super.position(position);
    }
    @Override public ParseTable getPointer(long i) {
        return new ParseTable((Pointer)this).offsetAddress(i);
    }

  public native @Const ParseTableField fields(); public native ParseTable fields(ParseTableField setter);
  public native @Const AuxillaryParseTableField aux(); public native ParseTable aux(AuxillaryParseTableField setter);
  public native int max_field_number(); public native ParseTable max_field_number(int setter);
  // TODO(ckennelly): Do something with this padding.

  // TODO(ckennelly): Vet these for sign extension.
  public native @Cast("google::protobuf::int64") long has_bits_offset(); public native ParseTable has_bits_offset(long setter);
  public native @Cast("google::protobuf::int64") long oneof_case_offset(); public native ParseTable oneof_case_offset(long setter);
  public native @Cast("google::protobuf::int64") long extension_offset(); public native ParseTable extension_offset(long setter);
  public native @Cast("google::protobuf::int64") long arena_offset(); public native ParseTable arena_offset(long setter);

  // ExplicitlyInitialized<T> -> T requires a reinterpret_cast, which prevents
  // the tables from being constructed as a constexpr.  We use void to avoid
  // the cast.
  public native @Const Pointer default_instance_void(); public native ParseTable default_instance_void(Pointer setter);
  public native @Const MessageLite default_instance();

  public native @Cast("bool") boolean unknown_field_set(); public native ParseTable unknown_field_set(boolean setter);
}
