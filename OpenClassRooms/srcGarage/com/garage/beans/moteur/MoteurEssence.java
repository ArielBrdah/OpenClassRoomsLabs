package com.garage.beans.moteur;

import com.garage.beans.Moteur;
import com.garage.enumeration.TypeMoteur;

public class MoteurEssence extends Moteur {

	public MoteurEssence(String string, double d) {
		super(string, d);
		super.setType(TypeMoteur.ESSENCE);

	}

}
