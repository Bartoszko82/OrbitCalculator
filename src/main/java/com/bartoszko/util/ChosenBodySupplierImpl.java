package com.bartoszko.util;

import com.bartoszko.model.CelestialBody;
import com.bartoszko.model.ChosenBody;

public class ChosenBodySupplierImpl implements ChosenBodySupplier {

	private CelestialBody chosenBody = ChosenBody.INSTANCE;
	
	public CelestialBody supplyCelestialBody(String celestialBodyName) {
		
		
		if(chosenBody.getName().equals(celestialBodyName)) {
			return chosenBody;
		} else if (CelestialBodyPool.contains(celestialBodyName)) {
			CelestialBody bodyFromPool = CelestialBodyPool.getBody(celestialBodyName); //getCelestialBody
			//find way to set bodyFromPool as ChosenBody
			return bodyFromPool;
		} else {
			CelestialBodyLoader cbl = new CelestialBodyFileLoader();
			CelestialBody loadedBody = cbl.loadBody(celestialBodyName); //loadCelestialBody
			//find way to set loadedBody as ChosenBody
			return loadedBody;
		}
	}
}
