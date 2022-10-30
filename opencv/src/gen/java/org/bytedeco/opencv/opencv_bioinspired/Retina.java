// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_bioinspired;

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
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;

import static org.bytedeco.opencv.global.opencv_bioinspired.*;




/** \brief class which allows the Gipsa/Listic Labs model to be used with OpenCV.
<p>
This retina model allows spatio-temporal image processing (applied on still images, video sequences).
As a summary, these are the retina model properties:
- It applies a spectral whithening (mid-frequency details enhancement)
- high frequency spatio-temporal noise reduction
- low frequency luminance to be reduced (luminance range compression)
- local logarithmic luminance compression allows details to be enhanced in low light conditions
<p>
USE : this model can be used basically for spatio-temporal video effects but also for :
     _using the getParvo method output matrix : texture analysiswith enhanced signal to noise ratio and enhanced details robust against input images luminance ranges
     _using the getMagno method output matrix : motion analysis also with the previously cited properties
<p>
for more information, reer to the following papers :
Benoit A., Caplier A., Durette B., Herault, J., "USING HUMAN VISUAL SYSTEM MODELING FOR BIO-INSPIRED LOW LEVEL IMAGE PROCESSING", Elsevier, Computer Vision and Image Understanding 114 (2010), pp. 758-773, DOI: http://dx.doi.org/10.1016/j.cviu.2010.01.011
Vision: Images, Signals and Neural Networks: Models of Neural Processing in Visual Perception (Progress in Neural Processing),By: Jeanny Herault, ISBN: 9814273686. WAPI (Tower ID): 113266891.
<p>
The retina filter includes the research contributions of phd/research collegues from which code has been redrawn by the author :
take a look at the retinacolor.hpp module to discover Brice Chaix de Lavarene color mosaicing/demosaicing and the reference paper:
B. Chaix de Lavarene, D. Alleysson, B. Durette, J. Herault (2007). "Efficient demosaicing through recursive filtering", IEEE International Conference on Image Processing ICIP 2007
take a look at imagelogpolprojection.hpp to discover retina spatial log sampling which originates from Barthelemy Durette phd with Jeanny Herault. A Retina / V1 cortex projection is also proposed and originates from Jeanny's discussions.
more informations in the above cited Jeanny Heraults's book.
 */
