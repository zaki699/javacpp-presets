// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.modsecurity;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.modsecurity.global.modsecurity.*;



@Namespace("modsecurity") @NoOffset @Properties(inherit = org.bytedeco.modsecurity.presets.modsecurity.class)
public class TransactionAnchoredVariables extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TransactionAnchoredVariables(Pointer p) { super(p); }

    public TransactionAnchoredVariables(Transaction t) { super((Pointer)null); allocate(t); }
    private native void allocate(Transaction t);

    public native int m_variableOffset(); public native TransactionAnchoredVariables m_variableOffset(int setter);
}
