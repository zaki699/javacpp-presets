// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvencodeapi;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.nvcodec.nvcuvid.*;
import static org.bytedeco.nvcodec.global.nvcuvid.*;

import static org.bytedeco.nvcodec.global.nvencodeapi.*;

// =========================================================================================
// #if !defined(GUID) && !defined(GUID_DEFINED)
/**
 * \struct GUID
 * Abstracts the GUID structure for non-windows platforms.
 */
// =========================================================================================
@Properties(inherit = org.bytedeco.nvcodec.presets.nvencodeapi.class)
public class GUID extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public GUID() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public GUID(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GUID(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public GUID position(long position) {
        return (GUID)super.position(position);
    }
    @Override public GUID getPointer(long i) {
        return new GUID((Pointer)this).offsetAddress(i);
    }

    /** [in]: Specifies the first 8 hexadecimal digits of the GUID.                                */
    public native @Cast("uint32_t") int Data1(); public native GUID Data1(int setter);
    /** [in]: Specifies the first group of 4 hexadecimal digits.                                   */
    public native @Cast("uint16_t") short Data2(); public native GUID Data2(short setter);
    /** [in]: Specifies the second group of 4 hexadecimal digits.                                  */
    public native @Cast("uint16_t") short Data3(); public native GUID Data3(short setter);
    /** [in]: Array of 8 bytes. The first 2 bytes contain the third group of 4 hexadecimal digits.
                                                                        The remaining 6 bytes contain the final 12 hexadecimal digits.                       */
    public native @Cast("uint8_t") byte Data4(int i); public native GUID Data4(int i, byte setter);
    @MemberGetter public native @Cast("uint8_t*") BytePointer Data4();
}
