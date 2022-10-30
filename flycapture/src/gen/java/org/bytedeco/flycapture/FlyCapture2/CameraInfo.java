// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;


    /** Camera information. */
    @Namespace("FlyCapture2") @NoOffset @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class CameraInfo extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CameraInfo(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public CameraInfo(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public CameraInfo position(long position) {
            return (CameraInfo)super.position(position);
        }
        @Override public CameraInfo getPointer(long i) {
            return new CameraInfo((Pointer)this).offsetAddress(i);
        }
    
        /** Device serial number. */
        public native @Cast("unsigned int") int serialNumber(); public native CameraInfo serialNumber(int setter);
        /** Interface type. */
        public native @Cast("FlyCapture2::InterfaceType") int interfaceType(); public native CameraInfo interfaceType(int setter);
        /** Driver type. */
        public native @Cast("FlyCapture2::DriverType") int driverType(); public native CameraInfo driverType(int setter);
        /** Flag indicating if this is a color camera. */
        public native @Cast("bool") boolean isColorCamera(); public native CameraInfo isColorCamera(boolean setter);
        /** Device model name. */
        public native @Cast("char") byte modelName(int i); public native CameraInfo modelName(int i, byte setter);
        @MemberGetter public native @Cast("char*") BytePointer modelName();
        /** Device vendor name. */
        public native @Cast("char") byte vendorName(int i); public native CameraInfo vendorName(int i, byte setter);
        @MemberGetter public native @Cast("char*") BytePointer vendorName();
        /** String detailing the sensor information. */
        public native @Cast("char") byte sensorInfo(int i); public native CameraInfo sensorInfo(int i, byte setter);
        @MemberGetter public native @Cast("char*") BytePointer sensorInfo();
        /** String providing the sensor resolution. */
        public native @Cast("char") byte sensorResolution(int i); public native CameraInfo sensorResolution(int i, byte setter);
        @MemberGetter public native @Cast("char*") BytePointer sensorResolution();
        /** Driver name of driver being used. */
        public native @Cast("char") byte driverName(int i); public native CameraInfo driverName(int i, byte setter);
        @MemberGetter public native @Cast("char*") BytePointer driverName();
        /** Firmware version of camera. */
        public native @Cast("char") byte firmwareVersion(int i); public native CameraInfo firmwareVersion(int i, byte setter);
        @MemberGetter public native @Cast("char*") BytePointer firmwareVersion();
        /** Firmware build time. */
        public native @Cast("char") byte firmwareBuildTime(int i); public native CameraInfo firmwareBuildTime(int i, byte setter);
        @MemberGetter public native @Cast("char*") BytePointer firmwareBuildTime();
        /** Maximum bus speed. */
        public native @Cast("FlyCapture2::BusSpeed") int maximumBusSpeed(); public native CameraInfo maximumBusSpeed(int setter);
        /** Bayer tile format. */
        public native @Cast("FlyCapture2::BayerTileFormat") int bayerTileFormat(); public native CameraInfo bayerTileFormat(int setter);
        /** Bus number, set to 0 for GigE and USB cameras **/
        public native @Cast("unsigned short") short busNumber(); public native CameraInfo busNumber(short setter);
        /** ieee1394 Node number, set to 0 for GigE and USB cameras **/
        public native @Cast("unsigned short") short nodeNumber(); public native CameraInfo nodeNumber(short setter);
        /** PCIe Bus Speed, set to PCIE_BUSSPEED_UNKNOWN for unsupported drivers **/
        public native @Cast("FlyCapture2::PCIeBusSpeed") int pcieBusSpeed(); public native CameraInfo pcieBusSpeed(int setter);

        /** \name IIDC specific information */
        /*@{*/

        /** DCAM version. */
        public native @Cast("unsigned int") int iidcVer(); public native CameraInfo iidcVer(int setter);
        /** Configuration ROM data. */
        public native @ByRef ConfigROM configROM(); public native CameraInfo configROM(ConfigROM setter);

        /*@}*/

        /** \name GigE specific information */
        /*@{*/

        /** GigE Vision version. */
        public native @Cast("unsigned int") int gigEMajorVersion(); public native CameraInfo gigEMajorVersion(int setter);
        /** GigE Vision minor version. */
        public native @Cast("unsigned int") int gigEMinorVersion(); public native CameraInfo gigEMinorVersion(int setter);
        /** User defined name. */
        public native @Cast("char") byte userDefinedName(int i); public native CameraInfo userDefinedName(int i, byte setter);
        @MemberGetter public native @Cast("char*") BytePointer userDefinedName();
        /** XML URL 1. */
        public native @Cast("char") byte xmlURL1(int i); public native CameraInfo xmlURL1(int i, byte setter);
        @MemberGetter public native @Cast("char*") BytePointer xmlURL1();
        /** XML URL 2. */
        public native @Cast("char") byte xmlURL2(int i); public native CameraInfo xmlURL2(int i, byte setter);
        @MemberGetter public native @Cast("char*") BytePointer xmlURL2();
        /** MAC address */
        public native @ByRef MACAddress macAddress(); public native CameraInfo macAddress(MACAddress setter);
        /** IP address. */
        public native @ByRef IPAddress ipAddress(); public native CameraInfo ipAddress(IPAddress setter);
        /** Subnet mask. */
        public native @ByRef IPAddress subnetMask(); public native CameraInfo subnetMask(IPAddress setter);
        /** Default gateway. */
        public native @ByRef IPAddress defaultGateway(); public native CameraInfo defaultGateway(IPAddress setter);
        /** Status/Content of CCP register */
        public native @Cast("unsigned int") int ccpStatus(); public native CameraInfo ccpStatus(int setter);
        /** Local Application IP Address. */
        public native @Cast("unsigned int") int applicationIPAddress(); public native CameraInfo applicationIPAddress(int setter);
        /** Local Application port. */
        public native @Cast("unsigned int") int applicationPort(); public native CameraInfo applicationPort(int setter);
        /*@}*/

        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native CameraInfo reserved(int i, int setter);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public CameraInfo() { super((Pointer)null); allocate(); }
        private native void allocate();
    }
