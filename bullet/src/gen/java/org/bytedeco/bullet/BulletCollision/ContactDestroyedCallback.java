// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


// #ifndef SWIG

@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class ContactDestroyedCallback extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    ContactDestroyedCallback(Pointer p) { super(p); }
    protected ContactDestroyedCallback() { allocate(); }
    private native void allocate();
    public native @Cast("bool") boolean call(Pointer userPersistentData);
}
