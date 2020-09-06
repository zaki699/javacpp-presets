// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.ale;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ale.global.ale.*;


@NoOffset @Properties(inherit = org.bytedeco.ale.presets.ale.class)
public class StellaEnvironmentWrapper extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StellaEnvironmentWrapper(Pointer p) { super(p); }

    public StellaEnvironmentWrapper(@ByRef StellaEnvironment environment) { super((Pointer)null); allocate(environment); }
    private native void allocate(@ByRef StellaEnvironment environment);
    public native @Cast("reward_t") int act(@Cast("Action") int player_a_action, @Cast("Action") int player_b_action);
    public native void softReset();
    public native void pressSelect(@Cast("size_t") long num_steps/*=1*/);
    public native void pressSelect();
    
    public native @MemberGetter @ByRef StellaEnvironment m_environment();
}
