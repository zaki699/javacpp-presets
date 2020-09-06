// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;


// parquet::PageType
@Namespace("parquet") @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class PageType extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PageType() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PageType(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PageType(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PageType position(long position) {
        return (PageType)super.position(position);
    }
    @Override public PageType getPointer(long i) {
        return new PageType(this).position(position + i);
    }

  public enum type {
    DATA_PAGE(0),
    INDEX_PAGE(1),
    DICTIONARY_PAGE(2),
    DATA_PAGE_V2(3),
    // Should always be last element
    UNDEFINED(4);

      public final int value;
      private type(int v) { this.value = v; }
      private type(type e) { this.value = e.value; }
      public type intern() { for (type e : values()) if (e.value == value) return e; return this; }
      @Override public String toString() { return intern().name(); }
  }
}
