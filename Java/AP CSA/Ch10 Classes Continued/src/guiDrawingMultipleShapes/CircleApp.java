package guiDrawingMultipleShapes;

import javax.swing.*;
import java.awt.*;

public class CircleApp {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(800, 500);
		frame.setTitle("Circles");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ColorPanel p = new ColorPanel(Color.DARK_GRAY);
		
		Container c = frame.getContentPane();
		c.add(p);
		
		frame.setVisible(true);
		
	}//end main
}//end class
