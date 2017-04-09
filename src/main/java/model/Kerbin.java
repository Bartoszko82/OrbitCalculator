package model;

public class Kerbin extends CelestialBody {

	private long radiusInMetres = 600000;
	private long equatorialCircumferenceInMetres;
	private double areaInSquareMetres;
	private double massInKg;
	private double gravitationalParameter = 3.5316000e12;
	private double densityInKgPerCubeMeter;
	private double surfaceGravity;
	
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
