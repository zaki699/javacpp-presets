// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;


@Namespace("H5") @Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5Object extends H5Location {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public H5Object(Pointer p) { super(p); }

        // Creates an attribute for the specified object
        // PropList is currently not used, so always be default.
        public native @ByVal Attribute createAttribute(@Cast("const char*") BytePointer name, @Const @ByRef DataType type, @Const @ByRef DataSpace space, @Const @ByRef(nullValue = "H5::PropList::DEFAULT") PropList create_plist);
        public native @ByVal Attribute createAttribute(@Cast("const char*") BytePointer name, @Const @ByRef DataType type, @Const @ByRef DataSpace space);
        public native @ByVal Attribute createAttribute(String name, @Const @ByRef DataType type, @Const @ByRef DataSpace space, @Const @ByRef(nullValue = "H5::PropList::DEFAULT") PropList create_plist);
        public native @ByVal Attribute createAttribute(String name, @Const @ByRef DataType type, @Const @ByRef DataSpace space);

        // Given its name, opens the attribute that belongs to an object at
        // this location.
        public native @ByVal Attribute openAttribute(@Cast("const char*") BytePointer name);
        public native @ByVal Attribute openAttribute(String name);

        // Given its index, opens the attribute that belongs to an object at
        // this location.
        public native @ByVal Attribute openAttribute(@Cast("const unsigned int") int idx);

        // Iterate user's function over the attributes of this object.
        public native int iterateAttrs(attr_operator_t user_op, @Cast("unsigned*") IntPointer idx/*=NULL*/, Pointer op_data/*=NULL*/);
        public native int iterateAttrs(attr_operator_t user_op);
        public native int iterateAttrs(attr_operator_t user_op, @Cast("unsigned*") IntBuffer idx/*=NULL*/, Pointer op_data/*=NULL*/);
        public native int iterateAttrs(attr_operator_t user_op, @Cast("unsigned*") int[] idx/*=NULL*/, Pointer op_data/*=NULL*/);

        // Recursively visit elements reachable from this object.
        public native void visit(@Cast("H5_index_t") int idx_type, @Cast("H5_iter_order_t") int order, visit_operator_t user_op, Pointer op_data, @Cast("unsigned int") int fields);

        // Returns the object header version of an object
        public native @Cast("unsigned") int objVersion();

        // Determines the number of attributes belong to this object.
        public native int getNumAttrs();

        // Checks whether the named attribute exists for this object.
        public native @Cast("bool") boolean attrExists(@Cast("const char*") BytePointer name);
        public native @Cast("bool") boolean attrExists(String name);

        // Renames the named attribute to a new name.
        public native void renameAttr(@Cast("const char*") BytePointer oldname, @Cast("const char*") BytePointer newname);
        public native void renameAttr(String oldname, String newname);

        // Removes the named attribute from this object.
        public native void removeAttr(@Cast("const char*") BytePointer name);
        public native void removeAttr(String name);

        // Returns an identifier.
        public native @Cast("hid_t") long getId();

        // Gets the name of this HDF5 object, i.e., Group, DataSet, or
        // DataType.
        public native @Cast("ssize_t") long getObjName(@Cast("char*") BytePointer obj_name, @Cast("size_t") long buf_size/*=0*/);
        public native @Cast("ssize_t") long getObjName(@Cast("char*") BytePointer obj_name);
        public native @Cast("ssize_t") long getObjName(@Cast("char*") ByteBuffer obj_name, @Cast("size_t") long buf_size/*=0*/);
        public native @Cast("ssize_t") long getObjName(@Cast("char*") ByteBuffer obj_name);
        public native @Cast("ssize_t") long getObjName(@Cast("char*") byte[] obj_name, @Cast("size_t") long buf_size/*=0*/);
        public native @Cast("ssize_t") long getObjName(@Cast("char*") byte[] obj_name);
        public native @StdString BytePointer getObjName();

}
