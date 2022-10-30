// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class ExtensionTypeRegistry extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ExtensionTypeRegistry(Pointer p) { super(p); }

  /** \brief Provide access to the global registry to allow code to control for
   *  race conditions in registry teardown when some types need to be
   *  unregistered and destroyed first */
  public static native @SharedPtr ExtensionTypeRegistry GetGlobalRegistry();

  public native @ByVal Status RegisterType(@SharedPtr ExtensionType type);
  public native @ByVal Status UnregisterType(@StdString String type_name);
  public native @ByVal Status UnregisterType(@StdString BytePointer type_name);
  public native @SharedPtr ExtensionType GetType(@StdString String type_name);
  public native @SharedPtr ExtensionType GetType(@StdString BytePointer type_name);
}
