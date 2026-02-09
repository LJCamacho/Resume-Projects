package potatoHead;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ColorPanel extends JPanel {
	//instance variables
	private int x, y;
	private eye e1, e2, selectedEye;
	private hat h1, selectedHat;
	private mouth m1, selectedMouth;
	private hands ha1, ha2, selectedHands;
	private shoes s1, s2, selectedShoe;
	private Handed handed1, selectedHanded;
	
	public ColorPanel (Color bk) {
		setBackground(bk);
		
		e1 = new eye(200, 200, 50);
		e2 = new eye(300, 400, 50);
		h1 = new hat(900, 300);
		m1 = new mouth(100, 100, 30);
		ha1 = new hands(500, 500);
		handed1 = new Handed(700, 500); 
		s1 = new shoes(500, 700);
		s2 = new shoes(300, 700);

		selectedEye = null;
		selectedHat = null;
		selectedMouth = null;
		selectedHands = null;
		selectedHanded = null;
		selectedShoe = null;
		
		x = 100; y = 100;
		
		addMouseListener(new PanelListener()	);
		addMouseMotionListener(new pml());
		
 	}//end ColorPanel
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(new Color(153, 102, 0));
		g.fillOval(500, 375, 400, 300);
		g.fillOval(550, 250, 300, 300);

		e1.draw(g);
		e2.draw(g);
		h1.draw(g);
		m1.draw(g);
		ha1.draw(g);
		handed1.draw(g);
		s1.draw(g);
		s2.draw2(g);
	}//end paintComponent
	
	private class pml extends MouseMotionAdapter {
		public void mouseDragged(MouseEvent e) {
			int newX = e.getX();
			int newY = e.getY();
			int dx = newX - x;
			int dy = newY - y;
			if(selectedEye != null) {
				selectedEye.move(dx, dy);
			}
			if(selectedHat != null) {
				selectedHat.move(dx, dy);
			}
			if(selectedMouth != null) {
				selectedMouth.move(dx, dy);
			}
			if(selectedHands != null) {
				selectedHands.move(dx, dy);
			}
			if(selectedHanded != null) {
				selectedHanded.move(dx, dy);
			}
			if(selectedShoe != null) {
				selectedShoe.move(dx, dy);
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
			
			if (e1.containsPoint(x,y))
				selectedEye = e1;
			else if (e2.containsPoint(x,y))
				selectedEye = e2;
			if (h1.containsPoint(x,y))
				selectedHat = h1;
			if (m1.containsPoint(x,y))
				selectedMouth = m1;
			if (ha1.containsPoint(x,y))
				selectedHands= ha1;
			else if (handed1.containsPoint(x,y))
				selectedHanded= handed1;
			if (s1.containsPoint(x,y))
				selectedShoe= s1;
			else if (s2.containsPoint(x,y))
				selectedShoe= s2;
			repaint();
		}//end mousePressed
		
		public void mouseReleased (MouseEvent e) {
			x = e.getX();
			y = e.getY();
			selectedEye = null;
			selectedHat = null;
			selectedHands = null;
			selectedMouth = null;
			selectedHanded = null;
			selectedShoe = null;
		}//end mouseRelease
		
		
	}//end PanelListener
	
}//end ColorPanel
