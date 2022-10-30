// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.librealsense;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.librealsense.global.RealSense.*;


    @Namespace("rs") @NoOffset @Properties(inherit = org.bytedeco.librealsense.presets.RealSense.class)
public class log_callback extends rs_log_callback {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public log_callback(Pointer p) { super(p); }
    
        public log_callback(@ByVal LogCallbackFunction on_event) { super((Pointer)null); allocate(on_event); }
        private native void allocate(@ByVal LogCallbackFunction on_event);

        public native void on_event(@Cast("rs_log_severity") int severity, @Cast("const char*") BytePointer message);
        public native void on_event(@Cast("rs_log_severity") int severity, String message);

        public native void release();
    }
