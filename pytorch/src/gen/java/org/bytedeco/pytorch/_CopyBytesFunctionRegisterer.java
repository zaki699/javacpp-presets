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
public class _CopyBytesFunctionRegisterer extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _CopyBytesFunctionRegisterer(Pointer p) { super(p); }

  public _CopyBytesFunctionRegisterer(
        DeviceType from,
        DeviceType to,
        CopyBytesFunction func_sync,
        CopyBytesFunction func_async/*=nullptr*/) { super((Pointer)null); allocate(from, to, func_sync, func_async); }
  private native void allocate(
        DeviceType from,
        DeviceType to,
        CopyBytesFunction func_sync,
        CopyBytesFunction func_async/*=nullptr*/);
  public _CopyBytesFunctionRegisterer(
        DeviceType from,
        DeviceType to,
        CopyBytesFunction func_sync) { super((Pointer)null); allocate(from, to, func_sync); }
  private native void allocate(
        DeviceType from,
        DeviceType to,
        CopyBytesFunction func_sync);
  public _CopyBytesFunctionRegisterer(
        @Cast("c10::DeviceType") byte from,
        @Cast("c10::DeviceType") byte to,
        CopyBytesFunction func_sync,
        CopyBytesFunction func_async/*=nullptr*/) { super((Pointer)null); allocate(from, to, func_sync, func_async); }
  private native void allocate(
        @Cast("c10::DeviceType") byte from,
        @Cast("c10::DeviceType") byte to,
        CopyBytesFunction func_sync,
        CopyBytesFunction func_async/*=nullptr*/);
  public _CopyBytesFunctionRegisterer(
        @Cast("c10::DeviceType") byte from,
        @Cast("c10::DeviceType") byte to,
        CopyBytesFunction func_sync) { super((Pointer)null); allocate(from, to, func_sync); }
  private native void allocate(
        @Cast("c10::DeviceType") byte from,
        @Cast("c10::DeviceType") byte to,
        CopyBytesFunction func_sync);
}
