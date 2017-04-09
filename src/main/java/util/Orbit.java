package util;

public class Orbit {
	
	private double heightInMetres;
	private Double apoapsisInMetres;
	private double periapsisInMetres;
	private double eccentricity;
	private double semimajorAxis;
	private int inclination;
	private int longitudeOfAscendingNode;
	private int argumentOdPeriapsis;
	private int trueAnomaly;
	
	public Orbit() {
		
	}

	public double getHeightInMetres() {
		return heightInMetres;
	}

	public void setHeightInMetres(double heightInMetres) {
		this.heightInMetres = heightInMetres;
	}

	public Double getApoapsisInMetres() {
		return apoapsisInMetres;
	}

	public void setApoapsisInMetres(Double apoapsis) {
		this.apoapsisInMetres = apoapsis;
	}

	public double getPeriapsisInMetres() {
		return periapsisInMetres;
	}

	public void setPeriapsisInMetres(double periapsis) {
		this.periapsisInMetres = periapsis;
	}

	public double getEccentricity() {
		return eccentricity;
	}

	public void setEccentricity(double eccentricity) {
		this.eccentricity = eccentricity;
	}

	public double getSemimajorAxis() {
		return semimajorAxis;
	}

	public void setSemimajorAxis(double semimajorAxis) {
		this.semimajorAxis = semimajorAxis;
	}

	public int getInclination() {
		return inclination;
	}

	public void setInclination(int inclination) {
		this.inclination = inclination;
	}

	public int getLongitudeOfAscendingNode() {
		return longitudeOfAscendingNode;
	}

	public void setLongitudeOfAscendingNode(int longitudeOfAscendingNode) {
		this.longitudeOfAscendingNode = longitudeOfAscendingNode;
	}

	public int getArgumentOdPeriapsis() {
		return argumentOdPeriapsis;
	}

	public void setArgumentOdPeriapsis(int argumentOdPeriapsis) {
		this.argumentOdPeriapsis = argumentOdPeriapsis;
	}

	public int getTrueAnomaly() {
		return trueAnomaly;
	}

	public void setTrueAnomaly(int trueAnomaly) {
		this.trueAnomaly = trueAnomaly;
	}
	
	
	
}