package WarmUp;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Challenge extends JPanel {

	public Challenge(Color bk) {
	  setBackground(bk);
	  
	}//end constructor
	
   public static void main(String[] args){
	      JFrame theGUI = new JFrame();
	      theGUI.setTitle("GUI Example");
	     
	      theGUI.setSize(10 * 50, 15 * 50);
	      theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	      Container pane = theGUI.getContentPane();
	      pane.setLayout(new GridLayout(10, 15));
	     
	      Random gen = new Random();
	     
	      for (int i = 1; i < 150; i++){
	         int red = gen.nextInt(256);
	         int green = gen.nextInt(256);
	         int blue = gen.nextInt(256);
	         Color backColor = new Color(red, green, blue);
	         Challenge panel = new Challenge(backColor);
	         pane.add(panel);
	      }//end for
	      
	      theGUI.setVisible(true);
	   }//end main

}//end class