@Namespace("cv::bioinspired") @Properties(inherit = org.bytedeco.opencv.presets.opencv_bioinspired.class)
public class Retina extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Retina(Pointer p) { super(p); }



    /** \brief Retreive retina input buffer size
    @return the retina input buffer size
     */
    public native @ByVal Size getInputSize();

    /** \brief Retreive retina output buffer size that can be different from the input if a spatial log
    transformation is applied
    @return the retina output buffer size
     */
    public native @ByVal Size getOutputSize();

    /** \brief Try to open an XML retina parameters file to adjust current retina instance setup
    <p>
    - if the xml file does not exist, then default setup is applied
    - warning, Exceptions are thrown if read XML file is not valid
    @param retinaParameterFile the parameters filename
    @param applyDefaultSetupOnFailure set to true if an error must be thrown on error
    <p>
    You can retrieve the current parameters structure using the method Retina::getParameters and update
    it before running method Retina::setup.
     */
    public native void setup(@Str BytePointer retinaParameterFile/*=""*/, @Cast("const bool") boolean applyDefaultSetupOnFailure/*=true*/);
    public native void setup();
    public native void setup(@Str String retinaParameterFile/*=""*/, @Cast("const bool") boolean applyDefaultSetupOnFailure/*=true*/);

    /** \overload
    @param fs the open Filestorage which contains retina parameters
    @param applyDefaultSetupOnFailure set to true if an error must be thrown on error
    */
    public native void setup(@ByRef FileStorage fs, @Cast("const bool") boolean applyDefaultSetupOnFailure/*=true*/);
    public native void setup(@ByRef FileStorage fs);

    /** \overload
    @param newParameters a parameters structures updated with the new target configuration.
    */
    public native void setup(@ByVal RetinaParameters newParameters);

    /**
    @return the current parameters setup
    */
    public native @ByVal RetinaParameters getParameters();

    /** \brief Outputs a string showing the used parameters setup
    @return a string which contains formated parameters information
     */
    public native @Str BytePointer printSetup();

    /** \brief Write xml/yml formated parameters information
    @param fs the filename of the xml file that will be open and writen with formatted parameters
    information
     */
    public native void write( @Str BytePointer fs );
    public native void write( @Str String fs );

    /** \overload */
    public native @Override void write( @ByRef FileStorage fs );

    /** \brief Setup the OPL and IPL parvo channels (see biologocal model)
    <p>
    OPL is referred as Outer Plexiform Layer of the retina, it allows the spatio-temporal filtering
    which withens the spectrum and reduces spatio-temporal noise while attenuating global luminance
    (low frequency energy) IPL parvo is the OPL next processing stage, it refers to a part of the
    Inner Plexiform layer of the retina, it allows high contours sensitivity in foveal vision. See
    reference papers for more informations.
    for more informations, please have a look at the paper Benoit A., Caplier A., Durette B., Herault, J., "USING HUMAN VISUAL SYSTEM MODELING FOR BIO-INSPIRED LOW LEVEL IMAGE PROCESSING", Elsevier, Computer Vision and Image Understanding 114 (2010), pp. 758-773, DOI: http://dx.doi.org/10.1016/j.cviu.2010.01.011
    @param colorMode specifies if (true) color is processed of not (false) to then processing gray
    level image
    @param normaliseOutput specifies if (true) output is rescaled between 0 and 255 of not (false)
    @param photoreceptorsLocalAdaptationSensitivity the photoreceptors sensitivity renage is 0-1
    (more log compression effect when value increases)
    @param photoreceptorsTemporalConstant the time constant of the first order low pass filter of
    the photoreceptors, use it to cut high temporal frequencies (noise or fast motion), unit is
    frames, typical value is 1 frame
    @param photoreceptorsSpatialConstant the spatial constant of the first order low pass filter of
    the photoreceptors, use it to cut high spatial frequencies (noise or thick contours), unit is
    pixels, typical value is 1 pixel
    @param horizontalCellsGain gain of the horizontal cells network, if 0, then the mean value of
    the output is zero, if the parameter is near 1, then, the luminance is not filtered and is
    still reachable at the output, typicall value is 0
    @param HcellsTemporalConstant the time constant of the first order low pass filter of the
    horizontal cells, use it to cut low temporal frequencies (local luminance variations), unit is
    frames, typical value is 1 frame, as the photoreceptors
    @param HcellsSpatialConstant the spatial constant of the first order low pass filter of the
    horizontal cells, use it to cut low spatial frequencies (local luminance), unit is pixels,
    typical value is 5 pixel, this value is also used for local contrast computing when computing
    the local contrast adaptation at the ganglion cells level (Inner Plexiform Layer parvocellular
    channel model)
    @param ganglionCellsSensitivity the compression strengh of the ganglion cells local adaptation
    output, set a value between 0.6 and 1 for best results, a high value increases more the low
    value sensitivity... and the output saturates faster, recommended value: 0.7
     */
    public native void setupOPLandIPLParvoChannel(@Cast("const bool") boolean colorMode/*=true*/, @Cast("const bool") boolean normaliseOutput/*=true*/, float photoreceptorsLocalAdaptationSensitivity/*=0.7f*/, float photoreceptorsTemporalConstant/*=0.5f*/, float photoreceptorsSpatialConstant/*=0.53f*/, float horizontalCellsGain/*=0.f*/, float HcellsTemporalConstant/*=1.f*/, float HcellsSpatialConstant/*=7.f*/, float ganglionCellsSensitivity/*=0.7f*/);
    public native void setupOPLandIPLParvoChannel();

    /** \brief Set parameters values for the Inner Plexiform Layer (IPL) magnocellular channel
    <p>
    this channel processes signals output from OPL processing stage in peripheral vision, it allows
    motion information enhancement. It is decorrelated from the details channel. See reference
    papers for more details.
    <p>
    @param normaliseOutput specifies if (true) output is rescaled between 0 and 255 of not (false)
    @param parasolCells_beta the low pass filter gain used for local contrast adaptation at the
    IPL level of the retina (for ganglion cells local adaptation), typical value is 0
    @param parasolCells_tau the low pass filter time constant used for local contrast adaptation
    at the IPL level of the retina (for ganglion cells local adaptation), unit is frame, typical
    value is 0 (immediate response)
    @param parasolCells_k the low pass filter spatial constant used for local contrast adaptation
    at the IPL level of the retina (for ganglion cells local adaptation), unit is pixels, typical
    value is 5
    @param amacrinCellsTemporalCutFrequency the time constant of the first order high pass fiter of
    the magnocellular way (motion information channel), unit is frames, typical value is 1.2
    @param V0CompressionParameter the compression strengh of the ganglion cells local adaptation
    output, set a value between 0.6 and 1 for best results, a high value increases more the low
    value sensitivity... and the output saturates faster, recommended value: 0.95
    @param localAdaptintegration_tau specifies the temporal constant of the low pas filter
    involved in the computation of the local "motion mean" for the local adaptation computation
    @param localAdaptintegration_k specifies the spatial constant of the low pas filter involved
    in the computation of the local "motion mean" for the local adaptation computation
     */
    public native void setupIPLMagnoChannel(@Cast("const bool") boolean normaliseOutput/*=true*/, float parasolCells_beta/*=0.f*/, float parasolCells_tau/*=0.f*/, float parasolCells_k/*=7.f*/, float amacrinCellsTemporalCutFrequency/*=1.2f*/, float V0CompressionParameter/*=0.95f*/, float localAdaptintegration_tau/*=0.f*/, float localAdaptintegration_k/*=7.f*/);
    public native void setupIPLMagnoChannel();

    /** \brief Method which allows retina to be applied on an input image,
    <p>
    after run, encapsulated retina module is ready to deliver its outputs using dedicated
    acccessors, see getParvo and getMagno methods
    @param inputImage the input Mat image to be processed, can be gray level or BGR coded in any
    format (from 8bit to 16bits)
     */
    public native void run(@ByVal Mat inputImage);
    public native void run(@ByVal UMat inputImage);
    public native void run(@ByVal GpuMat inputImage);

    /** \brief Method which processes an image in the aim to correct its luminance correct
    backlight problems, enhance details in shadows.
    <p>
    This method is designed to perform High Dynamic Range image tone mapping (compress \>8bit/pixel
    images to 8bit/pixel). This is a simplified version of the Retina Parvocellular model
    (simplified version of the run/getParvo methods call) since it does not include the
    spatio-temporal filter modelling the Outer Plexiform Layer of the retina that performs spectral
    whitening and many other stuff. However, it works great for tone mapping and in a faster way.
    <p>
    Check the demos and experiments section to see examples and the way to perform tone mapping
    using the original retina model and the method.
    <p>
    @param inputImage the input image to process (should be coded in float format : CV_32F,
    CV_32FC1, CV_32F_C3, CV_32F_C4, the 4th channel won't be considered).
    @param outputToneMappedImage the output 8bit/channel tone mapped image (CV_8U or CV_8UC3 format).
     */
    public native void applyFastToneMapping(@ByVal Mat inputImage, @ByVal Mat outputToneMappedImage);
    public native void applyFastToneMapping(@ByVal UMat inputImage, @ByVal UMat outputToneMappedImage);
    public native void applyFastToneMapping(@ByVal GpuMat inputImage, @ByVal GpuMat outputToneMappedImage);

    /** \brief Accessor of the details channel of the retina (models foveal vision).
    <p>
    Warning, getParvoRAW methods return buffers that are not rescaled within range [0;255] while
    the non RAW method allows a normalized matrix to be retrieved.
    <p>
    @param retinaOutput_parvo the output buffer (reallocated if necessary), format can be :
    -   a Mat, this output is rescaled for standard 8bits image processing use in OpenCV
    -   RAW methods actually return a 1D matrix (encoding is R1, R2, ... Rn, G1, G2, ..., Gn, B1,
    B2, ...Bn), this output is the original retina filter model output, without any
    quantification or rescaling.
    @see getParvoRAW
     */
    public native void getParvo(@ByVal Mat retinaOutput_parvo);
    public native void getParvo(@ByVal UMat retinaOutput_parvo);
    public native void getParvo(@ByVal GpuMat retinaOutput_parvo);

    /** \brief Accessor of the details channel of the retina (models foveal vision).
    @see getParvo
     */
    public native @Function void getParvoRAW(@ByVal Mat retinaOutput_parvo);
    public native @Function void getParvoRAW(@ByVal UMat retinaOutput_parvo);
    public native @Function void getParvoRAW(@ByVal GpuMat retinaOutput_parvo);

    /** \brief Accessor of the motion channel of the retina (models peripheral vision).
    <p>
    Warning, getMagnoRAW methods return buffers that are not rescaled within range [0;255] while
    the non RAW method allows a normalized matrix to be retrieved.
    @param retinaOutput_magno the output buffer (reallocated if necessary), format can be :
    -   a Mat, this output is rescaled for standard 8bits image processing use in OpenCV
    -   RAW methods actually return a 1D matrix (encoding is M1, M2,... Mn), this output is the
    original retina filter model output, without any quantification or rescaling.
    @see getMagnoRAW
     */
    public native void getMagno(@ByVal Mat retinaOutput_magno);
    public native void getMagno(@ByVal UMat retinaOutput_magno);
    public native void getMagno(@ByVal GpuMat retinaOutput_magno);

    /** \brief Accessor of the motion channel of the retina (models peripheral vision).
    @see getMagno
     */
    public native @Function void getMagnoRAW(@ByVal Mat retinaOutput_magno);
    public native @Function void getMagnoRAW(@ByVal UMat retinaOutput_magno);
    public native @Function void getMagnoRAW(@ByVal GpuMat retinaOutput_magno);

    /** \overload */
    public native @ByVal @Function Mat getMagnoRAW();
    /** \overload */
    public native @ByVal @Function Mat getParvoRAW();

    /** \brief Activate color saturation as the final step of the color demultiplexing process -\> this
    saturation is a sigmoide function applied to each channel of the demultiplexed image.
    @param saturateColors boolean that activates color saturation (if true) or desactivate (if false)
    @param colorSaturationValue the saturation factor : a simple factor applied on the chrominance
    buffers
     */
    public native void setColorSaturation(@Cast("const bool") boolean saturateColors/*=true*/, float colorSaturationValue/*=4.0f*/);
    public native void setColorSaturation();

    /** \brief Clears all retina buffers
    <p>
    (equivalent to opening the eyes after a long period of eye close ;o) whatchout the temporal
    transition occuring just after this method call.
     */
    public native void clearBuffers();

    /** \brief Activate/desactivate the Magnocellular pathway processing (motion information extraction), by
    default, it is activated
    @param activate true if Magnocellular output should be activated, false if not... if activated,
    the Magnocellular output can be retrieved using the **getMagno** methods
     */
    public native void activateMovingContoursProcessing(@Cast("const bool") boolean activate);

    /** \brief Activate/desactivate the Parvocellular pathway processing (contours information extraction), by
    default, it is activated
    @param activate true if Parvocellular (contours information extraction) output should be
    activated, false if not... if activated, the Parvocellular output can be retrieved using the
    Retina::getParvo methods
     */
    public native void activateContoursProcessing(@Cast("const bool") boolean activate);

    /** \overload */
    public static native @Ptr Retina create(@ByVal Size inputSize);
    /** \brief Constructors from standardized interfaces : retreive a smart pointer to a Retina instance
    <p>
    @param inputSize the input frame size
    @param colorMode the chosen processing mode : with or without color processing
    @param colorSamplingMethod specifies which kind of color sampling will be used :
    -   cv::bioinspired::RETINA_COLOR_RANDOM: each pixel position is either R, G or B in a random choice
    -   cv::bioinspired::RETINA_COLOR_DIAGONAL: color sampling is RGBRGBRGB..., line 2 BRGBRGBRG..., line 3, GBRGBRGBR...
    -   cv::bioinspired::RETINA_COLOR_BAYER: standard bayer sampling
    @param useRetinaLogSampling activate retina log sampling, if true, the 2 following parameters can
    be used
    @param reductionFactor only usefull if param useRetinaLogSampling=true, specifies the reduction
    factor of the output frame (as the center (fovea) is high resolution and corners can be
    underscaled, then a reduction of the output is allowed without precision leak
    @param samplingStrength only usefull if param useRetinaLogSampling=true, specifies the strength of
    the log scale that is applied
     */
    public static native @Ptr Retina create(@ByVal Size inputSize, @Cast("const bool") boolean colorMode,
                                               int colorSamplingMethod/*=cv::bioinspired::RETINA_COLOR_BAYER*/,
                                               @Cast("const bool") boolean useRetinaLogSampling/*=false*/,
                                               float reductionFactor/*=1.0f*/, float samplingStrength/*=10.0f*/);
    public static native @Ptr Retina create(@ByVal Size inputSize, @Cast("const bool") boolean colorMode);
}
