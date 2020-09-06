// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avformat;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.ffmpeg.avutil.*;
import static org.bytedeco.ffmpeg.global.avutil.*;
import org.bytedeco.ffmpeg.swresample.*;
import static org.bytedeco.ffmpeg.global.swresample.*;
import org.bytedeco.ffmpeg.avcodec.*;
import static org.bytedeco.ffmpeg.global.avcodec.*;

import static org.bytedeco.ffmpeg.global.avformat.*;


/**
 * Describes single entry of the directory.
 *
 * Only name and type fields are guaranteed be set.
 * Rest of fields are protocol or/and platform dependent and might be unknown.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avformat.class)
public class AVIODirEntry extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVIODirEntry() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVIODirEntry(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVIODirEntry(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVIODirEntry position(long position) {
        return (AVIODirEntry)super.position(position);
    }
    @Override public AVIODirEntry getPointer(long i) {
        return new AVIODirEntry(this).position(position + i);
    }

    /** Filename */
    public native @Cast("char*") BytePointer name(); public native AVIODirEntry name(BytePointer setter);
    /** Type of the entry */
    public native int type(); public native AVIODirEntry type(int setter);
    /** Set to 1 when name is encoded with UTF-8, 0 otherwise.
                                                   Name can be encoded with UTF-8 even though 0 is set. */
    public native int utf8(); public native AVIODirEntry utf8(int setter);
    /** File size in bytes, -1 if unknown. */
    public native @Cast("int64_t") long size(); public native AVIODirEntry size(long setter);
    /** Time of last modification in microseconds since unix
                                                   epoch, -1 if unknown. */
    public native @Cast("int64_t") long modification_timestamp(); public native AVIODirEntry modification_timestamp(long setter);
    /** Time of last access in microseconds since unix epoch,
                                                   -1 if unknown. */
    public native @Cast("int64_t") long access_timestamp(); public native AVIODirEntry access_timestamp(long setter);
    /** Time of last status change in microseconds since unix
                                                   epoch, -1 if unknown. */
    public native @Cast("int64_t") long status_change_timestamp(); public native AVIODirEntry status_change_timestamp(long setter);
    /** User ID of owner, -1 if unknown. */
    public native @Cast("int64_t") long user_id(); public native AVIODirEntry user_id(long setter);
    /** Group ID of owner, -1 if unknown. */
    public native @Cast("int64_t") long group_id(); public native AVIODirEntry group_id(long setter);
    /** Unix file mode, -1 if unknown. */
    public native @Cast("int64_t") long filemode(); public native AVIODirEntry filemode(long setter);
}
