package com.calculatrice.container;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonsNum extends JPanel implements ActionListener{

	//private boolean sum = false;
	private JButton[] buttons =  new JButton[12];
	private GridLayout gl = new GridLayout(4,3,5,5);
	
	public ButtonsNum() {
		
		for(int i = 0 ; i < buttons.length-3 ; i++ )
		{
			
			buttons[i] = new JButton(Integer.toString(i+1));
			buttons[i].addActionListener(this);
			
		}
		
		buttons[9] = new JButton("0");
		buttons[10] = new JButton(".");
		buttons[11] = new JButton("=");
		buttons[9].addActionListener(this);
		buttons[10].addActionListener(this);
		buttons[11].addActionListener(this);

		
		this.setLayout(gl);
		
		for(JButton b : buttons)
			this.add(b);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/**
		if(sum) {
			Result.number = "";
			sum = false;
		}*/
		
		switch(e.getActionCommand())
		{
		case "1":
			Result.number += 1;
			break;
		case "2":
			Result.number += 2;
			break;
		case "3":
			Result.number += 3;
			break;
		case "4":
			Result.number += 4;
			break;
		case "5":
			Result.number += 5;
			break;
		case "6":
			Result.number += 6;
			break;
		case "7":
			Result.number += 7;
			break;
		case "8":
			Result.number += 8;
			break;
		case "9":
			Result.number += 9;
			break;
		case "0":
			Result.number += 0;
			break;
		case ".":
			Result.number += ".";
			break;
		case "=": 
			Result.number = ""+calcul();
			break;
		default: 
			break;
		}
		Result.screen();
	}
	
	protected double calcul() {
		
		//sum = true;
		try {
		if(Result.op.equals(""))throw new Exception();	
		switch(Result.op) {
		case "+":	return Result.tmp + Double.parseDouble(Result.number);
		case "-":	return Result.tmp - Double.parseDouble(Result.number);
		case "*":	return Result.tmp * Double.parseDouble(Result.number);
		case "/":	return Result.tmp / Double.parseDouble(Result.number);
		}
		}catch(Exception e) {
			System.err.println("erreur d'operation !");
		}
		return 0;
	}


	
}
