// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Allocator;
import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;

        /** \brief Elementwise multiplication operation. */
        @Namespace("ngraph::op") @NoOffset @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class Multiply extends BinaryElementwiseArithmetic {
            static { Loader.load(); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public Multiply(Pointer p) { super(p); }
            /** Native array allocator. Access with {@link Pointer#position(long)}. */
            public Multiply(long size) { super((Pointer)null); allocateArray(size); }
            private native void allocateArray(long size);
            @Override public Multiply position(long position) {
                return (Multiply)super.position(position);
            }
            @Override public Multiply getPointer(long i) {
                return new Multiply((Pointer)this).offsetAddress(i);
            }
        
            @MemberGetter public static native @StdString BytePointer type_name();
            public native @StdString BytePointer description();
            /** \brief Constructs a multiplication operation. */
            
            ///
            public Multiply() { super((Pointer)null); allocate(); }
            private native void allocate();
            /** \brief Constructs a multiplication operation.
             * 
             *  @param arg0 Node that produces the first input tensor.
             *  @param arg1 Node that produces the second input tensor.
             *  @param auto_broadcast Auto broadcast specification */
            public Multiply(@Const @ByRef NodeOutput arg0,
                                 @Const @ByRef NodeOutput arg1,
                                 @Const @ByRef(nullValue = "ngraph::op::AutoBroadcastSpec()") AutoBroadcastSpec auto_broadcast) { super((Pointer)null); allocate(arg0, arg1, auto_broadcast); }
            private native void allocate(@Const @ByRef NodeOutput arg0,
                                 @Const @ByRef NodeOutput arg1,
                                 @Const @ByRef(nullValue = "ngraph::op::AutoBroadcastSpec()") AutoBroadcastSpec auto_broadcast);
            public Multiply(@Const @ByRef NodeOutput arg0,
                                 @Const @ByRef NodeOutput arg1) { super((Pointer)null); allocate(arg0, arg1); }
            private native void allocate(@Const @ByRef NodeOutput arg0,
                                 @Const @ByRef NodeOutput arg1);

            public native @SharedPtr @ByVal Node copy_with_new_args(@Const @ByRef NodeVector new_args);

            public native @Cast("bool") boolean is_commutative();
        }
