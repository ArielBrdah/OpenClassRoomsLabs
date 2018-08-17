package com.garage.beans.moteur;

import com.garage.beans.Moteur;
import com.garage.enumeration.TypeMoteur;

public class MoteurDiesel extends Moteur {

	public MoteurDiesel(String n, double d) {
		super(n,d);
		super.setType(TypeMoteur.DIESEL);
	}

}
