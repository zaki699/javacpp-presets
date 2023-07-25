// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;

@Name("torch::OrderedDict<std::string,torch::nn::AnyModule>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class StringAnyModuleDict extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringAnyModuleDict(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public StringAnyModuleDict(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public StringAnyModuleDict position(long position) {
        return (StringAnyModuleDict)super.position(position);
    }
    @Override public StringAnyModuleDict getPointer(long i) {
        return new StringAnyModuleDict((Pointer)this).offsetAddress(i);
    }

  /** A (key, value) pair. */

  // The lifetime of an iterator is bound to the lifetime of the `OrderedDict`.
  // Further, any `insert()` operation may invalidate all iterators
  // pointing into the vector.

  /** Constructs the {@code OrderedDict} with a short description of the kinds of keys
   *  stored in the {@code OrderedDict}. This description is used in error messages
   *  thrown by the {@code OrderedDict}. */
  public StringAnyModuleDict(@StdString BytePointer key_description/*="Key"*/) { super((Pointer)null); allocate(key_description); }
  private native void allocate(@StdString BytePointer key_description/*="Key"*/);
  public StringAnyModuleDict() { super((Pointer)null); allocate(); }
  private native void allocate();
  public StringAnyModuleDict(@StdString String key_description/*="Key"*/) { super((Pointer)null); allocate(key_description); }
  private native void allocate(@StdString String key_description/*="Key"*/);

  /** Copy constructs this {@code OrderedDict} from {@code other}. */
  public StringAnyModuleDict(@Const @ByRef StringAnyModuleDict other) { super((Pointer)null); allocate(other); }
  private native void allocate(@Const @ByRef StringAnyModuleDict other);

  /** Assigns items from {@code other} to this {@code OrderedDict}. */
  public native @ByRef @Name("operator =") StringAnyModuleDict put(@Const @ByRef StringAnyModuleDict other);

  // NB: Move works by default, because you can move-construct vectors of const
  // values. I tried to make this noexcept (conditional on the move constructors
  // of index_ and items_ being noexcept) but the obvious spelling didn't
  // compile on Windows.

  /** Constructs a new {@code OrderedDict} and pre-populates it with the given
   *  {@code Item}s. */
  /*implicit */

  /** Returns the key description string the {@code OrderedDict} was constructed with. */
  public native @StdString @NoException(true) BytePointer key_description();

  // Element Access

  /** Returns the very first item in the {@code OrderedDict} and throws an exception
   *  if it is empty. */
  public native @ByRef StringAnyModuleDictItem front();

  /** Returns the very first item in the {@code OrderedDict} and throws an exception
   *  if it is empty. */

  /** Returns the very last item in the {@code OrderedDict} and throws an exception
   *  if it is empty. */
  public native @ByRef StringAnyModuleDictItem back();

  /** Returns the very last item in the {@code OrderedDict} and throws an exception
   *  if it is empty. */

  /** Returns the item at the {@code index}-th position in the {@code OrderedDict}. Throws
   *  an exception if the index is out of bounds. */
  public native @ByRef @Name("operator []") StringAnyModuleDictItem get(@Cast("size_t") long index);

  /** Returns the item at the {@code index}-th position in the {@code OrderedDict}. Throws
   *  an exception if the index is out of bounds. */

  /** Returns the value associated with the given {@code key}. Throws an exception if
   *  no such key is stored in the {@code OrderedDict}. Use {@code find()} for a
   *  non-throwing way of accessing a value if it is present. */
  public native @ByRef @Name("operator []") AnyModule get(@StdString BytePointer key);
  public native @ByRef @Name("operator []") AnyModule get(@StdString String key);

  /** Returns the value associated with the given {@code key}. Throws an exception if
   *  no such key is stored in the {@code OrderedDict}. Use {@code find()} for a
   *  non-throwing way of accessing a value if it is present. */

  // Lookup

  /** Returns a pointer to the value associated with the given key, or a
   *  {@code nullptr} if no such key is stored in the {@code OrderedDict}. */
  public native @NoException(true) AnyModule find(@StdString BytePointer key);
  public native @NoException(true) AnyModule find(@StdString String key);

  /** Returns a pointer to the value associated with the given key, or a
   *  {@code nullptr} if no such key is stored in the {@code OrderedDict}. */

  /** Returns true if the key is present in the {@code OrderedDict}. */
  public native @Cast("bool") @NoException(true) boolean contains(@StdString BytePointer key);
  public native @Cast("bool") @NoException(true) boolean contains(@StdString String key);

  // Iterators

  /** Returns an iterator to the first item in the {@code OrderedDict}. Iteration is
   *  ordered. */
  public native @ByVal @Cast("torch::OrderedDict<std::string,torch::nn::AnyModule>::Iterator*") StringAnyModuleDictItemVector.Iterator begin();

  /** Returns an iterator to the first item in the {@code OrderedDict}. Iteration is
   *  ordered. */

  /** Returns an iterator one past the last item in the {@code OrderedDict}. */
  public native @ByVal @Cast("torch::OrderedDict<std::string,torch::nn::AnyModule>::Iterator*") StringAnyModuleDictItemVector.Iterator end();

  /** Returns an iterator one past the last item in the {@code OrderedDict}. */

  // Capacity

  /** Returns the number of items currently stored in the {@code OrderedDict}. */
  public native @Cast("size_t") @NoException(true) long size();

  /** Returns true if the {@code OrderedDict} contains no elements. */
  public native @Cast("bool") @NoException(true) boolean is_empty();

  /** Resizes internal storage to fit at least {@code requested_capacity} items
   *  without requiring reallocation. */
  public native void reserve(@Cast("size_t") long requested_capacity);

  // Modifiers

  /** Inserts a new {@code (key, value)} pair into the {@code OrderedDict}. Throws an
   *  exception if the key is already present. If insertion is successful,
   *  immediately returns a reference to the inserted value. */

  /** Inserts a new {@code (key, value)} pair into the {@code OrderedDict}. Throws an
   *  exception if the key is already present. If insertion is successful,
   *  immediately returns a reference to the inserted value. */
  public native @ByRef AnyModule insert(@StdString BytePointer key, @ByRef(true) AnyModule value);
  public native @ByRef AnyModule insert(@StdString String key, @ByRef(true) AnyModule value);

  /** Inserts all items from {@code other} into this {@code OrderedDict}. If any key from
   *  {@code other} is already present in this {@code OrderedDict}, an exception is thrown. */
  public native void update(@ByRef(true) StringAnyModuleDict other);

  /** Inserts all items from {@code other} into this {@code OrderedDict}. If any key from
   *  {@code other} is already present in this {@code OrderedDict}, an exception is thrown. */

  /** Removes the item that has {@code key} from this {@code OrderedDict} if exists and if
   *  it doesn't an exception is thrown. */
  public native void erase(@StdString BytePointer key);
  public native void erase(@StdString String key);

  /** Removes all items from this {@code OrderedDict}. */
  public native void clear();

  // Observers

  /** Returns the items stored in the {@code OrderedDict}. */
  public native @Const @ByRef @NoException(true) StringAnyModuleDictItemVector items();

  /** Returns a newly allocated vector and copies all keys from this
   *  {@code OrderedDict} into the vector. */
  public native @ByVal StringVector keys();

  /** Returns a newly allocated vector and copies all values from this
   *  {@code OrderedDict} into the vector. */
  public native @ByVal AnyModuleVector values();

  /** Returns a newly allocated vector and copies all keys and values from this
   *  {@code OrderedDict} into a vector of {@code std::pair<Key, Value>}. */
  public native @ByVal StringAnyModuleVector pairs();

  /** Returns true if both dicts contain the same keys and values, in the same
   *  order. */
  
  /** A mapping from a key to an index into the {@code items_} vector. */
}
