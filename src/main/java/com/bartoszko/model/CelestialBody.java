package com.bartoszko.model;

public abstract class CelestialBody {
	private String name;
	
	//Orbit properties
	private long semiMajorAxisInMetres; //unify field types with Orbit class
	private long apoapsisIMetres;
	private long periapsisInMetres;
	private long eccentricity;
	private long inclinationInDegrees;
	private long argumentOfPeriapsis;
	private long argumentOfAscendingNode;
	private long trueAnomaly;
	private long orbitalPeriod;
	private long orbitalSpeedInMetersPerSec;
	
	//Physical properties
	private double massInKg;
	private long radiusInMetres;
	private long equatorialCircumferenceInMetres;
	private double areaInSquareMetres;
	private double gravitationalParameter;
	private double densityInKgPerCubeMeter;
	private double surfaceGravity;
	private boolean isAtmospherePresent;
//	private double AtmosphereHeight; //check more atmo parameters
	
	public CelestialBody(){};
	
	public long getSemiMajorAxisInMetres() {
		return semiMajorAxisInMetres;
	}
	
	public void setApoapsisInMetres(long apoapsis) {
		this.apoapsisIMetres = apoapsis;
	}
	public long getApoapsisInMetres() {
		return apoapsisIMetres;
	}
	public long getPeriapsisInMetres() {
		return periapsisInMetres;
	}
	public long getEccentricity() {
		return eccentricity;
	}
	public long getInclination() {
		return inclinationInDegrees;
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
	
	public void setRadiusInMetres(long radius) {
		this.radiusInMetres = radius;
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
	public void setGravitationalParameter(double parameter) {
		this.gravitationalParameter = parameter;
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
