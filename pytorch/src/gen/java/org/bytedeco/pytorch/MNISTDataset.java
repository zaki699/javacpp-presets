// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

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


/** A dataset that can yield data in batches, or as individual examples.
 * 
 *  A {@code Dataset} is a {@code BatchDataset}, because it supports random access and
 *  therefore batched access is implemented (by default) by calling the random
 *  access indexing function for each index in the requested batch of indices.
 *  This can be customized. */
@Name("torch::data::datasets::Dataset<torch::data::datasets::MNIST,torch::data::Example<> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class MNISTDataset extends MNISTBatchDataset {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MNISTDataset(Pointer p) { super(p); }


  /** Returns the example at the given index. */
  public native @ByVal @Cast("torch::data::datasets::Dataset<torch::data::datasets::MNIST,torch::data::Example<> >::ExampleType*") Example get(@Cast("size_t") long index);

  /** Returns a batch of data.
   *  The default implementation calls {@code get()} for every requested index
   *  in the batch. */
  public native @ByVal ExampleVector get_batch(@ByVal SizeTArrayRef indices);
}
