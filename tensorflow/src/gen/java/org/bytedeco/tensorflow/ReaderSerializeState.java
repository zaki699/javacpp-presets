// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Produce a string tensor that encodes the state of a Reader.
 * 
 *  Not all Readers support being serialized, so this can produce an
 *  Unimplemented error.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * reader_handle: Handle to a Reader.
 * 
 *  Returns:
 *  * {@code Output}: The state tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ReaderSerializeState extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ReaderSerializeState(Pointer p) { super(p); }

  public ReaderSerializeState(@Const @ByRef Scope scope, @ByVal Input reader_handle) { super((Pointer)null); allocate(scope, reader_handle); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input reader_handle);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native ReaderSerializeState operation(Operation setter);
  public native @ByRef Output state(); public native ReaderSerializeState state(Output setter);
}
