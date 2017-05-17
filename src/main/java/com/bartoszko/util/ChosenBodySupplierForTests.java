package com.bartoszko.util;

import com.bartoszko.model.CelestialBody;
import com.bartoszko.model.CelestialBodyType;
import com.bartoszko.model.ChosenBody;
import com.bartoszko.model.Planet;

public class ChosenBodySupplierForTests implements ChosenBodySupplier {
	
	private CelestialBody chosenBody = ChosenBody.INSTANCE;	
	
	public CelestialBody supplyCelestialBody(String celestialBodyName) {
	
		if("Kerbin".equals(celestialBodyName)) {
			CelestialBodyLoader cbl = new CelestialBodyLoaderForTests();
			CelestialBody loadedCelestialBody = cbl.loadBody("Kerbin");
			setChosenBodyFieldsFromObject(loadedCelestialBody);
			return loadedCelestialBody;
		} else {
			return null;
		}
	} 
	
	
	private void setChosenBodyFieldsFromObject (CelestialBody body) {
		
		chosenBody.setBodyType(body.getBodyType());
		chosenBody.setParentBodyName(body.getParentBodyName());
		chosenBody.setName(body.getName());
		chosenBody.setRadiusInMetres(body.getRadiusInMetres());
//		kerbin.setEquatorialCircumferenceInMetres(??);
//		kerbin.setAreaInSquareMetres(??);
//		private final double massInKg = 10;
		chosenBody.setGravitationalParameter(body.getGravitationalParameter());
//		private final double densityInKgPerCubeMeter = 10;
		chosenBody.setSurfaceGravity(body.getSurfaceGravity());
		
		//write setter for all fields and copy to ChosenBodySupplierImpl
		
		
		
	}
}
