package potatoHead;

import java.awt.Color;
import java.awt.Graphics;

public class mouth {
	//instance variables
	private int centerX, centerY, radius;
	private Color color;
	
	public mouth(int x, int y, int r) {
		centerX = x;
		centerY = y;
		radius = r;
		color = Color.red;
	}//end constructor

	public void draw (Graphics g) {
		g.setColor(color);
		g.fillOval(centerX-radius, centerY-radius, radius*2, (int)(radius*1.5));
		g.setColor(Color.black);
		g.drawLine(centerX-radius, centerY-5, centerX+radius, centerY-5);
	}//end draw
	

	public boolean containsPoint(int x, int y) {
		
		if(x >= centerX-radius && x <= centerX +(int)(radius) &&
			y >= centerY-radius && y <= centerY+ radius)
				return true;
		return false;
		
				
	}//end containsPoint
	
	public void move(int xAmount, int yAmount) {
		centerX = centerX + xAmount;
		centerY = centerY + yAmount;
	}
			
			
	
}//end circle
