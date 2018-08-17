package com.garage.interfaces.option;

import com.garage.interfaces.Option;

public class SiegeChauffant implements Option {

	private double  prix;
	
	public SiegeChauffant() {}
	
	public SiegeChauffant(double  prix) {
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
		return "Siege chauffant ("+getPrix()+"€)";
	}

}
