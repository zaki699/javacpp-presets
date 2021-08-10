// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.linux.*;



// #ifdef	_TIME_H
/* Used by other time functions.  */
@Properties(inherit = org.bytedeco.systems.presets.linux.class)
public class tm extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public tm() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public tm(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public tm(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public tm position(long position) {
        return (tm)super.position(position);
    }
    @Override public tm getPointer(long i) {
        return new tm((Pointer)this).offsetAddress(i);
    }

  public native int tm_sec(); public native tm tm_sec(int setter);			/* Seconds.	[0-60] (1 leap second) */
  public native int tm_min(); public native tm tm_min(int setter);			/* Minutes.	[0-59] */
  public native int tm_hour(); public native tm tm_hour(int setter);			/* Hours.	[0-23] */
  public native int tm_mday(); public native tm tm_mday(int setter);			/* Day.		[1-31] */
  public native int tm_mon(); public native tm tm_mon(int setter);			/* Month.	[0-11] */
  public native int tm_year(); public native tm tm_year(int setter);			/* Year	- 1900.  */
  public native int tm_wday(); public native tm tm_wday(int setter);			/* Day of week.	[0-6] */
  public native int tm_yday(); public native tm tm_yday(int setter);			/* Days in year.[0-365]	*/
  public native int tm_isdst(); public native tm tm_isdst(int setter);			/* DST.		[-1/0/1]*/

// # ifdef	__USE_BSD
  public native long tm_gmtoff(); public native tm tm_gmtoff(long setter);		/* Seconds east of UTC.  */
  public native @Cast("const char*") BytePointer tm_zone(); public native tm tm_zone(BytePointer setter);		/* Timezone abbreviation.  */
// # else
// # endif
}
