// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

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


/** btVehicleRaycaster is provides interface for between vehicle simulation and raycasting */
@Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btVehicleRaycaster extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btVehicleRaycaster(Pointer p) { super(p); }

	@NoOffset public static class btVehicleRaycasterResult extends Pointer {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public btVehicleRaycasterResult(Pointer p) { super(p); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public btVehicleRaycasterResult(long size) { super((Pointer)null); allocateArray(size); }
	    private native void allocateArray(long size);
	    @Override public btVehicleRaycasterResult position(long position) {
	        return (btVehicleRaycasterResult)super.position(position);
	    }
	    @Override public btVehicleRaycasterResult getPointer(long i) {
	        return new btVehicleRaycasterResult((Pointer)this).offsetAddress(i);
	    }
	
		public btVehicleRaycasterResult() { super((Pointer)null); allocate(); }
		private native void allocate();
		public native @ByRef btVector3 m_hitPointInWorld(); public native btVehicleRaycasterResult m_hitPointInWorld(btVector3 setter);
		public native @ByRef btVector3 m_hitNormalInWorld(); public native btVehicleRaycasterResult m_hitNormalInWorld(btVector3 setter);
		public native @Cast("btScalar") double m_distFraction(); public native btVehicleRaycasterResult m_distFraction(double setter);
	}

	public native Pointer castRay(@Const @ByRef btVector3 from, @Const @ByRef btVector3 to, @ByRef btVehicleRaycasterResult result);
}
