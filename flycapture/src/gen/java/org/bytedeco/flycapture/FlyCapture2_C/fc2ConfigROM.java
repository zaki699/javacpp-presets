// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.flycapture.FlyCapture2.*;
import static org.bytedeco.flycapture.global.FlyCapture2.*;

import static org.bytedeco.flycapture.global.FlyCapture2_C.*;


    /** Camera configuration ROM. */
    @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2_C.class)
public class fc2ConfigROM extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public fc2ConfigROM() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public fc2ConfigROM(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public fc2ConfigROM(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public fc2ConfigROM position(long position) {
            return (fc2ConfigROM)super.position(position);
        }
        @Override public fc2ConfigROM getPointer(long i) {
            return new fc2ConfigROM((Pointer)this).offsetAddress(i);
        }
    
        /** Vendor ID of a node. */
        public native @Cast("unsigned int") int nodeVendorId(); public native fc2ConfigROM nodeVendorId(int setter);
        /** Chip ID (high part). */
        public native @Cast("unsigned int") int chipIdHi(); public native fc2ConfigROM chipIdHi(int setter);
        /** Chip ID (low part). */
        public native @Cast("unsigned int") int chipIdLo(); public native fc2ConfigROM chipIdLo(int setter);
        /** Unit Spec ID, usually 0xa02d. */
        public native @Cast("unsigned int") int unitSpecId(); public native fc2ConfigROM unitSpecId(int setter);
        /** Unit software version. */
        public native @Cast("unsigned int") int unitSWVer(); public native fc2ConfigROM unitSWVer(int setter);
        /** Unit sub software version. */
        public native @Cast("unsigned int") int unitSubSWVer(); public native fc2ConfigROM unitSubSWVer(int setter);
        /** Vendor unique info 0. */
        public native @Cast("unsigned int") int vendorUniqueInfo_0(); public native fc2ConfigROM vendorUniqueInfo_0(int setter);
        /** Vendor unique info 1. */
        public native @Cast("unsigned int") int vendorUniqueInfo_1(); public native fc2ConfigROM vendorUniqueInfo_1(int setter);
        /** Vendor unique info 2. */
        public native @Cast("unsigned int") int vendorUniqueInfo_2(); public native fc2ConfigROM vendorUniqueInfo_2(int setter);
        /** Vendor unique info 3. */
        public native @Cast("unsigned int") int vendorUniqueInfo_3(); public native fc2ConfigROM vendorUniqueInfo_3(int setter);
        /** Keyword. */
        public native @Cast("char") byte pszKeyword(int i); public native fc2ConfigROM pszKeyword(int i, byte setter);
        @MemberGetter public native @Cast("char*") BytePointer pszKeyword();
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native fc2ConfigROM reserved(int i, int setter);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

    }
