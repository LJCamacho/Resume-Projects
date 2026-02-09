package guiDrawingMultipleShapes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class ColorPanel extends JPanel {

	private Shape database[];
	private Shape selectedShape;
	private int x, y;
	
	public ColorPanel(Color backColor) {
		setBackground(backColor);
		Random gen = new Random();
		
		database = new Shape[10];
		
		for (int i = 0; i < database.length; i++) {
			Color color = new Color(gen.nextInt(256), 
											gen.nextInt(256), 
											gen.nextInt(256));
			
			Shape s;
			if(gen.nextInt(3)==1)
				s = new circle(i*40, 100, 25, color);
			else if(gen.nextInt(3)==2)
				s = new rectangle(i*40, 100, 50, 50, color);
			else
				s = new RightTriangle(i*40, 100, 50, 50, color);
			
			database[i] = s;
		}//end for
		
		selectedShape = null;
		addMouseListener(new PanelListener());
		addMouseMotionListener(new PanelMotionListener());
		
	}//end constructor
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(Shape c: database)
			c.fill(g);
	}//end paintComponent
	
	private class PanelListener extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			x = e.getX();
			y = e.getY();
			
			for(int i = database.length-1; i >= 0; i--) {
				
				if(database[i].containsPoint(x, y)) {
					selectedShape = database[i];
					break;
				}//end if
			}//end for			
		}//end mousePressed
		
		public void mouseReleased (MouseEvent e) {
			x = e.getX();
			y = e.getY();
			selectedShape = null;
			
		}//end mouseReleased
		
	}//end Listener
	
	private class PanelMotionListener extends MouseMotionAdapter{
		public void mouseDragged (MouseEvent e) {
			int newX = e.getX();
			int newY = e.getY();
			int dx = newX-x;
			int dy = newY - y;
			
			if (selectedShape != null)
				selectedShape.move(dx, dy);
			
			x = newX;
			y = newY;
			repaint();
			
		}//end mouseDragged
		
		
	}//end PanelMotionListener
	
	
}//end colorPanel
