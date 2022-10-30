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

@NoOffset @Name("std::pair<std::string,torch::nn::AnyModule>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class StringAnyModulePair extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringAnyModulePair(Pointer p) { super(p); }
    public StringAnyModulePair(BytePointer firstValue, AnyModule secondValue) { this(); put(firstValue, secondValue); }
    public StringAnyModulePair(String firstValue, AnyModule secondValue) { this(); put(firstValue, secondValue); }
    public StringAnyModulePair()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef StringAnyModulePair put(@ByRef StringAnyModulePair x);


    @MemberGetter public native @StdString BytePointer first(); public native StringAnyModulePair first(BytePointer first);
    @MemberGetter public native @ByRef AnyModule second();  public native StringAnyModulePair second(AnyModule second);
    @MemberSetter @Index public native StringAnyModulePair first(@StdString String first);

    public StringAnyModulePair put(BytePointer firstValue, AnyModule secondValue) {
        first(firstValue);
        second(secondValue);
        return this;
    }

    public StringAnyModulePair put(String firstValue, AnyModule secondValue) {
        first(firstValue);
        second(secondValue);
        return this;
    }
}

