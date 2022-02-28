// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.depthai.global.depthai.*;


// DeviceBootloader (RAII), connects to device and maintains watchdog ...

/**
 * Represents the DepthAI bootloader with the methods to interact with it.
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class DeviceBootloader extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DeviceBootloader(Pointer p) { super(p); }

    // Alias

    // Derive and extend bootloader::Config for easier usage
    public static class Config extends BootloaderConfig {
        static { Loader.load(); }
        /** Default native constructor. */
        public Config() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public Config(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Config(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public Config position(long position) {
            return (Config)super.position(position);
        }
        @Override public Config getPointer(long i) {
            return new Config((Pointer)this).offsetAddress(i);
        }
    
        /** Setting a static IPv4 won't start DHCP client */
        public native void setStaticIPv4(@StdString BytePointer ip, @StdString BytePointer mask, @StdString BytePointer gateway);
        public native void setStaticIPv4(@StdString ByteBuffer ip, @StdString ByteBuffer mask, @StdString ByteBuffer gateway);
        public native void setStaticIPv4(@StdString String ip, @StdString String mask, @StdString String gateway);
        /** Setting a dynamic IPv4 will set that IP as well as start DHCP client */
        public native void setDynamicIPv4(@StdString BytePointer ip, @StdString BytePointer mask, @StdString BytePointer gateway);
        public native void setDynamicIPv4(@StdString ByteBuffer ip, @StdString ByteBuffer mask, @StdString ByteBuffer gateway);
        public native void setDynamicIPv4(@StdString String ip, @StdString String mask, @StdString String gateway);
        /** Get if static IPv4 configuration is set */
        public native @Cast("bool") boolean isStaticIPV4();
        /** Get IPv4 */
        public native @StdString BytePointer getIPv4();
        /** Get IPv4 mask */
        public native @StdString BytePointer getIPv4Mask();
        /** Get IPv4 gateway */
        public native @StdString BytePointer getIPv4Gateway();
        /** Set IPv4 DNS options */
        public native void setDnsIPv4(@StdString BytePointer dns, @StdString BytePointer dnsAlt/*=""*/);
        public native void setDnsIPv4(@StdString BytePointer dns);
        public native void setDnsIPv4(@StdString ByteBuffer dns, @StdString ByteBuffer dnsAlt/*=""*/);
        public native void setDnsIPv4(@StdString ByteBuffer dns);
        public native void setDnsIPv4(@StdString String dns, @StdString String dnsAlt/*=""*/);
        public native void setDnsIPv4(@StdString String dns);
        /** Get primary IPv4 DNS server */
        public native @StdString BytePointer getDnsIPv4();
        /** Get alternate IPv4 DNS server */
        public native @StdString BytePointer getDnsAltIPv4();

        /** Set USB timeout */
        public native void setUsbTimeout(@ByVal @Cast("std::chrono::milliseconds*") Pointer ms);
        /** Get USB timeout */
        public native @ByVal @Cast("std::chrono::milliseconds*") Pointer getUsbTimeout();

        /** Set NETWOR timeout */
        public native void setNetworkTimeout(@ByVal @Cast("std::chrono::milliseconds*") Pointer ms);
        /** Get NETWORK timeout */
        public native @ByVal @Cast("std::chrono::milliseconds*") Pointer getNetworkTimeout();

        /** Set MAC address if not flashed on controller */
        public native void setMacAddress(@StdString BytePointer mac);
        public native void setMacAddress(@StdString ByteBuffer mac);
        public native void setMacAddress(@StdString String mac);
        /** Get MAC address if not flashed on controller */
        public native @StdString BytePointer getMacAddress();

        /** Set maxUsbSpeed */
        public native void setUsbMaxSpeed(UsbSpeed speed);
        public native void setUsbMaxSpeed(@Cast("dai::UsbSpeed") int speed);
        /** Get maxUsbSpeed */
        public native UsbSpeed getUsbMaxSpeed();
    }

    /** Bootloader version structure */
    @NoOffset public static class Version extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Version(Pointer p) { super(p); }
    
        /** Construct Version from string */
        public Version(@StdString BytePointer v) { super((Pointer)null); allocate(v); }
        private native void allocate(@StdString BytePointer v);
        public Version(@StdString ByteBuffer v) { super((Pointer)null); allocate(v); }
        private native void allocate(@StdString ByteBuffer v);
        public Version(@StdString String v) { super((Pointer)null); allocate(v); }
        private native void allocate(@StdString String v);
        /** Construct Version major, minor and patch numbers */
        public Version(@Cast("unsigned") int major, @Cast("unsigned") int minor, @Cast("unsigned") int patch) { super((Pointer)null); allocate(major, minor, patch); }
        private native void allocate(@Cast("unsigned") int major, @Cast("unsigned") int minor, @Cast("unsigned") int patch);
        public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef Version other);
        public native @Cast("bool") @Name("operator <") boolean lessThan(@Const @ByRef Version other);
        public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef Version rhs);
        public native @Cast("bool") @Name("operator >") boolean greaterThan(@Const @ByRef Version rhs);
        public native @Cast("bool") @Name("operator <=") boolean lessThanEquals(@Const @ByRef Version rhs);
        public native @Cast("bool") @Name("operator >=") boolean greaterThanEquals(@Const @ByRef Version rhs);
        /** Convert Version to string */
        public native @StdString String toString();
    }

    // constants

    /** Default Bootloader type */
    @MemberGetter public static native Type DEFAULT_TYPE();

    // Static API
    /**
     * Searches for connected devices in either UNBOOTED or BOOTLOADER states and returns first available.
     * @return Tuple of boolean and DeviceInfo. If found boolean is true and DeviceInfo describes the device. Otherwise false
     */
    public static native @ByVal @Cast("std::tuple<bool,dai::DeviceInfo>*") Pointer getFirstAvailableDevice();

    /**
     * Searches for connected devices in either UNBOOTED or BOOTLOADER states.
     * @return Vector of all found devices
     */
    public static native @StdVector DeviceInfo getAllAvailableDevices();

    /**
     * Creates application package which can be flashed to depthai device.
     * @param pipeline Pipeline from which to create the application package
     * @param pathToCmd Optional path to custom device firmware
     * @param compress Optional boolean which specifies if contents should be compressed
     * @return Depthai application package
     */
    public static native @Cast("uint8_t*") @StdVector BytePointer createDepthaiApplicationPackage(@Const @ByRef Pipeline pipeline, @StdString BytePointer pathToCmd/*=""*/, @Cast("bool") boolean compress/*=false*/);
    public static native @Cast("uint8_t*") @StdVector BytePointer createDepthaiApplicationPackage(@Const @ByRef Pipeline pipeline);
    public static native @Cast("uint8_t*") @StdVector ByteBuffer createDepthaiApplicationPackage(@Const @ByRef Pipeline pipeline, @StdString ByteBuffer pathToCmd/*=""*/, @Cast("bool") boolean compress/*=false*/);
    public static native @Cast("uint8_t*") @StdVector byte[] createDepthaiApplicationPackage(@Const @ByRef Pipeline pipeline, @StdString String pathToCmd/*=""*/, @Cast("bool") boolean compress/*=false*/);

    /**
     * Creates application package which can be flashed to depthai device.
     * @param pipeline Pipeline from which to create the application package
     * @param compress Specifies if contents should be compressed
     * @return Depthai application package
     */
    public static native @Cast("uint8_t*") @StdVector BytePointer createDepthaiApplicationPackage(@Const @ByRef Pipeline pipeline, @Cast("bool") boolean compress);

    /**
     * Saves application package to a file which can be flashed to depthai device.
     * @param path Path where to save the application package
     * @param pipeline Pipeline from which to create the application package
     * @param pathToCmd Optional path to custom device firmware
     * @param compress Optional boolean which specifies if contents should be compressed
     */
    public static native void saveDepthaiApplicationPackage(@StdString BytePointer path, @Const @ByRef Pipeline pipeline, @StdString BytePointer pathToCmd/*=""*/, @Cast("bool") boolean compress/*=false*/);
    public static native void saveDepthaiApplicationPackage(@StdString BytePointer path, @Const @ByRef Pipeline pipeline);
    public static native void saveDepthaiApplicationPackage(@StdString ByteBuffer path, @Const @ByRef Pipeline pipeline, @StdString ByteBuffer pathToCmd/*=""*/, @Cast("bool") boolean compress/*=false*/);
    public static native void saveDepthaiApplicationPackage(@StdString ByteBuffer path, @Const @ByRef Pipeline pipeline);
    public static native void saveDepthaiApplicationPackage(@StdString String path, @Const @ByRef Pipeline pipeline, @StdString String pathToCmd/*=""*/, @Cast("bool") boolean compress/*=false*/);
    public static native void saveDepthaiApplicationPackage(@StdString String path, @Const @ByRef Pipeline pipeline);

    /**
     * Saves application package to a file which can be flashed to depthai device.
     * @param path Path where to save the application package
     * @param pipeline Pipeline from which to create the application package
     * @param compress Specifies if contents should be compressed
     */
    public static native void saveDepthaiApplicationPackage(@StdString BytePointer path, @Const @ByRef Pipeline pipeline, @Cast("bool") boolean compress);
    public static native void saveDepthaiApplicationPackage(@StdString ByteBuffer path, @Const @ByRef Pipeline pipeline, @Cast("bool") boolean compress);
    public static native void saveDepthaiApplicationPackage(@StdString String path, @Const @ByRef Pipeline pipeline, @Cast("bool") boolean compress);

    /**
     * @return Embedded bootloader version
     */
    public static native @ByVal Version getEmbeddedBootloaderVersion();

    /**
     * @return Embedded bootloader binary
     */
    public static native @Cast("std::uint8_t*") @StdVector BytePointer getEmbeddedBootloaderBinary(Type type/*=dai::DeviceBootloader::DEFAULT_TYPE*/);
    public static native @Cast("std::uint8_t*") @StdVector BytePointer getEmbeddedBootloaderBinary();
    public static native @Cast("std::uint8_t*") @StdVector ByteBuffer getEmbeddedBootloaderBinary(@Cast("dai::bootloader::Type") int type/*=dai::DeviceBootloader::DEFAULT_TYPE*/);

    

    /**
     * Connects to or boots device in bootloader mode depending on devInfo state.
     * @param devInfo DeviceInfo of which to boot or connect to
     * @param allowFlashingBootloader Set to true to allow flashing the devices bootloader. Defaults to false
     */
    public DeviceBootloader(@Const @ByRef DeviceInfo devInfo, @Cast("bool") boolean allowFlashingBootloader/*=false*/) { super((Pointer)null); allocate(devInfo, allowFlashingBootloader); }
    private native void allocate(@Const @ByRef DeviceInfo devInfo, @Cast("bool") boolean allowFlashingBootloader/*=false*/);
    public DeviceBootloader(@Const @ByRef DeviceInfo devInfo) { super((Pointer)null); allocate(devInfo); }
    private native void allocate(@Const @ByRef DeviceInfo devInfo);

    /**
     * Connects to device in bootloader of specified type. Throws if it wasn't possible.
     * This constructor will automatically boot into specified bootloader type if not already running
     * @param devInfo DeviceInfo of which to boot or connect to
     * @param type Type of bootloader to boot/connect to.
     * @param allowFlashingBootloader Set to true to allow flashing the devices bootloader. Defaults to false
     */
    public DeviceBootloader(@Const @ByRef DeviceInfo devInfo, Type type, @Cast("bool") boolean allowFlashingBootloader/*=false*/) { super((Pointer)null); allocate(devInfo, type, allowFlashingBootloader); }
    private native void allocate(@Const @ByRef DeviceInfo devInfo, Type type, @Cast("bool") boolean allowFlashingBootloader/*=false*/);
    public DeviceBootloader(@Const @ByRef DeviceInfo devInfo, Type type) { super((Pointer)null); allocate(devInfo, type); }
    private native void allocate(@Const @ByRef DeviceInfo devInfo, Type type);
    public DeviceBootloader(@Const @ByRef DeviceInfo devInfo, @Cast("dai::bootloader::Type") int type, @Cast("bool") boolean allowFlashingBootloader/*=false*/) { super((Pointer)null); allocate(devInfo, type, allowFlashingBootloader); }
    private native void allocate(@Const @ByRef DeviceInfo devInfo, @Cast("dai::bootloader::Type") int type, @Cast("bool") boolean allowFlashingBootloader/*=false*/);
    public DeviceBootloader(@Const @ByRef DeviceInfo devInfo, @Cast("dai::bootloader::Type") int type) { super((Pointer)null); allocate(devInfo, type); }
    private native void allocate(@Const @ByRef DeviceInfo devInfo, @Cast("dai::bootloader::Type") int type);

    /**
     * Connects to or boots device in bootloader mode depending on devInfo state with a custom bootloader firmware.
     * @param devInfo DeviceInfo of which to boot or connect to
     * @param pathToBootloader Custom bootloader firmware to boot
     * @param allowFlashingBootloader Set to true to allow flashing the devices bootloader. Defaults to false
     */
    public DeviceBootloader(@Const @ByRef DeviceInfo devInfo, @StdString BytePointer pathToBootloader, @Cast("bool") boolean allowFlashingBootloader/*=false*/) { super((Pointer)null); allocate(devInfo, pathToBootloader, allowFlashingBootloader); }
    private native void allocate(@Const @ByRef DeviceInfo devInfo, @StdString BytePointer pathToBootloader, @Cast("bool") boolean allowFlashingBootloader/*=false*/);
    public DeviceBootloader(@Const @ByRef DeviceInfo devInfo, @StdString BytePointer pathToBootloader) { super((Pointer)null); allocate(devInfo, pathToBootloader); }
    private native void allocate(@Const @ByRef DeviceInfo devInfo, @StdString BytePointer pathToBootloader);
    public DeviceBootloader(@Const @ByRef DeviceInfo devInfo, @StdString ByteBuffer pathToBootloader, @Cast("bool") boolean allowFlashingBootloader/*=false*/) { super((Pointer)null); allocate(devInfo, pathToBootloader, allowFlashingBootloader); }
    private native void allocate(@Const @ByRef DeviceInfo devInfo, @StdString ByteBuffer pathToBootloader, @Cast("bool") boolean allowFlashingBootloader/*=false*/);
    public DeviceBootloader(@Const @ByRef DeviceInfo devInfo, @StdString ByteBuffer pathToBootloader) { super((Pointer)null); allocate(devInfo, pathToBootloader); }
    private native void allocate(@Const @ByRef DeviceInfo devInfo, @StdString ByteBuffer pathToBootloader);
    public DeviceBootloader(@Const @ByRef DeviceInfo devInfo, @StdString String pathToBootloader, @Cast("bool") boolean allowFlashingBootloader/*=false*/) { super((Pointer)null); allocate(devInfo, pathToBootloader, allowFlashingBootloader); }
    private native void allocate(@Const @ByRef DeviceInfo devInfo, @StdString String pathToBootloader, @Cast("bool") boolean allowFlashingBootloader/*=false*/);
    public DeviceBootloader(@Const @ByRef DeviceInfo devInfo, @StdString String pathToBootloader) { super((Pointer)null); allocate(devInfo, pathToBootloader); }
    private native void allocate(@Const @ByRef DeviceInfo devInfo, @StdString String pathToBootloader);

    /**
     * \overload
     */

    /**
     * Flashes a given pipeline to the device.
     * @param progressCallback Callback that sends back a value between 0..1 which signifies current flashing progress
     * @param pipeline Pipeline to flash to the board
     */
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flash(ProgressCallback progressCallback, @Const @ByRef Pipeline pipeline, @Cast("bool") boolean compress/*=false*/);
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flash(ProgressCallback progressCallback, @Const @ByRef Pipeline pipeline);

    /**
     * Flashes a given pipeline to the device.
     * @param pipeline Pipeline to flash to the board
     */
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flash(@Const @ByRef Pipeline pipeline, @Cast("bool") boolean compress/*=false*/);
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flash(@Const @ByRef Pipeline pipeline);

    /**
     * Flashes a specific depthai application package that was generated using createDepthaiApplicationPackage or saveDepthaiApplicationPackage
     * @param progressCallback Callback that sends back a value between 0..1 which signifies current flashing progress
     * @param package Depthai application package to flash to the board
     */
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashDepthaiApplicationPackage(ProgressCallback progressCallback, @Cast("uint8_t*") @StdVector BytePointer _package);
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashDepthaiApplicationPackage(ProgressCallback progressCallback, @Cast("uint8_t*") @StdVector ByteBuffer _package);
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashDepthaiApplicationPackage(ProgressCallback progressCallback, @Cast("uint8_t*") @StdVector byte[] _package);

    /**
     * Flashes a specific depthai application package that was generated using createDepthaiApplicationPackage or saveDepthaiApplicationPackage
     * @param package Depthai application package to flash to the board
     */
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashDepthaiApplicationPackage(@Cast("uint8_t*") @StdVector BytePointer _package);
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashDepthaiApplicationPackage(@Cast("uint8_t*") @StdVector ByteBuffer _package);
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashDepthaiApplicationPackage(@Cast("uint8_t*") @StdVector byte[] _package);

    /**
     * Flashes bootloader to the current board
     * @param progressCallback Callback that sends back a value between 0..1 which signifies current flashing progress
     * @param path Optional parameter to custom bootloader to flash
     */
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashBootloader(ProgressCallback progressCallback, @StdString BytePointer path/*=""*/);
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashBootloader(ProgressCallback progressCallback);
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashBootloader(ProgressCallback progressCallback, @StdString ByteBuffer path/*=""*/);
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashBootloader(ProgressCallback progressCallback, @StdString String path/*=""*/);

    /**
     * Flash selected bootloader to the current board
     * @param memory Memory to flash
     * @param type Bootloader type to flash
     * @param progressCallback Callback that sends back a value between 0..1 which signifies current flashing progress
     * @param path Optional parameter to custom bootloader to flash
     */
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashBootloader(Memory memory, Type type, ProgressCallback progressCallback, @StdString BytePointer path/*=""*/);
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashBootloader(Memory memory, Type type, ProgressCallback progressCallback);
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashBootloader(@Cast("dai::bootloader::Memory") int memory, @Cast("dai::bootloader::Type") int type, ProgressCallback progressCallback, @StdString ByteBuffer path/*=""*/);
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashBootloader(@Cast("dai::bootloader::Memory") int memory, @Cast("dai::bootloader::Type") int type, ProgressCallback progressCallback);
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashBootloader(Memory memory, Type type, ProgressCallback progressCallback, @StdString String path/*=""*/);
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashBootloader(@Cast("dai::bootloader::Memory") int memory, @Cast("dai::bootloader::Type") int type, ProgressCallback progressCallback, @StdString BytePointer path/*=""*/);
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashBootloader(Memory memory, Type type, ProgressCallback progressCallback, @StdString ByteBuffer path/*=""*/);
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashBootloader(@Cast("dai::bootloader::Memory") int memory, @Cast("dai::bootloader::Type") int type, ProgressCallback progressCallback, @StdString String path/*=""*/);

    /**
     * Flash arbitrary data at custom offset in specified memory
     * @param memory Memory to flash
     * @param offset Offset at which to flash the given data in bytes
     * @param progressCallback Callback that sends back a value between 0..1 which signifies current flashing progress
     * @param data Data to flash
     */
    // std::tuple<bool, std::string> flashCustom(Memory memory, uint32_t offset, std::function<void(float)> progressCb, std::vector<uint8_t> data);

    /**
     * Reads configuration data from bootloader
     * @return Unstructured configuration data
     * @param memory Optional - from which memory to read configuration data
     * @param type Optional - from which type of bootloader to read configuration data
     */
    public native @ByVal @Cast("nlohmann::json*") Pointer readConfigData(Memory memory/*=dai::DeviceBootloader::Memory::AUTO*/, Type type/*=dai::DeviceBootloader::Type::AUTO*/);
    public native @ByVal @Cast("nlohmann::json*") Pointer readConfigData();
    public native @ByVal @Cast("nlohmann::json*") Pointer readConfigData(@Cast("dai::bootloader::Memory") int memory/*=dai::DeviceBootloader::Memory::AUTO*/, @Cast("dai::bootloader::Type") int type/*=dai::DeviceBootloader::Type::AUTO*/);

    /**
     * Flashes configuration data to bootloader
     * @param configData Unstructured configuration data
     * @param memory Optional - to which memory flash configuration
     * @param type Optional - for which type of bootloader to flash configuration
     */
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashConfigData(@ByVal @Cast("nlohmann::json*") Pointer configData, Memory memory/*=dai::DeviceBootloader::Memory::AUTO*/, Type type/*=dai::DeviceBootloader::Type::AUTO*/);
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashConfigData(@ByVal @Cast("nlohmann::json*") Pointer configData);
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashConfigData(@ByVal @Cast("nlohmann::json*") Pointer configData, @Cast("dai::bootloader::Memory") int memory/*=dai::DeviceBootloader::Memory::AUTO*/, @Cast("dai::bootloader::Type") int type/*=dai::DeviceBootloader::Type::AUTO*/);

    /**
     * Flashes configuration data to bootloader
     * @param configPath Unstructured configuration data
     * @param memory Optional - to which memory flash configuration
     * @param type Optional - for which type of bootloader to flash configuration
     */
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashConfigFile(@StdString BytePointer configPath, Memory memory/*=dai::DeviceBootloader::Memory::AUTO*/, Type type/*=dai::DeviceBootloader::Type::AUTO*/);
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashConfigFile(@StdString BytePointer configPath);
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashConfigFile(@StdString ByteBuffer configPath, @Cast("dai::bootloader::Memory") int memory/*=dai::DeviceBootloader::Memory::AUTO*/, @Cast("dai::bootloader::Type") int type/*=dai::DeviceBootloader::Type::AUTO*/);
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashConfigFile(@StdString ByteBuffer configPath);
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashConfigFile(@StdString String configPath, Memory memory/*=dai::DeviceBootloader::Memory::AUTO*/, Type type/*=dai::DeviceBootloader::Type::AUTO*/);
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashConfigFile(@StdString String configPath);
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashConfigFile(@StdString BytePointer configPath, @Cast("dai::bootloader::Memory") int memory/*=dai::DeviceBootloader::Memory::AUTO*/, @Cast("dai::bootloader::Type") int type/*=dai::DeviceBootloader::Type::AUTO*/);
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashConfigFile(@StdString ByteBuffer configPath, Memory memory/*=dai::DeviceBootloader::Memory::AUTO*/, Type type/*=dai::DeviceBootloader::Type::AUTO*/);
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashConfigFile(@StdString String configPath, @Cast("dai::bootloader::Memory") int memory/*=dai::DeviceBootloader::Memory::AUTO*/, @Cast("dai::bootloader::Type") int type/*=dai::DeviceBootloader::Type::AUTO*/);

    /**
     * Clears configuration data
     * @param memory Optional - on which memory to clear configuration data
     * @param type Optional - for which type of bootloader to clear configuration data
     */
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashConfigClear(Memory memory/*=dai::DeviceBootloader::Memory::AUTO*/, Type type/*=dai::DeviceBootloader::Type::AUTO*/);
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashConfigClear();
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashConfigClear(@Cast("dai::bootloader::Memory") int memory/*=dai::DeviceBootloader::Memory::AUTO*/, @Cast("dai::bootloader::Type") int type/*=dai::DeviceBootloader::Type::AUTO*/);

    /**
     * Reads configuration from bootloader
     * @param memory Optional - from which memory to read configuration
     * @param type Optional - from which type of bootloader to read configuration
     * @return Configuration structure
     */
    public native @ByVal Config readConfig(Memory memory/*=dai::DeviceBootloader::Memory::AUTO*/, Type type/*=dai::DeviceBootloader::Type::AUTO*/);
    public native @ByVal Config readConfig();
    public native @ByVal Config readConfig(@Cast("dai::bootloader::Memory") int memory/*=dai::DeviceBootloader::Memory::AUTO*/, @Cast("dai::bootloader::Type") int type/*=dai::DeviceBootloader::Type::AUTO*/);

    /**
     * Flashes configuration to bootloader
     * @param configData Configuration structure
     * @param memory Optional - to which memory flash configuration
     * @param type Optional - for which type of bootloader to flash configuration
     */
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashConfig(@Const @ByRef Config config, Memory memory/*=dai::DeviceBootloader::Memory::AUTO*/, Type type/*=dai::DeviceBootloader::Type::AUTO*/);
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashConfig(@Const @ByRef Config config);
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashConfig(@Const @ByRef Config config, @Cast("dai::bootloader::Memory") int memory/*=dai::DeviceBootloader::Memory::AUTO*/, @Cast("dai::bootloader::Type") int type/*=dai::DeviceBootloader::Type::AUTO*/);

    /**
     * Boots a custom FW in memory
     * @param fw
     * @throws A runtime exception if there are any communication issues
     */
    public native void bootMemory(@Cast("uint8_t*") @StdVector BytePointer fw);
    public native void bootMemory(@Cast("uint8_t*") @StdVector ByteBuffer fw);
    public native void bootMemory(@Cast("uint8_t*") @StdVector byte[] fw);

    /**
     * Boots into integrated ROM bootloader in USB mode
     * @throws A runtime exception if there are any communication issues
     */
    public native void bootUsbRomBootloader();

    /**
     * @return Version of current running bootloader
     */
    public native @ByVal Version getVersion();

    /**
     * @return True when bootloader was booted using latest bootloader integrated in the library.
     * False when bootloader is already running on the device and just connected to.
     */
    public native @Cast("bool") boolean isEmbeddedVersion();

    /**
     * @return Type of currently connected bootloader
     */
    public native Type getType();

    /**
     * @return True if allowed to flash bootloader
     */
    public native @Cast("bool") boolean isAllowedFlashingBootloader();

    /**
     * Explicitly closes connection to device.
     * \note This function does not need to be explicitly called
     * as destructor closes the device automatically
     */
    public native @Name("close") void _close();

    /**
     * Is the device already closed (or disconnected)
     */
    public native @Cast("bool") boolean isClosed();
}
