// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \defgroup concrete-scalar-classes Concrete Scalar subclasses
 * 
 *  \{
 <p>
 *  \brief A scalar value for NullType. Never valid */
@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class NullScalar extends Scalar {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NullScalar(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NullScalar(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public NullScalar position(long position) {
        return (NullScalar)super.position(position);
    }
    @Override public NullScalar getPointer(long i) {
        return new NullScalar(this).position(position + i);
    }


  public NullScalar() { super((Pointer)null); allocate(); }
  private native void allocate();
}
