package clickDragCircle;

import javax.swing.*;
import java.awt.*;

public class mouseApp {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setTitle("Click n Drag");
		f.setSize(800,800);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ColorPanel p = new ColorPanel(Color.white);
				
		Container c = f.getContentPane();
		c.add(p);
		
		f.setVisible(true);
		
		
		
		
		
	}//end main
	
}
