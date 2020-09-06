// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.openpose;

import org.bytedeco.javacpp.annotation.Index;
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
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.hdf5.*;
import static org.bytedeco.hdf5.global.hdf5.*;
import org.bytedeco.caffe.*;
import static org.bytedeco.caffe.global.caffe.*;

import static org.bytedeco.openpose.global.openpose.*;

    @Name("op::Worker<std::shared_ptr<std::vector<std::shared_ptr<op::Datum> > > >") @NoOffset @Properties(inherit = org.bytedeco.openpose.presets.openpose.class)
public class DatumsWorker extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public DatumsWorker(Pointer p) { super(p); }
    

        public native void initializationOnThreadNoException();

        public native @Cast("bool") boolean checkAndWork(@SharedPtr @ByRef Datums tDatums);

        public native @Cast("bool") boolean isRunning();

        public native void stop();

        // Virtual in case some function needs spetial stopping (e.g., buffers might not stop inmediately and need a
        // few iterations)
        public native void tryStop();
    }
