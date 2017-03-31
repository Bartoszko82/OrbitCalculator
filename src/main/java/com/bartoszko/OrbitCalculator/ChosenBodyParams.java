package com.bartoszko.OrbitCalculator;

public class ChosenBodyParams {
	
	private String name;
	private static long mass;
	
	public static void setBody(String name) {
		CelestailBody chosenBody = newInstance(name);
		
		
	}
	
	
	public static long getMass() {
		return mass;
	}

}
