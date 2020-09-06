// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** This proxy is used internally to connect fixtures to the broad-phase. */
@Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2FixtureProxy extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b2FixtureProxy() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2FixtureProxy(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2FixtureProxy(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b2FixtureProxy position(long position) {
        return (b2FixtureProxy)super.position(position);
    }
    @Override public b2FixtureProxy getPointer(long i) {
        return new b2FixtureProxy(this).position(position + i);
    }

	public native @ByRef b2AABB aabb(); public native b2FixtureProxy aabb(b2AABB setter);
	public native b2Fixture fixture(); public native b2FixtureProxy fixture(b2Fixture setter);
	public native @Cast("int32") int childIndex(); public native b2FixtureProxy childIndex(int setter);
	public native @Cast("int32") int proxyId(); public native b2FixtureProxy proxyId(int setter);
}
