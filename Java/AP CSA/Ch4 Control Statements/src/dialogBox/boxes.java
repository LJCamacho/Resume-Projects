package dialogBox;

import javax.swing.*;

import java.awt.*;
import java.util.Random;

public class boxes {
	public static void main(String[] args) {

		JFrame banana = new JFrame ();
		banana.setTitle("my banana boxes");
		String str = JOptionPane.showInputDialog("number of rows","5");
		if (str == null) return;
		int row = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("number of columns","5");
		if (str == null) return;
		int col = Integer.parseInt(str);
		
		banana.setSize(col*50, row*50);
		banana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container butternut = banana.getContentPane();
		butternut.setLayout(new GridLayout(row,col));
		Random gen = new Random();
		
		for(int i=1; i<= row*col; i++) {
			int red = gen.nextInt(255);
			int green = gen.nextInt(255);
			int blue = gen.nextInt(255);
			Color backColor = new Color(red,green,blue);
			mauro cutie= new mauro (backColor);
			butternut.add(cutie);
		}//end for
		
		banana.setVisible(true);

			
		
	}//end main
	
	
	
	
 }//end class
	 class mauro extends JPanel{
		public mauro(Color bk) {
		setBackground(bk);
		}
	}	
