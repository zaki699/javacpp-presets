// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Collision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;

import static org.bytedeco.bullet.global.Bullet3Collision.*;


/**The b3OverlappingPairCache provides an interface for overlapping pair management (add, remove, storage), used by the b3BroadphaseInterface broadphases.
 * The b3HashedOverlappingPairCache and b3SortedOverlappingPairCache classes are two implementations. */
@Properties(inherit = org.bytedeco.bullet.presets.Bullet3Collision.class)
public class b3OverlappingPairCache extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3OverlappingPairCache(Pointer p) { super(p); }
  // this is needed so we can get to the derived class destructor

	public native b3Int4 getOverlappingPairArrayPtr();

	public native @Cast("b3BroadphasePairArray*") @ByRef b3Int4Array getOverlappingPairArray();

	public native void cleanOverlappingPair(@ByRef b3Int4 pair, b3Dispatcher dispatcher);

	public native int getNumOverlappingPairs();

	public native void cleanProxyFromPairs(int proxy, b3Dispatcher dispatcher);

	public native void setOverlapFilterCallback(b3OverlapFilterCallback callback);

	public native void processAllOverlappingPairs(b3OverlapCallback arg0, b3Dispatcher dispatcher);

	public native b3Int4 findPair(int proxy0, int proxy1);

	public native @Cast("bool") boolean hasDeferredRemoval();

	//virtual	void	setInternalGhostPairCallback(b3OverlappingPairCallback* ghostPairCallback)=0;

	public native b3Int4 addOverlappingPair(int proxy0, int proxy1);
	public native Pointer removeOverlappingPair(int proxy0, int proxy1, b3Dispatcher dispatcher);
	public native void removeOverlappingPairsContainingProxy(int arg0, b3Dispatcher arg1);

	public native void sortOverlappingPairs(b3Dispatcher dispatcher);
}
