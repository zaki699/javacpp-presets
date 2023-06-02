// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


@Namespace("c10") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SymNodeImpl extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SymNodeImpl() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SymNodeImpl(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SymNodeImpl(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SymNodeImpl position(long position) {
        return (SymNodeImpl)super.position(position);
    }
    @Override public SymNodeImpl getPointer(long i) {
        return new SymNodeImpl((Pointer)this).offsetAddress(i);
    }


  // these could be pure virtual when we implement LTC versions
  public native @Cast("bool") boolean is_int();
  public native @Cast("bool") boolean is_bool();
  public native @Cast("bool") boolean is_float();
  public native @ByVal @Cast("c10::SymNode*") Pointer add(@Cast("const c10::SymNode*") @ByRef Pointer other);
  public native @ByVal @Cast("c10::SymNode*") Pointer sub(@Cast("const c10::SymNode*") @ByRef Pointer other);
  public native @ByVal @Cast("c10::SymNode*") Pointer mul(@Cast("const c10::SymNode*") @ByRef Pointer other);
  public native @ByVal @Cast("c10::SymNode*") Pointer truediv(@Cast("const c10::SymNode*") @ByRef Pointer other);
  public native @ByVal @Cast("c10::SymNode*") Pointer pow(@Cast("const c10::SymNode*") @ByRef Pointer other);
  public native @ByVal @Cast("c10::SymNode*") Pointer floordiv(@Cast("const c10::SymNode*") @ByRef Pointer other);
  public native @ByVal @Cast("c10::SymNode*") Pointer mod(@Cast("const c10::SymNode*") @ByRef Pointer other);
  public native @ByVal @Cast("c10::SymNode*") Pointer eq(@Cast("const c10::SymNode*") @ByRef Pointer other);
  public native @ByVal @Cast("c10::SymNode*") Pointer ne(@Cast("const c10::SymNode*") @ByRef Pointer other);
  public native @ByVal @Cast("c10::SymNode*") Pointer gt(@Cast("const c10::SymNode*") @ByRef Pointer other);
  public native @ByVal @Cast("c10::SymNode*") Pointer lt(@Cast("const c10::SymNode*") @ByRef Pointer other);
  public native @ByVal @Cast("c10::SymNode*") Pointer le(@Cast("const c10::SymNode*") @ByRef Pointer other);
  public native @ByVal @Cast("c10::SymNode*") Pointer ge(@Cast("const c10::SymNode*") @ByRef Pointer other);
  public native @ByVal @Cast("c10::SymNode*") Pointer ceil();
  public native @ByVal @Cast("c10::SymNode*") Pointer floor();
  public native @ByVal @Cast("c10::SymNode*") Pointer neg();
  public native @ByVal @Cast("c10::SymNode*") Pointer sym_min(@Cast("const c10::SymNode*") @ByRef Pointer other);
  public native @ByVal @Cast("c10::SymNode*") Pointer sym_max(@Cast("const c10::SymNode*") @ByRef Pointer other);
  public native @ByVal @Cast("c10::SymNode*") Pointer sym_or(@Cast("const c10::SymNode*") @ByRef Pointer other);
  public native @ByVal @Cast("c10::SymNode*") Pointer sym_and(@Cast("const c10::SymNode*") @ByRef Pointer other);
  public native @ByVal @Cast("c10::SymNode*") Pointer sym_not();
  // NB: self is ignored here, only the arguments are used
  public native @ByVal @Cast("c10::SymNode*") Pointer is_non_overlapping_and_dense(
        @ByVal SymNodeRef sizes,
        @ByVal SymNodeRef strides);
  public native @ByVal @Cast("c10::SymNode*") Pointer clone();
  public native @ByVal @Cast("c10::SymNode*") Pointer sym_float();
  public native @ByVal @Cast("c10::SymNode*") Pointer wrap_int(@Cast("int64_t") long num);
  public native @ByVal @Cast("c10::SymNode*") Pointer wrap_float(double num);
  public native @ByVal @Cast("c10::SymNode*") Pointer wrap_bool(@Cast("bool") boolean num);
  public native @Cast("int64_t") long guard_int(@Cast("const char*") BytePointer file, @Cast("int64_t") long line);
  public native @Cast("int64_t") long guard_int(String file, @Cast("int64_t") long line);
  public native @Cast("bool") boolean guard_bool(@Cast("const char*") BytePointer file, @Cast("int64_t") long line);
  public native @Cast("bool") boolean guard_bool(String file, @Cast("int64_t") long line);
  public native double guard_float(@Cast("const char*") BytePointer file, @Cast("int64_t") long line);
  public native double guard_float(String file, @Cast("int64_t") long line);
  public native @Cast("int64_t") long int_();
  public native @Cast("bool") boolean bool_();
  public native @StdString BytePointer str();
  
}
