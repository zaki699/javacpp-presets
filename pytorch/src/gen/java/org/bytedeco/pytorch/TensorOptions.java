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


/** A class to encapsulate construction axes of an Tensor.  TensorOptions was
 *  designed to support the Python style API for specifying construction options
 *  on factory functions, e.g.,
 * 
 *      torch.zeros(2, 3, dtype=torch.int32)
 * 
 *  Because C++ doesn't natively support keyword arguments, there must be
 *  another way of specifying keyword-like arguments.  TensorOptions is a
 *  builder class which can be used to construct this "dictionary" of keyword
 *  arguments: functions which support TensorOptions conventionally take this
 *  argument optionally as their last argument.
 * 
 *  WARNING: In PyTorch, there are {@code torch::} variants of factory functions,
 *  e.g., torch::zeros for at::zeros.  These return Variables (while the
 *  stock ATen functions return plain Tensors).  If you mix these functions
 *  up, you WILL BE SAD.
 * 
 *  Rather than use the constructor of this class directly, you should prefer to
 *  use the constructor functions, and then chain setter methods on top of them.
 * 
 *      at::device(at::kCUDA).dtype(kInt)
 *      at::dtype(at::kInt)
 * 
 *  Additionally, anywhere a TensorOptions is expected, you can directly
 *  pass at::kCUDA / at::kInt, and it will implicitly convert to a
 *  TensorOptions.
 * 
 *  Here are some recommended ways to create a 2x2 tensor of zeros
 *  with certain properties.  These all *implicitly* make use of
 *  TensorOptions, even if they don't mention the class explicitly:
 * 
 *      at::zeros({2,2}, at::kCUDA);
 *      at::zeros({2,2}, at::kLong);
 *      at::zeros({2,2}, at::device(at::kCUDA).dtype(at::kLong()));
 *      at::zeros({2,2}, at::device({at::kCUDA, 1})); // place on device 1
 *      at::zeros({2,2}, at::requires_grad());
 * 
 <p>
 *  NOTE [ TensorOptions Constructors ]
 * 
 *  TensorOptions is like a dictionary with entries from the set:
 *  {requires_grad, device, dtype, layout}, where each entry may be
 *  unspecified (i.e., is optional). It is used to specify the properties of
 *  tensors in many places both in C++ internal and API, e.g., tensor factory
 *  methods like {@code at::empty({10}, options)}, tensor conversions like
 *  {@code tensor.to(...)}, etc.
 * 
 *  To provide a simple API that is consistent with Python, where one can do
 *  {@code torch.empty(sizes, X)} with {@code X} being a {@code torch.device}, {@code torch.dtype}, or a
 *  {@code torch.layout}, we want TensorOptions to be implicitly convertible from
 *  {@code ScalarType dtype}, {@code Layout layout} and {@code Device device}. Therefore, we have
 *  three implicit constructors from each of these three types.
 * 
 *  This is sufficient for {@code ScalarType} and {@code Layout} as they are simple Enum
 *  classes. However, {@code Device} is an ordinary class with implicit constructors
 *  {@code Device(DeviceType, DeviceIndex = -1)} and {@code Device(std::string)} to be
 *  consistent with Python API, where strings are treated as equivalent with a
 *  {@code torch.device} object (e.g., "cuda:1" can be passed to everywhere a
 *  {@code torch.device("cuda:1")} is accepted). To support the syntax
 *  {@code at::empty({10}, {kCUDA, 1})} and {@code tensor.to(kCUDA)}, we need to make sure
 *  that {@code TensorOptions} is implicitly constructible with any argments that a
 *  {@code Device} can constructed from. So we have,
 * 
 *     /* implicit * / TensorOptions(T&& device) : TensorOptions() {
 *       this->set_device(device);
 *     }
 * 
 *     template <typename... Args,
 *              typename = std::enable_if_t<std::is_constructible<Device,
 *              Args&&...>::value>>
 *     /* implicit * /  TensorOptions(Args&&... args)
 *      : TensorOptions(Device(std::forward<Args>(args)...)) {}
 * 
 * 
 *  But this will be problematic. Consider this: {@code TensorOptions({kCUDA, 1})}.
 *  Compiler will compain about ambiguity between the copy constructor and the
 *  {@code Device} constructor because {@code {kCUDA, 1}} can be converted to both a
 *  {@code TensorOption} and a {@code Device}.
 * 
 *  To get around this, we templatize the {@code Device} constructor. Since overload
 *  resolution is done before template resolution, our problem is solved. */

