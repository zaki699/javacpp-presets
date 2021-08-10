// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.linux.*;


/* Structure used for storage of ancillary data object information.  */
@Properties(inherit = org.bytedeco.systems.presets.linux.class)
public class cmsghdr extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cmsghdr(Pointer p) { super(p); }

    public native @Cast("size_t") long cmsg_len(); public native cmsghdr cmsg_len(long setter);		/* Length of data in cmsg_data plus length
				   of cmsghdr structure.
				   !! The type should be socklen_t but the
				   definition of the kernel is incompatible
				   with this.  */
    public native int cmsg_level(); public native cmsghdr cmsg_level(int setter);		/* Originating protocol.  */
    public native int cmsg_type(); public native cmsghdr cmsg_type(int setter);		/* Protocol specific type.  */
// #if (!defined __STRICT_ANSI__ && __GNUC__ >= 2) || __STDC_VERSION__ >= 199901L
     /* Ancillary data.  */
// #endif
  }
