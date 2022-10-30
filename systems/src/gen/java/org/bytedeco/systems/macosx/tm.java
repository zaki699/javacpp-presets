// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.macosx.*;


@Properties(inherit = org.bytedeco.systems.presets.macosx.class)
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

	public native int tm_sec(); public native tm tm_sec(int setter);		/* seconds after the minute [0-60] */
	public native int tm_min(); public native tm tm_min(int setter);		/* minutes after the hour [0-59] */
	public native int tm_hour(); public native tm tm_hour(int setter);	/* hours since midnight [0-23] */
	public native int tm_mday(); public native tm tm_mday(int setter);	/* day of the month [1-31] */
	public native int tm_mon(); public native tm tm_mon(int setter);		/* months since January [0-11] */
	public native int tm_year(); public native tm tm_year(int setter);	/* years since 1900 */
	public native int tm_wday(); public native tm tm_wday(int setter);	/* days since Sunday [0-6] */
	public native int tm_yday(); public native tm tm_yday(int setter);	/* days since January 1 [0-365] */
	public native int tm_isdst(); public native tm tm_isdst(int setter);	/* Daylight Savings Time flag */
	public native long tm_gmtoff(); public native tm tm_gmtoff(long setter);	/* offset from UTC in seconds */
	public native @Cast("char*") BytePointer tm_zone(); public native tm tm_zone(BytePointer setter);	/* timezone abbreviation */
}
