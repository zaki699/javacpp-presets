// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletDynamics;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;
import org.bytedeco.bullet.BulletCollision.*;
import static org.bytedeco.bullet.global.BulletCollision.*;

import static org.bytedeco.bullet.global.BulletDynamics.*;


/**Basic interface to allow actions such as vehicles and characters to be updated inside a btDynamicsWorld */
@Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btActionInterface extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btActionInterface(Pointer p) { super(p); }


	public native void updateAction(btCollisionWorld collisionWorld, @Cast("btScalar") float deltaTimeStep);

	public native void debugDraw(btIDebugDraw debugDrawer);
}
