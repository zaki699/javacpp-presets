// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**The btOverlappingPairCallback class is an additional optional broadphase user callback for adding/removing overlapping pairs, similar interface to btOverlappingPairCache. */
@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btOverlappingPairCallback extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btOverlappingPairCallback(Pointer p) { super(p); }


	public native btBroadphasePair addOverlappingPair(btBroadphaseProxy proxy0, btBroadphaseProxy proxy1);

	public native Pointer removeOverlappingPair(btBroadphaseProxy proxy0, btBroadphaseProxy proxy1, btDispatcher dispatcher);

	public native void removeOverlappingPairsContainingProxy(btBroadphaseProxy proxy0, btDispatcher dispatcher);
}
