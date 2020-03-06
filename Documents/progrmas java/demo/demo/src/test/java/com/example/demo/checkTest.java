package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.example.demo.model.SumaNumeros;

public class checkTest {
	
	@Test
	public void checksum() {
		SumaNumeros sumanumeros = new SumaNumeros();
		assertEquals(2, sumanumeros.SumaDosNumeros(1, 1));
		System.out.println("Primer Resultado Esperado Correcto");
		assertEquals(2, sumanumeros.SumaDosNumeros(1, 1));
		System.out.println("Segundo Resultado Esperado Correcto");
	}

	
}
