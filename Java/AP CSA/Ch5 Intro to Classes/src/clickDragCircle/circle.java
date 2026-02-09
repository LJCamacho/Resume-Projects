package clickDragCircle;

import javax.swing.*;
import java.awt.*;

public class circle {
		//instance variables
		private int centerX, centerY, radius;
		private Color color;
		
		public circle(int x, int y, int r, Color c) {
			centerX = x;
			centerY = y;
			radius = r;
			color = c;
		}//end constructor

		public void draw (Graphics g) {
			Color oldColor = g.getColor();
			g.setColor(color);
			g.drawOval(centerX-radius, centerY-radius, radius*2, radius*2);
			g.setColor(oldColor);
		}//end draw
		
		public void fill (Graphics g) {
			Color oldColor = g.getColor();
			g.setColor(color);
			g.fillOval(centerX-radius, centerY-radius, radius*2, radius*2);
			g.setColor(oldColor);
		}//end draw
		
		public boolean containsPoint(int x, int y) {
			int xSquared = (x-centerX) * (x-centerX);
			int ySquared = (y-centerY) * (y-centerY);
			int radiusSquared = radius * radius;
			
			return xSquared + ySquared - radiusSquared <= 0;
						
		}//end containsPoint
		
		public void move(int xAmount, int yAmount) {
			centerX = centerX + xAmount;
			centerY = centerY + yAmount;
			
			
		}
				
				
		
}//end circle
