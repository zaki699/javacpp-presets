// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief SelectK options */
@Namespace("arrow::compute") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class SelectKOptions extends FunctionOptions {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SelectKOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SelectKOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SelectKOptions position(long position) {
        return (SelectKOptions)super.position(position);
    }
    @Override public SelectKOptions getPointer(long i) {
        return new SelectKOptions((Pointer)this).offsetAddress(i);
    }

  public SelectKOptions(@Cast("int64_t") long k/*=-1*/, @StdVector SortKey sort_keys/*={}*/) { super((Pointer)null); allocate(k, sort_keys); }
  private native void allocate(@Cast("int64_t") long k/*=-1*/, @StdVector SortKey sort_keys/*={}*/);
  public SelectKOptions() { super((Pointer)null); allocate(); }
  private native void allocate();
  @MemberGetter public static native byte kTypeName(int i);
  @MemberGetter public static native String kTypeName();
  public static native @ByVal SelectKOptions Defaults();

  public static native @ByVal SelectKOptions TopKDefault(@Cast("int64_t") long k, @ByVal(nullValue = "std::vector<std::string>{}") StringVector key_names);
  public static native @ByVal SelectKOptions TopKDefault(@Cast("int64_t") long k);
  public static native @ByVal SelectKOptions BottomKDefault(@Cast("int64_t") long k,
                                         @ByVal(nullValue = "std::vector<std::string>{}") StringVector key_names);
  public static native @ByVal SelectKOptions BottomKDefault(@Cast("int64_t") long k);

  /** The number of {@code k} elements to keep. */
  public native @Cast("int64_t") long k(); public native SelectKOptions k(long setter);
  /** Column key(s) to order by and how to order by these sort keys. */
  public native @StdVector SortKey sort_keys(); public native SelectKOptions sort_keys(SortKey setter);
}
