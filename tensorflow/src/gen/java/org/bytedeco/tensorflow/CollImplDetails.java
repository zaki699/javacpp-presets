// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// The best implementation of a collective op depends on many factors
// including the number of devices involved, the topology of
// interconnects between them and the sizes of inputs.  This structure
// is used in generating and representing data movement choreography
// for each specific algorithm, hence it does not have a single, fixed
// interpretation.  On first execution the runtime will update this
// structure with decisions that will guide all subsequent executions.
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class CollImplDetails extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CollImplDetails() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CollImplDetails(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CollImplDetails(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CollImplDetails position(long position) {
        return (CollImplDetails)super.position(position);
    }
    @Override public CollImplDetails getPointer(long i) {
        return new CollImplDetails((Pointer)this).offsetAddress(i);
    }

  public native @StdString BytePointer collective_name(); public native CollImplDetails collective_name(BytePointer setter);
  public native @ByRef IntIntVector subdiv_permutations(); public native CollImplDetails subdiv_permutations(IntIntVector setter);
  public native @StdVector IntPointer subdiv_offsets(); public native CollImplDetails subdiv_offsets(IntPointer setter);
  public native @StdVector IntPointer subdiv_source_rank(); public native CollImplDetails subdiv_source_rank(IntPointer setter);  // rank of source in each subdiv
  public native @StdVector IntPointer dependencies(); public native CollImplDetails dependencies(IntPointer setter);           // collective instances on which this node depends
  public native @StdString BytePointer communication_hint(); public native CollImplDetails communication_hint(BytePointer setter);  // user-supplied hint for implementation choice,
                              // e.g. ring or nccl
}
