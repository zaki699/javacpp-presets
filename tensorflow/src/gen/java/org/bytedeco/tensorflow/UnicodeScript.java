// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Determine the script codes of a given tensor of Unicode integer code points.
 * 
 *  This operation converts Unicode code points to script codes corresponding to
 *  each code point. Script codes correspond to International Components for
 *  Unicode (ICU) UScriptCode values. See http://icu-project.org/apiref/icu4c/uscript_8h.html.
 *  Returns -1 (USCRIPT_INVALID_CODE) for invalid codepoints. Output shape will
 *  match input shape.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: A Tensor of int32 Unicode code points.
 * 
 *  Returns:
 *  * {@code Output}: A Tensor of int32 script codes corresponding to each input code point. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class UnicodeScript extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UnicodeScript(Pointer p) { super(p); }

  public UnicodeScript(@Const @ByRef Scope scope, @ByVal Input input) { super((Pointer)null); allocate(scope, input); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native UnicodeScript operation(Operation setter);
  public native @ByRef Output output(); public native UnicodeScript output(Output setter);
}
