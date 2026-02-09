package clickDragCircle;

import javax.swing.*;
import java.awt.*;

public class eye {
		//instance variables
		private int centerX, centerY, radius;
		private Color color;
		
		public eye(int x, int y, int r) {
			centerX = x;
			centerY = y;
			radius = r;
			color = Color.white;
		}//end constructor

		public void draw (Graphics g) {
			Color oldColor = g.getColor();
			g.setColor(color);
			g.fillOval(centerX-radius, centerY-radius, (int)(radius*1.5), radius*2);
			g.setColor(Color.black);
			g.fillOval(centerX-radius+10, centerY, (int)radius*1, radius);
			
			g.setColor(oldColor);
		}//end draw
		

		public boolean containsPoint(int x, int y) {
			
			if(x >= centerX-radius && x <= centerX +(int)(radius) &&
				y >= centerY-radius && y <= centerY+ radius*1)
					return true;
			return false;
			
					
		}//end containsPoint
		
		public void move(int xAmount, int yAmount) {
			centerX = centerX + xAmount;
			centerY = centerY + yAmount;
			
			
		}
				
				
		
}//end circle