@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TensorOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TensorOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TensorOptions position(long position) {
        return (TensorOptions)super.position(position);
    }
    @Override public TensorOptions getPointer(long i) {
        return new TensorOptions((Pointer)this).offsetAddress(i);
    }

  public TensorOptions() { super((Pointer)null); allocate(); }
  private native void allocate();

  /** Constructs a {@code TensorOptions} object with the given layout. */
  /* implicit */ public TensorOptions(Layout layout) { super((Pointer)null); allocate(layout); }
private native void allocate(Layout layout);
public TensorOptions(@Cast("c10::Layout") byte layout) { super((Pointer)null); allocate(layout); }
private native void allocate(@Cast("c10::Layout") byte layout);

  /** Constructs a {@code TensorOptions} object with the given device.
   *  See NOTE [ TensorOptions Constructors ] on why this is templatized. */
  
  ///
  ///
  public TensorOptions(@ByRef(true) Device device) { super((Pointer)null); allocate(device); }
  private native void allocate(@ByRef(true) Device device);

  /** Constructs a {@code TensorOptions} object from arguments allowed in {@code Device}
   *  constructors.
   * 
   *  See NOTE [ TensorOptions Constructors ].
   * 
   *  NB: Ideally we only allow implicit constructors here. But there is no easy
   *      way to detect them. So we have this one that allows explicit
   *      constructors too. */

  /** Constructs a {@code TensorOptions} object with the given dtype. */
  /* implicit */ public TensorOptions(@ByVal TypeMeta dtype) { super((Pointer)null); allocate(dtype); }
private native void allocate(@ByVal TypeMeta dtype);

  /** legacy constructor to support ScalarType */
  /* implicit */ public TensorOptions(ScalarType dtype) { super((Pointer)null); allocate(dtype); }
private native void allocate(ScalarType dtype);

  /** Constructs a {@code TensorOptions} object with the given memory format. */
  /* implicit */ public TensorOptions(MemoryFormat memory_format) { super((Pointer)null); allocate(memory_format); }
