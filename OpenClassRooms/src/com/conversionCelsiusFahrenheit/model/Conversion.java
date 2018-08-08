package com.conversionCelsiusFahrenheit.model;

import com.conversionCelsiusFahrenheit.controller.*;

import java.util.Scanner;

public class Conversion {

	private static Scanner sc;
	private static boolean instanciate = false;
	private static Conversion conversion;
	private boolean convertMore = true;
	
	
	private Conversion(){
		if(!instanciate) {
			conversion = this;
			sc = new Scanner(System.in);
		}
	}
	
	public void runMenu() {
		
		// HEAD
		System.out.println(displayHeadOfMenu());
		
		while(convertMore) {

		// type to convert
		System.out.println(askConversionModal());
		int choose = selectedConversionModal();
		
		// value to insert
		System.out.println(askTemperatureToConvert());
		float result = selectedTemperatureToConvert();
		
		// implementation of the controller
		switch(choose) {
		case 1: 
				System.out.println(result
					+" C correspond a : " + ConversionController.convertToFahrenheit(result) + " F.");
					break;
		
		case 2: 
				System.out.println(result
					+" F correspond a : " + ConversionController.convertToCelsius(result) + " C.");
					break;
		
		default: 
				System.out.println("Une erreur s'est produit sur le choix !");
					break;
		}
		
		// retry
		System.out.println(askToConvertOneMoreTime());
		String str = selectedToConvertOneMoreTime();
		
		// yes or not ?
		convertMore = str.charAt(0) == 'O';
		
		}
		
		System.out.println("Au revoir !");
	}

	
	// welcome
	private String displayHeadOfMenu() {
		String head = "CONVERTISSEUR DEGRES CELSIUS ET DEGRES FAHRENHEIT\n";
		head +="___________________________________________________";
		
		return head;
	}
	
	
	// all input method
	private int selectedConversionModal() {
		return sc.nextInt();		
	}
	
	private float selectedTemperatureToConvert() {
		return sc.nextFloat();
	}
	
	private String selectedToConvertOneMoreTime() {
		return sc.next();
	}
	
	// all string question method
	private String askConversionModal() {
		String menu ="Choisissez le mode de conversion :\n";
		menu +="1 - Convertisseur Celsius - Fahrenheit\n";
		menu +="2 - Convertisseur Fahrenheit - Celsius";	
		return menu;
	}
	
	private String askTemperatureToConvert() {
		return "Temperature a convertir:";
	}
	
	private String askToConvertOneMoreTime() {
		return "Souhaitez-vous convertire une autre temperature ? (O/N)";
	}

	// instanciation of the application
	public static Conversion getInstance() {
		if(!instanciate)
				new Conversion();
		return conversion;
	}
}
