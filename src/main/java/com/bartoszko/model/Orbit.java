package com.bartoszko.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import lombok.Getter;

public class Orbit {
	private static Logger log = LogManager.getLogger(Orbit.class.getName());
	
	@Getter private final int apoapsisInMetres;
	@Getter private final int periapsisInMetres;
	@Getter private final double eccentricity;
	@Getter private final double semiMajorAxis;
	@Getter private final double inclination;
	@Getter private final double longitudeOfAscendingNode;
	@Getter private final double argumentOdPeriapsis;
	@Getter private final double trueAnomaly;
	@Getter private final double heightInMetres;
	@Getter private final double speedInMetresPerSecond;
	
	public Orbit(Builder builder) {
		apoapsisInMetres = builder.apoapsisInMetres;
		periapsisInMetres = builder.periapsisInMetres;
		eccentricity = builder.eccentricity;
		semiMajorAxis = builder.semiMajorAxis;
		inclination = builder.inclination;
		longitudeOfAscendingNode = builder.longitudeOfAscendingNode;
		argumentOdPeriapsis = builder.argumentOdPeriapsis;
		trueAnomaly = builder.trueAnomaly;
		heightInMetres = builder.heightInMetres;
		speedInMetresPerSecond = builder.speedInMetresPerSecond;
		
		log.trace("new Instance of Orbit Created");
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
		private double heightInMetres;
		private double speedInMetresPerSecond;
	
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
		
		public Builder heightInMetres(double val) {
			heightInMetres = val;
			return this;
		}
		
		public Builder speedInMetresPerSecond(double val) {
			speedInMetresPerSecond = val;
			return this;
		}
	
		public Orbit build() {
			return new Orbit(this);
		}
	}
}