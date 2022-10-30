// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;

@Opaque @Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class FixtureParticleSet extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public FixtureParticleSet() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FixtureParticleSet(Pointer p) { super(p); }
}
