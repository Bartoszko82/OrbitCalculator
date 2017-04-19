package com.bartoszko.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bartoszko.model.CelestialBody;
import com.bartoszko.model.ChosenBody;
import com.bartoszko.model.Orbit;
import com.bartoszko.model.OrbitingBody;

public class VisVivaImpl implements VisViva {

	private Orbit orbit;
	private CelestialBody celestialBody;
	private OrbitingBody orbitingBody;
	
	Logger log = LogManager.getLogger();
	
	public VisVivaImpl (Orbit orbit, /*CelestialBody celestialBody, */OrbitingBody orbitingBody) {
		this.orbit = orbit;
		this.celestialBody = ChosenBody.INSTANCE;
//		this.celestialBody = celestialBody;
		this.orbitingBody = orbitingBody;
	}
	
//	VisViva equation
//	v2 = GM ( 2/r - 1/ a) 
//	where v - relative speed
//	G - gravitiational constant
//	r - distance beetween two bodies
//	M - mass of a central body
//	a (alpha) semi major axis
	
	
	
	@Override
	public double resolveForSpeed () {
		double apoapsis = orbit.getApoapsisInMetres();
		double periapsis = orbit.getPeriapsisInMetres();
		log.debug(periapsis);
		double distance = orbitingBody.getHeightInMetres() + celestialBody.getRadiusInMetres();
		log.debug(celestialBody.getRadiusInMetres());
		double SemiMajorAxis = (apoapsis + periapsis)/2 + celestialBody.getRadiusInMetres(); 
		
		double speedSquared = celestialBody.getGravitationalParameter()*(2/distance - 1 / SemiMajorAxis);
		double speed = Math.sqrt(speedSquared);
		
		return log.traceExit(speed);
	}
	
	@Override
	public double resolveForDistance (){
		return 100.0;
	};	

	@Override
	public double resolveForSMAxis (){
		return 100;
		
	};	
	
}
