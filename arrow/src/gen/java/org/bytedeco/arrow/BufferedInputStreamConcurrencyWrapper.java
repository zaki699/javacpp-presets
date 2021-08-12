// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


// Concurrency wrappers for IO classes that check the correctness of
// concurrent calls to various methods.  It is not necessary to wrap all
// IO classes with these, only a few core classes that get used in tests.
//
// We're not using virtual inheritance here as virtual bases have poorly
// understood semantic overhead which we'd be passing on to implementers
// and users of these interfaces.  Instead, we just duplicate the method
// wrappers between those two classes.

@Name("arrow::io::internal::InputStreamConcurrencyWrapper<arrow::io::BufferedInputStream>") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class BufferedInputStreamConcurrencyWrapper extends InputStream {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BufferedInputStreamConcurrencyWrapper(Pointer p) { super(p); }

  public native @ByVal Status Close();

  public native @ByVal Status Abort();

  public native @ByVal LongResult Tell();

  public native @ByVal LongResult Read(@Cast("int64_t") long nbytes, Pointer out);

  public native @ByVal BufferResult Read(@Cast("int64_t") long nbytes);

  public native @ByVal StringViewResult Peek(@Cast("int64_t") long nbytes);
}
