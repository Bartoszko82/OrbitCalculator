package com.bartoszko.util;

import com.bartoszko.model.CelestialBody;

public interface CelestialBodyLoader {
	
	public CelestialBody loadBody(String celestialBodyName);

}
