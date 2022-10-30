// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.spinnaker.Spinnaker_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.spinnaker.global.Spinnaker_C.*;


/**
 * \defgroup SpinnakerCGenApi Spinnaker C GenICam API
 */
/*@{*/

/**
 * \defgroup SpinnakerGenApiHandlesC Spinnaker C GenICam Handles
 *
 * Handle definitions for Spinnaker C GenICam API
 */
/*@{*/

/**
 * Handle for nodemap functionality. Created by calling
 * spinCameraGetNodemap(), spinCameraGetTLDeviceNodeMap(),
 * spinCameraGetTLStreamNodeMap() or spinInterfaceGetTLNodeMap(). No need
 * to release, clear, or destroy.
 */
@Namespace @Name("void") @Opaque @Properties(inherit = org.bytedeco.spinnaker.presets.Spinnaker_C.class)
public class spinNodeMapHandle extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public spinNodeMapHandle() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public spinNodeMapHandle(Pointer p) { super(p); }
}
