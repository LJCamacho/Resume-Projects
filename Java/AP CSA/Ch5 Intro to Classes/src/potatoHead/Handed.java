package potatoHead;

import java.awt.Color;
import java.awt.Graphics;

public class Handed {
	//instance variables
	private int centerX, centerY;
	private Color color;
	
	public Handed(int x, int y) {
		centerX = x;
		centerY = y;
		color = Color.white;
	}//end constructor

	public void draw (Graphics g) {
		g.setColor(color);
		g.fillRect(centerX, centerY-50, 100, 50);
		g.fillRect(centerX-100, centerY, 200, 100);
		g.setColor(Color.black);
		g.drawLine(centerX, centerY+50, centerX-100, centerY+50);
		g.drawLine(centerX, centerY+20, centerX-100, centerY+20);
	
	}//end draw
	

	public boolean containsPoint(int x, int y) {
		
		if(x >= centerX-(centerX/7) && x <= centerX+(centerX/7) &&
			y >= centerY-(centerY/7) && y <= centerY+(centerY/7))
				return true;
		return false;
		
				
	}//end containsPoint
	
	public void move(int xAmount, int yAmount) {
		centerX = centerX + xAmount;
		centerY = centerY + yAmount;
	}
			
			
	
}//end hands