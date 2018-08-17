package com.garage.enumeration;

public enum Marque {
RENO("RENO"),PIGEOT("PIGEOT"),TROEN("TROEN");
	
	private String marque = "";
	
	
	Marque(String marque){
		this.marque = marque;
	}
	
	
	public String toString() {
		return this.marque;
	}
}
