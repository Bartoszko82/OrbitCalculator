package com.bartoszko.model;

public class OrbitingBody {
	private double heightInMetres;
	private double speedInMetresPerSecond;

	public OrbitingBody(){}

	public double getHeightInMetres() {
		return heightInMetres;
	}

	public void setHeightInMetres(int heightInMetres) {
		this.heightInMetres = heightInMetres;
	}

	public double getSpeedInMetresPerSecond() {
		return speedInMetresPerSecond;
	}

	public void setSpeedInMetresPerSecond(int speedInMetresPerSecond) {
		this.speedInMetresPerSecond = speedInMetresPerSecond;
	};
	
	
}
