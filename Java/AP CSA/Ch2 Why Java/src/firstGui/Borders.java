package firstGui;

import javax.swing.*;
import java.awt.*;

public class Borders {
	public static void main(String[] args) {
		
		JFrame drew = new JFrame();
		drew.setSize(300,200);
		drew.setTitle("my borders");
		drew.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		
		JPanel adam = new JPanel (); 		adam.setBackground(Color.pink);
		JPanel matt = new JPanel (); 		matt.setBackground(Color.green);
		JPanel justin = new JPanel (); 	justin.setBackground(Color.pink);
		JPanel logan = new JPanel (); 		logan.setBackground(Color.green);
		JPanel mauro = new JPanel();     mauro.setBackground(Color.BLACK);
		Container michael = drew.getContentPane();
		michael.add (adam, BorderLayout.NORTH);
		michael.add (matt, BorderLayout.WEST);
		michael.add (justin, BorderLayout.SOUTH);
		michael.add (logan, BorderLayout.EAST);
		michael.add (mauro, BorderLayout.CENTER);
		
		drew.setVisible (true);
		
		
	}//end main

}//end main
