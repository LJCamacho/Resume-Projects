package dialogBox;

import java.awt.*;
import java.util.*;
import java.io.*;
import javax.swing.*;
    
   	
 public class illusion
{
    public static void main(String [] args)
   {
      JFrame theGUI = new JFrame();
      theGUI.setTitle("Induced Contrast");
      theGUI.setSize(400, 250);
      theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      illusion2 panel = new illusion2(Color.black);
      JPanel panel1 = new illusion2(Color.black);
      panel1.setPreferredSize(new Dimension(200, 200));
      JPanel panel2 = new illusion2(Color.white);
   
      Container pane = theGUI.getContentPane();
      pane.setLayout(new GridLayout(1, 2));
      pane.add(panel1);
      pane.add(panel2);
   
      theGUI.setVisible(true);
   }
}
 class illusion2 extends JPanel
{
    public illusion2(Color backColor)
   {
      setBackground(backColor);
   }
   
    public void paintComponent(Graphics g)
   {
      super.paintComponent(g);     	
      g.setColor(Color.gray);  
      g.fillRect(50, 50, 100, 100);
         
   }
}