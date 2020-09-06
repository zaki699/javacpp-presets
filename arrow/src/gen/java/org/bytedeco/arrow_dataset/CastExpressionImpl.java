// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;


/** Helper class which implements Copy and forwards construction */
@Name("arrow::dataset::ExpressionImpl<arrow::dataset::UnaryExpression,arrow::dataset::CastExpression,arrow::dataset::ExpressionType::CAST>") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class CastExpressionImpl extends UnaryExpression {
    static { Loader.load(); }
    /** Default native constructor. */
    public CastExpressionImpl() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CastExpressionImpl(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CastExpressionImpl(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CastExpressionImpl position(long position) {
        return (CastExpressionImpl)super.position(position);
    }
    @Override public CastExpressionImpl getPointer(long i) {
        return new CastExpressionImpl(this).position(position + i);
    }

  @MemberGetter public static native ExpressionType.type expression_type();

  public native @SharedPtr @ByVal Expression Copy();
}
