// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.lz4;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.lz4.global.lz4.*;
   /* compatibility with previous API versions */

@Name("LZ4F_decompressOptions_t") @Properties(inherit = org.bytedeco.lz4.presets.lz4.class)
public class LZ4FDecompressOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public LZ4FDecompressOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public LZ4FDecompressOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LZ4FDecompressOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public LZ4FDecompressOptions position(long position) {
        return (LZ4FDecompressOptions)super.position(position);
    }
    @Override public LZ4FDecompressOptions getPointer(long i) {
        return new LZ4FDecompressOptions((Pointer)this).offsetAddress(i);
    }

  public native @Cast("unsigned") int stableDst(); public native LZ4FDecompressOptions stableDst(int setter);     /* pledges that last 64KB decompressed data will remain available unmodified between invocations.
                           * This optimization skips storage operations in tmp buffers. */
  public native @Cast("unsigned") int skipChecksums(); public native LZ4FDecompressOptions skipChecksums(int setter); /* disable checksum calculation and verification, even when one is present in frame, to save CPU time.
                           * Setting this option to 1 once disables all checksums for the rest of the frame. */
  public native @Cast("unsigned") int reserved1(); public native LZ4FDecompressOptions reserved1(int setter);     /* must be set to zero for forward compatibility */
  public native @Cast("unsigned") int reserved0(); public native LZ4FDecompressOptions reserved0(int setter);     /* idem */
}
