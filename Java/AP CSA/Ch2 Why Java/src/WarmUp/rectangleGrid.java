package WarmUp;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class rectangleGrid {

	public static void main(String[] args) {
		JFrame shape = new JFrame();
		shape.setSize(300,200);
		shape.setTitle("my borders");
		shape.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		JPanel a = new JPanel (); 		a.setBackground(Color.black);
		JPanel b = new JPanel (); 		b.setBackground(Color.white);
		JPanel c = new JPanel (); 		c.setBackground(Color.black);
		JPanel d = new JPanel (); 		d.setBackground(Color.white);
		JPanel e = new JPanel (); 		e.setBackground(Color.black);
		JPanel f = new JPanel (); 		f.setBackground(Color.white);
		JPanel g = new JPanel (); 		g.setBackground(Color.black);
		JPanel h = new JPanel (); 		h.setBackground(Color.white);
		JPanel i = new JPanel (); 		i.setBackground(Color.black);


		
		Container square = shape.getContentPane();
		square.setLayout (new GridLayout (3,3));
		square.add(a);
		square.add(b);
		square.add(c);
		square.add(d);
		square.add(e);
		square.add(f);
		square.add(g);
		square.add(h);
		square.add(i);
		
		shape.setVisible (true);
		
	}//end main
}//end class
