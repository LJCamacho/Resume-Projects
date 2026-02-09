package drawingShapes;

import javax.swing.*;

import java.awt.*;

public class Comic  extends JPanel {

	public Comic (Color backColor)   {
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
		
		Font header = new Font("Comic", Font.PLAIN, 21);
		Font body = new Font("Courier", Font.ITALIC +Font.BOLD, 25 );
		
		
		g.setFont(header); g.setColor (Color.black);
		//sad guy
		g.drawString("Hey man", 30, 50);
		g.drawString("Yooooo wuss grillin g", 258 , 50);
		//stickman2
		g.setColor(Color.black);
		g.fillOval (350, 100, 45, 45);
		g.setColor (Color.white);
		g.fillOval (355,110, 10, 10);
		g.fillOval (375,110, 10, 10);
		g.drawLine (360, 138, 380, 138);
		g.setColor(Color.black);
		g.drawLine(382, 145, 382, 200);
		g.drawLine(382, 165, 366, 165);
		g.drawLine(382, 165, 398, 165);
		g.drawLine(382, 200, 366, 225);
		g.drawLine(382, 200, 398, 225);

		//disappointed face
		//g.drawArc(15, 140, 20, 10, 45, 45);

	}//end method	

	}//end class
