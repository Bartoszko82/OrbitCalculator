package com.bartoszko.model;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Orbit {
	private final int apoapsisInMetres;
	private final int periapsisInMetres;
	private final double eccentricity;
	private final double semiMajorAxis;
	private final double inclination;
	private final double longitudeOfAscendingNode;
	private final double argumentOdPeriapsis;
	private final double trueAnomaly;
	private static Logger log = LogManager.getLogger(Orbit.class.getName());
	
	public Orbit(Builder builder) {
		apoapsisInMetres = builder.apoapsisInMetres;
		periapsisInMetres = builder.periapsisInMetres;
		eccentricity = builder.eccentricity;
		semiMajorAxis = builder.semiMajorAxis;
		inclination = builder.inclination;
		longitudeOfAscendingNode = builder.longitudeOfAscendingNode;
		argumentOdPeriapsis = builder.argumentOdPeriapsis;
		trueAnomaly = builder.trueAnomaly;
		
		log.trace("new Instance of Orbit Created");
	}
		
	public int getApoapsisInMetres() {
		return apoapsisInMetres;
	}

	public int getPeriapsisInMetres() {
		return periapsisInMetres;
	}

	public double getEccentricity() {
		return eccentricity;
	}

	public double getSemimajorAxis() {
		return semiMajorAxis;
	}

	public double getInclination() {
		return inclination;
	}

	public double getLongitudeOfAscendingNode() {
		return longitudeOfAscendingNode;
	}

	public double getArgumentOdPeriapsis() {
		return argumentOdPeriapsis;
	}

	public double getTrueAnomaly() {
		return trueAnomaly;
	}
	
	public static class Builder {
		private int apoapsisInMetres;
		private int periapsisInMetres;
		private double eccentricity;
		private double semiMajorAxis;
		private double inclination;
		private double longitudeOfAscendingNode;
		private double argumentOdPeriapsis;
		private double trueAnomaly;
	
		public Builder(){
			
		}
				
		public Builder apoapsisInMetres(int val) {
			apoapsisInMetres = val;
			return this;
		}
		
		public Builder periapsisInMetres(int val) {
			periapsisInMetres = val;
			return this;
		}
		
		public Builder eccentricity(double val) {
			eccentricity = val;
			return this;
		}
		
		public Builder semiMajorAxis(double val) {
			semiMajorAxis = val;
			return this;
		}
		
		public Builder longitudeOfAscendingNode(double val) {
			longitudeOfAscendingNode = val;
			return this;
		}
		
		public Builder argumentOdPeriapsis(double val) {
			argumentOdPeriapsis = val;
			return this;
		}
		
		public Builder trueAnomaly(double val) {
			trueAnomaly = val;
			return this;
		}
	
		public Orbit build() {
			return new Orbit(this);
		}
	}
}