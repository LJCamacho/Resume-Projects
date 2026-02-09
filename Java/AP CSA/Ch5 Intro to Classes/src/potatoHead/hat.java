package potatoHead;

import javax.swing.*;
import java.awt.*;

public class hat {
			//instance variables
			private int centerX, centerY;
			private Color color;
			
			public hat(int x, int y) {
				centerX = x;
				centerY = y;
				color = Color.white;
			}//end constructor

			public void draw (Graphics g) {
				g.setColor(Color.black);
				g.fillRect(centerX, centerY, 350, 100);
				g.fillRect(centerX+100, centerY-100, 150, 100);

			}//end draw
			

			public boolean containsPoint(int x, int y) {
				
				if(x >= centerX-(centerX/3) && x <= centerX+(centerX/3) &&
					y >= centerY-(centerY/3) && y <= centerY+(centerY/3))
						return true;
				return false;
				
						
			}//end containsPoint
			
			public void move(int xAmount, int yAmount) {
				centerX = centerX + xAmount;
				centerY = centerY + yAmount;
			}
					
					
			
}//end hat