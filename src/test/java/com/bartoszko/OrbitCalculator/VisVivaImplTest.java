package com.bartoszko.OrbitCalculator;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import model.Kerbin;
import util.Orbit;
import util.VisVivaImpl;

@RunWith(MockitoJUnitRunner.class)
public class VisVivaImplTest {

	@InjectMocks
	VisVivaImpl visViva;
	
	@Mock
	Orbit orbit;
	
	@Mock
	Kerbin kerbin;
	
	@Test
	public void shouldGiveProperSpeedForKerbinLowOrbit() {
//		given
		double apoapsis = 75000;
		double periapsis = 75000;
		double distance = 75000;
		double kerbinGravitationalParameter = 3.5316000e12;
		long kerbinRadius = 600000;
		when(orbit.getApoapsisInMetres()).thenReturn(apoapsis);
		when(orbit.getPeriapsisInMetres()).thenReturn(periapsis);
		when(orbit.getHeightInMetres()).thenReturn(distance);
		when(kerbin.getGravitationalParameter()).thenReturn(kerbinGravitationalParameter);
		when(kerbin.getRadiusInMetres()).thenReturn(kerbinRadius);
		
//		when
		double result = Math.floor(visViva.resolveForSpeed());

//		then
		Assert.assertThat(result, is(2398.0));
	}	
}
