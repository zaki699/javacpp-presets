// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;


@Namespace("parquet") @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class DecryptionKeyRetriever extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DecryptionKeyRetriever(Pointer p) { super(p); }

  public native @StdString String GetKey(@StdString String key_metadata);
  public native @StdString BytePointer GetKey(@StdString BytePointer key_metadata);
}
