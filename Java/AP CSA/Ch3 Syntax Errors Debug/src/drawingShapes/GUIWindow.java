package drawingShapes;

import javax.swing.*;
import java.awt.*;

public class GUIWindow {
	public static void main(String[] args) {
			JFrame ryan = new JFrame ();
			ryan.setTitle("shapes");
			ryan.setSize(800,600);
			ryan.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
			
			ColorPanel panel = new ColorPanel(Color.WHITE);
			myPanel temple = new myPanel(Color.LIGHT_GRAY);
			
			Container pane = ryan.getContentPane();
			pane.setLayout(new GridLayout (2,3));
			
			pane.add(panel);
			pane.add(temple);
			
			ryan.setVisible(true);
	
	
	}//end main
}//end class
