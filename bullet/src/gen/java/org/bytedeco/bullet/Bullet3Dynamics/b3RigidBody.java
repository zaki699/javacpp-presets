// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Dynamics;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;
import org.bytedeco.bullet.Bullet3Collision.*;
import static org.bytedeco.bullet.global.Bullet3Collision.*;

import static org.bytedeco.bullet.global.Bullet3Dynamics.*;


@Opaque @Properties(inherit = org.bytedeco.bullet.presets.Bullet3Dynamics.class)
public class b3RigidBody extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public b3RigidBody() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3RigidBody(Pointer p) { super(p); }
}
