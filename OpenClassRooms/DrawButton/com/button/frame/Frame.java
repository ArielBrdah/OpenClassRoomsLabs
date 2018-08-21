package com.button.frame;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

import com.button.bean.Button;
import com.button.panel.Panel;

public class Frame extends JFrame{

	private Panel pan = new Panel();
	private Button but = new Button("Mon boutton");
	  CardLayout cl = new CardLayout();
	  Panel content = new Panel();
	  //Liste des noms de nos conteneurs pour la pile de cartes
	  String[] listContent = {"CARD_1", "CARD_2", "CARD_3"};
	  int indice = 0;

	
	
	public Frame(com.button.types.Border b) {
		
		this.setTitle("Button Application");
		this.setLocationRelativeTo(null);
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.getContentPane().add(new Button("CENTER"),BorderLayout.CENTER);
		this.getContentPane().add(new Button("NORTH"),BorderLayout.NORTH);
		this.getContentPane().add(new Button("SOUTH"),BorderLayout.SOUTH);
		this.getContentPane().add(new Button("WEST"),BorderLayout.WEST);
		this.getContentPane().add(new Button("EAST"),BorderLayout.EAST);
		this.setVisible(true);
			
	}
	
	public Frame(com.button.types.Grid g) {
		
	    this.setTitle("Bouton");
	    this.setSize(300, 300);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    //On définit le layout à utiliser sur le content pane
	    //Trois lignes sur deux colonnes
	    this.setLayout(new GridLayout(3, 2,5,5));
	    //On ajoute le bouton au content pane de la JFrame
	    this.getContentPane().add(new Button("1"));
	    this.getContentPane().add(new Button("2"));
	    this.getContentPane().add(new Button("3"));
	    this.getContentPane().add(new Button("4"));
	    this.getContentPane().add(new Button("5"));
	    this.setVisible(true);
			
		}
	
	  		public Frame(com.button.types.BoxLayout b){
			
		    this.setTitle("Box Layout");
		    this.setSize(300, 120);
		    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    this.setLocationRelativeTo(null);

		    Panel b1 = new Panel();
		    //On définit le layout en lui indiquant qu'il travaillera en ligne
		    
		    b1.setLayout(new BoxLayout(b1, BoxLayout.LINE_AXIS));
		    b1.add(new Button("Bouton 1"));

		    Panel b2 = new Panel();
		    //Idem pour cette ligne
		    b2.setLayout(new BoxLayout(b2, BoxLayout.LINE_AXIS));
		    b2.add(new Button("Bouton 2"));
		    b2.add(new Button("Bouton 3"));

		    Panel b3 = new Panel();
		    //Idem pour cette ligne
		    b3.setLayout(new BoxLayout(b3, BoxLayout.LINE_AXIS));
		    b3.add(new Button("Bouton 4"));
		    b3.add(new Button("Bouton 5"));
		    b3.add(new Button("Bouton 6"));

		    Panel b4 = new Panel();
		    //On positionne maintenant ces trois lignes en colonne
		    b4.setLayout(new BoxLayout(b4, BoxLayout.PAGE_AXIS));
		    b4.add(b1);
		    b4.add(b2);
		    b4.add(b3);
				
		    this.getContentPane().add(b4);
		    this.setVisible(true);
		  }

	  	  public Frame(com.button.types.CardLayout c){
	  	    this.setTitle("CardLayout");
	  	    this.setSize(300, 120);
	  	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  	    this.setLocationRelativeTo(null);
	  			
	  	    //On crée trois conteneurs de couleur différente
	  	    Panel card1 = new Panel();
	  	    card1.setBackground(Color.blue);		
	  	    Panel card2 = new Panel();
	  	    card2.setBackground(Color.red);		
	  	    Panel card3 = new Panel();
	  	    card3.setBackground(Color.green);

	  	    Panel boutonPane = new Panel();
	  	    Button bouton = new Button("Contenu suivant");
	  	    //Définition de l'action du bouton
	  	    bouton.addActionListener(new ActionListener(){
	  	      public void actionPerformed(ActionEvent event){
	  	        //Via cette instruction, on passe au prochain conteneur de la pile
	  	        cl.next(content);
	  	      }
	  	    });
	  			
	  	    Button bouton2 = new Button("Contenu par indice");
	  	    //Définition de l'action du bouton2
	  	    bouton2.addActionListener(new ActionListener(){
	  	      public void actionPerformed(ActionEvent event){				
	  	        if(++indice > 2)
	  	          indice = 0;
	  	        //Via cette instruction, on passe au conteneur correspondant au nom fourni en paramètre
	  	        cl.show(content, listContent[indice]);
	  	      }
	  	    });
	  			
	  	    boutonPane.add(bouton);
	  	    boutonPane.add(bouton2);
	  	    //On définit le layout
	  	    content.setLayout(cl);
	  	    //On ajoute les cartes à la pile avec un nom pour les retrouver
	  	    content.add(card1, listContent[0]);
	  	    content.add(card2, listContent[1]);
	  	    content.add(card3, listContent[2]);

	  	    this.getContentPane().add(boutonPane, BorderLayout.NORTH);
	  	    this.getContentPane().add(content, BorderLayout.CENTER);
	  	    this.setVisible(true);
	  	  }	
	
