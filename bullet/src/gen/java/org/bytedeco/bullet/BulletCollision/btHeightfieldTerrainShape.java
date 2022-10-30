// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**btHeightfieldTerrainShape simulates a 2D heightfield terrain
/**
  The caller is responsible for maintaining the heightfield array; this
  class does not make a copy.
  <p>
  The heightfield can be dynamic so long as the min/max height values
  capture the extremes (heights must always be in that range).
  <p>
  The local origin of the heightfield is assumed to be the exact
  center (as determined by width and length and height, with each
  axis multiplied by the localScaling).
  <p>
  \b NOTE: be careful with coordinates.  If you have a heightfield with a local
  min height of -100m, and a max height of +500m, you may be tempted to place it
  at the origin (0,0) and expect the heights in world coordinates to be
  -100 to +500 meters.
  Actually, the heights will be -300 to +300m, because bullet will re-center
  the heightfield based on its AABB (which is determined by the min/max
  heights).  So keep in mind that once you create a btHeightfieldTerrainShape
  object, the heights will be adjusted relative to the center of the AABB.  This
  is different to the behavior of many rendering engines, but is useful for
  physics engines.
  <p>
  Most (but not all) rendering and heightfield libraries assume upAxis = 1
  (that is, the y-axis is "up").  This class allows any of the 3 coordinates
  to be "up".  Make sure your choice of axis is consistent with your rendering
  system.
  <p>
  The heightfield heights are determined from the data type used for the
  heightfieldData array.  
   <p>
   - unsigned char: height at a point is the uchar value at the
       grid point, multipled by heightScale.  uchar isn't recommended
       because of its inability to deal with negative values, and
       low resolution (8-bit).
   <p>
   - short: height at a point is the short int value at that grid
       point, multipled by heightScale.
   <p>
   - float or dobule: height at a point is the value at that grid point.
  <p>
  Whatever the caller specifies as minHeight and maxHeight will be honored.
  The class will not inspect the heightfield to discover the actual minimum
  or maximum heights.  These values are used to determine the heightfield's
  axis-aligned bounding box, multiplied by localScaling.
  <p>
  For usage and testing see the TerrainDemo.
 */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btHeightfieldTerrainShape extends btConcaveShape {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btHeightfieldTerrainShape(Pointer p) { super(p); }

	@NoOffset public static class Range extends Pointer {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public Range(Pointer p) { super(p); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public Range(long size) { super((Pointer)null); allocateArray(size); }
	    private native void allocateArray(long size);
	    @Override public Range position(long position) {
	        return (Range)super.position(position);
	    }
	    @Override public Range getPointer(long i) {
	        return new Range((Pointer)this).offsetAddress(i);
	    }
	
		public Range() { super((Pointer)null); allocate(); }
		private native void allocate();
		public Range(@Cast("btScalar") double min, @Cast("btScalar") double max) { super((Pointer)null); allocate(min, max); }
		private native void allocate(@Cast("btScalar") double min, @Cast("btScalar") double max);

		public native @Cast("bool") boolean overlaps(@Const @ByRef Range other);

		public native @Cast("btScalar") double min(); public native Range min(double setter);
		public native @Cast("btScalar") double max(); public native Range max(double setter);
	}

	/** preferred constructors */
	public btHeightfieldTerrainShape(
			int heightStickWidth, int heightStickLength,
			@Const FloatPointer heightfieldData, @Cast("btScalar") double minHeight, @Cast("btScalar") double maxHeight,
			int upAxis, @Cast("bool") boolean flipQuadEdges) { super((Pointer)null); allocate(heightStickWidth, heightStickLength, heightfieldData, minHeight, maxHeight, upAxis, flipQuadEdges); }
	private native void allocate(
			int heightStickWidth, int heightStickLength,
			@Const FloatPointer heightfieldData, @Cast("btScalar") double minHeight, @Cast("btScalar") double maxHeight,
			int upAxis, @Cast("bool") boolean flipQuadEdges);
	public btHeightfieldTerrainShape(
			int heightStickWidth, int heightStickLength,
			@Const FloatBuffer heightfieldData, @Cast("btScalar") double minHeight, @Cast("btScalar") double maxHeight,
			int upAxis, @Cast("bool") boolean flipQuadEdges) { super((Pointer)null); allocate(heightStickWidth, heightStickLength, heightfieldData, minHeight, maxHeight, upAxis, flipQuadEdges); }
	private native void allocate(
			int heightStickWidth, int heightStickLength,
			@Const FloatBuffer heightfieldData, @Cast("btScalar") double minHeight, @Cast("btScalar") double maxHeight,
			int upAxis, @Cast("bool") boolean flipQuadEdges);
	public btHeightfieldTerrainShape(
			int heightStickWidth, int heightStickLength,
			@Const float[] heightfieldData, @Cast("btScalar") double minHeight, @Cast("btScalar") double maxHeight,
			int upAxis, @Cast("bool") boolean flipQuadEdges) { super((Pointer)null); allocate(heightStickWidth, heightStickLength, heightfieldData, minHeight, maxHeight, upAxis, flipQuadEdges); }
	private native void allocate(
			int heightStickWidth, int heightStickLength,
			@Const float[] heightfieldData, @Cast("btScalar") double minHeight, @Cast("btScalar") double maxHeight,
			int upAxis, @Cast("bool") boolean flipQuadEdges);
	public btHeightfieldTerrainShape(
			int heightStickWidth, int heightStickLength,
			@Const DoublePointer heightfieldData, @Cast("btScalar") double minHeight, @Cast("btScalar") double maxHeight,
			int upAxis, @Cast("bool") boolean flipQuadEdges) { super((Pointer)null); allocate(heightStickWidth, heightStickLength, heightfieldData, minHeight, maxHeight, upAxis, flipQuadEdges); }
	private native void allocate(
			int heightStickWidth, int heightStickLength,
			@Const DoublePointer heightfieldData, @Cast("btScalar") double minHeight, @Cast("btScalar") double maxHeight,
			int upAxis, @Cast("bool") boolean flipQuadEdges);
	public btHeightfieldTerrainShape(
			int heightStickWidth, int heightStickLength,
			@Const DoubleBuffer heightfieldData, @Cast("btScalar") double minHeight, @Cast("btScalar") double maxHeight,
			int upAxis, @Cast("bool") boolean flipQuadEdges) { super((Pointer)null); allocate(heightStickWidth, heightStickLength, heightfieldData, minHeight, maxHeight, upAxis, flipQuadEdges); }
	private native void allocate(
			int heightStickWidth, int heightStickLength,
			@Const DoubleBuffer heightfieldData, @Cast("btScalar") double minHeight, @Cast("btScalar") double maxHeight,
			int upAxis, @Cast("bool") boolean flipQuadEdges);
	public btHeightfieldTerrainShape(
			int heightStickWidth, int heightStickLength,
			@Const double[] heightfieldData, @Cast("btScalar") double minHeight, @Cast("btScalar") double maxHeight,
			int upAxis, @Cast("bool") boolean flipQuadEdges) { super((Pointer)null); allocate(heightStickWidth, heightStickLength, heightfieldData, minHeight, maxHeight, upAxis, flipQuadEdges); }
	private native void allocate(
			int heightStickWidth, int heightStickLength,
			@Const double[] heightfieldData, @Cast("btScalar") double minHeight, @Cast("btScalar") double maxHeight,
			int upAxis, @Cast("bool") boolean flipQuadEdges);
	public btHeightfieldTerrainShape(
			int heightStickWidth, int heightStickLength,
			@Const ShortPointer heightfieldData, @Cast("btScalar") double heightScale, @Cast("btScalar") double minHeight, @Cast("btScalar") double maxHeight,
			int upAxis, @Cast("bool") boolean flipQuadEdges) { super((Pointer)null); allocate(heightStickWidth, heightStickLength, heightfieldData, heightScale, minHeight, maxHeight, upAxis, flipQuadEdges); }
	private native void allocate(
			int heightStickWidth, int heightStickLength,
			@Const ShortPointer heightfieldData, @Cast("btScalar") double heightScale, @Cast("btScalar") double minHeight, @Cast("btScalar") double maxHeight,
			int upAxis, @Cast("bool") boolean flipQuadEdges);
	public btHeightfieldTerrainShape(
			int heightStickWidth, int heightStickLength,
			@Const ShortBuffer heightfieldData, @Cast("btScalar") double heightScale, @Cast("btScalar") double minHeight, @Cast("btScalar") double maxHeight,
			int upAxis, @Cast("bool") boolean flipQuadEdges) { super((Pointer)null); allocate(heightStickWidth, heightStickLength, heightfieldData, heightScale, minHeight, maxHeight, upAxis, flipQuadEdges); }
	private native void allocate(
			int heightStickWidth, int heightStickLength,
			@Const ShortBuffer heightfieldData, @Cast("btScalar") double heightScale, @Cast("btScalar") double minHeight, @Cast("btScalar") double maxHeight,
			int upAxis, @Cast("bool") boolean flipQuadEdges);
	public btHeightfieldTerrainShape(
			int heightStickWidth, int heightStickLength,
			@Const short[] heightfieldData, @Cast("btScalar") double heightScale, @Cast("btScalar") double minHeight, @Cast("btScalar") double maxHeight,
			int upAxis, @Cast("bool") boolean flipQuadEdges) { super((Pointer)null); allocate(heightStickWidth, heightStickLength, heightfieldData, heightScale, minHeight, maxHeight, upAxis, flipQuadEdges); }
	private native void allocate(
			int heightStickWidth, int heightStickLength,
			@Const short[] heightfieldData, @Cast("btScalar") double heightScale, @Cast("btScalar") double minHeight, @Cast("btScalar") double maxHeight,
			int upAxis, @Cast("bool") boolean flipQuadEdges);
	public btHeightfieldTerrainShape(
			int heightStickWidth, int heightStickLength,
			@Cast("const unsigned char*") BytePointer heightfieldData, @Cast("btScalar") double heightScale, @Cast("btScalar") double minHeight, @Cast("btScalar") double maxHeight,
			int upAxis, @Cast("bool") boolean flipQuadEdges) { super((Pointer)null); allocate(heightStickWidth, heightStickLength, heightfieldData, heightScale, minHeight, maxHeight, upAxis, flipQuadEdges); }
	private native void allocate(
			int heightStickWidth, int heightStickLength,
			@Cast("const unsigned char*") BytePointer heightfieldData, @Cast("btScalar") double heightScale, @Cast("btScalar") double minHeight, @Cast("btScalar") double maxHeight,
			int upAxis, @Cast("bool") boolean flipQuadEdges);
	public btHeightfieldTerrainShape(
			int heightStickWidth, int heightStickLength,
			@Cast("const unsigned char*") ByteBuffer heightfieldData, @Cast("btScalar") double heightScale, @Cast("btScalar") double minHeight, @Cast("btScalar") double maxHeight,
			int upAxis, @Cast("bool") boolean flipQuadEdges) { super((Pointer)null); allocate(heightStickWidth, heightStickLength, heightfieldData, heightScale, minHeight, maxHeight, upAxis, flipQuadEdges); }
	private native void allocate(
			int heightStickWidth, int heightStickLength,
			@Cast("const unsigned char*") ByteBuffer heightfieldData, @Cast("btScalar") double heightScale, @Cast("btScalar") double minHeight, @Cast("btScalar") double maxHeight,
			int upAxis, @Cast("bool") boolean flipQuadEdges);
	public btHeightfieldTerrainShape(
			int heightStickWidth, int heightStickLength,
			@Cast("const unsigned char*") byte[] heightfieldData, @Cast("btScalar") double heightScale, @Cast("btScalar") double minHeight, @Cast("btScalar") double maxHeight,
			int upAxis, @Cast("bool") boolean flipQuadEdges) { super((Pointer)null); allocate(heightStickWidth, heightStickLength, heightfieldData, heightScale, minHeight, maxHeight, upAxis, flipQuadEdges); }
	private native void allocate(
			int heightStickWidth, int heightStickLength,
			@Cast("const unsigned char*") byte[] heightfieldData, @Cast("btScalar") double heightScale, @Cast("btScalar") double minHeight, @Cast("btScalar") double maxHeight,
			int upAxis, @Cast("bool") boolean flipQuadEdges);

	/** legacy constructor
	/**
	  This constructor supports a range of heightfield
	  data types, and allows for a non-zero minimum height value.
	  heightScale is needed for any integer-based heightfield data types.
	  <p>
	  This legacy constructor considers {@code PHY_FLOAT} to mean {@code btScalar}.
	  With {@code BT_USE_DOUBLE_PRECISION}, it will expect {@code heightfieldData}
	  to be double-precision.
	 */
	public btHeightfieldTerrainShape(int heightStickWidth, int heightStickLength,
								  @Const Pointer heightfieldData, @Cast("btScalar") double heightScale,
								  @Cast("btScalar") double minHeight, @Cast("btScalar") double maxHeight,
								  int upAxis, @Cast("PHY_ScalarType") int heightDataType,
								  @Cast("bool") boolean flipQuadEdges) { super((Pointer)null); allocate(heightStickWidth, heightStickLength, heightfieldData, heightScale, minHeight, maxHeight, upAxis, heightDataType, flipQuadEdges); }
	private native void allocate(int heightStickWidth, int heightStickLength,
								  @Const Pointer heightfieldData, @Cast("btScalar") double heightScale,
								  @Cast("btScalar") double minHeight, @Cast("btScalar") double maxHeight,
								  int upAxis, @Cast("PHY_ScalarType") int heightDataType,
								  @Cast("bool") boolean flipQuadEdges);

	/** legacy constructor
	/**
	  The legacy constructor assumes the heightfield has a minimum height
	  of zero.  Only unsigned char or btScalar data are supported.  For legacy
	  compatibility reasons, heightScale is calculated as maxHeight / 65535 
	  (and is only used when useFloatData = false).
 	 */
	public btHeightfieldTerrainShape(int heightStickWidth, int heightStickLength, @Const Pointer heightfieldData, @Cast("btScalar") double maxHeight, int upAxis, @Cast("bool") boolean useFloatData, @Cast("bool") boolean flipQuadEdges) { super((Pointer)null); allocate(heightStickWidth, heightStickLength, heightfieldData, maxHeight, upAxis, useFloatData, flipQuadEdges); }
	private native void allocate(int heightStickWidth, int heightStickLength, @Const Pointer heightfieldData, @Cast("btScalar") double maxHeight, int upAxis, @Cast("bool") boolean useFloatData, @Cast("bool") boolean flipQuadEdges);

	public native void setUseDiamondSubdivision(@Cast("bool") boolean useDiamondSubdivision/*=true*/);
	public native void setUseDiamondSubdivision();

	/**could help compatibility with Ogre heightfields. See https://code.google.com/p/bullet/issues/detail?id=625 */
	public native void setUseZigzagSubdivision(@Cast("bool") boolean useZigzagSubdivision/*=true*/);
	public native void setUseZigzagSubdivision();

	public native void setFlipTriangleWinding(@Cast("bool") boolean flipTriangleWinding);
	public native void getAabb(@Const @ByRef btTransform t, @ByRef btVector3 aabbMin, @ByRef btVector3 aabbMax);

	public native void processAllTriangles(btTriangleCallback callback, @Const @ByRef btVector3 aabbMin, @Const @ByRef btVector3 aabbMax);

	public native void calculateLocalInertia(@Cast("btScalar") double mass, @ByRef btVector3 inertia);

	public native void setLocalScaling(@Const @ByRef btVector3 scaling);

	public native @Const @ByRef btVector3 getLocalScaling();

	public native void getVertex(int x, int y, @ByRef btVector3 vertex);

	public native void performRaycast(btTriangleCallback callback, @Const @ByRef btVector3 raySource, @Const @ByRef btVector3 rayTarget);

	public native void buildAccelerator(int chunkSize/*=16*/);
	public native void buildAccelerator();
	public native void clearAccelerator();

	public native int getUpAxis();
	//debugging
	public native @Cast("const char*") BytePointer getName();

	
	public native void setUserValue3(@Cast("btScalar") double value);
	public native @Cast("btScalar") double getUserValue3();
	public native btTriangleInfoMap getTriangleInfoMap();
	public native void setTriangleInfoMap(btTriangleInfoMap map);
	public native @Cast("const unsigned char*") BytePointer getHeightfieldRawData();
}
