// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;


@Namespace("onnx") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class Graph extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Graph(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Graph(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Graph position(long position) {
        return (Graph)super.position(position);
    }
    @Override public Graph getPointer(long i) {
        return new Graph((Pointer)this).offsetAddress(i);
    }


  
  public Graph() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native @Cast("bool") boolean has_doc_string();
  public native @StdString BytePointer docString();
  public native void setDocString(@StdString BytePointer doc_string);
  public native void setDocString(@StdString String doc_string);

  public native void addInitializer(@ByVal Tensor initializer, @StdString BytePointer name);
  public native void addInitializer(@ByVal Tensor initializer, @StdString String name);
  public native void eraseInitializer(@StdString BytePointer name);
  public native void eraseInitializer(@StdString String name);
  public native void clearInitializers();
  public native @StdVector Tensor initializers();
  public native @Const @ByRef StringVector initializer_names();

  public native @StdVector OpSetID opset_versions_mutable();

  public native @Cast("size_t") long getNextUnique();

  // These invocations of begin() on output of function are OK
  // because graph_node_list is non-owning, so it doesn't matter
  // if it immediately dies after the invocation.
  public native Node return_node();

  public native Value addInput();
  public native void eraseInput(@Cast("size_t") long i);
  public native void advanceStage();
  public native void setStage(@Cast("size_t") long new_stage);
  public native @Cast("size_t") long stage();

  public native @Cast("size_t") long registerOutput(Value n);

  public native Node appendNode(Node n);

  public native Node prependNode(Node n);

  //Adds to graph initializer list, initializer names list, and as a graph input
  //Also syncs the initializer name, tensor name, and value name
  public native Value addInitializerAndInput(@Const @ByRef Tensor initializer, @StdString BytePointer name);
  public native Value addInitializerAndInput(@Const @ByRef Tensor initializer, @StdString String name);

  public native Value addInitializerAndInput(@Const @ByRef Tensor initializer);


  //Erases from graph initializer list, initializer names list, and as a graph input
  //Must have no uses
  public native void eraseInitializerAndInput(Value v);

  

  public native @Cast("bool") boolean has_name();

  public native @StdString BytePointer name();

  public native void setName(@StdString BytePointer name);
  public native void setName(@StdString String name);

  
}
