// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.modsecurity;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.modsecurity.global.modsecurity.*;


// #ifdef __cplusplus
@Namespace("modsecurity") @Opaque @Properties(inherit = org.bytedeco.modsecurity.presets.modsecurity.class)
public class RuleWithOperator extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public RuleWithOperator() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RuleWithOperator(Pointer p) { super(p); }
}