private native void allocate(MemoryFormat memory_format);

  /** Return a copy of {@code TensorOptions} with {@code device} set to the given one, or
   *  cleared if {@code device} is {@code nullopt}. */
  public native @ByVal @NoException(true) TensorOptions device(@ByVal DeviceOptional device);

  /** Return a copy of {@code TensorOptions} with {@code device} set to the given one.
   *  (This overload ensures that variadic template c10::optional constructor
   *  for Device work correctly.) */

  /** Return a copy of {@code TensorOptions}, but with device set to CUDA, and the
   *  device index set to the given one.
   * 
   *  TODO: This function encourages bad behavior (assuming CUDA is
   *  the only device that matters).  Get rid of it / rename it. */
  public native @ByVal @NoException(true) TensorOptions device_index(@Cast("c10::DeviceIndex") byte device_index);

  /** Return a copy of {@code TensorOptions} with {@code dtype} set to the given one. */
  public native @ByVal @NoException(true) TensorOptions dtype(@ByVal TypeMetaOptional dtype);

  // legacy function to support ScalarType
  public native @ByVal @NoException(true) TensorOptions dtype(@ByVal ScalarTypeOptional dtype);

  // Since dtype is taken...

  /** Sets the layout of the {@code TensorOptions}. */
  public native @ByVal @NoException(true) TensorOptions layout(@ByVal LayoutOptional layout);

  /** Sets the {@code requires_grad} property of the {@code TensorOptions}. */
  public native @ByVal @NoException(true) TensorOptions requires_grad(@ByVal BoolOptional requires_grad);

  /** Sets the {@code pinned_memory} property on the {@code TensorOptions}. */
  public native @ByVal @NoException(true) TensorOptions pinned_memory(@ByVal BoolOptional pinned_memory);

  /** Sets the {@code memory_format} property on {@code TensorOptions}. */
  public native @ByVal @NoException(true) TensorOptions memory_format(@ByVal MemoryFormatOptional memory_format);

  /** Returns the device of the {@code TensorOptions}. */
  public native @ByVal @NoException(true) Device device();

  /** Returns whether the device is specified. */
  public native @Cast("bool") @NoException(true) boolean has_device();

  /** Returns the device of the {@code TensorOptions}, or {@code c10::nullopt} if
   *  device is not specified. */
  public native @ByVal @NoException(true) DeviceOptional device_opt();

  /** Returns the device index of the {@code TensorOptions}. */
  public native @NoException(true) int device_index();

  /** Returns the dtype of the {@code TensorOptions}. */
  public native @ByVal @NoException(true) TypeMeta dtype();

  /** Returns whether the dtype is specified. */
  public native @Cast("bool") @NoException(true) boolean has_dtype();

  /** Returns the dtype of the {@code TensorOptions}, or {@code c10::nullopt} if
   *  device is not specified. */
  public native @ByVal @NoException(true) TypeMetaOptional dtype_opt();

  /** Returns the layout of the {@code TensorOptions}. */
  public native @NoException(true) Layout layout();

  /** Returns whether the layout is specified. */
  public native @Cast("bool") @NoException(true) boolean has_layout();

  /** Returns the layout of the {@code TensorOptions}, or {@code c10::nullopt} if
   *  layout is not specified. */
  public native @ByVal @NoException(true) LayoutOptional layout_opt();

  /** Returns the {@code requires_grad} property of the {@code TensorOptions}. */
  public native @Cast("bool") @NoException(true) boolean requires_grad();

  /** Returns whether the {@code requires_grad} is specified. */
  public native @Cast("bool") @NoException(true) boolean has_requires_grad();

  /** Returns the {@code requires_grad} property of the {@code TensorOptions}, or
   *  {@code c10::nullopt} if {@code requires_grad} is not specified. */
  public native @ByVal @NoException(true) BoolOptional requires_grad_opt();

  /** Returns the {@code pinned_memory} property of the {@code TensorOptions}. */
  public native @Cast("bool") @NoException(true) boolean pinned_memory();

  /** Returns whether the {@code pinned_memory} is specified. */
  public native @Cast("bool") @NoException(true) boolean has_pinned_memory();

  /** Returns if the layout is sparse */
  public native @Cast("bool") boolean is_sparse();

  public native @Cast("bool") boolean is_sparse_csr();

  // For compatibility with legacy tensor.type() comparisons
  public native @Cast("bool") boolean type_equal(@Const @ByRef TensorOptions other);

  /** Returns the {@code pinned_memory} property of the {@code TensorOptions}, or
   *  {@code c10::nullopt} if {@code pinned_memory} is not specified. */
  public native @ByVal @NoException(true) BoolOptional pinned_memory_opt();

  /** Returns whether the {@code memory_layout} is specified */
  public native @Cast("bool") @NoException(true) boolean has_memory_format();

  // NB: memory_format() getter is PURPOSELY not defined, as the default
  // behavior of memory_format varies from function to function.

  /** Returns the {@code memory_layout} property of {@code TensorOptions, or
   *  }c10::nullopt{@code  if }memory_format{@code  is not specified. */
  public native @ByVal @NoException(true) MemoryFormatOptional memory_format_opt();

  // Resolves the ATen backend specified by the current construction axes.
  // TODO: Deprecate this
  
  ///
  ///
  public native @NoException(true) Backend backend();

  /** Return the right-biased merge of two TensorOptions.  This has the
   *  effect of overwriting settings from self with specified options
   *  of options.
   * 
   *  NB: This merging operation does NOT respect device merges.
   *  For example, if you device({kCUDA, 1}).merge_in(kCUDA)
   *  you will get kCUDA in the end!  Functions like Tensor.new_empty
   *  ensure the right device is selected anyway by way of a
   *  device guard.
   *  */
  public native @ByVal @NoException(true) TensorOptions merge_in(@ByVal TensorOptions options);

  // TODO remove after TensorOptions rationalization
  public native @ByVal @NoException(true) TensorOptions merge_memory_format(
        @ByVal MemoryFormatOptional optional_memory_format);

  // INVARIANT: computeDispatchKey returns only the subset of dispatch keys for
  // which dispatchKeyToBackend is injective, if it is defined at all  (for
  // the most part, this just means that this function never returns an
  // Autograd key)
  public native DispatchKey computeDispatchKey();
}
