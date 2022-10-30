// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_flight;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.arrow_flight.*;


/** \brief The access coordinates for retireval of a dataset, returned by
 *  GetFlightInfo */
@Namespace("arrow::flight") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_flight.class)
public class FlightInfo extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FlightInfo(Pointer p) { super(p); }

  public static class Data extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Data() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Data(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Data(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Data position(long position) {
          return (Data)super.position(position);
      }
      @Override public Data getPointer(long i) {
          return new Data((Pointer)this).offsetAddress(i);
      }
  
    public native @StdString String schema(); public native Data schema(String setter);
    public native @ByRef FlightDescriptor descriptor(); public native Data descriptor(FlightDescriptor setter);
    public native @StdVector FlightEndpoint endpoints(); public native Data endpoints(FlightEndpoint setter);
    public native @Cast("int64_t") long total_records(); public native Data total_records(long setter);
    public native @Cast("int64_t") long total_bytes(); public native Data total_bytes(long setter);
  }

  public FlightInfo(@Const @ByRef Data data) { super((Pointer)null); allocate(data); }
  private native void allocate(@Const @ByRef Data data);

  /** \brief Factory method to construct a FlightInfo. */
  public static native @ByVal FlightInfoResult Make(@Const @ByRef Schema schema,
                                          @Const @ByRef FlightDescriptor descriptor,
                                          @StdVector FlightEndpoint endpoints,
                                          @Cast("int64_t") long total_records, @Cast("int64_t") long total_bytes);

  /** \brief Deserialize the Arrow schema of the dataset, to be passed
   *  to each call to DoGet. Populate any dictionary encoded fields
   *  into a DictionaryMemo for bookkeeping
   *  @param dictionary_memo [in,out] for dictionary bookkeeping, will
   *  be modified
   *  @param out [out] the reconstructed Schema */
  public native @ByVal Status GetSchema(DictionaryMemo dictionary_memo,
                     @SharedPtr Schema out);

  public native @StdString String serialized_schema();

  /** The descriptor associated with this flight, may not be set */
  public native @Const @ByRef FlightDescriptor descriptor();

  /** A list of endpoints associated with the flight (dataset). To consume the
   *  whole flight, all endpoints must be consumed */
  public native @StdVector FlightEndpoint endpoints();

  /** The total number of records (rows) in the dataset. If unknown, set to -1 */
  public native @Cast("int64_t") long total_records();

  /** The total number of bytes in the dataset. If unknown, set to -1 */
  
  ///
  public native @Cast("int64_t") long total_bytes();

  /** \brief Get the wire-format representation of this type.
   * 
   *  Useful when interoperating with non-Flight systems (e.g. REST
   *  services) that may want to return Flight types. */
  
  ///
  public native @ByVal Status SerializeToString(@StdString @Cast({"char*", "std::string*"}) BytePointer out);

  /** \brief Parse the wire-format representation of this type.
   * 
   *  Useful when interoperating with non-Flight systems (e.g. REST
   *  services) that may want to return Flight types. */
  public static native @ByVal Status Deserialize(@StdString String serialized,
                              @UniquePtr FlightInfo out);
  public static native @ByVal Status Deserialize(@StdString BytePointer serialized,
                              @UniquePtr FlightInfo out);
}
