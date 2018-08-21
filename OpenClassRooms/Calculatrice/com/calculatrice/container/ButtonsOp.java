package com.calculatrice.container;

import java.awt.Color;
import  java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonsOp extends JPanel implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton[] buttons =  new JButton[5];
	private GridLayout gl = new GridLayout(5,1,5,5);
	

	public ButtonsOp() {
			
		buttons[0] = new JButton("C");
		buttons[0].setForeground(Color.RED);
		buttons[1] = new JButton("+");	
		buttons[2] = new JButton("-");
		buttons[3] = new JButton("*");	
		buttons[4] = new JButton("/");
		
		this.setLayout(gl);
		
		for(JButton b : buttons)
		{
			b.addActionListener(this);
			this.add(b);
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		switch(e.getActionCommand())
		{
		case "C":
			Result.number = "";
			break;
		case "+":
			Result.tmp = Double.parseDouble(Result.number);
			Result.op = "+";
			break;
		case "-":
			Result.tmp = Double.parseDouble(Result.number);
			Result.op = "-";
			break;
		case "*":
			Result.tmp = Double.parseDouble(Result.number);
			Result.op = "*";
			break;
		case "/":
			Result.tmp = Double.parseDouble(Result.number);
			Result.op = "/";
			break;
			default: break;
		}
		
		Result.number = "";
		Result.screen();
	}


	
	
}
