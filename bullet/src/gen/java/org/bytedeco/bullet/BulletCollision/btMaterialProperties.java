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
public class btMaterialProperties extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btMaterialProperties() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btMaterialProperties(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btMaterialProperties(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btMaterialProperties position(long position) {
        return (btMaterialProperties)super.position(position);
    }
    @Override public btMaterialProperties getPointer(long i) {
        return new btMaterialProperties((Pointer)this).offsetAddress(i);
    }

	/**m_materialBase ==========> 2 btScalar values make up one material, friction then restitution */
	public native int m_numMaterials(); public native btMaterialProperties m_numMaterials(int setter);
	public native @Cast("const unsigned char*") BytePointer m_materialBase(); public native btMaterialProperties m_materialBase(BytePointer setter);
	public native int m_materialStride(); public native btMaterialProperties m_materialStride(int setter);
	public native @Cast("PHY_ScalarType") int m_materialType(); public native btMaterialProperties m_materialType(int setter);
	/**m_numTriangles <=========== This exists in the btIndexedMesh object for the same subpart, but since we're
	 *                            padding the structure, it can be reproduced at no real cost
	 * m_triangleMaterials =====> 1 integer value makes up one entry
	 *                            eg: m_triangleMaterials[1] = 5; // This will set triangle 2 to use material 5 */
	public native int m_numTriangles(); public native btMaterialProperties m_numTriangles(int setter);
	public native @Cast("const unsigned char*") BytePointer m_triangleMaterialsBase(); public native btMaterialProperties m_triangleMaterialsBase(BytePointer setter);
	public native int m_triangleMaterialStride(); public native btMaterialProperties m_triangleMaterialStride(int setter);
	/**m_triangleType <========== Automatically set in addMaterialProperties */
	public native @Cast("PHY_ScalarType") int m_triangleType(); public native btMaterialProperties m_triangleType(int setter);
}
