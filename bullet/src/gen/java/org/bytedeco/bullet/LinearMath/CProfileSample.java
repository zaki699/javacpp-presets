// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.LinearMath;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.LinearMath.*;


// #ifndef BT_NO_PROFILE

// #endif  //#ifndef BT_NO_PROFILE

/**ProfileSampleClass is a simple way to profile a function's scope
 * Use the BT_PROFILE macro at the start of scope to time */
@Properties(inherit = org.bytedeco.bullet.presets.LinearMath.class)
public class CProfileSample extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CProfileSample(Pointer p) { super(p); }

	public CProfileSample(@Cast("const char*") BytePointer name) { super((Pointer)null); allocate(name); }
	private native void allocate(@Cast("const char*") BytePointer name);
	public CProfileSample(String name) { super((Pointer)null); allocate(name); }
	private native void allocate(String name);
}
