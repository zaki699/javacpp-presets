// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**btCollisionConfiguration allows to configure Bullet collision detection
 * stack allocator, pool memory allocators
 * \todo: describe the meaning */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btDefaultCollisionConfiguration extends btCollisionConfiguration {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btDefaultCollisionConfiguration(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btDefaultCollisionConfiguration(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btDefaultCollisionConfiguration position(long position) {
        return (btDefaultCollisionConfiguration)super.position(position);
    }
    @Override public btDefaultCollisionConfiguration getPointer(long i) {
        return new btDefaultCollisionConfiguration((Pointer)this).offsetAddress(i);
    }

	public btDefaultCollisionConfiguration(@Const @ByRef(nullValue = "btDefaultCollisionConstructionInfo()") btDefaultCollisionConstructionInfo constructionInfo) { super((Pointer)null); allocate(constructionInfo); }
	private native void allocate(@Const @ByRef(nullValue = "btDefaultCollisionConstructionInfo()") btDefaultCollisionConstructionInfo constructionInfo);
	public btDefaultCollisionConfiguration() { super((Pointer)null); allocate(); }
	private native void allocate();

	/**memory pools */
	public native btPoolAllocator getPersistentManifoldPool();

	public native btPoolAllocator getCollisionAlgorithmPool();

	public native btCollisionAlgorithmCreateFunc getCollisionAlgorithmCreateFunc(int proxyType0, int proxyType1);

	public native btCollisionAlgorithmCreateFunc getClosestPointsAlgorithmCreateFunc(int proxyType0, int proxyType1);

	/**Use this method to allow to generate multiple contact points between at once, between two objects using the generic convex-convex algorithm.
	 * By default, this feature is disabled for best performance.
	 * @param numPerturbationIterations controls the number of collision queries. Set it to zero to disable the feature.
	 * @param minimumPointsPerturbationThreshold is the minimum number of points in the contact cache, above which the feature is disabled
	 * 3 is a good value for both params, if you want to enable the feature. This is because the default contact cache contains a maximum of 4 points, and one collision query at the unperturbed orientation is performed first.
	 * See Bullet/Demos/CollisionDemo for an example how this feature gathers multiple points.
	 * \todo we could add a per-object setting of those parameters, for level-of-detail collision detection. */
	public native void setConvexConvexMultipointIterations(int numPerturbationIterations/*=3*/, int minimumPointsPerturbationThreshold/*=3*/);
	public native void setConvexConvexMultipointIterations();

	public native void setPlaneConvexMultipointIterations(int numPerturbationIterations/*=3*/, int minimumPointsPerturbationThreshold/*=3*/);
	public native void setPlaneConvexMultipointIterations();
}
