package com.bartoszko.util;

import com.bartoszko.model.CelestialBody;

public interface ChosenBodySupplier {
	
	public CelestialBody supplyCelestialBody(String CelestialBodyName);
}
