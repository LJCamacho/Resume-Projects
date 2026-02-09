package WarmUp;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlagofMauritius {

	public static void main(String[] args) {
		JFrame flag = new JFrame();
		flag.setSize(300,200);
		flag.setTitle("my borders");
		flag.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		JPanel red = new JPanel (); 		red.setBackground(Color.red);
		JPanel blue = new JPanel (); 		blue.setBackground(Color.blue);
		JPanel yellow = new JPanel (); 	yellow.setBackground(Color.yellow);
		JPanel green = new JPanel (); 	green.setBackground(Color.green);

		
		Container Mauritius = flag.getContentPane();
		Mauritius.setLayout (new GridLayout (4,1));
		Mauritius.add(red);
		Mauritius.add(blue);
		Mauritius.add(yellow);
		Mauritius.add(green);

		
		flag.setVisible (true);
		
	}//end main
}//end class
