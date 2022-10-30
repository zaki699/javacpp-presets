// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

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

  @Name("std::hash<caffe2::TypeIdentifier>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class DeviceTypeHash extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public DeviceTypeHash() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public DeviceTypeHash(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public DeviceTypeHash(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public DeviceTypeHash position(long position) {
          return (DeviceTypeHash)super.position(position);
      }
      @Override public DeviceTypeHash getPointer(long i) {
          return new DeviceTypeHash((Pointer)this).offsetAddress(i);
      }
  
    public native @Cast("std::size_t") @Name("operator ()") long apply(@ByVal TypeIdentifier x);
  }
