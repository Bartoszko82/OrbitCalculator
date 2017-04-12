package com.bartoszko.model;

public class CelestialBody {
	
	//Orbit
	private long semiMajorAxisInMetres; //unify field types with Orbit class
	private long apoapsisIMetres;
	private long periapsisInMetres;
	private long eccentricity;
	private long inclination;
	private long argumentOfPeriapsis;
	private long argumentOfAscendingNode;
	private long trueAnomaly;
	private long orbitalPeriod;
	private long orbitalSpeedInMetersPerSec;
	
	//Properties
	private long radiusInMetres;
	private long equatorialCircumferenceInMetres;
	private double areaInSquareMetres;
	private double massInKg;
	private double gravitationalParameter;
	private double densityInKgPerCubeMeter;
	private double surfaceGravity;
	
	
	public long getSemiMajorAxisInMetres() {
		return semiMajorAxisInMetres;
	}
	public long getApoapsisInInMetres() {
		return apoapsisIMetres;
	}
	public long getPeriapsisInInMetres() {
		return periapsisInMetres;
	}
	public long getEccentricity() {
		return eccentricity;
	}
	public long getInclination() {
		return inclination;
	}
	public long getArgumentOfPeriapsis() {
		return argumentOfPeriapsis;
	}
	public long getArgumentOfAscendingNode() {
		return argumentOfAscendingNode;
	}
	public long getTrueAnomaly() {
		return trueAnomaly;
	}
	public long getOrbitalPeriod() {
		return orbitalPeriod;
	}
	public long getOrbitalSpeedInMetersPerSec() {
		return orbitalSpeedInMetersPerSec;
	}
	
	public long getRadiusInMetres() {
		return radiusInMetres;
	}
	
	public long getEquatorialCircumferenceInMetres() {
		return equatorialCircumferenceInMetres;
	}
	public double getAreaInSquareMetres() {
		return areaInSquareMetres;
	}
	public double getMassInKg() {
		return massInKg;
	}
	public double getGravitationalParameter() {
		return gravitationalParameter;
	}
	public double getDensityInKgPerCubeMeter() {
		return densityInKgPerCubeMeter;
	}
	public double getSurfaceGravity() {
		return surfaceGravity;
	}

	
	
}