	  	 public Frame(com.button.types.GridBagLayout griddy){
	  	    this.setTitle("GridBagLayout");
	  	    this.setSize(300, 160);
	  	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  	    this.setLocationRelativeTo(null);

	  	    //On crée nos différents conteneurs de couleur différente
	  	    Panel cell1 = new Panel();
	  	    cell1.setBackground(Color.YELLOW);
	  	    cell1.setPreferredSize(new Dimension(60, 40));		
	  	    Panel cell2 = new Panel();
	  	    cell2.setBackground(Color.red);
	  	    cell2.setPreferredSize(new Dimension(60, 40));
	  	    Panel cell3 = new Panel();
	  	    cell3.setBackground(Color.green);
	  	    cell3.setPreferredSize(new Dimension(60, 40));
	  	    Panel cell4 = new Panel();
	  	    cell4.setBackground(Color.black);
	  	    cell4.setPreferredSize(new Dimension(60, 40));
	  	    Panel cell5 = new Panel();
	  	    cell5.setBackground(Color.cyan);
	  	    cell5.setPreferredSize(new Dimension(60, 40));
	  	    Panel cell6 = new Panel();
	  	    cell6.setBackground(Color.BLUE);
	  	    cell6.setPreferredSize(new Dimension(60, 40));
	  	    Panel cell7 = new Panel();
	  	    cell7.setBackground(Color.orange);
	  	    cell7.setPreferredSize(new Dimension(60, 40));
	  	    Panel cell8 = new Panel();
	  	    cell8.setBackground(Color.DARK_GRAY);
	  	    cell8.setPreferredSize(new Dimension(60, 40));
	  			
	  	    //Le conteneur principal
	  	    Panel content = new Panel();
	  	    content.setPreferredSize(new Dimension(300, 120));
	  	    content.setBackground(Color.WHITE);
	  	    //On définit le layout manager
	  	    content.setLayout(new GridBagLayout());
	  			
	  	    //L'objet servant à positionner les composants
	  	    GridBagConstraints gbc = new GridBagConstraints();
	  			
	  	    //On positionne la case de départ du composant
	  	    gbc.gridx = 0;
	  	    gbc.gridy = 0;
	  	    //La taille en hauteur et en largeur
	  	    gbc.gridheight = 1;
	  	    gbc.gridwidth = 1;
	  	    content.add(cell1, gbc);
	  	    //---------------------------------------------
	  	    gbc.gridx = 1;
	  	    content.add(cell2, gbc);
	  	    //---------------------------------------------
	  	    gbc.gridx = 2;		
	  	    content.add(cell3, gbc);		
	  	    //---------------------------------------------
	  	    //Cette instruction informe le layout que c'est une fin de ligne
	  	    gbc.gridwidth = GridBagConstraints.REMAINDER;
	  	    gbc.gridx = 3;	
	  	    content.add(cell4, gbc);
	  	    //---------------------------------------------
	  	    gbc.gridx = 0;
	  	    gbc.gridy = 1;
	  	    gbc.gridwidth = 1;
	  	    gbc.gridheight = 2;
	  	    //Celle-ci indique que la cellule se réplique de façon verticale
	  	    gbc.fill = GridBagConstraints.VERTICAL;
	  	    content.add(cell5, gbc);
	  	    //---------------------------------------------
	  	    gbc.gridx = 1;
	  	    gbc.gridheight = 1;
	  	    //Celle-ci indique que la cellule se réplique de façon horizontale
	  	    gbc.fill = GridBagConstraints.HORIZONTAL;
	  	    gbc.gridwidth = GridBagConstraints.REMAINDER;
	  	    content.add(cell6, gbc);
	  	    //---------------------------------------------
	  	    gbc.gridx = 1;
	  	    gbc.gridy = 2;
	  	    gbc.gridwidth = 2;
	  	    content.add(cell7, gbc);
	  	    //---------------------------------------------
	  	    gbc.gridx = 3;
	  	    gbc.gridwidth = GridBagConstraints.REMAINDER;
	  	    content.add(cell8, gbc);
	  	    //---------------------------------------------
	  	    //On ajoute le conteneur
	  	    this.setContentPane(content);
	  	    this.setVisible(true);		
	  	  }
	
	
	
}
