// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


/** \brief a Class to measure passing time.
<p>
The class computes passing time by counting the number of ticks per second. That is, the following code computes the
execution time in seconds:
\snippet snippets/core_various.cpp TickMeter_total
<p>
It is also possible to compute the average time over multiple runs:
\snippet snippets/core_various.cpp TickMeter_average
<p>
@see getTickCount, getTickFrequency
*/
@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class TickMeter extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TickMeter(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TickMeter(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TickMeter position(long position) {
        return (TickMeter)super.position(position);
    }
    @Override public TickMeter getPointer(long i) {
        return new TickMeter((Pointer)this).offsetAddress(i);
    }

    /** the default constructor */
    public TickMeter() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** starts counting ticks. */
    public native void start();

    /** stops counting ticks. */
    public native void stop();

    /** returns counted ticks. */
    public native @Cast("int64") long getTimeTicks();

    /** returns passed time in microseconds. */
    public native double getTimeMicro();

    /** returns passed time in milliseconds. */
    public native double getTimeMilli();

    /** returns passed time in seconds. */
    public native double getTimeSec();

    /** returns internal counter value. */
    public native @Cast("int64") long getCounter();

    /** returns average FPS (frames per second) value. */
    public native double getFPS();

    /** returns average time in seconds */
    public native double getAvgTimeSec();

    /** returns average time in milliseconds */
    public native double getAvgTimeMilli();

    /** resets internal values. */
    public native void reset();
}
