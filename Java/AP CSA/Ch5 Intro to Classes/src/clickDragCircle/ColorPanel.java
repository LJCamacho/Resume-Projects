package clickDragCircle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ColorPanel extends JPanel {
	//instance variables
	private circle c1, c2, c3, c4;
	private circle selectedCircle;
	private int x, y;
	
	public ColorPanel (Color bk) {
		setBackground(bk);
		c1 = new circle(200, 100, 25, Color.red);
		c2 = new circle(100, 100, 50, Color.blue);
		c3 = new circle(300, 100, 100, Color.green);
		c4 = new circle(500, 100, 20, Color.orange);

		selectedCircle = null;
		x = 100; y = 100;
		
		addMouseListener(new PanelListener()	);
		addMouseMotionListener(new pml());
		
 	}//end ColorPanel
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		c1.fill(g);
		c2.draw(g);
		c3.fill(g);
		c4.fill(g);
		//g.drawString(" ("+x+", "+y+")", x, y);
		
	}//end paintComponent
	
	private class pml extends MouseMotionAdapter {
		public void mouseDragged(MouseEvent e) {
			int newX = e.getX();
			int newY = e.getY();
			int dx = newX - x;
			int dy = newY - y;
			
			if(selectedCircle != null) {
				selectedCircle.move(dx, dy);
			}
			x = newX;
			y = newY;
			repaint();
			
		}//end mouseDragged
	}//end pml
	
	
	private class PanelListener extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			x = e.getX();
			y = e.getY();
			if (c1.containsPoint(x, y))
				selectedCircle = c1;
			else 
				if (c2.containsPoint(x,y))
				selectedCircle = c2;
			else
				if (c3.containsPoint(x, y))
				selectedCircle = c3;
			else 
				if (c4.containsPoint(x,y))
				selectedCircle = c4;
			
			
			repaint();
		}//end mousePressed
		
		public void mouseRelease (MouseEvent e) {
			x = e.getX();
			y = e.getY();
			selectedCircle = null;
		}//end mouseRelease
		
		
	}//end PanelListener
	
}//end ColorPanel
