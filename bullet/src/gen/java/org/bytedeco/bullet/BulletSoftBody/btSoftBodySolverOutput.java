// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletSoftBody;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;
import org.bytedeco.bullet.BulletCollision.*;
import static org.bytedeco.bullet.global.BulletCollision.*;
import org.bytedeco.bullet.BulletDynamics.*;
import static org.bytedeco.bullet.global.BulletDynamics.*;

import static org.bytedeco.bullet.global.BulletSoftBody.*;


/** 
 * Class to manage movement of data from a solver to a given target.
 * This version is abstract. Subclasses will have custom pairings for different combinations.
 */
@Properties(inherit = org.bytedeco.bullet.presets.BulletSoftBody.class)
public class btSoftBodySolverOutput extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btSoftBodySolverOutput(Pointer p) { super(p); }


	/** Output current computed vertex data to the vertex buffers for all cloths in the solver. */
	public native void copySoftBodyToVertexBuffer(@Const btSoftBody softBody, btVertexBufferDescriptor vertexBuffer);
}
