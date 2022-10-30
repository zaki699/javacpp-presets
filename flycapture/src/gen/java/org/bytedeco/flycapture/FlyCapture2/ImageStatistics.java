// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;


	/**
	 * The ImageStatistics object represents image statistics for an image.
	 */
	@Namespace("FlyCapture2") @NoOffset @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class ImageStatistics extends Pointer {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public ImageStatistics(Pointer p) { super(p); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public ImageStatistics(long size) { super((Pointer)null); allocateArray(size); }
	    private native void allocateArray(long size);
	    @Override public ImageStatistics position(long position) {
	        return (ImageStatistics)super.position(position);
	    }
	    @Override public ImageStatistics getPointer(long i) {
	        return new ImageStatistics((Pointer)this).offsetAddress(i);
	    }
	

			/**
			 * Channels that allow statistics to be calculated.
			 */
			/** enum FlyCapture2::ImageStatistics::StatisticsChannel */
			public static final int
				GREY = 0,
				RED = 1,
				GREEN = 2,
				BLUE = 3,
				HUE = 4,
				SATURATION = 5,
				LIGHTNESS = 6,
				NUM_STATISTICS_CHANNELS = 7;

			/**
			 * Default constructor.
			 */
			public ImageStatistics() { super((Pointer)null); allocate(); }
			private native void allocate();

			/**
			 * Default destructor.
			 */

			/**
			 * Copy constructor.
			 */
			public ImageStatistics( @Const @ByRef ImageStatistics other ) { super((Pointer)null); allocate(other); }
			private native void allocate( @Const @ByRef ImageStatistics other );

			/**
			 * Assignment operator.
			 *
			 * @param other The ImageStatistics object to copy from.
			 */
			public native @ByRef @Name("operator =") ImageStatistics put( @Const @ByRef ImageStatistics other );

			/**
			 * Enable all channels.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error EnableAll();

			/**
			 * Disable all channels.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error DisableAll();

			/**
			 * Enable only the grey channel.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error EnableGreyOnly();

			/**
			 * Enable only the RGB channels.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error EnableRGBOnly();

			/**
			 * Enable only the HSL channels.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error EnableHSLOnly();

			/**
			 * Get the status of a statistics channel.
			 *
			 * @param channel The statistics channel.
			 * @param pEnabled Whether the channel is enabled.
			 *
			 * @see SetChannelStatus()
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error GetChannelStatus(
								@Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel,
								@Cast("bool*") BoolPointer pEnabled );
			public native @ByVal Error GetChannelStatus(
								@Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel,
								@Cast("bool*") boolean[] pEnabled );

			/**
			 * Set the status of a statistics channel.
			 *
			 * @param channel The statistics channel.
			 * @param enabled Whether the channel should be enabled.
			 *
			 * @see GetChannelStatus()
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error SetChannelStatus(
								@Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel,
								@Cast("bool") boolean enabled );

			/**
			 * Get the range of a statistics channel. The values returned
			 * are the maximum possible values for any given pixel in the image.
			 * This is generally 0-255 for 8 bit images, and 0-65535 for
			 * 16 bit images.
			 *
			 * @param channel The statistics channel.
			 * @param pMin The minimum possible value.
			 * @param pMax The maximum possible value.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error GetRange(
								@Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel,
								@Cast("unsigned int*") IntPointer pMin,
								@Cast("unsigned int*") IntPointer pMax );
			public native @ByVal Error GetRange(
								@Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel,
								@Cast("unsigned int*") IntBuffer pMin,
								@Cast("unsigned int*") IntBuffer pMax );
			public native @ByVal Error GetRange(
								@Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel,
								@Cast("unsigned int*") int[] pMin,
								@Cast("unsigned int*") int[] pMax );

			/**
			 * Get the range of a statistics channel. The values returned
			 * are the maximum values recorded for all pixels in the image.
			 *
			 * @param channel The statistics channel.
			 * @param pPixelValueMin The minimum pixel value.
			 * @param pPixelValueMax The maximum pixel value.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error GetPixelValueRange(
								@Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel,
								@Cast("unsigned int*") IntPointer pPixelValueMin,
								@Cast("unsigned int*") IntPointer pPixelValueMax );
			public native @ByVal Error GetPixelValueRange(
								@Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel,
								@Cast("unsigned int*") IntBuffer pPixelValueMin,
								@Cast("unsigned int*") IntBuffer pPixelValueMax );
			public native @ByVal Error GetPixelValueRange(
								@Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel,
								@Cast("unsigned int*") int[] pPixelValueMin,
								@Cast("unsigned int*") int[] pPixelValueMax );

			/**
			 * Get the number of unique pixel values in the image.
			 *
			 * @param channel The statistics channel.
			 * @param pNumPixelValues The number of unique pixel values.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error GetNumPixelValues(
								@Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel,
								@Cast("unsigned int*") IntPointer pNumPixelValues );
			public native @ByVal Error GetNumPixelValues(
								@Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel,
								@Cast("unsigned int*") IntBuffer pNumPixelValues );
			public native @ByVal Error GetNumPixelValues(
								@Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel,
								@Cast("unsigned int*") int[] pNumPixelValues );

			/**
			 * Get the mean of the image.
			 *
			 * @param channel The statistics channel.
			 * @param pPixelValueMean The mean of the image.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error GetMean(
								@Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel,
								FloatPointer pPixelValueMean );
			public native @ByVal Error GetMean(
								@Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel,
								FloatBuffer pPixelValueMean );
			public native @ByVal Error GetMean(
								@Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel,
								float[] pPixelValueMean );

			/**
			 * Get the histogram for the image.
			 *
			 * @param channel The statistics channel.
			 * @param ppHistogram Pointer to an array containing the histogram.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error GetHistogram(
								@Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel,
								@Cast("int**") PointerPointer ppHistogram );
			public native @ByVal Error GetHistogram(
								@Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel,
								@ByPtrPtr IntPointer ppHistogram );
			public native @ByVal Error GetHistogram(
								@Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel,
								@ByPtrPtr IntBuffer ppHistogram );
			public native @ByVal Error GetHistogram(
								@Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel,
								@ByPtrPtr int[] ppHistogram );

			/**
			 * Get all statistics for the image.
			 *
			 * @param channel The statistics channel.
			 * @param pRangeMin The minimum possible value.
			 * @param pRangeMax The maximum possible value.
			 * @param pPixelValueMin The minimum pixel value.
			 * @param pPixelValueMax The maximum pixel value.
			 * @param pNumPixelValues The number of unique pixel values.
			 * @param pPixelValueMean The mean of the image.
			 * @param ppHistogram Pointer to an array containing the histogram.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error GetStatistics(
								@Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel,
								@Cast("unsigned int*") IntPointer pRangeMin/*=NULL*/,
								@Cast("unsigned int*") IntPointer pRangeMax/*=NULL*/,
								@Cast("unsigned int*") IntPointer pPixelValueMin/*=NULL*/,
								@Cast("unsigned int*") IntPointer pPixelValueMax/*=NULL*/,
								@Cast("unsigned int*") IntPointer pNumPixelValues/*=NULL*/,
								FloatPointer pPixelValueMean/*=NULL*/,
								@Cast("int**") PointerPointer ppHistogram/*=NULL*/ );
			public native @ByVal Error GetStatistics(
								@Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel );
			public native @ByVal Error GetStatistics(
								@Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel,
								@Cast("unsigned int*") IntPointer pRangeMin/*=NULL*/,
								@Cast("unsigned int*") IntPointer pRangeMax/*=NULL*/,
								@Cast("unsigned int*") IntPointer pPixelValueMin/*=NULL*/,
								@Cast("unsigned int*") IntPointer pPixelValueMax/*=NULL*/,
								@Cast("unsigned int*") IntPointer pNumPixelValues/*=NULL*/,
								FloatPointer pPixelValueMean/*=NULL*/,
								@ByPtrPtr IntPointer ppHistogram/*=NULL*/ );
			public native @ByVal Error GetStatistics(
								@Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel,
								@Cast("unsigned int*") IntBuffer pRangeMin/*=NULL*/,
								@Cast("unsigned int*") IntBuffer pRangeMax/*=NULL*/,
								@Cast("unsigned int*") IntBuffer pPixelValueMin/*=NULL*/,
								@Cast("unsigned int*") IntBuffer pPixelValueMax/*=NULL*/,
								@Cast("unsigned int*") IntBuffer pNumPixelValues/*=NULL*/,
								FloatBuffer pPixelValueMean/*=NULL*/,
								@ByPtrPtr IntBuffer ppHistogram/*=NULL*/ );
			public native @ByVal Error GetStatistics(
								@Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel,
								@Cast("unsigned int*") int[] pRangeMin/*=NULL*/,
								@Cast("unsigned int*") int[] pRangeMax/*=NULL*/,
								@Cast("unsigned int*") int[] pPixelValueMin/*=NULL*/,
								@Cast("unsigned int*") int[] pPixelValueMax/*=NULL*/,
								@Cast("unsigned int*") int[] pNumPixelValues/*=NULL*/,
								float[] pPixelValueMean/*=NULL*/,
								@ByPtrPtr int[] ppHistogram/*=NULL*/ );
	}
