// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.flycapture.FlyCapture2.*;
import static org.bytedeco.flycapture.global.FlyCapture2.*;

import static org.bytedeco.flycapture.global.FlyCapture2_C.*;


    /**
     * A specific camera property. \n
     * For example, to set the gain to 12dB, set the following values:
     * - \a type - \c GAIN
     * - \a absControl - \c true
     * - \a onePush - \c false
     * - \a onOff - \c true
     * - \a autoManualMode - \c false
     * - \a absValue - \c 12.0
     */
    @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2_C.class)
public class fc2Property extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public fc2Property() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public fc2Property(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public fc2Property(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public fc2Property position(long position) {
            return (fc2Property)super.position(position);
        }
        @Override public fc2Property getPointer(long i) {
            return new fc2Property((Pointer)this).offsetAddress(i);
        }
    
        /** Property info type. */
        public native @Cast("fc2PropertyType") int type(); public native fc2Property type(int setter);
        /** Flag indicating if the property is present. */
        public native @Cast("BOOL") int present(); public native fc2Property present(int setter);
        /**
         * Flag controlling absolute mode (real world units)
         * or non-absolute mode (camera internal units).
         */
        public native @Cast("BOOL") int absControl(); public native fc2Property absControl(int setter);
        /** Flag controlling one push. */
        public native @Cast("BOOL") int onePush(); public native fc2Property onePush(int setter);
        /** Flag controlling on/off. */
        public native @Cast("BOOL") int onOff(); public native fc2Property onOff(int setter);
        /** Flag controlling auto. */
        public native @Cast("BOOL") int autoManualMode(); public native fc2Property autoManualMode(int setter);
        /**
         * Value A (integer).
         * Used to configure properties in non-absolute mode.
         */
        public native @Cast("unsigned int") int valueA(); public native fc2Property valueA(int setter);
        /**
         * Value B (integer). For white balance, value B applies to the blue value and
         * value A applies to the red value.
         */
        public native @Cast("unsigned int") int valueB(); public native fc2Property valueB(int setter);
        /**
        * Floating point value.
        * Used to configure properties in absolute mode.
        */
        public native float absValue(); public native fc2Property absValue(float setter);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native fc2Property reserved(int i, int setter);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        // For convenience, trigger delay is the same structure
        // used in a separate function along with trigger mode.

    }
