package com.calculatrice.container;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Result extends JPanel {

	protected static String number = "", op = "";
	protected static double tmp = 0.0;
	private static JLabel label = new JLabel();
	private GridLayout gl = new GridLayout(1,1);
	
	public Result() {
		this.setPreferredSize(new Dimension(220,30));
		label.setBackground(Color.WHITE);
		label.setSize(220,30);
		label.setText("Entrer un nombre");
		this.add(label);
		this.setVisible(true);
	
	}

	protected static void screen() {
		label.setText(number);
	}
	
}
