package com.bartoszko.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.bartoszko.model.CelestialBody;

public class CelestialBodyPool {

	private static Map<String, CelestialBody> celestialBodyPool = new HashMap<String, CelestialBody>();
	
	public static void addBody(CelestialBody celestialBody) {
		celestialBodyPool.put(celestialBody.getName(), celestialBody);
	}
	
	public static CelestialBody getBody(String celestialBodyName) {
		return celestialBodyPool.get(celestialBodyName);
	}
	
	public static boolean contains (String celestialBodyName) {
		for(Entry<String, CelestialBody> body : celestialBodyPool.entrySet()) {
			if(body.getKey().equals(celestialBodyName)) {
				return true;
			}
		}
		return false;
	}
}
