// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;


    /** A GUID to the camera.  It is used to uniquely identify a camera. */
    @Namespace("FlyCapture2") @NoOffset @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class PGRGuid extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public PGRGuid(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public PGRGuid(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public PGRGuid position(long position) {
            return (PGRGuid)super.position(position);
        }
        @Override public PGRGuid getPointer(long i) {
            return new PGRGuid((Pointer)this).offsetAddress(i);
        }
    
            public native @Cast("unsigned int") int value(int i); public native PGRGuid value(int i, int setter);
            @MemberGetter public native @Cast("unsigned int*") IntPointer value();

            /** Constructor. */
            public PGRGuid() { super((Pointer)null); allocate(); }
            private native void allocate();

            /** Equality operator. */
            public native @Cast("bool") @Name("operator ==") boolean equals( @Const @ByRef PGRGuid guid );

            /** Inequality operator. */
            public native @Cast("bool") @Name("operator !=") boolean notEquals( @Const @ByRef PGRGuid guid );
    }
