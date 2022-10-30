// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;



/* Define structure for C API. */
@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyDateTime_CAPI extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyDateTime_CAPI() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyDateTime_CAPI(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyDateTime_CAPI(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyDateTime_CAPI position(long position) {
        return (PyDateTime_CAPI)super.position(position);
    }
    @Override public PyDateTime_CAPI getPointer(long i) {
        return new PyDateTime_CAPI((Pointer)this).offsetAddress(i);
    }

    /* type objects */
    public native PyTypeObject DateType(); public native PyDateTime_CAPI DateType(PyTypeObject setter);
    public native PyTypeObject DateTimeType(); public native PyDateTime_CAPI DateTimeType(PyTypeObject setter);
    public native PyTypeObject TimeType(); public native PyDateTime_CAPI TimeType(PyTypeObject setter);
    public native PyTypeObject DeltaType(); public native PyDateTime_CAPI DeltaType(PyTypeObject setter);
    public native PyTypeObject TZInfoType(); public native PyDateTime_CAPI TZInfoType(PyTypeObject setter);

    /* singletons */
    public native PyObject TimeZone_UTC(); public native PyDateTime_CAPI TimeZone_UTC(PyObject setter);

    /* constructors */
    public static class Date_FromDate_int_int_int_PyTypeObject extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Date_FromDate_int_int_int_PyTypeObject(Pointer p) { super(p); }
        protected Date_FromDate_int_int_int_PyTypeObject() { allocate(); }
        private native void allocate();
        public native PyObject call(int arg0, int arg1, int arg2, PyTypeObject arg3);
    }
    public native Date_FromDate_int_int_int_PyTypeObject Date_FromDate(); public native PyDateTime_CAPI Date_FromDate(Date_FromDate_int_int_int_PyTypeObject setter);
    public static class DateTime_FromDateAndTime_int_int_int_int_int_int_int_PyObject_PyTypeObject extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    DateTime_FromDateAndTime_int_int_int_int_int_int_int_PyObject_PyTypeObject(Pointer p) { super(p); }
        protected DateTime_FromDateAndTime_int_int_int_int_int_int_int_PyObject_PyTypeObject() { allocate(); }
        private native void allocate();
        public native PyObject call(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6,
            PyObject arg7, PyTypeObject arg8);
    }
    public native DateTime_FromDateAndTime_int_int_int_int_int_int_int_PyObject_PyTypeObject DateTime_FromDateAndTime(); public native PyDateTime_CAPI DateTime_FromDateAndTime(DateTime_FromDateAndTime_int_int_int_int_int_int_int_PyObject_PyTypeObject setter);
    public static class Time_FromTime_int_int_int_int_PyObject_PyTypeObject extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Time_FromTime_int_int_int_int_PyObject_PyTypeObject(Pointer p) { super(p); }
        protected Time_FromTime_int_int_int_int_PyObject_PyTypeObject() { allocate(); }
        private native void allocate();
        public native PyObject call(int arg0, int arg1, int arg2, int arg3, PyObject arg4, PyTypeObject arg5);
    }
    public native Time_FromTime_int_int_int_int_PyObject_PyTypeObject Time_FromTime(); public native PyDateTime_CAPI Time_FromTime(Time_FromTime_int_int_int_int_PyObject_PyTypeObject setter);
    public static class Delta_FromDelta_int_int_int_int_PyTypeObject extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Delta_FromDelta_int_int_int_int_PyTypeObject(Pointer p) { super(p); }
        protected Delta_FromDelta_int_int_int_int_PyTypeObject() { allocate(); }
        private native void allocate();
        public native PyObject call(int arg0, int arg1, int arg2, int arg3, PyTypeObject arg4);
    }
    public native Delta_FromDelta_int_int_int_int_PyTypeObject Delta_FromDelta(); public native PyDateTime_CAPI Delta_FromDelta(Delta_FromDelta_int_int_int_int_PyTypeObject setter);
    public static class TimeZone_FromTimeZone_PyObject_PyObject extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    TimeZone_FromTimeZone_PyObject_PyObject(Pointer p) { super(p); }
        protected TimeZone_FromTimeZone_PyObject_PyObject() { allocate(); }
        private native void allocate();
        public native PyObject call(PyObject offset, PyObject name);
    }
    public native TimeZone_FromTimeZone_PyObject_PyObject TimeZone_FromTimeZone(); public native PyDateTime_CAPI TimeZone_FromTimeZone(TimeZone_FromTimeZone_PyObject_PyObject setter);

    /* constructors for the DB API */
    public static class DateTime_FromTimestamp_PyObject_PyObject_PyObject extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    DateTime_FromTimestamp_PyObject_PyObject_PyObject(Pointer p) { super(p); }
        protected DateTime_FromTimestamp_PyObject_PyObject_PyObject() { allocate(); }
        private native void allocate();
        public native PyObject call(PyObject arg0, PyObject arg1, PyObject arg2);
    }
    public native DateTime_FromTimestamp_PyObject_PyObject_PyObject DateTime_FromTimestamp(); public native PyDateTime_CAPI DateTime_FromTimestamp(DateTime_FromTimestamp_PyObject_PyObject_PyObject setter);
    public static class Date_FromTimestamp_PyObject_PyObject extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Date_FromTimestamp_PyObject_PyObject(Pointer p) { super(p); }
        protected Date_FromTimestamp_PyObject_PyObject() { allocate(); }
        private native void allocate();
        public native PyObject call(PyObject arg0, PyObject arg1);
    }
    public native Date_FromTimestamp_PyObject_PyObject Date_FromTimestamp(); public native PyDateTime_CAPI Date_FromTimestamp(Date_FromTimestamp_PyObject_PyObject setter);

    /* PEP 495 constructors */
    public static class DateTime_FromDateAndTimeAndFold_int_int_int_int_int_int_int_PyObject_int_PyTypeObject extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    DateTime_FromDateAndTimeAndFold_int_int_int_int_int_int_int_PyObject_int_PyTypeObject(Pointer p) { super(p); }
        protected DateTime_FromDateAndTimeAndFold_int_int_int_int_int_int_int_PyObject_int_PyTypeObject() { allocate(); }
        private native void allocate();
        public native PyObject call(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6,
            PyObject arg7, int arg8, PyTypeObject arg9);
    }
    public native DateTime_FromDateAndTimeAndFold_int_int_int_int_int_int_int_PyObject_int_PyTypeObject DateTime_FromDateAndTimeAndFold(); public native PyDateTime_CAPI DateTime_FromDateAndTimeAndFold(DateTime_FromDateAndTimeAndFold_int_int_int_int_int_int_int_PyObject_int_PyTypeObject setter);
    public static class Time_FromTimeAndFold_int_int_int_int_PyObject_int_PyTypeObject extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Time_FromTimeAndFold_int_int_int_int_PyObject_int_PyTypeObject(Pointer p) { super(p); }
        protected Time_FromTimeAndFold_int_int_int_int_PyObject_int_PyTypeObject() { allocate(); }
        private native void allocate();
        public native PyObject call(int arg0, int arg1, int arg2, int arg3, PyObject arg4, int arg5, PyTypeObject arg6);
    }
    public native Time_FromTimeAndFold_int_int_int_int_PyObject_int_PyTypeObject Time_FromTimeAndFold(); public native PyDateTime_CAPI Time_FromTimeAndFold(Time_FromTimeAndFold_int_int_int_int_PyObject_int_PyTypeObject setter);

}
