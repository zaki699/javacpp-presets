// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

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


/**
 * Tracklet structure
 *
 * Contains tracklets from object tracker output.
 */
@Namespace("dai") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class Tracklet extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Tracklet() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Tracklet(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Tracklet(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Tracklet position(long position) {
        return (Tracklet)super.position(position);
    }
    @Override public Tracklet getPointer(long i) {
        return new Tracklet((Pointer)this).offsetAddress(i);
    }

    public enum TrackingStatus {
        /** The object is newly added. */
        NEW(0),
        /** The object is being tracked. */
        TRACKED(1),
        /** The object gets lost now. The object can be tracked again automatically(long term tracking) or by specifying detected object manually(short
                  term and zero term tracking). */
        LOST(2),
        /** The object is removed. */
        REMOVED(3);

        public final int value;
        private TrackingStatus(int v) { this.value = v; }
        private TrackingStatus(TrackingStatus e) { this.value = e.value; }
        public TrackingStatus intern() { for (TrackingStatus e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }
    /**
     * Tracked region of interest.
     */
    public native @ByRef Rect roi(); public native Tracklet roi(Rect setter);
    /**
     * Tracklet's ID.
     */
    public native @Cast("std::int32_t") int id(); public native Tracklet id(int setter);
    /**
     * Tracklet's label ID.
     */
    public native @Cast("std::int32_t") int label(); public native Tracklet label(int setter);
    /**
     * Number of frames it is being tracked for.
     */
    public native @Cast("std::int32_t") int age(); public native Tracklet age(int setter);
    /**
     * Status of tracklet.
     */
    public native TrackingStatus status(); public native Tracklet status(TrackingStatus setter);

    /**
     * Image detection that is tracked.
     */
    public native @ByRef ImgDetection srcImgDetection(); public native Tracklet srcImgDetection(ImgDetection setter);
    /**
     * Spatial coordinates of tracklet.
     */
    public native @ByRef Point3f spatialCoordinates(); public native Tracklet spatialCoordinates(Point3f setter);
}
