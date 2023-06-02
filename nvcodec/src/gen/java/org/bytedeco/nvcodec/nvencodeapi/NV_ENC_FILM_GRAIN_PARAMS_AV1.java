// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvencodeapi;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.nvcodec.nvcuvid.*;
import static org.bytedeco.nvcodec.global.nvcuvid.*;

import static org.bytedeco.nvcodec.global.nvencodeapi.*;


/**
 * \struct _NV_ENC_FILM_GRAIN_PARAMS_AV1
 * AV1 Film Grain Parameters structure
 */

@Properties(inherit = org.bytedeco.nvcodec.presets.nvencodeapi.class)
public class NV_ENC_FILM_GRAIN_PARAMS_AV1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NV_ENC_FILM_GRAIN_PARAMS_AV1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NV_ENC_FILM_GRAIN_PARAMS_AV1(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NV_ENC_FILM_GRAIN_PARAMS_AV1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NV_ENC_FILM_GRAIN_PARAMS_AV1 position(long position) {
        return (NV_ENC_FILM_GRAIN_PARAMS_AV1)super.position(position);
    }
    @Override public NV_ENC_FILM_GRAIN_PARAMS_AV1 getPointer(long i) {
        return new NV_ENC_FILM_GRAIN_PARAMS_AV1((Pointer)this).offsetAddress(i);
    }

    /** [in]: Set to 1 to specify film grain should be added to frame */
    public native @Cast("uint32_t") @NoOffset int applyGrain(); public native NV_ENC_FILM_GRAIN_PARAMS_AV1 applyGrain(int setter);
    /** [in]: Set to 1 to specify the chroma scaling is inferred from luma scaling */
    public native @Cast("uint32_t") @NoOffset int chromaScalingFromLuma(); public native NV_ENC_FILM_GRAIN_PARAMS_AV1 chromaScalingFromLuma(int setter);
    /** [in]: Set to 1 to indicate that overlap between film grain blocks should be applied*/
    public native @Cast("uint32_t") @NoOffset int overlapFlag(); public native NV_ENC_FILM_GRAIN_PARAMS_AV1 overlapFlag(int setter);
    /** [in]: Set to 1 to clip values to restricted (studio) range after adding film grain  */
    public native @Cast("uint32_t") @NoOffset int clipToRestrictedRange(); public native NV_ENC_FILM_GRAIN_PARAMS_AV1 clipToRestrictedRange(int setter);
    /** [in]: Represents the shift - 8 applied to the values of the chroma component */
    public native @Cast("uint32_t") @NoOffset int grainScalingMinus8(); public native NV_ENC_FILM_GRAIN_PARAMS_AV1 grainScalingMinus8(int setter);
    /** [in]: Specifies the number of auto-regressive coefficients for luma and chroma */
    public native @Cast("uint32_t") @NoOffset int arCoeffLag(); public native NV_ENC_FILM_GRAIN_PARAMS_AV1 arCoeffLag(int setter);
    /** [in]: Specifies the number of points for the piecewise linear scaling function of the luma component */
    public native @Cast("uint32_t") @NoOffset int numYPoints(); public native NV_ENC_FILM_GRAIN_PARAMS_AV1 numYPoints(int setter);
    /** [in]: Specifies the number of points for the piecewise linear scaling function of the cb component */
    public native @Cast("uint32_t") @NoOffset int numCbPoints(); public native NV_ENC_FILM_GRAIN_PARAMS_AV1 numCbPoints(int setter);
    /** [in]: Specifies the number of points for the piecewise linear scaling function of the cr component */
    public native @Cast("uint32_t") @NoOffset int numCrPoints(); public native NV_ENC_FILM_GRAIN_PARAMS_AV1 numCrPoints(int setter);
    /** [in]: specifies the range of the auto-regressive coefficients */
    public native @Cast("uint32_t") @NoOffset int arCoeffShiftMinus6(); public native NV_ENC_FILM_GRAIN_PARAMS_AV1 arCoeffShiftMinus6(int setter);
    /** [in]: Specifies how much the Gaussian random numbers should be scaled down during the grain synthesi process  */
    public native @Cast("uint32_t") @NoOffset int grainScaleShift(); public native NV_ENC_FILM_GRAIN_PARAMS_AV1 grainScaleShift(int setter);
    /** [in]: Reserved bits field - should be set to 0 */
    public native @Cast("uint32_t") @NoOffset int reserved1(); public native NV_ENC_FILM_GRAIN_PARAMS_AV1 reserved1(int setter);
    /** [in]: pointYValue[i]: x coordinate for i-th point of luma piecewise linear scaling function. Values on a scale of 0...255 */
    public native @Cast("uint8_t") byte pointYValue(int i); public native NV_ENC_FILM_GRAIN_PARAMS_AV1 pointYValue(int i, byte setter);
    @MemberGetter public native @Cast("uint8_t*") BytePointer pointYValue();
    /** [in]: pointYScaling[i]: i-th point output value of luma piecewise linear scaling function */
    public native @Cast("uint8_t") byte pointYScaling(int i); public native NV_ENC_FILM_GRAIN_PARAMS_AV1 pointYScaling(int i, byte setter);
    @MemberGetter public native @Cast("uint8_t*") BytePointer pointYScaling();
    /** [in]: pointCbValue[i]: x coordinate for i-th point of cb piecewise linear scaling function. Values on a scale of 0...255 */
    public native @Cast("uint8_t") byte pointCbValue(int i); public native NV_ENC_FILM_GRAIN_PARAMS_AV1 pointCbValue(int i, byte setter);
    @MemberGetter public native @Cast("uint8_t*") BytePointer pointCbValue();
    /** [in]: pointCbScaling[i]: i-th point output value of cb piecewise linear scaling function */
    public native @Cast("uint8_t") byte pointCbScaling(int i); public native NV_ENC_FILM_GRAIN_PARAMS_AV1 pointCbScaling(int i, byte setter);
    @MemberGetter public native @Cast("uint8_t*") BytePointer pointCbScaling();
    /** [in]: pointCrValue[i]: x coordinate for i-th point of cr piecewise linear scaling function. Values on a scale of 0...255 */
    public native @Cast("uint8_t") byte pointCrValue(int i); public native NV_ENC_FILM_GRAIN_PARAMS_AV1 pointCrValue(int i, byte setter);
    @MemberGetter public native @Cast("uint8_t*") BytePointer pointCrValue();
    /** [in]: pointCrScaling[i]: i-th point output value of cr piecewise linear scaling function */
    public native @Cast("uint8_t") byte pointCrScaling(int i); public native NV_ENC_FILM_GRAIN_PARAMS_AV1 pointCrScaling(int i, byte setter);
    @MemberGetter public native @Cast("uint8_t*") BytePointer pointCrScaling();
    /** [in]: Specifies auto-regressive coefficients used for the Y plane */
    public native @Cast("uint8_t") byte arCoeffsYPlus128(int i); public native NV_ENC_FILM_GRAIN_PARAMS_AV1 arCoeffsYPlus128(int i, byte setter);
    @MemberGetter public native @Cast("uint8_t*") BytePointer arCoeffsYPlus128();
    /** [in]: Specifies auto-regressive coefficients used for the U plane */
    public native @Cast("uint8_t") byte arCoeffsCbPlus128(int i); public native NV_ENC_FILM_GRAIN_PARAMS_AV1 arCoeffsCbPlus128(int i, byte setter);
    @MemberGetter public native @Cast("uint8_t*") BytePointer arCoeffsCbPlus128();
    /** [in]: Specifies auto-regressive coefficients used for the V plane */
    public native @Cast("uint8_t") byte arCoeffsCrPlus128(int i); public native NV_ENC_FILM_GRAIN_PARAMS_AV1 arCoeffsCrPlus128(int i, byte setter);
    @MemberGetter public native @Cast("uint8_t*") BytePointer arCoeffsCrPlus128();
    /** [in]: Reserved bytes -  should be set to 0 */
    public native @Cast("uint8_t") byte reserved2(int i); public native NV_ENC_FILM_GRAIN_PARAMS_AV1 reserved2(int i, byte setter);
    @MemberGetter public native @Cast("uint8_t*") BytePointer reserved2();
    /** [in]: Represents a multiplier for the cb component used in derivation of the input index to the cb component scaling function */
    public native @Cast("uint8_t") byte cbMult(); public native NV_ENC_FILM_GRAIN_PARAMS_AV1 cbMult(byte setter);
    /** [in]: represents a multiplier for the average luma component used in derivation of the input index to the cb component scaling function. */
    public native @Cast("uint8_t") byte cbLumaMult(); public native NV_ENC_FILM_GRAIN_PARAMS_AV1 cbLumaMult(byte setter);
    /** [in]: Represents an offset used in derivation of the input index to the cb component scaling function */
    public native @Cast("uint16_t") short cbOffset(); public native NV_ENC_FILM_GRAIN_PARAMS_AV1 cbOffset(short setter);
    /** [in]: Represents a multiplier for the cr component used in derivation of the input index to the cr component scaling function */
    public native @Cast("uint8_t") byte crMult(); public native NV_ENC_FILM_GRAIN_PARAMS_AV1 crMult(byte setter);
    /** [in]: represents a multiplier for the average luma component used in derivation of the input index to the cr component scaling function. */
    public native @Cast("uint8_t") byte crLumaMult(); public native NV_ENC_FILM_GRAIN_PARAMS_AV1 crLumaMult(byte setter);
    /** [in]: Represents an offset used in derivation of the input index to the cr component scaling function */
    public native @Cast("uint16_t") short crOffset(); public native NV_ENC_FILM_GRAIN_PARAMS_AV1 crOffset(short setter);
}
