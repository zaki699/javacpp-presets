// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.LinearMath;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.LinearMath.*;


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.LinearMath.class)
public class btHashInt extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btHashInt(Pointer p) { super(p); }

	public btHashInt() { super((Pointer)null); allocate(); }
	private native void allocate();

	public btHashInt(int uid) { super((Pointer)null); allocate(uid); }
	private native void allocate(int uid);

	public native int getUid1();

	public native void setUid1(int uid);

	public native @Cast("bool") boolean equals(@Const @ByRef btHashInt other);
	//to our success
	public native @Cast("unsigned int") int getHash();
}
