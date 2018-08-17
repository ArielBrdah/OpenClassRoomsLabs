package com.garage.beans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.garage.enumeration.Marque;
import com.garage.interfaces.Option;

public class Vehicule {

	private double prix;
	@SuppressWarnings("unused")
	private String nom = "";
	@SuppressWarnings("rawtypes")
	private List<Option> options = new ArrayList<Option>();
	private Marque nomMarque;
	private Moteur moteur;

	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Marque getNomMarque() {
		return nomMarque;
	}

	public void setNomMarque(Marque nomMarque) {
		this.nomMarque = nomMarque;
	}

	public Moteur getMoteur() {
		return this.moteur;
	}

	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}

	public double getPrix() {
		return prix;
	}
	
	public List<Option> getOptions(){
		return options;
	}

	public String toString() {
		return "+ Voiture " + getNomMarque() + " : " + getNom() + " " + getMoteur() + " " + getOptions() + " d'une valeur totale de " + getPrix() + " €";
	}
	
	public void addOption(Option option) {
		options.add(option);
	}


}
