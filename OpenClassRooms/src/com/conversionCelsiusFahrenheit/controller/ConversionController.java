package com.conversionCelsiusFahrenheit.controller;

public class ConversionController {

	/***
	 * 	CONTROLLER
	 *  static method to convert celsius - fahrenheit and reverse
	 **/
	public static float convertToFahrenheit(float celsius) {

		float fahrenheit = (9.0f/5.0f) * celsius + 32.0f ;
		return fahrenheit;
	}
	
	public static float convertToCelsius(float fahrenheit) {
		
		float celsius = ( (fahrenheit - 32.0f ) * 5.0f ) / 9.0f;
		return celsius;
	}

	
}
