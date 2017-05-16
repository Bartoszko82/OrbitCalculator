package com.bartoszko.model;

import lombok.Data;

@Data
public class Sun extends CelestialBody{
	
	//General
	private CelestialBodyType bodyType;
	private String parentBodyName;
	private String name;
	
	//Orbit properties
	private long semiMajorAxisInMetres; 
	private long apoapsisInMetres;
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
	
	//Atmo
	private boolean isAtmospherePresent;
	private double AtmosphereHeight;
}
