// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Allocator;
import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;

            @Namespace("ngraph::runtime::cpu") @Opaque @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class CPU_ExternalFunction extends Pointer {
                /** Empty constructor. Calls {@code super((Pointer)null)}. */
                public CPU_ExternalFunction() { super((Pointer)null); }
                /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
                public CPU_ExternalFunction(Pointer p) { super(p); }
            }
