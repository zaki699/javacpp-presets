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

/** A {@code Sampler} is an object that yields an index with which to access a
 *  dataset. */
@Name("torch::data::samplers::Sampler<std::vector<size_t> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Sampler extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Sampler(Pointer p) { super(p); }


  /** Resets the {@code Sampler}'s internal state.
   *  Typically called before a new epoch.
   *  Optionally, accepts a new size when reseting the sampler. */
  public native void reset(@ByVal SizeTOptional new_size);

  /** Returns the next index if possible, or an empty optional if the
   *  sampler is exhausted for this epoch. */
  public native @ByVal SizeTVectorOptional next(@Cast("size_t") long batch_size);

  /** Serializes the {@code Sampler} to the {@code archive}. */
  public native void save(@ByRef OutputArchive archive);

  /** Deserializes the {@code Sampler} from the {@code archive}. */
  public native void load(@ByRef InputArchive archive);
}
