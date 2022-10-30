// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cublas;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.cublas.*;


/** Results structure used by cublasLtMatmulGetAlgo.
 *
 * Holds returned configured algo descriptor and its runtime properties.
 */
@Properties(inherit = org.bytedeco.cuda.presets.cublas.class)
public class cublasLtMatmulHeuristicResult_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cublasLtMatmulHeuristicResult_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cublasLtMatmulHeuristicResult_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cublasLtMatmulHeuristicResult_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cublasLtMatmulHeuristicResult_t position(long position) {
        return (cublasLtMatmulHeuristicResult_t)super.position(position);
    }
    @Override public cublasLtMatmulHeuristicResult_t getPointer(long i) {
        return new cublasLtMatmulHeuristicResult_t((Pointer)this).offsetAddress(i);
    }

  /** Matmul algorithm descriptor.
   *
   * Must be initialized with cublasLtMatmulAlgoInit() if preferences' CUBLASLT_MATMUL_PERF_SEARCH_MODE is set to
   * CUBLASLT_SEARCH_LIMITED_BY_ALGO_ID
   */
  public native @ByRef cublasLtMatmulAlgo_t algo(); public native cublasLtMatmulHeuristicResult_t algo(cublasLtMatmulAlgo_t setter);

  /** Actual size of workspace memory required.
   */
  public native @Cast("size_t") long workspaceSize(); public native cublasLtMatmulHeuristicResult_t workspaceSize(long setter);

  /** Result status, other fields are only valid if after call to cublasLtMatmulAlgoGetHeuristic() this member is set to
   * CUBLAS_STATUS_SUCCESS.
   */
  public native @Cast("cublasStatus_t") int state(); public native cublasLtMatmulHeuristicResult_t state(int setter);

  /** Waves count - a device utilization metric.
   *
   * wavesCount value of 1.0f suggests that when kernel is launched it will fully occupy the GPU.
   */
  public native float wavesCount(); public native cublasLtMatmulHeuristicResult_t wavesCount(float setter);

  public native int reserved(int i); public native cublasLtMatmulHeuristicResult_t reserved(int i, int setter);
  @MemberGetter public native IntPointer reserved();
}
