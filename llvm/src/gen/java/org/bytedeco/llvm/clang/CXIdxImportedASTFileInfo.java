// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.clang;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;

import static org.bytedeco.llvm.global.clang.*;


/**
 * Data for IndexerCallbacks#importedASTFile.
 */
@Properties(inherit = org.bytedeco.llvm.presets.clang.class)
public class CXIdxImportedASTFileInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXIdxImportedASTFileInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CXIdxImportedASTFileInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIdxImportedASTFileInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CXIdxImportedASTFileInfo position(long position) {
        return (CXIdxImportedASTFileInfo)super.position(position);
    }
    @Override public CXIdxImportedASTFileInfo getPointer(long i) {
        return new CXIdxImportedASTFileInfo(this).position(position + i);
    }

  /**
   * Top level AST file containing the imported PCH, module or submodule.
   */
  public native CXFile file(); public native CXIdxImportedASTFileInfo file(CXFile setter);
  /**
   * The imported module or NULL if the AST file is a PCH.
   */
  public native CXModule module(); public native CXIdxImportedASTFileInfo module(CXModule setter);
  /**
   * Location where the file is imported. Applicable only for modules.
   */
  public native @ByRef CXIdxLoc loc(); public native CXIdxImportedASTFileInfo loc(CXIdxLoc setter);
  /**
   * Non-zero if an inclusion directive was automatically turned into
   * a module import. Applicable only for modules.
   */
  public native int isImplicit(); public native CXIdxImportedASTFileInfo isImplicit(int setter);

}
