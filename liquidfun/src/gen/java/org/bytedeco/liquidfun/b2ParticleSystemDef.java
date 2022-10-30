// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


@NoOffset @Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2ParticleSystemDef extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2ParticleSystemDef(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2ParticleSystemDef(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public b2ParticleSystemDef position(long position) {
        return (b2ParticleSystemDef)super.position(position);
    }
    @Override public b2ParticleSystemDef getPointer(long i) {
        return new b2ParticleSystemDef((Pointer)this).offsetAddress(i);
    }

	public b2ParticleSystemDef() { super((Pointer)null); allocate(); }
	private native void allocate();

	/** Enable strict Particle/Body contact check.
	 *  See SetStrictContactCheck for details. */
	public native @Cast("bool") boolean strictContactCheck(); public native b2ParticleSystemDef strictContactCheck(boolean setter);

	/** Set the particle density.
	 *  See SetDensity for details. */
	public native @Cast("float32") float density(); public native b2ParticleSystemDef density(float setter);

	/** Change the particle gravity scale. Adjusts the effect of the global
	 *  gravity vector on particles. Default value is 1.0f. */
	public native @Cast("float32") float gravityScale(); public native b2ParticleSystemDef gravityScale(float setter);

	/** Particles behave as circles with this radius. In Box2D units. */
	public native @Cast("float32") float radius(); public native b2ParticleSystemDef radius(float setter);

	/** Set the maximum number of particles.
	 *  By default, there is no maximum. The particle buffers can continue to
	 *  grow while b2World's block allocator still has memory.
	 *  See SetMaxParticleCount for details. */
	public native @Cast("int32") int maxCount(); public native b2ParticleSystemDef maxCount(int setter);

	/** Increases pressure in response to compression
	 *  Smaller values allow more compression */
	public native @Cast("float32") float pressureStrength(); public native b2ParticleSystemDef pressureStrength(float setter);

	/** Reduces velocity along the collision normal
	 *  Smaller value reduces less */
	public native @Cast("float32") float dampingStrength(); public native b2ParticleSystemDef dampingStrength(float setter);

	/** Restores shape of elastic particle groups
	 *  Larger values increase elastic particle velocity */
	public native @Cast("float32") float elasticStrength(); public native b2ParticleSystemDef elasticStrength(float setter);

	/** Restores length of spring particle groups
	 *  Larger values increase spring particle velocity */
	public native @Cast("float32") float springStrength(); public native b2ParticleSystemDef springStrength(float setter);

	/** Reduces relative velocity of viscous particles
	 *  Larger values slow down viscous particles more */
	public native @Cast("float32") float viscousStrength(); public native b2ParticleSystemDef viscousStrength(float setter);

	/** Produces pressure on tensile particles
	 *  0~0.2. Larger values increase the amount of surface tension. */
	public native @Cast("float32") float surfaceTensionPressureStrength(); public native b2ParticleSystemDef surfaceTensionPressureStrength(float setter);

	/** Smoothes outline of tensile particles
	 *  0~0.2. Larger values result in rounder, smoother, water-drop-like
	 *  clusters of particles. */
	public native @Cast("float32") float surfaceTensionNormalStrength(); public native b2ParticleSystemDef surfaceTensionNormalStrength(float setter);

	/** Produces additional pressure on repulsive particles
	 *  Larger values repulse more
	 *  Negative values mean attraction. The range where particles behave
	 *  stably is about -0.2 to 2.0. */
	public native @Cast("float32") float repulsiveStrength(); public native b2ParticleSystemDef repulsiveStrength(float setter);

	/** Produces repulsion between powder particles
	 *  Larger values repulse more */
	public native @Cast("float32") float powderStrength(); public native b2ParticleSystemDef powderStrength(float setter);

	/** Pushes particles out of solid particle group
	 *  Larger values repulse more */
	public native @Cast("float32") float ejectionStrength(); public native b2ParticleSystemDef ejectionStrength(float setter);

	/** Produces static pressure
	 *  Larger values increase the pressure on neighboring partilces
	 *  For a description of static pressure, see
	 *  http://en.wikipedia.org/wiki/Static_pressure#Static_pressure_in_fluid_dynamics */
	public native @Cast("float32") float staticPressureStrength(); public native b2ParticleSystemDef staticPressureStrength(float setter);

	/** Reduces instability in static pressure calculation
	 *  Larger values make stabilize static pressure with fewer iterations */
	public native @Cast("float32") float staticPressureRelaxation(); public native b2ParticleSystemDef staticPressureRelaxation(float setter);

	/** Computes static pressure more precisely
	 *  See SetStaticPressureIterations for details */
	public native @Cast("int32") int staticPressureIterations(); public native b2ParticleSystemDef staticPressureIterations(int setter);

	/** Determines how fast colors are mixed
	 *  1.0f ==> mixed immediately
	 *  0.5f ==> mixed half way each simulation step (see b2World::Step()) */
	public native @Cast("float32") float colorMixingStrength(); public native b2ParticleSystemDef colorMixingStrength(float setter);

	/** Whether to destroy particles by age when no more particles can be
	 *  created.  See #b2ParticleSystem::SetDestructionByAge() for
	 *  more information. */
	public native @Cast("bool") boolean destroyByAge(); public native b2ParticleSystemDef destroyByAge(boolean setter);

	/** Granularity of particle lifetimes in seconds.  By default this is
	 *  set to (1.0f / 60.0f) seconds.  b2ParticleSystem uses a 32-bit signed
	 *  value to track particle lifetimes so the maximum lifetime of a
	 *  particle is (2^32 - 1) / (1.0f / lifetimeGranularity) seconds.
	 *  With the value set to 1/60 the maximum lifetime or age of a particle is
	 *  2.27 years. */
	public native @Cast("float32") float lifetimeGranularity(); public native b2ParticleSystemDef lifetimeGranularity(float setter);
}
