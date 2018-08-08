package com.conversionCelsiusFahrenheit.application;

import com.conversionCelsiusFahrenheit.model.Conversion;

public class ConversionApp {

	public static void main(String[] args) {

		/***
		 * Run our application
		 */
		Conversion conversion = Conversion.getInstance();
		conversion.runMenu();
	}

}
