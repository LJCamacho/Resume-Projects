package WarmUp;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlagofFrance {

	public static void main(String[] args) {
		JFrame flag = new JFrame();
		flag.setSize(300,200);
		flag.setTitle("my borders");
		flag.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		JPanel blue = new JPanel (); 		blue.setBackground(Color.blue);
		JPanel white = new JPanel (); 		white.setBackground(Color.white);
		JPanel red = new JPanel (); 	red.setBackground(Color.red);
		
		
		Container France = flag.getContentPane();
		France.setLayout (new GridLayout (1,3));
		France.add(blue);
		France.add(white);
		France.add(red);
		
		
		flag.setVisible (true);
	}//end main
}//end class
