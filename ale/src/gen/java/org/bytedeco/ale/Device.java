// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.ale;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ale.global.ale.*;


/**
  Abstract base class for devices which can be attached to a 6502
  based system.
  <p>
  @author  Bradford W. Mott
  @version $Id: Device.hxx,v 1.6 2007/01/14 16:17:57 stephena Exp $
*/
@Namespace("ale::stella") @NoOffset @Properties(inherit = org.bytedeco.ale.presets.ale.class)
public class Device extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Device(Pointer p) { super(p); }

    /**
      Create a new device
    */

    /**
      Destructor
    */
    /**
      Get a null terminated string which is the device's name (i.e. "M6532")
      <p>
      @return The name of the device
    */
    public native @Cast("const char*") BytePointer name();

    /**
      Reset device to its power-on state
    */
    public native void reset();

    /**
      Notification method invoked by the system right before the
      system resets its cycle counter to zero.  It may be necessary
      to override this method for devices that remember cycle counts.
    */
    public native void systemCyclesReset();

    /**
      Install device in the specified system.  Invoked by the system
      when the device is attached to it.
      <p>
      @param system The system the device should install itself in
    */
    public native void install(@ByRef System system);

    /**
      Saves the current state of this device to the given Serializer.
      <p>
      @param out The serializer device to save to.
      @return The result of the save.  True on success, false on failure.
    */
    public native @Cast("bool") boolean save(@ByRef Serializer out);

    /**
      Loads the current state of this device from the given Deserializer.
      <p>
      @param in The deserializer device to load from.
      @return The result of the load.  True on success, false on failure.
    */
    public native @Cast("bool") boolean load(@ByRef Deserializer in);
    /**
      Get the byte at the specified address
      <p>
      @return The byte at the specified address
    */
    public native @Cast("uint8_t") byte peek(@Cast("uint16_t") short _address);

    /**
      Change the byte at the specified address to the given value
      <p>
      @param address The address where the value should be stored
      @param value The value to be stored at the address
    */
    public native void poke(@Cast("uint16_t") short _address, @Cast("uint8_t") byte value);
}
