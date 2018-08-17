package com.garage.interfaces.option;

import com.garage.interfaces.Option;

public class BarreDeToit implements Option{

	private double prix;
	
	
	public BarreDeToit() {}
	
	 public BarreDeToit(double prix) {
		this.prix = prix;
	}
	 
	public void setPrix(double prix) {
			this.prix = prix ;
		}
	
	@Override
	public double getPrix() {
		return this.prix;
	}
	
	@Override
	public String toString() {
		return "Barre de toit ("+getPrix()+"€)";
	}
	

}
