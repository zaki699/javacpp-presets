// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;

@Name("std::unordered_map<std::string,std::shared_ptr<arrow::DataType> >") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class StringDataTypeMap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringDataTypeMap(Pointer p) { super(p); }
    public StringDataTypeMap()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef StringDataTypeMap put(@ByRef StringDataTypeMap x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType get(@StdString String i);
    public native StringDataTypeMap put(@StdString String i, DataType value);

    public native void erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *().first") @MemberGetter @StdString String first();
        public native @Name("operator *().second") @MemberGetter @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType second();
    }
}

