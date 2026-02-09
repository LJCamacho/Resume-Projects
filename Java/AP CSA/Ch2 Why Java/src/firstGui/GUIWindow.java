package firstGui;

import javax.swing.*;
import java.awt.*;

public class GUIWindow {

	public static void main(String[] args) {
		
		JFrame theGUI = new JFrame();
		theGUI.setTitle("First GUI Program");
		theGUI.setSize(1200,800);
		theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 0, 255));
		
		Container pane = theGUI.getContentPane();
		pane.add(panel);
		
		theGUI.setVisible(true);
	
	
	}//end main
}//end class
