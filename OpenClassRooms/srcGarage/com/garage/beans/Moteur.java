package com.garage.beans;

import com.garage.enumeration.TypeMoteur;

public class Moteur {

	private TypeMoteur type;
	private String cylindre;
	private double prix;
	
	public TypeMoteur getType() {
		return type;
	}

	public void setType(TypeMoteur type) {
		this.type = type;
	}

	public String getCylindre() {
		return cylindre;
	}

	public void setCylindre(String cylindre) {
		this.cylindre = cylindre;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Moteur(String cylindre, double prix) {
		this.cylindre = cylindre;
		this.prix = prix;
	}
	
	public double getPrix() {
		return prix;
	}
	
	public String toString() {
		return "Moteur "+ getType() + " " + getCylindre() + " (" + getPrix() + "€)";
	}
	
}
