package com.bartoszko.test;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.bartoszko.model.Kerbin;
import com.bartoszko.model.Orbit;
import com.bartoszko.model.OrbitingBody;
import com.bartoszko.util.VisVivaImpl;

@RunWith(MockitoJUnitRunner.class)
public class VisVivaImplTest {

	@InjectMocks
	VisVivaImpl visViva;
	
	@Mock
	Orbit orbit;
	
	@Mock
	Kerbin kerbin;
	
	@Mock
	OrbitingBody orbitingBody;
	
	@Test
	public void shouldGiveProperSpeedForKerbinLowOrbit() {
//		given
		int apoapsis = 70000;
		int periapsis = 70000;
		double distance = 70000;
		double kerbinGravitationalParameter = 3.5316000e12;
		long kerbinRadius = 600000;
		when(orbit.getApoapsisInMetres()).thenReturn(apoapsis);
		when(orbit.getPeriapsisInMetres()).thenReturn(periapsis);
		when(orbitingBody.getHeightInMetres()).thenReturn(distance);
		when(kerbin.getGravitationalParameter()).thenReturn(kerbinGravitationalParameter);
		when(kerbin.getRadiusInMetres()).thenReturn(kerbinRadius);
		
//		when
		int result = (int)Math.floor(visViva.resolveForSpeed());

//		then
		Assert.assertThat(result, is(2295));
	}	
}
