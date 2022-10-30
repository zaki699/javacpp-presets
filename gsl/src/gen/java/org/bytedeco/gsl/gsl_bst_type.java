// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


/* type of binary search tree */
@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_bst_type extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_bst_type(Pointer p) { super(p); }

  public native @Cast("const char*") BytePointer name(); public native gsl_bst_type name(BytePointer setter);
  @MemberGetter public native @Cast("const size_t") long node_size();
  public static class Init_gsl_bst_allocator_gsl_bst_cmp_function_Pointer_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Init_gsl_bst_allocator_gsl_bst_cmp_function_Pointer_Pointer(Pointer p) { super(p); }
      protected Init_gsl_bst_allocator_gsl_bst_cmp_function_Pointer_Pointer() { allocate(); }
      private native void allocate();
      public native int call(@Const gsl_bst_allocator allocator,
                   gsl_bst_cmp_function compare, Pointer params, Pointer vtable);
  }
  public native Init_gsl_bst_allocator_gsl_bst_cmp_function_Pointer_Pointer init(); public native gsl_bst_type init(Init_gsl_bst_allocator_gsl_bst_cmp_function_Pointer_Pointer setter);
  public static class Nodes_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Nodes_Pointer(Pointer p) { super(p); }
      protected Nodes_Pointer() { allocate(); }
      private native void allocate();
      public native @Cast("size_t") long call(@Const Pointer vtable);
  }
  public native Nodes_Pointer nodes(); public native gsl_bst_type nodes(Nodes_Pointer setter);
  public static class Insert_Pointer_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Insert_Pointer_Pointer(Pointer p) { super(p); }
      protected Insert_Pointer_Pointer() { allocate(); }
      private native void allocate();
      public native Pointer call(Pointer item, Pointer vtable);
  }
  public native Insert_Pointer_Pointer insert(); public native gsl_bst_type insert(Insert_Pointer_Pointer setter);
  public static class Find_Pointer_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Find_Pointer_Pointer(Pointer p) { super(p); }
      protected Find_Pointer_Pointer() { allocate(); }
      private native void allocate();
      public native Pointer call(@Const Pointer item, @Const Pointer vtable);
  }
  public native Find_Pointer_Pointer find(); public native gsl_bst_type find(Find_Pointer_Pointer setter);
  public static class Remove_Pointer_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Remove_Pointer_Pointer(Pointer p) { super(p); }
      protected Remove_Pointer_Pointer() { allocate(); }
      private native void allocate();
      public native Pointer call(@Const Pointer item, Pointer vtable);
  }
  public native Remove_Pointer_Pointer remove(); public native gsl_bst_type remove(Remove_Pointer_Pointer setter);
  public static class Empty_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Empty_Pointer(Pointer p) { super(p); }
      protected Empty_Pointer() { allocate(); }
      private native void allocate();
      public native int call(Pointer vtable);
  }
  public native Empty_Pointer empty(); public native gsl_bst_type empty(Empty_Pointer setter);
  public static class Trav_init_Pointer_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Trav_init_Pointer_Pointer(Pointer p) { super(p); }
      protected Trav_init_Pointer_Pointer() { allocate(); }
      private native void allocate();
      public native int call(Pointer vtrav, @Const Pointer vtable);
  }
  public native Trav_init_Pointer_Pointer trav_init(); public native gsl_bst_type trav_init(Trav_init_Pointer_Pointer setter);
  public static class Trav_first_Pointer_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Trav_first_Pointer_Pointer(Pointer p) { super(p); }
      protected Trav_first_Pointer_Pointer() { allocate(); }
      private native void allocate();
      public native Pointer call(Pointer vtrav, @Const Pointer vtable);
  }
  public native Trav_first_Pointer_Pointer trav_first(); public native gsl_bst_type trav_first(Trav_first_Pointer_Pointer setter);
  public static class Trav_last_Pointer_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Trav_last_Pointer_Pointer(Pointer p) { super(p); }
      protected Trav_last_Pointer_Pointer() { allocate(); }
      private native void allocate();
      public native Pointer call(Pointer vtrav, @Const Pointer vtable);
  }
  public native Trav_last_Pointer_Pointer trav_last(); public native gsl_bst_type trav_last(Trav_last_Pointer_Pointer setter);
  public static class Trav_find_Pointer_Pointer_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Trav_find_Pointer_Pointer_Pointer(Pointer p) { super(p); }
      protected Trav_find_Pointer_Pointer_Pointer() { allocate(); }
      private native void allocate();
      public native Pointer call(@Const Pointer item, Pointer vtrav, @Const Pointer vtable);
  }
  public native Trav_find_Pointer_Pointer_Pointer trav_find(); public native gsl_bst_type trav_find(Trav_find_Pointer_Pointer_Pointer setter);
  public static class Trav_insert_Pointer_Pointer_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Trav_insert_Pointer_Pointer_Pointer(Pointer p) { super(p); }
      protected Trav_insert_Pointer_Pointer_Pointer() { allocate(); }
      private native void allocate();
      public native Pointer call(Pointer item, Pointer vtrav, Pointer vtable);
  }
  public native Trav_insert_Pointer_Pointer_Pointer trav_insert(); public native gsl_bst_type trav_insert(Trav_insert_Pointer_Pointer_Pointer setter);
  public static class Trav_copy_Pointer_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Trav_copy_Pointer_Pointer(Pointer p) { super(p); }
      protected Trav_copy_Pointer_Pointer() { allocate(); }
      private native void allocate();
      public native Pointer call(Pointer vtrav, @Const Pointer vsrc);
  }
  public native Trav_copy_Pointer_Pointer trav_copy(); public native gsl_bst_type trav_copy(Trav_copy_Pointer_Pointer setter);
  public static class Trav_next_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Trav_next_Pointer(Pointer p) { super(p); }
      protected Trav_next_Pointer() { allocate(); }
      private native void allocate();
      public native Pointer call(Pointer vtrav);
  }
  public native Trav_next_Pointer trav_next(); public native gsl_bst_type trav_next(Trav_next_Pointer setter);
  public static class Trav_prev_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Trav_prev_Pointer(Pointer p) { super(p); }
      protected Trav_prev_Pointer() { allocate(); }
      private native void allocate();
      public native Pointer call(Pointer vtrav);
  }
  public native Trav_prev_Pointer trav_prev(); public native gsl_bst_type trav_prev(Trav_prev_Pointer setter);
  public static class Trav_cur_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Trav_cur_Pointer(Pointer p) { super(p); }
      protected Trav_cur_Pointer() { allocate(); }
      private native void allocate();
      public native Pointer call(@Const Pointer vtrav);
  }
  public native Trav_cur_Pointer trav_cur(); public native gsl_bst_type trav_cur(Trav_cur_Pointer setter);
  public static class Trav_replace_Pointer_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Trav_replace_Pointer_Pointer(Pointer p) { super(p); }
      protected Trav_replace_Pointer_Pointer() { allocate(); }
      private native void allocate();
      public native Pointer call(Pointer vtrav, Pointer new_item);
  }
  public native Trav_replace_Pointer_Pointer trav_replace(); public native gsl_bst_type trav_replace(Trav_replace_Pointer_Pointer setter);
}
