package potatoHead;

import java.awt.Color;
import java.awt.Graphics;

public class shoes {
	//instance variables
	private int centerX, centerY;
	private Color color;
	
	public shoes(int x, int y) {
		centerX = x;
		centerY = y;
		color = Color.blue;
	}//end constructor

	public void draw (Graphics g) {
		g.setColor(color);
		g.fillRect(centerX, centerY-50, 100, 50);
		g.fillRect(centerX, centerY, 200, 100);
		
	}//end draw
	public void draw2 (Graphics g) {
		g.setColor(color);
		g.fillRect(centerX, centerY-50, 100, 50);
		g.fillRect(centerX-100, centerY, 200, 100);
		
	}//end draw

	public boolean containsPoint(int x, int y) {
		
		if(x >= centerX-(centerX/5) && x <= centerX+(centerX/5) &&
			y >= centerY-(centerY/5) && y <= centerY+(centerY/5))
				return true;
		return false;
		
				
	}//end containsPoint
	
	public void move(int xAmount, int yAmount) {
		centerX = centerX + xAmount;
		centerY = centerY + yAmount;
	}
			
			
	
}//end shoes