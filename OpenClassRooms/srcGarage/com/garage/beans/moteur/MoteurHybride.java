package com.garage.beans.moteur;

import com.garage.beans.Moteur;
import com.garage.enumeration.TypeMoteur;

public class MoteurHybride extends Moteur {

	public MoteurHybride(String string, double d) {
		super(string, d);
		super.setType(TypeMoteur.HYBRIDE);

	}

}
