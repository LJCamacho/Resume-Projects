package firstGui;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class myGridLayout {

	public static void main(String[] args) {
		JFrame drew = new JFrame();
		drew.setSize(300,200);
		drew.setTitle("my borders");
		drew.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		JPanel adam = new JPanel (); 		adam.setBackground(Color.pink);
		JPanel matt = new JPanel (); 		matt.setBackground(Color.green);
		JPanel justin = new JPanel (); 	justin.setBackground(Color.orange);
		JPanel logan = new JPanel (); 		logan.setBackground(Color.red);
		
		
		Container michael = drew.getContentPane();
		michael.setLayout (new GridLayout (3,1));
		michael.add(adam);
		michael.add(matt);
		michael.add(justin);
		michael.add(logan);
		
		drew.setVisible (true);
	
	}//end main
}//end class
