// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.LinearMath;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.LinearMath.*;


/**rudimentary class to provide type info */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.LinearMath.class)
public class btTypedObject extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btTypedObject(Pointer p) { super(p); }

	public btTypedObject(int objectType) { super((Pointer)null); allocate(objectType); }
	private native void allocate(int objectType);
	public native int m_objectType(); public native btTypedObject m_objectType(int setter);
	public native int getObjectType();
}
