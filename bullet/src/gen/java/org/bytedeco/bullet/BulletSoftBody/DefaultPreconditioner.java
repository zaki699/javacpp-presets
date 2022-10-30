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


@Properties(inherit = org.bytedeco.bullet.presets.BulletSoftBody.class)
public class DefaultPreconditioner extends Preconditioner {
    static { Loader.load(); }
    /** Default native constructor. */
    public DefaultPreconditioner() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DefaultPreconditioner(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DefaultPreconditioner(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public DefaultPreconditioner position(long position) {
        return (DefaultPreconditioner)super.position(position);
    }
    @Override public DefaultPreconditioner getPointer(long i) {
        return new DefaultPreconditioner((Pointer)this).offsetAddress(i);
    }

	public native @Name("operator ()") void apply(@Const @ByRef btVector3Array x, @ByRef btVector3Array b);
	public native void reinitialize(@Cast("bool") boolean nodeUpdated);
}
