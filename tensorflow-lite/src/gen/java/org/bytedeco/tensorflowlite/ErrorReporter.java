// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


/** A functor that reports error to supporting system. Invoked similar to
 *  printf.
 * 
 *  Usage:
 *   ErrorReporter foo;
 *   foo.Report("test %d", 5);
 *  or
 *   va_list args;
 *   foo.Report("test %d", args); // where args is va_list
 * 
 *  Subclass ErrorReporter to provide another reporting destination.
 *  For example, if you have a GUI program, you might redirect to a buffer
 *  that drives a GUI error log box. */
@Namespace("tflite") @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class ErrorReporter extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ErrorReporter(Pointer p) { super(p); }

  public native int Report(@Cast("const char*") BytePointer format, @ByVal @Cast("va_list*") Pointer args);
  public native int Report(String format, @ByVal @Cast("va_list*") Pointer args);
  public native int Report(@Cast("const char*") BytePointer format);
  public native int Report(String format);
  public native int ReportError(Pointer arg0, @Cast("const char*") BytePointer format);
  public native int ReportError(Pointer arg0, String format);
}
