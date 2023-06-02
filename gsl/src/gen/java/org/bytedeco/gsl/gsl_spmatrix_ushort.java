// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


/*
 * COO format:
 *
 * If data[n] = A_{ij}, then:
 *   i = A->i[n]
 *   j = A->p[n]
 *
 * Compressed column format (CSC):
 *
 * If data[n] = A_{ij}, then:
 *   i = A->i[n]
 *   A->p[j] <= n < A->p[j+1]
 * so that column j is stored in
 * [ data[p[j]], data[p[j] + 1], ..., data[p[j+1] - 1] ]
 *
 * Compressed row format (CSR):
 *
 * If data[n] = A_{ij}, then:
 *   j = A->i[n]
 *   A->p[i] <= n < A->p[i+1]
 * so that row i is stored in
 * [ data[p[i]], data[p[i] + 1], ..., data[p[i+1] - 1] ]
 */

@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_spmatrix_ushort extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_spmatrix_ushort() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_spmatrix_ushort(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_spmatrix_ushort(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_spmatrix_ushort position(long position) {
        return (gsl_spmatrix_ushort)super.position(position);
    }
    @Override public gsl_spmatrix_ushort getPointer(long i) {
        return new gsl_spmatrix_ushort((Pointer)this).offsetAddress(i);
    }

  public native @Cast("size_t") long size1(); public native gsl_spmatrix_ushort size1(long setter);               /* number of rows */
  public native @Cast("size_t") long size2(); public native gsl_spmatrix_ushort size2(long setter);               /* number of columns */

  /* i (size nzmax) contains:
   *
   * COO/CSC: row indices
   * CSR: column indices
   */
  public native IntPointer i(); public native gsl_spmatrix_ushort i(IntPointer setter);

  public native @Cast("unsigned short*") ShortPointer data(); public native gsl_spmatrix_ushort data(ShortPointer setter);               /* matrix elements of size nzmax */

  /*
   * COO: p[n] = column number of element data[n]
   * CSC: p[j] = index in data of first non-zero element in column j
   * CSR: p[i] = index in data of first non-zero element in row i
   */
  public native IntPointer p(); public native gsl_spmatrix_ushort p(IntPointer setter);

  public native @Cast("size_t") long nzmax(); public native gsl_spmatrix_ushort nzmax(long setter);              /* maximum number of matrix elements */
  public native @Cast("size_t") long nz(); public native gsl_spmatrix_ushort nz(long setter);                 /* number of non-zero values in matrix */

  public native gsl_bst_workspace tree(); public native gsl_spmatrix_ushort tree(gsl_bst_workspace setter);   /* binary tree structure */
  public native gsl_spmatrix_pool pool(); public native gsl_spmatrix_ushort pool(gsl_spmatrix_pool setter);   /* memory pool for binary tree nodes */
  public native @Cast("size_t") long node_size(); public native gsl_spmatrix_ushort node_size(long setter);          /* size of individual tree node in bytes */

  /*
   * workspace of size MAX(size1,size2)*MAX(sizeof(unsigned short),sizeof(int))
   * used in various routines
   */
      @Name("work.work_void") public native Pointer work_work_void(); public native gsl_spmatrix_ushort work_work_void(Pointer setter);
      @Name("work.work_int") public native IntPointer work_work_int(); public native gsl_spmatrix_ushort work_work_int(IntPointer setter);
      @Name("work.work_atomic") public native @Cast("unsigned short*") ShortPointer work_work_atomic(); public native gsl_spmatrix_ushort work_work_atomic(ShortPointer setter);

  public native int sptype(); public native gsl_spmatrix_ushort sptype(int setter);                /* sparse storage type */
  public native @Cast("size_t") long spflags(); public native gsl_spmatrix_ushort spflags(long setter);            /* GSL_SPMATRIX_FLG_xxx */
}
