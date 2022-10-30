// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Simple wrapper class that can be used to retrieve EagerClients.
@Namespace("tensorflow::eager") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class EagerClientCache extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EagerClientCache(Pointer p) { super(p); }

  public native @ByVal Status GetClient(@StdString BytePointer target, @Cast("tensorflow::eager::EagerClient**") PointerPointer client);
  public native @ByVal Status GetClient(@StdString BytePointer target, @ByPtrPtr EagerClient client);
  public native @ByVal Status GetClient(@StdString String target, @ByPtrPtr EagerClient client);
}
