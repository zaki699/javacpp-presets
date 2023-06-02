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

@NoOffset @Name("std::pair<std::string,torch::nn::Module>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class StringModulePair extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringModulePair(Pointer p) { super(p); }
    public StringModulePair(BytePointer firstValue, Module secondValue) { this(); put(firstValue, secondValue); }
    public StringModulePair(String firstValue, Module secondValue) { this(); put(firstValue, secondValue); }
    public StringModulePair()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef StringModulePair put(@ByRef StringModulePair x);


    @MemberGetter public native @StdString BytePointer first(); public native StringModulePair first(BytePointer first);
    @MemberGetter public native @ByRef Module second();  public native StringModulePair second(Module second);
    @MemberSetter @Index public native StringModulePair first(@StdString String first);

    public StringModulePair put(BytePointer firstValue, Module secondValue) {
        first(firstValue);
        second(secondValue);
        return this;
    }

    public StringModulePair put(String firstValue, Module secondValue) {
        first(firstValue);
        second(secondValue);
        return this;
    }
}

