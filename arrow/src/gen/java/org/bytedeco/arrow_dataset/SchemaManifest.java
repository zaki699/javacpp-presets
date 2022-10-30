// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;

@Namespace("parquet::arrow") @Opaque @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class SchemaManifest extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public SchemaManifest() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SchemaManifest(Pointer p) { super(p); }
}
