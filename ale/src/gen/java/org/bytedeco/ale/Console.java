// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.ale;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ale.global.ale.*;


/**
  This class represents the entire game console.
  <p>
  @author  Bradford W. Mott
  @version $Id: Console.hxx,v 1.61 2007/07/27 13:49:16 stephena Exp $
*/
@Namespace("ale::stella") @NoOffset @Properties(inherit = org.bytedeco.ale.presets.ale.class)
public class Console extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Console(Pointer p) { super(p); }

    /**
      Create a new console for emulating the specified game using the
      given game image and operating system.
      <p>
      @param osystem  The OSystem object to use
      @param cart     The cartridge to use with this console
      @param props    The properties for the cartridge
    */
    public Console(OSystem osystem, Cartridge cart, @Const @ByRef StellaProperties props) { super((Pointer)null); allocate(osystem, cart, props); }
    private native void allocate(OSystem osystem, Cartridge cart, @Const @ByRef StellaProperties props);

    /**
      Create a new console object by copying another one
      <p>
      @param console The object to copy
    */
    public Console(@Const @ByRef Console console) { super((Pointer)null); allocate(console); }
    private native void allocate(@Const @ByRef Console console);

    /**
      Destructor
    */
    /**
      Get the controller plugged into the specified jack
      <p>
      @return The specified controller
    */
    public native @ByRef Controller controller(@Cast("ale::stella::Controller::Jack") int jack);

    /**
      Get the MediaSource for this console
      <p>
      @return The mediasource
    */
    public native @ByRef MediaSource mediaSource();

    /**
      Get the properties being used by the game
      <p>
      @return The properties being used by the game
    */
    public native @Const @ByRef StellaProperties properties();

    /**
      Get the console switches
      <p>
      @return The console switches
    */
    public native @ByRef Switches switches();

    /**
      Get the 6502 based system used by the console to emulate the game
      <p>
      @return The 6502 based system
    */
    public native @ByRef System system();

    /**
      Returns the OSystem for this emulator.
      <p>
      @return The OSystem.
    */
    public native @ByRef OSystem osystem();

    /**
      Set the properties to those given
      <p>
      @param The properties to use for the current game
    */
    public native void setProperties(@Const @ByRef StellaProperties props);

    /**
      Query some information about this console.
    */
    public native @StdString BytePointer about();
    /**
      Overloaded assignment operator
      <p>
      @param console The console object to set myself equal to
      @return Myself after assignment has taken place
    */
    public native @ByRef @Name("operator =") Console put(@Const @ByRef Console console);
    /**
      Query the currently selected display format (NTSC/PAL/PAL60).
    */
    public native @StdString BytePointer getFormat();

    /**
      Returns the framerate based on a number of factors
      (whether 'framerate' is set, what display format is in use, etc)
    */
    public native @Cast("uint32_t") int getFrameRate();

}
