package potatoHead;

import javax.swing.*;
import java.awt.*;

public class potatoHeadApp {
	public static void main(String[] args) {

		
		JFrame f = new JFrame();
		f.setTitle("My Potato Head Project");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		ColorPanel p = new ColorPanel(Color.DARK_GRAY);
		
		Container c = f.getContentPane();
		c.add(p);
		
		f.setExtendedState(JFrame.MAXIMIZED_BOTH);
		f.setVisible(true);
		
		
	}//end main
	
}//end app
