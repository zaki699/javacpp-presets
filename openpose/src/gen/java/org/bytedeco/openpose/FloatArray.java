// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.openpose;

import org.bytedeco.javacpp.annotation.Index;
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
import org.bytedeco.hdf5.*;
import static org.bytedeco.hdf5.global.hdf5.*;
import org.bytedeco.caffe.*;
import static org.bytedeco.caffe.global.caffe.*;

import static org.bytedeco.openpose.global.openpose.*;

    /**
     * Array<T>: The OpenPose Basic Raw Data Container
     * This template class implements a multidimensional data array. It is our basic data container, analogous to
     * Mat in OpenCV, Tensor in Torch/TensorFlow or Blob in Caffe.
     * It wraps a Matrix and a std::shared_ptr, both of them pointing to the same raw data. I.e. they both share the
     * same memory, so we can read and modify this data in both formats with no performance impact.
     * Hence, it keeps high performance while adding high-level functions.
     */
    @Name("op::Array<float>") @NoOffset @Properties(inherit = org.bytedeco.openpose.presets.openpose.class)
public class FloatArray extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public FloatArray(Pointer p) { super(p); }
    
        // ------------------------------ Constructors and Data Allocator Functions ------------------------------ //
        /**
         * Array constructor.
         * Equivalent to default constructor + reset(const int size).
         * @param size Integer with the number of T element to be allocated. E.g., size = 5 is internally similar to
         * {@code new T[5]}.
         */
        public FloatArray(int size) { super((Pointer)null); allocate(size); }
        private native void allocate(int size);

        /**
         * Array constructor.
         * Equivalent to default constructor + reset(const std::vector<int>& size = {}).
         * @param sizes Vector with the size of each dimension. E.g., size = {3, 5, 2} is internally similar to
         * {@code new T[3*5*2]}.
         */
        public FloatArray(@StdVector IntPointer sizes/*={}*/) { super((Pointer)null); allocate(sizes); }
        private native void allocate(@StdVector IntPointer sizes/*={}*/);
        public FloatArray() { super((Pointer)null); allocate(); }
        private native void allocate();
        public FloatArray(@StdVector IntBuffer sizes/*={}*/) { super((Pointer)null); allocate(sizes); }
        private native void allocate(@StdVector IntBuffer sizes/*={}*/);
        public FloatArray(@StdVector int[] sizes/*={}*/) { super((Pointer)null); allocate(sizes); }
        private native void allocate(@StdVector int[] sizes/*={}*/);

        /**
         * Array constructor.
         * Equivalent to default constructor + reset(const int size, const T value).
         * @param size Integer with the number of T element to be allocated. E.g., size = 5 is internally similar to
         * {@code new T[5]}.
         * @param value Initial value for each component of the Array.
         */
        public FloatArray(int size, float value) { super((Pointer)null); allocate(size, value); }
        private native void allocate(int size, float value);

        /**
         * Array constructor.
         * Equivalent to default constructor + reset(const std::vector<int>& size, const T value).
         * @param sizes Vector with the size of each dimension. E.g., size = {3, 5, 2} is internally similar to:
         * {@code new T[3*5*2]}.
         * @param value Initial value for each component of the Array.
         */
        public FloatArray(@StdVector IntPointer sizes, float value) { super((Pointer)null); allocate(sizes, value); }
        private native void allocate(@StdVector IntPointer sizes, float value);
        public FloatArray(@StdVector IntBuffer sizes, float value) { super((Pointer)null); allocate(sizes, value); }
        private native void allocate(@StdVector IntBuffer sizes, float value);
        public FloatArray(@StdVector int[] sizes, float value) { super((Pointer)null); allocate(sizes, value); }
        private native void allocate(@StdVector int[] sizes, float value);

        /**
         * Array constructor.
         * Equivalent to default constructor, but it does not allocate memory, but rather use dataPtr.
         * @param size Integer with the number of T element to be allocated. E.g., size = 5 is internally similar to
         * {@code new T[5]}.
         * @param dataPtr Pointer to the memory to be used by the Array.
         */
        public FloatArray(int size, FloatPointer dataPtr) { super((Pointer)null); allocate(size, dataPtr); }
        private native void allocate(int size, FloatPointer dataPtr);
        public FloatArray(int size, FloatBuffer dataPtr) { super((Pointer)null); allocate(size, dataPtr); }
        private native void allocate(int size, FloatBuffer dataPtr);
        public FloatArray(int size, float[] dataPtr) { super((Pointer)null); allocate(size, dataPtr); }
        private native void allocate(int size, float[] dataPtr);

        /**
         * Array constructor.
         * Equivalent to default constructor, but it does not allocate memory, but rather use dataPtr.
         * @param sizes Vector with the size of each dimension. E.g., size = {3, 5, 2} is internally similar to:
         * {@code new T[3*5*2]}.
         * @param dataPtr Pointer to the memory to be used by the Array.
         */
        public FloatArray(@StdVector IntPointer sizes, FloatPointer dataPtr) { super((Pointer)null); allocate(sizes, dataPtr); }
        private native void allocate(@StdVector IntPointer sizes, FloatPointer dataPtr);
        public FloatArray(@StdVector IntBuffer sizes, FloatBuffer dataPtr) { super((Pointer)null); allocate(sizes, dataPtr); }
        private native void allocate(@StdVector IntBuffer sizes, FloatBuffer dataPtr);
        public FloatArray(@StdVector int[] sizes, float[] dataPtr) { super((Pointer)null); allocate(sizes, dataPtr); }
        private native void allocate(@StdVector int[] sizes, float[] dataPtr);

        /**
         * Array constructor.
         * @param array Array<T> with the original data array to slice.
         * @param index indicates the index of the array to extract.
         * @param noCopy indicates whether to perform a copy. Copy will never go to undefined behavior, however, if
         * noCopy == true, then:
         *     1. It is faster, as no data copy is involved, but...
         *     2. If the Array array goes out of scope, then the resulting Array will provoke an undefined behavior.
         *     3. If the returned Array is modified, the information in the Array array will also be.
         * @return Array<T> with the same dimension than array expect the first dimension being 1. E.g., if array
         * is {p,k,m}, the resulting Array<T> is {1,k,m}.
         */
        public FloatArray(@Const @ByRef FloatArray array, int index, @Cast("const bool") boolean noCopy/*=false*/) { super((Pointer)null); allocate(array, index, noCopy); }
        private native void allocate(@Const @ByRef FloatArray array, int index, @Cast("const bool") boolean noCopy/*=false*/);
        public FloatArray(@Const @ByRef FloatArray array, int index) { super((Pointer)null); allocate(array, index); }
        private native void allocate(@Const @ByRef FloatArray array, int index);

        /**
         * Array constructor. It manually copies the Array<T2> into the new Array<T>
         * @param array Array<T2> with a format T2 different to the current Array type T.
         */

        /**
         * Copy constructor.
         * It performs {@code fast copy}: For performance purpose, copying a Array<T> or Datum or cv::Mat just copies the
         * reference, it still shares the same internal data.
         * Modifying the copied element will modify the original one.
         * Use clone() for a slower but real copy, similarly to cv::Mat and Array<T>.
         * @param array Array to be copied.
         */
        public FloatArray(@Const @ByRef FloatArray array) { super((Pointer)null); allocate(array); }
        private native void allocate(@Const @ByRef FloatArray array);

        /**
         * Copy assignment.
         * Similar to Array<T>(const Array<T>& array).
         * @param array Array to be copied.
         * @return The resulting Array.
         */
        public native @ByRef @Name("operator =") FloatArray put(@Const @ByRef FloatArray array);

        /**
         * Move constructor.
         * It destroys the original Array to be moved.
         * @param array Array to be moved.
         */

        /**
         * Move assignment.
         * Similar to Array<T>(Array<T>&& array).
         * @param array Array to be moved.
         * @return The resulting Array.
         */

        /**
         * Clone function.
         * Similar to cv::Mat::clone and Datum::clone.
         * It performs a real but slow copy of the data, i.e., even if the copied element is modified, the original
         * one is not.
         * @return The resulting Array.
         */
        public native @ByVal FloatArray clone();

        /**
         * Data allocation function.
         * It allocates the required space for the memory (it does not initialize that memory).
         * @param size Integer with the number of T element to be allocated. E.g., size = 5 is internally similar to
         * {@code new T[5]}.
         */
        public native void reset(int size);

        /**
         * Data allocation function.
         * Similar to reset(const int size), but it allocates a multi-dimensional array of dimensions each of the
         * values of the argument.
         * @param sizes Vector with the size of each dimension. E.g., size = {3, 5, 2} is internally similar to
         * {@code new T[3*5*2]}.
         */
        public native void reset(@StdVector IntPointer sizes/*={}*/);
        public native void reset();
        public native void reset(@StdVector IntBuffer sizes/*={}*/);
        public native void reset(@StdVector int[] sizes/*={}*/);

        /**
         * Data allocation function.
         * Similar to reset(const int size), but initializing the data to the value specified by the second argument.
         * @param size Integer with the number of T element to be allocated. E.g., size = 5 is internally similar to
         * {@code new T[5]}.
         * @param value Initial value for each component of the Array.
         */
        public native void reset(int size, float value);

        /**
         * Data allocation function.
         * Similar to reset(const std::vector<int>& size), but initializing the data to the value specified by the
         * second argument.
         * @param sizes Vector with the size of each dimension. E.g., size = {3, 5, 2} is internally similar to
         * {@code new T[3*5*2]}.
         * @param value Initial value for each component of the Array.
         */
        public native void reset(@StdVector IntPointer sizes, float value);
        public native void reset(@StdVector IntBuffer sizes, float value);
        public native void reset(@StdVector int[] sizes, float value);

        /**
         * Data allocation function.
         * Equivalent to default constructor, but it does not allocate memory, but rather use dataPtr.
         * @param size Integer with the number of T element to be allocated. E.g., size = 5 is internally similar to
         * {@code new T[5]}.
         * @param dataPtr Pointer to the memory to be used by the Array.
         */
        public native void reset(int size, FloatPointer dataPtr);
        public native void reset(int size, FloatBuffer dataPtr);
        public native void reset(int size, float[] dataPtr);

        /**
         * Data allocation function.
         * Equivalent to default constructor, but it does not allocate memory, but rather use dataPtr.
         * @param sizes Vector with the size of each dimension. E.g., size = {3, 5, 2} is internally similar to:
         * {@code new T[3*5*2]}.
         * @param dataPtr Pointer to the memory to be used by the Array.
         */
        public native void reset(@StdVector IntPointer sizes, FloatPointer dataPtr);
        public native void reset(@StdVector IntBuffer sizes, FloatBuffer dataPtr);
        public native void reset(@StdVector int[] sizes, float[] dataPtr);

        /**
         * Data allocation function.
         * It internally allocates memory and copies the data of the argument to the Array allocated memory.
         * @param cvMat Matrix to be copied.
         */
        public native void setFrom(@Const @ByRef Matrix cvMat);

        /**
         * Data allocation function.
         * It internally assigns all the allocated memory to the value indicated by the argument.
         * @param value Value for each component of the Array.
         */
        public native void setTo(float value);



        // ------------------------------ Data Information Functions ------------------------------ //
        /**
         * Check whether memory has been allocated.
         * @return True if no memory has been allocated, false otherwise.
         */
        public native @Cast("bool") boolean empty();

        /**
         * Return a vector with the size of each dimension allocated.
         * @return A std::vector<int> with the size of each dimension. If no memory has been allocated, it will return
         * an empty std::vector.
         */
        public native @StdVector IntPointer getSize();

        /**
         * Return a vector with the size of the desired dimension.
         * @param index Dimension to check its size.
         * @return Size of the desired dimension. It will return 0 if the requested dimension is higher than the number
         * of dimensions.
         */
        public native int getSize(int index);

        /**
         * Return a string with the size of each dimension allocated.
         * @return A std::stringwith the size of each dimension. If no memory has been allocated, it will return an
         * empty string.
         */
        public native @StdString BytePointer printSize();

        /**
         * Return the total number of dimensions, equivalent to getSize().size().
         * @return The number of dimensions. If no memory is allocated, it returns 0.
         */
        public native @Cast("size_t") long getNumberDimensions();

        /**
         * Return the total number of elements allocated, equivalent to multiply all the components from getSize().
         * E.g., for a Array<T> of size = {2,5,3}, the volume or total number of elements is: 2x5x3 = 30.
         * @return The total volume of the allocated data. If no memory is allocated, it returns 0.
         */
        public native @Cast("size_t") long getVolume();

        /**
         * Similar to getVolume(), but in this case it just returns the volume between the desired dimensions.
         * E.g., for a Array<T> of size = {2,5,3}, the volume or total number of elements for getVolume(1,2) is
         * 5x3 = 15.
         * @param indexA Dimension where to start.
         * @param indexB Dimension where to stop. If indexB == -1, then it will take up to the last dimension.
         * @return The total volume of the allocated data between the desired dimensions. If the index are out of
         * bounds, it throws an error.
         */
        public native @Cast("size_t") long getVolume(int indexA, int indexB/*=-1*/);
        public native @Cast("size_t") long getVolume(int indexA);

        /**
         * Return the stride or step size of the array.
         * E.g., given and Array<T> of size 5x3, getStride() would return the following vector:
         * {5x3sizeof(T), 3sizeof(T), sizeof(T)}.
         */
        public native @StdVector IntPointer getStride();

        /**
         * Return the stride or step size of the array at the index-th dimension.
         * E.g., given and Array<T> of size 5x3, getStride(2) would return sizeof(T).
         */
        public native int getStride(int index);



        // ------------------------------ Data Access Functions And Operators ------------------------------ //
        /**
         * Return a raw pointer to the data. Similar to: std::shared_ptr::get().
         * Note: if you modify the pointer data, you will directly modify it in the Array<T> instance too.
         * If you know you do not want to modify the data, then use getConstPtr() instead.
         * @return A raw pointer to the data.
         */
        public native FloatPointer getPtr();

        /**
         * Similar to getPtr(), but it forbids the data to be edited.
         * @return A raw const pointer to the data.
         */
        public native @Const FloatPointer getConstPtr();

        /**
         * Similar to getConstPtr(), but it allows the data to be edited.
         * This function is only implemented for Pybind11 usage.
         * @return A raw pointer to the data.
         */
        public native FloatPointer getPseudoConstPtr();

        /**
         * Return a Matrix wrapper to the data. It forbids the data to be modified.
         * OpenCV only admits unsigned char, signed char, int, float & double. If the T class is not supported by
         * OpenCV, it will throw an error.
         * Note: Array<T> does not return an editable Matrix because some OpenCV functions reallocate memory and it
         * would not longer point to the Array<T> instance.
         * If you want to perform some OpenCV operation on the Array data, you can use:
         *     editedCvMat = array.getConstCvMat().clone();
         *     // modify data
         *     array.setFrom(editedCvMat)
         * @return A const Matrix pointing to the data.
         */
        public native @Const @ByRef Matrix getConstCvMat();

        /**
         * Analogous to getConstCvMat, but in this case it returns a editable Matrix.
         * Very important: Only allowed functions which do not provoke data reallocation.
         * E.g., resizing functions will not work and they would provoke an undefined behavior and/or execution
         * crashes.
         * @return A Matrix pointing to the data.
         */
        public native @ByRef Matrix getCvMat();

        /**
         * [] operator
         * Similar to the [] operator for raw pointer data.
         * If debug mode is enabled, then it will check that the desired index is in the data range, and it will throw
         * an exception otherwise (similar to the at operator).
         * @param index The desired memory location.
         * @return A editable reference to the data on the desired index location.
         */
        public native @ByRef @Name("operator []") FloatPointer get(int index);

        /**
         * [] operator
         * Same functionality as operator[](const int index), but it forbids modifying the value. Otherwise, const
         * functions would not be able to call the [] operator.
         * @param index The desired memory location.
         * @return A non-editable reference to the data on the desired index location.
         */

        /**
         * [] operator
         * Same functionality as operator[](const int index), but it lets the user introduce the multi-dimensional
         * index.
         * E.g., given a (10 x 10 x 10) array, array[11] is equivalent to array[{1,1,0}]
         * @param indexes Vector with the desired memory location.
         * @return A editable reference to the data on the desired index location.
         */
        public native @ByRef @Name("operator []") FloatPointer get(@StdVector IntPointer indexes);
        public native @ByRef @Name("operator []") FloatBuffer get(@StdVector IntBuffer indexes);
        public native @ByRef @Name("operator []") float[] get(@StdVector int[] indexes);

        /**
         * [] operator
         * Same functionality as operator[](const std::vector<int>& indexes), but it forbids modifying the value.
         * Otherwise, const functions would not be able to call the [] operator.
         * @param indexes Vector with the desired memory location.
         * @return A non-editable reference to the data on the desired index location.
         */

        /**
         * at() function
         * Same functionality as operator[](const int index), but it always check whether the indexes are within the
         * data bounds. Otherwise, it will throw an error.
         * @param index The desired memory location.
         * @return A editable reference to the data on the desired index location.
         */
        public native @ByRef FloatPointer at(int index);

        /**
         * at() function
         * Same functionality as operator[](const int index) const, but it always check whether the indexes are within
         * the data bounds. Otherwise, it will throw an error.
         * @param index The desired memory location.
         * @return A non-editable reference to the data on the desired index location.
         */

        /**
         * at() function
         * Same functionality as operator[](const std::vector<int>& indexes), but it always check whether the indexes
         * are within the data bounds. Otherwise, it will throw an error.
         * @param indexes Vector with the desired memory location.
         * @return A editable reference to the data on the desired index location.
         */
        public native @ByRef FloatPointer at(@StdVector IntPointer indexes);
        public native @ByRef FloatBuffer at(@StdVector IntBuffer indexes);
        public native @ByRef float[] at(@StdVector int[] indexes);

        /**
         * at() function
         * Same functionality as operator[](const std::vector<int>& indexes) const, but it always check whether the
         * indexes are within the data bounds. Otherwise, it will throw an error.
         * @param indexes Vector with the desired memory location.
         * @return A non-editable reference to the data on the desired index location.
         */

        /**
         * It returns a string with the whole array data. Useful for debugging.
         * The format is: values separated by a space, and a enter for each dimension. E.g.,
         * For the Array{2, 2, 3}, it will print:
         * Array<T>::toString():
         * x1 x2 x3
         * x4 x5 x6
         *
         * x7 x8 x9
         * x10 x11 x12
         * @return A string with the array values in the above format.
         */
        
    }
