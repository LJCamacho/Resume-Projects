package drawingShapes;

import javax.swing.*;

import java.awt.*;

public class ComicB extends JPanel {

	public ComicB (Color backColor)   {
		setBackground (backColor);
	}//end constructor
	
	public void paintComponent (Graphics g)  {
		super.paintComponent(g);
		
		
		//stickman1
				g.setColor(Color.black);
				g.fillOval (10, 100, 45, 45);
				g.setColor (Color.white);
				g.fillOval (20,110, 10, 10);
				g.fillOval (40,110, 10, 10);
				g.drawArc(13, 138, 30, 10, 45, 45);
				g.setColor(Color.black);
				g.drawLine(32, 145, 32, 200);
				g.drawLine(32, 165, 16, 165);
				g.drawLine(32, 165, 48, 165);
				g.drawLine(32, 200, 16, 225);
				g.drawLine(32, 200, 48, 225);
				
				Font header = new Font("Comic", Font.PLAIN, 16);
				Font body = new Font("Courier", Font.ITALIC +Font.BOLD, 20 );
				
				
				g.setFont(header); g.setColor (Color.black);
				//sad guy
				g.drawString("Wait wha-where are your legs?", 30, 50);
				g.drawString("Excuse me what?", 30, 250);
				g.setFont(body);
				g.drawString("Never had em", 260, 70);
				
				//stickman2
				g.setColor(Color.black);
				g.fillOval (250, 100, 45, 45);
				g.setColor (Color.white);
				g.fillOval (255,110, 10, 10);
				g.fillOval (275,110, 10, 10);
				g.drawLine (260, 138, 280, 138);
				g.setColor(Color.black);
				g.drawLine(282, 145, 282, 200);
				g.drawLine(282, 165, 266, 165);
				g.drawLine(282, 165, 298, 165);
		

		
		
		
		
		
		
		
		
		
	}//end method	

	}//end class
