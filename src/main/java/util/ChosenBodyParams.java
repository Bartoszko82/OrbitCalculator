package util;

import model.CelestialBody;

public class ChosenBodyParams {
	
	private String name;
	private static long mass;
	
	public static void setBody(String name) {
		CelestialBody chosenBody = newInstance(name);
		
		
	}
	
	
	private static CelestialBody newInstance(String name2) {
		// TODO Auto-generated method stub
		return null;
	}


	public static long getMass() {
		return mass;
	}

}
