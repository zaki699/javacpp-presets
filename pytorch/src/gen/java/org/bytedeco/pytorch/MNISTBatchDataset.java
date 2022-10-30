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
 // namespace detail

/** A dataset that can yield data only in batches. */
@Name("torch::data::datasets::BatchDataset<torch::data::datasets::MNIST,std::vector<torch::data::Example<> >,at::ArrayRef<size_t> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class MNISTBatchDataset extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MNISTBatchDataset(Pointer p) { super(p); }

  @MemberGetter public static native @Cast("const bool") boolean is_stateful();
  public static final boolean is_stateful = is_stateful();

  /** Returns a batch of data given an index. */
  public native @ByVal ExampleVector get_batch(@ByVal SizeTArrayRef request);

  /** Returns the size of the dataset, or an empty optional if it is unsized. */
  public native @ByVal SizeTOptional size();

  /** Creates a {@code MapDataset} that applies the given {@code transform} to this dataset. */
  public native @ByVal MNISTMapDataset map(@ByVal ExampleStack transform);

  /** Creates a {@code MapDataset} that applies the given {@code transform} to this dataset. */
  
}
