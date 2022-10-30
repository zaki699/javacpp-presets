// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
* External semaphore wait parameters(deprecated)
*/
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaExternalSemaphoreWaitParams_v1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaExternalSemaphoreWaitParams_v1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaExternalSemaphoreWaitParams_v1(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaExternalSemaphoreWaitParams_v1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaExternalSemaphoreWaitParams_v1 position(long position) {
        return (cudaExternalSemaphoreWaitParams_v1)super.position(position);
    }
    @Override public cudaExternalSemaphoreWaitParams_v1 getPointer(long i) {
        return new cudaExternalSemaphoreWaitParams_v1((Pointer)this).offsetAddress(i);
    }

        /**
        * Parameters for fence objects
        */
            /**
            * Value of fence to be waited on
            */
            @Name("params.fence.value") public native @Cast("unsigned long long") long params_fence_value(); public native cudaExternalSemaphoreWaitParams_v1 params_fence_value(long setter);
            /**
             * Pointer to NvSciSyncFence. Valid if ::cudaExternalSemaphoreHandleType
             * is of type ::cudaExternalSemaphoreHandleTypeNvSciSync.
             */
            @Name("params.nvSciSync.fence") public native Pointer params_nvSciSync_fence(); public native cudaExternalSemaphoreWaitParams_v1 params_nvSciSync_fence(Pointer setter);
            @Name("params.nvSciSync.reserved") public native @Cast("unsigned long long") long params_nvSciSync_reserved(); public native cudaExternalSemaphoreWaitParams_v1 params_nvSciSync_reserved(long setter);
        /**
         * Parameters for keyed mutex objects
         */
            /**
             * Value of key to acquire the mutex with
             */
            @Name("params.keyedMutex.key") public native @Cast("unsigned long long") long params_keyedMutex_key(); public native cudaExternalSemaphoreWaitParams_v1 params_keyedMutex_key(long setter);
            /**
             * Timeout in milliseconds to wait to acquire the mutex
             */
            @Name("params.keyedMutex.timeoutMs") public native @Cast("unsigned int") int params_keyedMutex_timeoutMs(); public native cudaExternalSemaphoreWaitParams_v1 params_keyedMutex_timeoutMs(int setter);
    /**
     * Only when ::cudaExternalSemaphoreSignalParams is used to
     * signal a ::cudaExternalSemaphore_t of type
     * ::cudaExternalSemaphoreHandleTypeNvSciSync, the valid flag is 
     * ::cudaExternalSemaphoreSignalSkipNvSciBufMemSync: which indicates
     * that while waiting for the ::cudaExternalSemaphore_t, no memory
     * synchronization operations should be performed for any external memory
     * object imported as ::cudaExternalMemoryHandleTypeNvSciBuf.
     * For all other types of ::cudaExternalSemaphore_t, flags must be zero.
     */
    public native @Cast("unsigned int") int flags(); public native cudaExternalSemaphoreWaitParams_v1 flags(int setter);
}
