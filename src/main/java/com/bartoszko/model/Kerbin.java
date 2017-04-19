package com.bartoszko.model;

public class Kerbin extends CelestialBody {

	private final long radiusInMetres = 600000;
	private final long equatorialCircumferenceInMetres = 10;
	private final double areaInSquareMetres = 10;
	private final double massInKg = 10;
	private final double gravitationalParameter = 3.5316000e12;
	private final double densityInKgPerCubeMeter = 10;
	private final double surfaceGravity = 9.8;
	
	public Kerbin() {}

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
