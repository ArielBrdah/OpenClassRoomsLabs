package com.garage.interfaces.option;

import com.garage.interfaces.Option;

public class GPS implements Option {

	private double  prix;
	
	public GPS() {}
	
	public GPS(double  prix) {
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
		return "GPS ("+getPrix()+"€)";
	}

}
