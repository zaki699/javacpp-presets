// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** A fixture is used to attach a shape to a body for collision detection. A fixture
 *  inherits its transform from its parent. Fixtures hold additional non-geometric data
 *  such as friction, collision filters, etc.
 *  Fixtures are created via b2Body::CreateFixture.
 *  \warning you cannot reuse fixtures. */
@NoOffset @Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2Fixture extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2Fixture(Pointer p) { super(p); }

	/** Get the type of the child shape. You can use this to down cast to the concrete shape.
	 *  @return the shape type. */
	public native @Cast("b2Shape::Type") int GetType();

	/** Get the child shape. You can modify the child shape, however you should not change the
	 *  number of vertices because this will crash some collision caching mechanisms.
	 *  Manipulating the shape may lead to non-physical behavior. */
	public native b2Shape GetShape();

	/** Set if this fixture is a sensor. */
	public native void SetSensor(@Cast("bool") boolean sensor);

	/** Is this fixture a sensor (non-solid)?
	 *  @return the true if the shape is a sensor. */
	public native @Cast("bool") boolean IsSensor();

	/** Set the contact filtering data. This will not update contacts until the next time
	 *  step when either parent body is active and awake.
	 *  This automatically calls Refilter. */
	public native void SetFilterData(@Const @ByRef b2Filter filter);

	/** Get the contact filtering data. */
	public native @Const @ByRef b2Filter GetFilterData();

	/** Call this if you want to establish collision that was previously disabled by b2ContactFilter::ShouldCollide. */
	public native void Refilter();

	/** Get the parent body of this fixture. This is NULL if the fixture is not attached.
	 *  @return the parent body. */
	public native b2Body GetBody();

	/** Get the next fixture in the parent body's fixture list.
	 *  @return the next shape. */
	public native b2Fixture GetNext();

	/** Get the user data that was assigned in the fixture definition. Use this to
	 *  store your application specific data. */
	public native Pointer GetUserData();

	/** Set the user data. Use this to store your application specific data. */
	public native void SetUserData(Pointer data);

	/** Test a point for containment in this fixture.
	 *  @param p a point in world coordinates. */
	public native @Cast("bool") boolean TestPoint(@Const @ByRef b2Vec2 p);

	/** Compute the distance from this fixture.
	 *  @param p a point in world coordinates. */
	public native void ComputeDistance(@Const @ByRef b2Vec2 p, @Cast("float32*") FloatPointer distance, b2Vec2 normal, @Cast("int32") int childIndex);
	public native void ComputeDistance(@Const @ByRef b2Vec2 p, @Cast("float32*") FloatBuffer distance, b2Vec2 normal, @Cast("int32") int childIndex);
	public native void ComputeDistance(@Const @ByRef b2Vec2 p, @Cast("float32*") float[] distance, b2Vec2 normal, @Cast("int32") int childIndex);

	/** Cast a ray against this shape.
	 *  @param output the ray-cast results.
	 *  @param input the ray-cast input parameters. */
	public native @Cast("bool") boolean RayCast(b2RayCastOutput output, @Const @ByRef b2RayCastInput input, @Cast("int32") int childIndex);

	/** Get the mass data for this fixture. The mass data is based on the density and
	 *  the shape. The rotational inertia is about the shape's origin. This operation
	 *  may be expensive. */
	public native void GetMassData(b2MassData massData);

	/** Set the density of this fixture. This will _not_ automatically adjust the mass
	 *  of the body. You must call b2Body::ResetMassData to update the body's mass. */
	public native void SetDensity(@Cast("float32") float density);

	/** Get the density of this fixture. */
	public native @Cast("float32") float GetDensity();

	/** Get the coefficient of friction. */
	public native @Cast("float32") float GetFriction();

	/** Set the coefficient of friction. This will _not_ change the friction of
	 *  existing contacts. */
	public native void SetFriction(@Cast("float32") float friction);

	/** Get the coefficient of restitution. */
	public native @Cast("float32") float GetRestitution();

	/** Set the coefficient of restitution. This will _not_ change the restitution of
	 *  existing contacts. */
	public native void SetRestitution(@Cast("float32") float restitution);

	/** Get the fixture's AABB. This AABB may be enlarge and/or stale.
	 *  If you need a more accurate AABB, compute it using the shape and
	 *  the body transform. */
	public native @Const @ByRef b2AABB GetAABB(@Cast("int32") int childIndex);

	/** Dump this fixture to the log file. */
	public native void Dump(@Cast("int32") int bodyIndex);
}
