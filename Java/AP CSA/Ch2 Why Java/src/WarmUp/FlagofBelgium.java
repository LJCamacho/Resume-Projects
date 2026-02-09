package WarmUp;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlagofBelgium {

	public static void main(String[] args) {
		JFrame flag = new JFrame();
		flag.setSize(300,200);
		flag.setTitle("my borders");
		flag.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		JPanel white = new JPanel (); 		white.setBackground(Color.white);
		JPanel red = new JPanel (); 		red.setBackground(Color.red);
		JPanel green = new JPanel (); 	green.setBackground(Color.green);
		
		
		Container Belgium = flag.getContentPane();
		Belgium.setLayout (new GridLayout (3,1));
		Belgium.add(white);
		Belgium.add(red);
		Belgium.add(green);
		
		
		flag.setVisible (true);
		
	}//end main
}//end class
