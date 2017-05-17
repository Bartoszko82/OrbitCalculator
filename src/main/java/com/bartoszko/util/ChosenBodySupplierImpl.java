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
			setChosenBodyFieldsFromObject(bodyFromPool);
			return bodyFromPool;
		} else {
			CelestialBodyLoader cbl = new CelestialBodyLoaderFromFile();
			CelestialBody loadedBody = cbl.loadBody(celestialBodyName); //loadCelestialBody
			setChosenBodyFieldsFromObject(loadedBody);
			CelestialBodyPool.addBody(loadedBody);
			return loadedBody;
		}
	}
	
	private void setChosenBodyFieldsFromObject (CelestialBody body) {
		
	}
}


