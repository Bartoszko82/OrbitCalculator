package com.bartoszko.test;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.bartoszko.model.CelestialBody;
import com.bartoszko.model.ChosenBody;
import com.bartoszko.model.KerbinTempForTest;
import com.bartoszko.model.Orbit;
import com.bartoszko.model.OrbitingBody;
import com.bartoszko.util.VisVivaImpl;

@RunWith(MockitoJUnitRunner.class)
public class VisVivaImplTest {

	CelestialBody chosenBody = ChosenBody.INSTANCE;
	CelestialBody kerbin = new KerbinTempForTest();
	
	@InjectMocks
	VisVivaImpl visViva;
	
	@Mock
	Orbit orbit;
	
	@Mock
	OrbitingBody orbitingBody;
	
	@Test
	public void shouldGiveProperSpeedForKerbinLowOrbit() {
//		given
		int apoapsis = 70000;
		int periapsis = 70000;
		double distance = 70000;
		when(orbit.getApoapsisInMetres()).thenReturn(apoapsis);
		when(orbit.getPeriapsisInMetres()).thenReturn(periapsis);
		when(orbitingBody.getHeightInMetres()).thenReturn(distance);
		chosenBody.setRadiusInMetres(kerbin.getRadiusInMetres());
		chosenBody.setGravitationalParameter(kerbin.getGravitationalParameter());
		
//		when
		int result = (int)Math.floor(visViva.resolveForSpeed());

//		then
		Assert.assertThat(result, is(2295));
	}	
}
