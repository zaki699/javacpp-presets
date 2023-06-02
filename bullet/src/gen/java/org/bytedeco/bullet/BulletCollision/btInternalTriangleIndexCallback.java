// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btInternalTriangleIndexCallback extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btInternalTriangleIndexCallback(Pointer p) { super(p); }

	public native void internalProcessTriangleIndex(btVector3 triangle, int partId, int triangleIndex);
}
