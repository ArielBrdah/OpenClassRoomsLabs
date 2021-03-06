package com.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.button.Bouton;
import com.panel.Panel;

public class Frame extends JFrame implements java.awt.event.ActionListener {
	
	  private int inc = 1;
	  private Panel pan = new Panel();
	  private Bouton bouton = new Bouton("start"),bouton2 = new Bouton("stop");
	  private Panel container = new Panel();
	  private JLabel label = new JLabel();
	  private int compteur = 0;
	  private Thread t;
	  private boolean animated = true;
	  private boolean backX, backY;
	  private int x, y;

	  public Frame(){
	    this.setTitle("Animation");
	    this.setSize(300, 300);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);

	    container.setBackground(Color.white);
	    container.setLayout(new BorderLayout());
	    container.add(pan, BorderLayout.CENTER);
	    bouton.addActionListener(new BoutonListener()); 
	    bouton.setEnabled(false);
	    bouton2.addActionListener(new Bouton2Listener());

	    Panel south = new Panel();
	    south.add(bouton);
	    south.add(bouton2);
	    container.add(south, BorderLayout.SOUTH);
	    Font police = new Font("Tahoma", Font.BOLD, 16);
	    label.setFont(police);
	    label.setForeground(Color.blue);
	    label.setHorizontalAlignment(JLabel.CENTER);
	    container.add(label, BorderLayout.NORTH);
	    this.setContentPane(container);
	    this.setVisible(true);
	    go();
	  }

	  private void go(){
	    //Les coordonnées de départ de notre rond
	    x = pan.getPosX();
	    y = pan.getPosY();
	    //Dans cet exemple, j'utilise une boucle while
	    //Vous verrez qu'elle fonctionne très bien
	    while(this.animated){
	      if(x < 1)backX = false;
	      if(x > pan.getWidth()-50)backX = true;          
	      if(y < 1)backY = false;
	      if(y > pan.getHeight()-50)backY = true;
	      if(!backX)pan.setPosX(++x);
	      else pan.setPosX(--x);
	      if(!backY) pan.setPosY(++y);
	      else pan.setPosY(--y);
	      pan.repaint();

	      try {
	        Thread.sleep(3);
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }
	    }     
	  }


	  public class BoutonListener implements ActionListener{
	    public void actionPerformed(ActionEvent arg0) {
	      animated = true;
	      t = new Thread(new PlayAnimation());
	      t.start();
	      bouton.setEnabled(false);
	      bouton2.setEnabled(true);
	    }
	  }

	  class Bouton2Listener  implements ActionListener{
	    public void actionPerformed(ActionEvent e) {
	      animated = false;       
	      bouton.setEnabled(true);
	      bouton2.setEnabled(false);
	    }
	  }       

	  class PlayAnimation implements Runnable{
	    public void run() {
	      go();                   
	    }               
	  } 

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
