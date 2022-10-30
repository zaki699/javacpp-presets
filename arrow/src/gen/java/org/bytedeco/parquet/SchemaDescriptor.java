// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;


// Container for the converted Parquet schema with a computed information from
// the schema analysis needed for file reading
//
// * Column index to Node
// * Max repetition / definition levels for each primitive node
//
// The ColumnDescriptor objects produced by this class can be used to assist in
// the reconstruction of fully materialized data structures from the
// repetition-definition level encoding of nested data
//
// TODO(wesm): this object can be recomputed from a Schema
@Namespace("parquet") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class SchemaDescriptor extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SchemaDescriptor(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SchemaDescriptor(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SchemaDescriptor position(long position) {
        return (SchemaDescriptor)super.position(position);
    }
    @Override public SchemaDescriptor getPointer(long i) {
        return new SchemaDescriptor((Pointer)this).offsetAddress(i);
    }

  public SchemaDescriptor() { super((Pointer)null); allocate(); }
  private native void allocate();

  // Analyze the schema
  public native void Init(@UniquePtr Node schema);

  public native @Const ColumnDescriptor Column(int i);

  // Get the index of a column by its dotstring path, or negative value if not found.
  // If several columns share the same dotstring path, it is unspecified which one
  // is returned.
  public native int ColumnIndex(@StdString String node_path);
  public native int ColumnIndex(@StdString BytePointer node_path);
  // Get the index of a column by its node, or negative value if not found.
  public native int ColumnIndex(@Const @ByRef Node node);

  public native @Cast("bool") boolean Equals(@Const @ByRef SchemaDescriptor other);

  // The number of physical columns appearing in the file
  public native int num_columns();

  public native @Const @SharedPtr @ByRef Node schema_root();

  public native @Const GroupNode group_node();

  // Returns the root (child of the schema root) node of the leaf(column) node
  public native @Const Node GetColumnRoot(int i);

  public native @StdString String name();

  public native @StdString String ToString();

  public native void updateColumnOrders(@StdVector ColumnOrder column_orders);

  /** \brief Return column index corresponding to a particular
   *  PrimitiveNode. Returns -1 if not found */
  public native int GetColumnIndex(@Const @ByRef PrimitiveNode node);

  /** \brief Return true if any field or their children have REPEATED repetition
   *  type */
  public native @Cast("bool") boolean HasRepeatedFields();
}
