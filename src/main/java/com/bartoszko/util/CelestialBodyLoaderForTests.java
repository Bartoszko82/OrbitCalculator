package com.bartoszko.util;

import com.bartoszko.model.CelestialBody;
import com.bartoszko.model.CelestialBodyType;
import com.bartoszko.model.Planet;

public class CelestialBodyLoaderForTests implements CelestialBodyLoader{

	@Override
	public CelestialBody loadBody(String doesntMatterWillLoadKerbin) {
		CelestialBody kerbin = new Planet();
		kerbin.setBodyType(CelestialBodyType.PLANET);
		kerbin.setParentBodyName("Kerbol");
		kerbin.setName("Kerbin");
		kerbin.setRadiusInMetres(600000);
//		kerbin.setEquatorialCircumferenceInMetres(??);
//		kerbin.setAreaInSquareMetres(??);
//		private final double massInKg = 10;
		kerbin.setGravitationalParameter(3.5316000e12);
//		private final double densityInKgPerCubeMeter = 10;
		kerbin.setSurfaceGravity(9.8);
		CelestialBodyPool.addBody(kerbin);
		return kerbin;
	}
	

}
