package drawingShapes;

import javax.swing.*;

import java.awt.*;

public class panel extends JPanel {;

		public panel (Color bk)  {
			setBackground(bk);
		}//end constructor
		
		public void paintComponent (Graphics g)    {
			super.paintComponent(g);
			int x = getWidth() / 2 - 60;
			int y = getHeight() / 2;
			g.setColor(Color.blue);
			g.drawRect(x, y, 120, 20);
			g.setColor(Color.red);
			Font font = new Font("Courier", Font.BOLD, 14);
			g.setFont(font);
			g.drawString("JAva rules!", x+10,y+15);
			
			
		}//end paintComponent

}//end myPanel
