// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Allocator;
import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;

    /** Base class for ngraph assertion failure exceptions. */
    @Namespace("ngraph") @NoOffset @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class AssertionFailure extends ngraph_error {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public AssertionFailure(Pointer p) { super(p); }
    
        public AssertionFailure(@StdString BytePointer what_arg) { super((Pointer)null); allocate(what_arg); }
        private native void allocate(@StdString BytePointer what_arg);
        public AssertionFailure(@StdString String what_arg) { super((Pointer)null); allocate(what_arg); }
        private native void allocate(@StdString String what_arg);

        public native @NoException @Cast("const char*") BytePointer what();
    }
