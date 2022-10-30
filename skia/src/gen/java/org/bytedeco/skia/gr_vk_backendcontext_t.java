// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.skia;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.skia.global.Skia.*;


@Properties(inherit = org.bytedeco.skia.presets.Skia.class)
public class gr_vk_backendcontext_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gr_vk_backendcontext_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gr_vk_backendcontext_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gr_vk_backendcontext_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gr_vk_backendcontext_t position(long position) {
        return (gr_vk_backendcontext_t)super.position(position);
    }
    @Override public gr_vk_backendcontext_t getPointer(long i) {
        return new gr_vk_backendcontext_t((Pointer)this).offsetAddress(i);
    }

    public native vk_instance_t fInstance(); public native gr_vk_backendcontext_t fInstance(vk_instance_t setter);
    public native vk_physical_device_t fPhysicalDevice(); public native gr_vk_backendcontext_t fPhysicalDevice(vk_physical_device_t setter);
    public native vk_device_t fDevice(); public native gr_vk_backendcontext_t fDevice(vk_device_t setter);
    public native vk_queue_t fQueue(); public native gr_vk_backendcontext_t fQueue(vk_queue_t setter);
    public native @Cast("uint32_t") int fGraphicsQueueIndex(); public native gr_vk_backendcontext_t fGraphicsQueueIndex(int setter);
    public native @Cast("uint32_t") int fMinAPIVersion(); public native gr_vk_backendcontext_t fMinAPIVersion(int setter);
    public native @Cast("uint32_t") int fInstanceVersion(); public native gr_vk_backendcontext_t fInstanceVersion(int setter);
    public native @Cast("uint32_t") int fMaxAPIVersion(); public native gr_vk_backendcontext_t fMaxAPIVersion(int setter);
    public native @Cast("uint32_t") int fExtensions(); public native gr_vk_backendcontext_t fExtensions(int setter);
    public native @Const gr_vk_extensions_t fVkExtensions(); public native gr_vk_backendcontext_t fVkExtensions(gr_vk_extensions_t setter);
    public native @Cast("uint32_t") int fFeatures(); public native gr_vk_backendcontext_t fFeatures(int setter);
    public native @Const vk_physical_device_features_t fDeviceFeatures(); public native gr_vk_backendcontext_t fDeviceFeatures(vk_physical_device_features_t setter);
    public native @Const vk_physical_device_features_2_t fDeviceFeatures2(); public native gr_vk_backendcontext_t fDeviceFeatures2(vk_physical_device_features_2_t setter);
    public native gr_vk_memory_allocator_t fMemoryAllocator(); public native gr_vk_backendcontext_t fMemoryAllocator(gr_vk_memory_allocator_t setter);
    public native gr_vk_get_proc fGetProc(); public native gr_vk_backendcontext_t fGetProc(gr_vk_get_proc setter);
    public native Pointer fGetProcUserData(); public native gr_vk_backendcontext_t fGetProcUserData(Pointer setter);
    public native @Cast("bool") boolean fOwnsInstanceAndDevice(); public native gr_vk_backendcontext_t fOwnsInstanceAndDevice(boolean setter);
    public native @Cast("bool") boolean fProtectedContext(); public native gr_vk_backendcontext_t fProtectedContext(boolean setter);
}
