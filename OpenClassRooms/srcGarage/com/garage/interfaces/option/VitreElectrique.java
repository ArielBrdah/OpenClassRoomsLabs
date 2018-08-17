package com.garage.interfaces.option;

import com.garage.interfaces.Option;

public class VitreElectrique implements Option {

	
	private double  prix;
	
	public VitreElectrique() {
	}
	
	public VitreElectrique(double  prix) {
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
		return "Vitre electrique ("+getPrix()+"€)";
	}

}
