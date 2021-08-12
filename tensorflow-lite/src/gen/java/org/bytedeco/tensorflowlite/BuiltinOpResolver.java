// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


// This built-in op resolver provides a list of TfLite delegates that could be
// applied by TfLite interpreter by default.
@Namespace("tflite::ops::builtin") @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class BuiltinOpResolver extends MutableOpResolver {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BuiltinOpResolver(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BuiltinOpResolver(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BuiltinOpResolver position(long position) {
        return (BuiltinOpResolver)super.position(position);
    }
    @Override public BuiltinOpResolver getPointer(long i) {
        return new BuiltinOpResolver((Pointer)this).offsetAddress(i);
    }

  public BuiltinOpResolver() { super((Pointer)null); allocate(); }
  private native void allocate();
  public native @ByVal TfLiteDelegatePtrVector GetDelegates(
        int num_threads);
}
