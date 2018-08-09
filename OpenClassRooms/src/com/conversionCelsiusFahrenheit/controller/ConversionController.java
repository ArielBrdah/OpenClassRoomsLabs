package com.conversionCelsiusFahrenheit.controller;

public class ConversionController {

	/***
	 * 	CONTROLLER
	 *  static method to convert celsius - fahrenheit and reverse
	 *  method arrondi, ceil the result, @param A : number to ceil
	 *  @param B : number after comma. 
	 **/
	public static double convertToFahrenheit(double celsius) {

		double fahrenheit = (9.0/5.0) * celsius + 32.0 ;
		return fahrenheit;
	}
	
	public static double convertToCelsius(double fahrenheit) {
		
		double celsius = ( (fahrenheit - 32.0 ) * 5.0 ) / 9.0;
		return celsius;
	}

	public static double arrondi(double A, int B) {
		return (double) ( (int) ( A * Math.pow(10, B) + .5)) / Math.pow(10, B);
	}
}
