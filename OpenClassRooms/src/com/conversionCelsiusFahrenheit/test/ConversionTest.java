package com.conversionCelsiusFahrenheit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.conversionCelsiusFahrenheit.controller.ConversionController;

class ConversionTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void conversionToCelsiusTest() {
		assertEquals(363.89,ConversionController.arrondi(ConversionController.convertToCelsius(687.0),2));
	}

	@Test
	void conversionToFahrenheitTest() {
		assertEquals(122.0,ConversionController.arrondi(ConversionController.convertToFahrenheit(50.0),2));
	}
	
	@Test
	void conversionArrondi() {
		assertEquals(50.89 , ConversionController.arrondi(50.888,2));
	}
}
