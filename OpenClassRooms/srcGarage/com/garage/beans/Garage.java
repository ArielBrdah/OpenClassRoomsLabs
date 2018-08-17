package com.garage.beans;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.ObjectInputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Garage {

	@SuppressWarnings("unused")
	private List<Vehicule> voitures;
	private ObjectInputStream ois;
	
	public Garage() {
		
		voitures = new ArrayList<Vehicule>();
		
		String fileName = "garagerooms.txt";
		File file = new File(fileName);
		
		try {
		if(file.createNewFile()) throw new Exception();
		
		try(Stream<String> sf = Files.lines(Paths.get(fileName)))
		{
			
		
		Path path = Paths.get(fileName);
		
		
			if(new File(fileName).length() == 0 )throw new Exception(); 
			 sf.forEach(System.out::println);
			 
			
		}}catch(Exception e) {
			System.err.println("Aucune voiture sauvegardee !");

		}		
		
	}
	
	public void addVoiture(Vehicule lag1) {
		
		
		String fileName = "garagerooms.txt";
		Path path = Paths.get(fileName);
		
		try ( BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8,StandardOpenOption.APPEND) )  
		{
			writer.write(lag1.toString());
			writer.newLine();
			
		} catch(Exception e) {
			
		}
		
		voitures.add(lag1);
	}

	public String toString() {
		
		String pull = "", tmp = "";
		String fileName = "garagerooms.txt";
		Path path = Paths.get(fileName);
		
		try ( BufferedReader buffer = Files.newBufferedReader(path) )  
		{
			while ((tmp = buffer.readLine()) != null) {

				pull += tmp +"\n";
			}
			
		} catch(Exception e) {
			
			System.err.println("Aucune voiture sauvegardee !");
		}		

		return pull;
	}
	
	}
