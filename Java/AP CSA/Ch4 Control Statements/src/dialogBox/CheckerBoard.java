package dialogBox;

import javax.swing.*;

import java.awt.*;
import java.util.Random;

public class CheckerBoard {
	public static void main(String[] args) {

		JFrame banana = new JFrame ();
		banana.setTitle("Checkerboard");
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
		
		boolean even = false;
		if (row*col % 2 == 0) even = true;
		
		
		for(int i=1; i<= row*col; i++) {
				mauro2 m = new mauro2(Color.red);
				
				//odd
				if (even != true) {
					if (i % 2== 0)
						m.setBackground(Color.black);
					else
						m.setBackground(Color.red);
				}else { //even
					if (n==1) {
						if (i % 2== 0)
							m.setBackground(Color.black);
						else
							m.setBackground(Color.red);
					}
					
					
				}//end if (odd/even)
				
				butternut.add(m);
				
				
				
		}//end for
		
		banana.setVisible(true);	
		
		
	}//end main
	
 }//end class
class mauro2 extends JPanel{
		public mauro2(Color bk) {
			setBackground(bk);
		}
		
}	
