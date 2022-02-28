// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.depthai.global.depthai.*;


@Namespace("dai") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class IMUReport extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMUReport() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMUReport(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMUReport(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMUReport position(long position) {
        return (IMUReport)super.position(position);
    }
    @Override public IMUReport getPointer(long i) {
        return new IMUReport((Pointer)this).offsetAddress(i);
    }

    public enum Accuracy {
        UNRELIABLE((byte)(0)),
        LOW((byte)(1)),
        MEDIUM((byte)(2)),
        HIGH((byte)(3));

        public final byte value;
        private Accuracy(byte v) { this.value = v; }
        private Accuracy(Accuracy e) { this.value = e.value; }
        public Accuracy intern() { for (Accuracy e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }
    /**
     * The sequence number increments once for each report sent.  Gaps
     * in the sequence numbers indicate missing or dropped reports.
     * Max value 255 after which resets to 0.
     */
    public native int sequence(); public native IMUReport sequence(int setter);

    /** Accuracy of sensor */
    public native @Name("accuracy") Accuracy reportAccuracy(); public native IMUReport reportAccuracy(Accuracy setter);

    public native @ByRef Timestamp timestamp(); public native IMUReport timestamp(Timestamp setter);
}
