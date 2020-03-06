package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.example.demo.model.SumaNumeros;



public class MocktsSum {

	
	
	@Test
	public void checkSumNumeros() {
		SumaNumeros sumaDeNumeros = mock(SumaNumeros.class);
		
		assertEquals(10, sumaDeNumeros.SumaDosNumeros(5,5));
	}

}
