// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**CollisionWorld is interface and container for the collision detection */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btCollisionWorld extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btCollisionWorld(Pointer p) { super(p); }

	//this constructor doesn't own the dispatcher and paircache/broadphase
	public btCollisionWorld(btDispatcher dispatcher, btBroadphaseInterface broadphasePairCache, btCollisionConfiguration collisionConfiguration) { super((Pointer)null); allocate(dispatcher, broadphasePairCache, collisionConfiguration); }
	private native void allocate(btDispatcher dispatcher, btBroadphaseInterface broadphasePairCache, btCollisionConfiguration collisionConfiguration);

	public native void setBroadphase(btBroadphaseInterface pairCache);

	public native btBroadphaseInterface getBroadphase();

	public native btOverlappingPairCache getPairCache();

	public native btDispatcher getDispatcher();

	public native void updateSingleAabb(btCollisionObject colObj);

	public native void updateAabbs();

	/**the computeOverlappingPairs is usually already called by performDiscreteCollisionDetection (or stepSimulation)
	 * it can be useful to use if you perform ray tests without collision detection/simulation */
	public native void computeOverlappingPairs();

	public native void setDebugDrawer(btIDebugDraw debugDrawer);

	public native btIDebugDraw getDebugDrawer();

	public native void debugDrawWorld();

	public native void debugDrawObject(@Const @ByRef btTransform worldTransform, @Const btCollisionShape shape, @Const @ByRef btVector3 color);

	/**LocalShapeInfo gives extra information for complex shapes
	 * Currently, only btTriangleMeshShape is available, so it just contains triangleIndex and subpart */
	public static class LocalShapeInfo extends Pointer {
	    static { Loader.load(); }
	    /** Default native constructor. */
	    public LocalShapeInfo() { super((Pointer)null); allocate(); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public LocalShapeInfo(long size) { super((Pointer)null); allocateArray(size); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public LocalShapeInfo(Pointer p) { super(p); }
	    private native void allocate();
	    private native void allocateArray(long size);
	    @Override public LocalShapeInfo position(long position) {
	        return (LocalShapeInfo)super.position(position);
	    }
	    @Override public LocalShapeInfo getPointer(long i) {
	        return new LocalShapeInfo((Pointer)this).offsetAddress(i);
	    }
	
		public native int m_shapePart(); public native LocalShapeInfo m_shapePart(int setter);
		public native int m_triangleIndex(); public native LocalShapeInfo m_triangleIndex(int setter);

		//const btCollisionShape*	m_shapeTemp;
		//const btTransform*	m_shapeLocalTransform;
	}

	@NoOffset public static class LocalRayResult extends Pointer {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public LocalRayResult(Pointer p) { super(p); }
	
		public LocalRayResult(@Const btCollisionObject collisionObject,
							   LocalShapeInfo localShapeInfo,
							   @Const @ByRef btVector3 hitNormalLocal,
							   @Cast("btScalar") double hitFraction) { super((Pointer)null); allocate(collisionObject, localShapeInfo, hitNormalLocal, hitFraction); }
		private native void allocate(@Const btCollisionObject collisionObject,
							   LocalShapeInfo localShapeInfo,
							   @Const @ByRef btVector3 hitNormalLocal,
							   @Cast("btScalar") double hitFraction);

		public native @Const btCollisionObject m_collisionObject(); public native LocalRayResult m_collisionObject(btCollisionObject setter);
		public native LocalShapeInfo m_localShapeInfo(); public native LocalRayResult m_localShapeInfo(LocalShapeInfo setter);
		public native @ByRef btVector3 m_hitNormalLocal(); public native LocalRayResult m_hitNormalLocal(btVector3 setter);
		public native @Cast("btScalar") double m_hitFraction(); public native LocalRayResult m_hitFraction(double setter);
	}

	/**RayResultCallback is used to report new raycast results */
	@NoOffset public static class RayResultCallback extends Pointer {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public RayResultCallback(Pointer p) { super(p); }
	
		public native @Cast("btScalar") double m_closestHitFraction(); public native RayResultCallback m_closestHitFraction(double setter);
		public native @Const btCollisionObject m_collisionObject(); public native RayResultCallback m_collisionObject(btCollisionObject setter);
		public native int m_collisionFilterGroup(); public native RayResultCallback m_collisionFilterGroup(int setter);
		public native int m_collisionFilterMask(); public native RayResultCallback m_collisionFilterMask(int setter);
		//@BP Mod - Custom flags, currently used to enable backface culling on tri-meshes, see btRaycastCallback.h. Apply any of the EFlags defined there on m_flags here to invoke.
		public native @Cast("unsigned int") int m_flags(); public native RayResultCallback m_flags(int setter);
		public native @Cast("bool") boolean hasHit();

		public native @Cast("bool") boolean needsCollision(btBroadphaseProxy proxy0);

		public native @Cast("btScalar") double addSingleResult(@ByRef LocalRayResult rayResult, @Cast("bool") boolean normalInWorldSpace);
	}

	@NoOffset public static class ClosestRayResultCallback extends RayResultCallback {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public ClosestRayResultCallback(Pointer p) { super(p); }
	
		public ClosestRayResultCallback(@Const @ByRef btVector3 rayFromWorld, @Const @ByRef btVector3 rayToWorld) { super((Pointer)null); allocate(rayFromWorld, rayToWorld); }
		private native void allocate(@Const @ByRef btVector3 rayFromWorld, @Const @ByRef btVector3 rayToWorld);

		public native @ByRef btVector3 m_rayFromWorld(); public native ClosestRayResultCallback m_rayFromWorld(btVector3 setter);  //used to calculate hitPointWorld from hitFraction
		public native @ByRef btVector3 m_rayToWorld(); public native ClosestRayResultCallback m_rayToWorld(btVector3 setter);

		public native @ByRef btVector3 m_hitNormalWorld(); public native ClosestRayResultCallback m_hitNormalWorld(btVector3 setter);
		public native @ByRef btVector3 m_hitPointWorld(); public native ClosestRayResultCallback m_hitPointWorld(btVector3 setter);

		public native @Cast("btScalar") double addSingleResult(@ByRef LocalRayResult rayResult, @Cast("bool") boolean normalInWorldSpace);
	}

	@NoOffset public static class AllHitsRayResultCallback extends RayResultCallback {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public AllHitsRayResultCallback(Pointer p) { super(p); }
	
		public AllHitsRayResultCallback(@Const @ByRef btVector3 rayFromWorld, @Const @ByRef btVector3 rayToWorld) { super((Pointer)null); allocate(rayFromWorld, rayToWorld); }
		private native void allocate(@Const @ByRef btVector3 rayFromWorld, @Const @ByRef btVector3 rayToWorld);

		

		public native @ByRef btVector3 m_rayFromWorld(); public native AllHitsRayResultCallback m_rayFromWorld(btVector3 setter);  //used to calculate hitPointWorld from hitFraction
		public native @ByRef btVector3 m_rayToWorld(); public native AllHitsRayResultCallback m_rayToWorld(btVector3 setter);

		public native @ByRef btVector3Array m_hitNormalWorld(); public native AllHitsRayResultCallback m_hitNormalWorld(btVector3Array setter);
		public native @ByRef btVector3Array m_hitPointWorld(); public native AllHitsRayResultCallback m_hitPointWorld(btVector3Array setter);
		public native @ByRef btScalarArray m_hitFractions(); public native AllHitsRayResultCallback m_hitFractions(btScalarArray setter);

		public native @Cast("btScalar") double addSingleResult(@ByRef LocalRayResult rayResult, @Cast("bool") boolean normalInWorldSpace);
	}

	@NoOffset public static class LocalConvexResult extends Pointer {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public LocalConvexResult(Pointer p) { super(p); }
	
		public LocalConvexResult(@Const btCollisionObject hitCollisionObject,
								  LocalShapeInfo localShapeInfo,
								  @Const @ByRef btVector3 hitNormalLocal,
								  @Const @ByRef btVector3 hitPointLocal,
								  @Cast("btScalar") double hitFraction) { super((Pointer)null); allocate(hitCollisionObject, localShapeInfo, hitNormalLocal, hitPointLocal, hitFraction); }
		private native void allocate(@Const btCollisionObject hitCollisionObject,
								  LocalShapeInfo localShapeInfo,
								  @Const @ByRef btVector3 hitNormalLocal,
								  @Const @ByRef btVector3 hitPointLocal,
								  @Cast("btScalar") double hitFraction);

		public native @Const btCollisionObject m_hitCollisionObject(); public native LocalConvexResult m_hitCollisionObject(btCollisionObject setter);
		public native LocalShapeInfo m_localShapeInfo(); public native LocalConvexResult m_localShapeInfo(LocalShapeInfo setter);
		public native @ByRef btVector3 m_hitNormalLocal(); public native LocalConvexResult m_hitNormalLocal(btVector3 setter);
		public native @ByRef btVector3 m_hitPointLocal(); public native LocalConvexResult m_hitPointLocal(btVector3 setter);
		public native @Cast("btScalar") double m_hitFraction(); public native LocalConvexResult m_hitFraction(double setter);
	}

	/**RayResultCallback is used to report new raycast results */
	@NoOffset public static class ConvexResultCallback extends Pointer {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public ConvexResultCallback(Pointer p) { super(p); }
	
		public native @Cast("btScalar") double m_closestHitFraction(); public native ConvexResultCallback m_closestHitFraction(double setter);
		public native int m_collisionFilterGroup(); public native ConvexResultCallback m_collisionFilterGroup(int setter);
		public native int m_collisionFilterMask(); public native ConvexResultCallback m_collisionFilterMask(int setter);

		public native @Cast("bool") boolean hasHit();

		public native @Cast("bool") boolean needsCollision(btBroadphaseProxy proxy0);

		public native @Cast("btScalar") double addSingleResult(@ByRef LocalConvexResult convexResult, @Cast("bool") boolean normalInWorldSpace);
	}

	@NoOffset public static class ClosestConvexResultCallback extends ConvexResultCallback {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public ClosestConvexResultCallback(Pointer p) { super(p); }
	
		public ClosestConvexResultCallback(@Const @ByRef btVector3 convexFromWorld, @Const @ByRef btVector3 convexToWorld) { super((Pointer)null); allocate(convexFromWorld, convexToWorld); }
		private native void allocate(@Const @ByRef btVector3 convexFromWorld, @Const @ByRef btVector3 convexToWorld);

		public native @ByRef btVector3 m_convexFromWorld(); public native ClosestConvexResultCallback m_convexFromWorld(btVector3 setter);  //used to calculate hitPointWorld from hitFraction
		public native @ByRef btVector3 m_convexToWorld(); public native ClosestConvexResultCallback m_convexToWorld(btVector3 setter);

		public native @ByRef btVector3 m_hitNormalWorld(); public native ClosestConvexResultCallback m_hitNormalWorld(btVector3 setter);
		public native @ByRef btVector3 m_hitPointWorld(); public native ClosestConvexResultCallback m_hitPointWorld(btVector3 setter);
		public native @Const btCollisionObject m_hitCollisionObject(); public native ClosestConvexResultCallback m_hitCollisionObject(btCollisionObject setter);

		public native @Cast("btScalar") double addSingleResult(@ByRef LocalConvexResult convexResult, @Cast("bool") boolean normalInWorldSpace);
	}

	/**ContactResultCallback is used to report contact points */
	@NoOffset public static class ContactResultCallback extends Pointer {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public ContactResultCallback(Pointer p) { super(p); }
	
		public native int m_collisionFilterGroup(); public native ContactResultCallback m_collisionFilterGroup(int setter);
		public native int m_collisionFilterMask(); public native ContactResultCallback m_collisionFilterMask(int setter);
		public native @Cast("btScalar") double m_closestDistanceThreshold(); public native ContactResultCallback m_closestDistanceThreshold(double setter);

		public native @Cast("bool") boolean needsCollision(btBroadphaseProxy proxy0);

		public native @Cast("btScalar") double addSingleResult(@ByRef btManifoldPoint cp, @Const btCollisionObjectWrapper colObj0Wrap, int partId0, int index0, @Const btCollisionObjectWrapper colObj1Wrap, int partId1, int index1);
	}

	public native int getNumCollisionObjects();

	/** rayTest performs a raycast on all objects in the btCollisionWorld, and calls the resultCallback
	 *  This allows for several queries: first hit, all hits, any hit, dependent on the value returned by the callback. */
	public native void rayTest(@Const @ByRef btVector3 rayFromWorld, @Const @ByRef btVector3 rayToWorld, @ByRef RayResultCallback resultCallback);

	/** convexTest performs a swept convex cast on all objects in the btCollisionWorld, and calls the resultCallback
	 *  This allows for several queries: first hit, all hits, any hit, dependent on the value return by the callback. */
	public native void convexSweepTest(@Const btConvexShape castShape, @Const @ByRef btTransform from, @Const @ByRef btTransform to, @ByRef ConvexResultCallback resultCallback, @Cast("btScalar") double allowedCcdPenetration/*=btScalar(0.)*/);
	public native void convexSweepTest(@Const btConvexShape castShape, @Const @ByRef btTransform from, @Const @ByRef btTransform to, @ByRef ConvexResultCallback resultCallback);

	/**contactTest performs a discrete collision test between colObj against all objects in the btCollisionWorld, and calls the resultCallback.
	 * it reports one or more contact points for every overlapping object (including the one with deepest penetration) */
	public native void contactTest(btCollisionObject colObj, @ByRef ContactResultCallback resultCallback);

	/**contactTest performs a discrete collision test between two collision objects and calls the resultCallback if overlap if detected.
	 * it reports one or more contact points (including the one with deepest penetration) */
	public native void contactPairTest(btCollisionObject colObjA, btCollisionObject colObjB, @ByRef ContactResultCallback resultCallback);

	/** rayTestSingle performs a raycast call and calls the resultCallback. It is used internally by rayTest.
	 *  In a future implementation, we consider moving the ray test as a virtual method in btCollisionShape.
	 *  This allows more customization. */
	public static native void rayTestSingle(@Const @ByRef btTransform rayFromTrans, @Const @ByRef btTransform rayToTrans,
								  btCollisionObject collisionObject,
								  @Const btCollisionShape collisionShape,
								  @Const @ByRef btTransform colObjWorldTransform,
								  @ByRef RayResultCallback resultCallback);

	public static native void rayTestSingleInternal(@Const @ByRef btTransform rayFromTrans, @Const @ByRef btTransform rayToTrans,
										  @Const btCollisionObjectWrapper collisionObjectWrap,
										  @ByRef RayResultCallback resultCallback);

	/** objectQuerySingle performs a collision detection query and calls the resultCallback. It is used internally by rayTest. */
	public static native void objectQuerySingle(@Const btConvexShape castShape, @Const @ByRef btTransform rayFromTrans, @Const @ByRef btTransform rayToTrans,
									  btCollisionObject collisionObject,
									  @Const btCollisionShape collisionShape,
									  @Const @ByRef btTransform colObjWorldTransform,
									  @ByRef ConvexResultCallback resultCallback, @Cast("btScalar") double allowedPenetration);

	public static native void objectQuerySingleInternal(@Const btConvexShape castShape, @Const @ByRef btTransform convexFromTrans, @Const @ByRef btTransform convexToTrans,
											  @Const btCollisionObjectWrapper colObjWrap,
											  @ByRef ConvexResultCallback resultCallback, @Cast("btScalar") double allowedPenetration);

	public native void addCollisionObject(btCollisionObject collisionObject, int collisionFilterGroup/*=btBroadphaseProxy::DefaultFilter*/, int collisionFilterMask/*=btBroadphaseProxy::AllFilter*/);
	public native void addCollisionObject(btCollisionObject collisionObject);

	public native void refreshBroadphaseProxy(btCollisionObject collisionObject);

	public native @ByRef btCollisionObjectArray getCollisionObjectArray();

	public native void removeCollisionObject(btCollisionObject collisionObject);

	public native void performDiscreteCollisionDetection();

	public native @ByRef btDispatcherInfo getDispatchInfo();

	public native @Cast("bool") boolean getForceUpdateAllAabbs();
	public native void setForceUpdateAllAabbs(@Cast("bool") boolean forceUpdateAllAabbs);

	/**Preliminary serialization test for Bullet 2.76. Loading those files requires a separate parser (Bullet/Demos/SerializeDemo) */
	public native void serialize(btSerializer serializer);
}
