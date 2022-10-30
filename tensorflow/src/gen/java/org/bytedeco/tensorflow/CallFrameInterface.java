// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class CallFrameInterface extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CallFrameInterface(Pointer p) { super(p); }


  public native @Cast("size_t") long num_args();
  public native @Cast("size_t") long num_retvals();

  public native @ByVal Status GetArg(int index, Tensor val);
  public native @ByVal Status SetRetval(int index, @Const @ByRef Tensor val);
}
