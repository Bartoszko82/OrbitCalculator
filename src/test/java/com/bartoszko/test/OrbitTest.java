package com.bartoszko.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import com.bartoszko.model.Orbit;

public class OrbitTest {
	
	@Test
	public void shouldBuildOrbitWithApoapsisIneMetres() {
//		given
		int testValue = 70000;
		Orbit orbit = new Orbit.Builder().apoapsisInMetres(testValue).build();
		
//		when
		int result = orbit.getApoapsisInMetres();
		
//		then
		Assert.assertEquals(testValue, result, 0);
		
	}

}
