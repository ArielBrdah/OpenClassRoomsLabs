package com.garage.interfaces.option;

import com.garage.interfaces.Option;

public class Climatisation implements Option {

	private double prix;
	
	public Climatisation() {}
	
	public Climatisation(double  prix) {
		this.prix = prix;
	}
	
	public void setPrix(double  prix) {
		this.prix = prix;
	}
	
	@Override
	public double  getPrix() {
		return this.prix;
	}

	@Override
	public String toString() {
		return "Climatisation ("+getPrix()+"€)";
	}
}
