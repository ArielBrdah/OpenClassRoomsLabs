package com.garage.main;

import com.garage.beans.Garage;
import com.garage.beans.Vehicule;
import com.garage.beans.moteur.MoteurDiesel;
import com.garage.beans.moteur.MoteurElectrique;
import com.garage.beans.moteur.MoteurEssence;
import com.garage.beans.moteur.MoteurHybride;
import com.garage.beans.vehicule.A300B;
import com.garage.beans.vehicule.D4;
import com.garage.beans.vehicule.Lagouna;
import com.garage.interfaces.option.BarreDeToit;
import com.garage.interfaces.option.Climatisation;
import com.garage.interfaces.option.GPS;
import com.garage.interfaces.option.SiegeChauffant;
import com.garage.interfaces.option.VitreElectrique;

public class Main {
    public static void main(String[] args) {
     System.out.println(
    		"*************************\n" + 
     		"* Garage OpenClassrooms *\n" + 
     		"*************************");	
     
   	 Garage garage = new Garage();
   	 
   	 Vehicule lag1 = new Lagouna();
   	 lag1.setMoteur(new MoteurEssence("150 Chevaux", 10256d));
   	 lag1.addOption(new GPS());
   	 lag1.addOption(new SiegeChauffant());
   	 lag1.addOption(new VitreElectrique());
   	 garage.addVoiture(lag1);
   		 
   	 Vehicule A300B_2 = new A300B();
   	 A300B_2.setMoteur(new MoteurElectrique("1500 W", 1234d));
   	 A300B_2.addOption(new Climatisation());
   	 A300B_2.addOption(new BarreDeToit());
   	 A300B_2.addOption(new SiegeChauffant());
   	 garage.addVoiture(A300B_2);
   	 
   	 Vehicule d4_1 = new D4();
   	 d4_1.setMoteur(new MoteurDiesel("200 Hdi", 25684.80d));
   	 d4_1.addOption(new BarreDeToit());
   	 d4_1.addOption(new Climatisation());
   	 d4_1.addOption(new GPS());
   	 garage.addVoiture(d4_1);   	 
   	 
   	 Vehicule lag2 = new Lagouna();
   	 lag2.setMoteur(new MoteurDiesel("500 Hdi", 456987d));
   	 garage.addVoiture(lag2);
   	 
   	 Vehicule A300B_1 = new A300B();
   	 A300B_1.setMoteur(new MoteurHybride("ESSENCE/Electrique", 12345.95d));
   	 A300B_1.addOption(new VitreElectrique());
   	 A300B_1.addOption(new BarreDeToit());
   	 garage.addVoiture(A300B_1);
   	 
   	 Vehicule d4_2 = new D4();
   	 d4_2.setMoteur(new MoteurElectrique("100 KW", 1224d));
   	 d4_2.addOption(new SiegeChauffant());
   	 d4_2.addOption(new BarreDeToit());
   	 d4_2.addOption(new Climatisation());
   	 d4_2.addOption(new GPS());
   	 d4_2.addOption(new VitreElectrique());
   	 garage.addVoiture(d4_2);   			 
   	 
   	 System.out.println(garage.toString());
    }
}