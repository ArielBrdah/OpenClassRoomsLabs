package com.garage.beans.moteur;

import com.garage.beans.Moteur;
import com.garage.enumeration.TypeMoteur;

public class MoteurElectrique extends Moteur {

	public MoteurElectrique(String string, double d) {
super(string, d);
super.setType(TypeMoteur.ELECTRIQUE);

	}

}
