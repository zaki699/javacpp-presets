// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;

@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class ContactProcessedCallback extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    ContactProcessedCallback(Pointer p) { super(p); }
    protected ContactProcessedCallback() { allocate(); }
    private native void allocate();
    public native @Cast("bool") boolean call(@ByRef btManifoldPoint cp, Pointer body0, Pointer body1);
}
