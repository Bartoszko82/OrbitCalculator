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
import com.bartoszko.model.Orbit;
import com.bartoszko.util.ChosenBodySupplier;
import com.bartoszko.util.ChosenBodySupplierForTests;
import com.bartoszko.util.ChosenBodySupplierImpl;
import com.bartoszko.util.VisVivaImpl;

@RunWith(MockitoJUnitRunner.class)
public class VisVivaImplTest {

	ChosenBodySupplier bodySupplier = new ChosenBodySupplierForTests();
	
	@InjectMocks
	VisVivaImpl visViva;
	
	@Mock
	Orbit orbit;
	
	@Test
	public void shouldGiveProperSpeedForKerbinLowOrbit() {
//		given
		when(orbit.getApoapsisInMetres()).thenReturn(70000);
		when(orbit.getPeriapsisInMetres()).thenReturn(70000);
		when(orbit.getHeightInMetres()).thenReturn(70000d);
		
		bodySupplier.supplyCelestialBody("Kerbin");
		
//		when
		int result = (int)Math.floor(visViva.resolveForSpeed());

//		then
		Assert.assertThat(result, is(2295));
	}	
}
