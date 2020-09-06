// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** DEPRECATED.  Use the FileSystem API in arrow::fs instead. */
@Namespace("arrow::io") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class FileStatistics extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public FileStatistics() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FileStatistics(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FileStatistics(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public FileStatistics position(long position) {
        return (FileStatistics)super.position(position);
    }
    @Override public FileStatistics getPointer(long i) {
        return new FileStatistics(this).position(position + i);
    }

  /** Size of file, -1 if finding length is unsupported */
  public native @Cast("int64_t") long size(); public native FileStatistics size(long setter);
  public native ObjectType.type kind(); public native FileStatistics kind(ObjectType.type setter);
}
