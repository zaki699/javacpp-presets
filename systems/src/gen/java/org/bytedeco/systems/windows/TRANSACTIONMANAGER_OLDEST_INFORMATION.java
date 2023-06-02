// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;



// end_wdm
@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class TRANSACTIONMANAGER_OLDEST_INFORMATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TRANSACTIONMANAGER_OLDEST_INFORMATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TRANSACTIONMANAGER_OLDEST_INFORMATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TRANSACTIONMANAGER_OLDEST_INFORMATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TRANSACTIONMANAGER_OLDEST_INFORMATION position(long position) {
        return (TRANSACTIONMANAGER_OLDEST_INFORMATION)super.position(position);
    }
    @Override public TRANSACTIONMANAGER_OLDEST_INFORMATION getPointer(long i) {
        return new TRANSACTIONMANAGER_OLDEST_INFORMATION((Pointer)this).offsetAddress(i);
    }

    public native @ByRef GUID OldestTransactionGuid(); public native TRANSACTIONMANAGER_OLDEST_INFORMATION OldestTransactionGuid(GUID setter);
}
