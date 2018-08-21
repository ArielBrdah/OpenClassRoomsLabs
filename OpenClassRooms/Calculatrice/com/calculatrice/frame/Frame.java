package com.calculatrice.frame;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import com.calculatrice.container.ButtonsNum;
import com.calculatrice.container.ButtonsOp;
import com.calculatrice.container.Result;

public class Frame extends JFrame {

	public Frame() {
		
		this.setTitle("Calculatrice");
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.setLayout(new BorderLayout(10,10));
		
		this.getContentPane().add(new Result(),BorderLayout.NORTH);
		this.getContentPane().add(new ButtonsNum(),BorderLayout.CENTER);
		this.getContentPane().add(new ButtonsOp(),BorderLayout.EAST);
		this.setVisible(true);
		
	}

	
	
	
}
