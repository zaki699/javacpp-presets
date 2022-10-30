// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


/**
 * \brief Blob is a general container that hosts a typed pointer.
 *
 * A Blob hosts a pointer as well as its type, and takes charge of deleting it
 * properly when the blob is deallocated or re-allocated with a new type. A blob
 * could contain anything, although the most common case is to contain a Tensor.
 */
@Namespace("caffe2") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Blob extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Blob(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Blob(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Blob position(long position) {
        return (Blob)super.position(position);
    }
    @Override public Blob getPointer(long i) {
        return new Blob((Pointer)this).offsetAddress(i);
    }

  /**
   * Initializes an empty Blob.
   */
  public Blob() { super((Pointer)null); allocate(); }
  @NoException(true) private native void allocate();

  public Blob(@ByRef(true) Blob other) { super((Pointer)null); allocate(other); }
  @NoException(true) private native void allocate(@ByRef(true) Blob other);

  

  /**
   * Checks if the content stored in the blob is of type T.
   */

  /**
   * Returns the meta info of the blob.
   */
  public native @Const @ByVal @NoException(true) TypeMeta meta();

  /**
   * Returns a printable typename of the blob.
   */
  public native @ByVal @Cast("c10::string_view*") @NoException(true) Pointer TypeName();

  /**
   * \brief Gets the const reference of the stored object. The code checks if
   * the stored object is of the desired type.
   */
  // TODO(jerryzh): add a Get(DeviceType) function?
  public native @NoException(true) Pointer GetRaw();

  /**
   * \brief Gets a mutable pointer to the stored object.
   *
   * If the current object is not of the right type, a new object is created
   * and the old object is freed. Note that type T should have a default
   * constructor. Otherwise, create the object yourself first, and use
   * Reset().
   */

  /**
   * Sets the underlying object to the allocated one. The Blob then takes over
   * the ownership of the passed in pointer. If there is already an object in
   * the Blob, the old object is freed.
   *
   * This is used when the underlying class T does not have a default ctor, or
   * complex initializations needs to be done outside the blob.
   */

  /**
   * Sets the underlying object to the allocated one, but does not take over
   * the ownership of the passed in pointer. If there is already an object in
   * the Blob, the old object is freed.
   *
   * Unlike Reset, this does not take over the ownership of the pointer and the
   * caller is responsible for making sure that the lifetime of the allocated
   * blob outlasts the lifetime of any access to this blob, until another Reset
   * call is made or the blob is destructed.
   */

  public native Pointer ShareExternal(Pointer allocated, @Const @ByVal TypeMeta meta);

  /**
   * Resets the Blob to an empty one.
   */
  public native void Reset();

  /**
   * \brief Swaps the underlying storage of two blobs.
   */
  public native void swap(@ByRef Blob rhs);
}
