// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.libraw;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libraw.global.LibRaw.*;

  @Properties(inherit = org.bytedeco.libraw.presets.LibRaw.class)
public class exif_parser_callback extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    exif_parser_callback(Pointer p) { super(p); }
      protected exif_parser_callback() { allocate(); }
      private native void allocate();
      public native void call(Pointer context, int tag, int type,
                                         int len, @Cast("unsigned int") int ord, Pointer ifp,
                                         @Cast("INT64") long base);
  }
