package drawingShapes;

import javax.swing.*;

import java.awt.*;

public class ColorPanel  extends JPanel {

	public ColorPanel (Color backColor)   {
		setBackground (backColor);
	}//end constructor
	
	public void paintComponent (Graphics g)  {
		super.paintComponent(g);
		
		g.setColor(Color.blue);
		g.drawRect (10, 5, 120, 20);
		g.setColor (Color.red);
		g.drawString ("Hello World!", 20,20);
		
		g.setColor (Color.green);
		g.drawLine(50, 75, 100, 78);
		
		g.setColor(Color.orange);
		g.fillOval (100, 100, 35, 45);
		
		g.setColor(Color.MAGENTA);
		g.drawArc(200, 10, 25, 55, 0, 90);
		
		g.setColor(Color.red);
		g.fillRoundRect(200, 75, 80, 40, 20, 20);
		
		Font header = new Font("Arial", Font.BOLD, 16);
		Font body = new Font("Courier", Font.ITALIC +Font.BOLD, 20 );
		
		
		g.setFont(header); g.setColor (Color.black);
		//wrote the header
		g.drawString("JAVA!!", 300, 50);
		
		//body
		g.setFont(body); g.setColor(Color.DARK_GRAY);
		g.drawString("period: 7/8", 300, 60);
		
	}//end method	

	}//end class
