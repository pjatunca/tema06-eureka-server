package com.example.eureka.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EurekaTest {

	@Test
	void prueba01() {
		int resultado = 10; // funcion1()
		assertEquals(20, resultado);
	}
	
	@Test
	void prueba02() {
		int resultado = 10; // funcion2()
		assertEquals(10, resultado);
	}
}
