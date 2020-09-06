// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Creates ngrams from ragged string data.
 * 
 *  This op accepts a ragged tensor with 1 ragged dimension containing only
 *  strings and outputs a ragged tensor with 1 ragged dimension containing ngrams
 *  of that string, joined along the innermost axis.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * data: The values tensor of the ragged string tensor to make ngrams out of. Must be a
 *  1D string tensor.
 *  * data_splits: The splits tensor of the ragged string tensor to make ngrams out of.
 *  * separator: The string to append between elements of the token. Use "" for no separator.
 *  * ngram_widths: The sizes of the ngrams to create.
 *  * left_pad: The string to use to pad the left side of the ngram sequence. Only used if
 *  pad_width != 0.
 *  * right_pad: The string to use to pad the right side of the ngram sequence. Only used if
 *  pad_width != 0.
 *  * pad_width: The number of padding elements to add to each side of each
 *  sequence. Note that padding will never be greater than 'ngram_widths'-1
 *  regardless of this value. If {@code pad_width=-1}, then add {@code max(ngram_widths)-1}
 *  elements.
 * 
 *  Returns:
 *  * {@code Output} ngrams: The values tensor of the output ngrams ragged tensor.
 *  * {@code Output} ngrams_splits: The splits tensor of the output ngrams ragged tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class StringNGrams extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringNGrams(Pointer p) { super(p); }

  public StringNGrams(@Const @ByRef Scope scope, @ByVal Input data,
               @ByVal Input data_splits, @StringPiece BytePointer separator, @ArraySlice IntPointer ngram_widths, @StringPiece BytePointer left_pad,
               @StringPiece BytePointer right_pad, @Cast("tensorflow::int64") long pad_width, @Cast("bool") boolean preserve_short_sequences) { super((Pointer)null); allocate(scope, data, data_splits, separator, ngram_widths, left_pad, right_pad, pad_width, preserve_short_sequences); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input data,
               @ByVal Input data_splits, @StringPiece BytePointer separator, @ArraySlice IntPointer ngram_widths, @StringPiece BytePointer left_pad,
               @StringPiece BytePointer right_pad, @Cast("tensorflow::int64") long pad_width, @Cast("bool") boolean preserve_short_sequences);
  public StringNGrams(@Const @ByRef Scope scope, @ByVal Input data,
               @ByVal Input data_splits, @StringPiece String separator, @ArraySlice IntBuffer ngram_widths, @StringPiece String left_pad,
               @StringPiece String right_pad, @Cast("tensorflow::int64") long pad_width, @Cast("bool") boolean preserve_short_sequences) { super((Pointer)null); allocate(scope, data, data_splits, separator, ngram_widths, left_pad, right_pad, pad_width, preserve_short_sequences); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input data,
               @ByVal Input data_splits, @StringPiece String separator, @ArraySlice IntBuffer ngram_widths, @StringPiece String left_pad,
               @StringPiece String right_pad, @Cast("tensorflow::int64") long pad_width, @Cast("bool") boolean preserve_short_sequences);
  public StringNGrams(@Const @ByRef Scope scope, @ByVal Input data,
               @ByVal Input data_splits, @StringPiece BytePointer separator, @ArraySlice int[] ngram_widths, @StringPiece BytePointer left_pad,
               @StringPiece BytePointer right_pad, @Cast("tensorflow::int64") long pad_width, @Cast("bool") boolean preserve_short_sequences) { super((Pointer)null); allocate(scope, data, data_splits, separator, ngram_widths, left_pad, right_pad, pad_width, preserve_short_sequences); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input data,
               @ByVal Input data_splits, @StringPiece BytePointer separator, @ArraySlice int[] ngram_widths, @StringPiece BytePointer left_pad,
               @StringPiece BytePointer right_pad, @Cast("tensorflow::int64") long pad_width, @Cast("bool") boolean preserve_short_sequences);
  public StringNGrams(@Const @ByRef Scope scope, @ByVal Input data,
               @ByVal Input data_splits, @StringPiece String separator, @ArraySlice IntPointer ngram_widths, @StringPiece String left_pad,
               @StringPiece String right_pad, @Cast("tensorflow::int64") long pad_width, @Cast("bool") boolean preserve_short_sequences) { super((Pointer)null); allocate(scope, data, data_splits, separator, ngram_widths, left_pad, right_pad, pad_width, preserve_short_sequences); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input data,
               @ByVal Input data_splits, @StringPiece String separator, @ArraySlice IntPointer ngram_widths, @StringPiece String left_pad,
               @StringPiece String right_pad, @Cast("tensorflow::int64") long pad_width, @Cast("bool") boolean preserve_short_sequences);
  public StringNGrams(@Const @ByRef Scope scope, @ByVal Input data,
               @ByVal Input data_splits, @StringPiece BytePointer separator, @ArraySlice IntBuffer ngram_widths, @StringPiece BytePointer left_pad,
               @StringPiece BytePointer right_pad, @Cast("tensorflow::int64") long pad_width, @Cast("bool") boolean preserve_short_sequences) { super((Pointer)null); allocate(scope, data, data_splits, separator, ngram_widths, left_pad, right_pad, pad_width, preserve_short_sequences); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input data,
               @ByVal Input data_splits, @StringPiece BytePointer separator, @ArraySlice IntBuffer ngram_widths, @StringPiece BytePointer left_pad,
               @StringPiece BytePointer right_pad, @Cast("tensorflow::int64") long pad_width, @Cast("bool") boolean preserve_short_sequences);
  public StringNGrams(@Const @ByRef Scope scope, @ByVal Input data,
               @ByVal Input data_splits, @StringPiece String separator, @ArraySlice int[] ngram_widths, @StringPiece String left_pad,
               @StringPiece String right_pad, @Cast("tensorflow::int64") long pad_width, @Cast("bool") boolean preserve_short_sequences) { super((Pointer)null); allocate(scope, data, data_splits, separator, ngram_widths, left_pad, right_pad, pad_width, preserve_short_sequences); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input data,
               @ByVal Input data_splits, @StringPiece String separator, @ArraySlice int[] ngram_widths, @StringPiece String left_pad,
               @StringPiece String right_pad, @Cast("tensorflow::int64") long pad_width, @Cast("bool") boolean preserve_short_sequences);

  public native @ByRef Operation operation(); public native StringNGrams operation(Operation setter);
  public native @ByRef Output ngrams(); public native StringNGrams ngrams(Output setter);
  public native @ByRef Output ngrams_splits(); public native StringNGrams ngrams_splits(Output setter);
}
