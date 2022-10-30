// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**do not change those serialization structures, it requires an updated sBulletDNAstr/sBulletDNAstr64 */
@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btGImpactMeshShapeData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btGImpactMeshShapeData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btGImpactMeshShapeData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btGImpactMeshShapeData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btGImpactMeshShapeData position(long position) {
        return (btGImpactMeshShapeData)super.position(position);
    }
    @Override public btGImpactMeshShapeData getPointer(long i) {
        return new btGImpactMeshShapeData((Pointer)this).offsetAddress(i);
    }

	public native @ByRef btCollisionShapeData m_collisionShapeData(); public native btGImpactMeshShapeData m_collisionShapeData(btCollisionShapeData setter);

	public native @ByRef btStridingMeshInterfaceData m_meshInterface(); public native btGImpactMeshShapeData m_meshInterface(btStridingMeshInterfaceData setter);

	public native @ByRef btVector3FloatData m_localScaling(); public native btGImpactMeshShapeData m_localScaling(btVector3FloatData setter);

	public native float m_collisionMargin(); public native btGImpactMeshShapeData m_collisionMargin(float setter);

	public native int m_gimpactSubType(); public native btGImpactMeshShapeData m_gimpactSubType(int setter);
}
