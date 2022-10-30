// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;


    /*@}*/

    /**
     * Configuration for a camera. These options are options that are
     * generally should be set before starting isochronous transfer.
     */
    @Namespace("FlyCapture2") @NoOffset @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class FC2Config extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public FC2Config(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public FC2Config(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public FC2Config position(long position) {
            return (FC2Config)super.position(position);
        }
        @Override public FC2Config getPointer(long i) {
            return new FC2Config((Pointer)this).offsetAddress(i);
        }
    
        /** Number of buffers used by the FlyCapture2 library to grab images. */
        public native @Cast("unsigned int") int numBuffers(); public native FC2Config numBuffers(int setter);

        /**
         * Number of notifications per image. This value should only be set
         * after the image settings to be used is set to the camera.
         * The default number of notifications is 1.
         *
         * There are 4 general scenarios:
         * - 1 notification - End of image
         * - 2 notifications - After first packet and end of image
         * - 3 notifications - After first packet, middle of image, end of image
         * - x notifications - After first packet, (x -2) spread evenly, end of image
         *
         * Specifying zero for the number of notifications will be ignored (the current value
         * will not be modified).
         *
         * Note that the event numbers start at 0. Ex. when 3 notifications are
         * used, the three events will be 0, 1 and 2.
         */
        public native @Cast("unsigned int") int numImageNotifications(); public native FC2Config numImageNotifications(int setter);

        /**
         *  Minimum number of notifications needed for the current image
         *  settings on the camera. Read-only value.
         */
        public native @Cast("unsigned int") int minNumImageNotifications(); public native FC2Config minNumImageNotifications(int setter);

        /**
         * Time in milliseconds that RetrieveBuffer() and WaitForBufferEvent()
         * will wait for an image before timing out and returning.
         */
        public native int grabTimeout(); public native FC2Config grabTimeout(int setter);

        /** Grab mode for the camera. The default is DROP_FRAMES. */
        public native @Cast("FlyCapture2::GrabMode") int grabMode(); public native FC2Config grabMode(int setter);

        /** This parameter enables RetrieveBuffer to run in high
         *  performance mode.  This means that any interaction
         *  with the camera, other then grabbing the image is disabled.
         *  Currently Retrieve buffer reads registers on the camera to
         *  determine which embedded image information settings have been
         *  enabled, and it reads what the bayer tile is currently set to.
         *  When High Performance mode is on, these reads are disabled.  This
         *  means that any changes to the Bayer Tile or to the Embedded image
         *  info after StartCapture() will not be tracked when made using
         *  direct register writes.  If the corresponding SetEmbededImageInfo()
         *  and GetEmbededImageInfo() calls are used then the changes will be
         *  appropriately reflected.  This also means that changes to embedded
         *  image info from other processes will not be updated either.*/
        public native @Cast("bool") boolean highPerformanceRetrieveBuffer(); public native FC2Config highPerformanceRetrieveBuffer(boolean setter);

        /** Isochronous bus speed. */
        public native @Cast("FlyCapture2::BusSpeed") int isochBusSpeed(); public native FC2Config isochBusSpeed(int setter);

        /** Asynchronous bus speed. */
        public native @Cast("FlyCapture2::BusSpeed") int asyncBusSpeed(); public native FC2Config asyncBusSpeed(int setter);

        /**
         * Bandwidth allocation flag that tells the camera the bandwidth
         * allocation strategy to employ.
         */
        public native @Cast("FlyCapture2::BandwidthAllocation") int bandwidthAllocation(); public native FC2Config bandwidthAllocation(int setter);

        /**
         * Number of retries to perform when a register read/write timeout
         * is received by the library. The default value is 0.
         */
        public native @Cast("unsigned int") int registerTimeoutRetries(); public native FC2Config registerTimeoutRetries(int setter);

        /**
         * Register read/write timeout value, in microseconds.
         * The default value is dependent on the interface type.
         */
        public native @Cast("unsigned int") int registerTimeout(); public native FC2Config registerTimeout(int setter);

        /** Reserved for future use */
        public native @Cast("unsigned int") int reserved(int i); public native FC2Config reserved(int i, int setter);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public FC2Config() { super((Pointer)null); allocate(); }
        private native void allocate();
    }
