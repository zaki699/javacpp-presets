// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


//
//  This record is returned if the user is requesting AclSizeInformation
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class ACL_SIZE_INFORMATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ACL_SIZE_INFORMATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ACL_SIZE_INFORMATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ACL_SIZE_INFORMATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ACL_SIZE_INFORMATION position(long position) {
        return (ACL_SIZE_INFORMATION)super.position(position);
    }
    @Override public ACL_SIZE_INFORMATION getPointer(long i) {
        return new ACL_SIZE_INFORMATION((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int AceCount(); public native ACL_SIZE_INFORMATION AceCount(int setter);
    public native @Cast("DWORD") int AclBytesInUse(); public native ACL_SIZE_INFORMATION AclBytesInUse(int setter);
    public native @Cast("DWORD") int AclBytesFree(); public native ACL_SIZE_INFORMATION AclBytesFree(int setter);
}
