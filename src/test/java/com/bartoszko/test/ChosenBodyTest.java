package com.bartoszko.test;

import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;

import com.bartoszko.model.CelestialBody;
import com.bartoszko.model.ChosenBody;

public class ChosenBodyTest {
	
	
	@Test
	public void bothInstancesShouldBeTheSame() {
		
//		given
		CelestialBody body1 = ChosenBody.INSTANCE;
		CelestialBody body2 = ChosenBody.INSTANCE;
//		when
		// no when this time
		
//		then
		Assert.assertTrue(body1.equals(body2));
		
	}
	
	@Test
	public void FieldValuesShouldBeTheSame() {
		
//		given
		CelestialBody body1 = ChosenBody.INSTANCE;
		CelestialBody body2 = ChosenBody.INSTANCE;

//		when
		body1.setApoapsisInMetres(70000);
		long body1apoapsis = body1.getApoapsisInMetres();
		long body2apoapsis = body2.getApoapsisInMetres();
		
		
//		then
		Assert.assertTrue(body1apoapsis == body2apoapsis);
		
	}


	
	
	

}
