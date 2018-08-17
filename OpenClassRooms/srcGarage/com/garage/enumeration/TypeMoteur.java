package com.garage.enumeration;

public enum TypeMoteur {
DIESEL("DIESEL"),ESSENCE("ESSENCE"),HYBRIDE("HYBRIDE"),ELECTRIQUE("ELECTRIQUE");
	
	private String type = "";
	
	
	TypeMoteur(String type){
		this.type = type;
	}
	
	
	public String toString() {
		return this.type;
	}
}
