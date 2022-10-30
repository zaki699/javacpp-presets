// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;


@Namespace("parquet") @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class AadMetadata extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AadMetadata() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AadMetadata(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AadMetadata(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AadMetadata position(long position) {
        return (AadMetadata)super.position(position);
    }
    @Override public AadMetadata getPointer(long i) {
        return new AadMetadata((Pointer)this).offsetAddress(i);
    }

  public native @StdString String aad_prefix(); public native AadMetadata aad_prefix(String setter);
  public native @StdString String aad_file_unique(); public native AadMetadata aad_file_unique(String setter);
  public native @Cast("bool") boolean supply_aad_prefix(); public native AadMetadata supply_aad_prefix(boolean setter);
}
