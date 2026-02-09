package simpleGame;

import java.awt.Graphics;

import javax.swing.*;

public class TheGuy {
	//instance variables
	private int x, y, b, h;
	private ImageIcon img;
	
	public TheGuy(int x, int y, ImageIcon img) {
		this.x = x;
		this.y = y;
		this.img = img;
		b = img.getIconWidth();
		h = img.getIconHeight();
	}//end constructor
	
	
	public void move (int dx, int dy) {
		x = x + dx;
		y = y + dy;
	}//end move
	
	public void resetCharacter() {
		x = 500;
		y = 350;
	}
	public boolean getHit(Enemies e) {
		if (x <= e.getX()+e.getB() && x+b>= e.getX() && y <= e.getY()+e.getH() && y+h >= e.getY())
			return true;
		return false;
	}
	public void draw(Graphics g) {img.paintIcon(null, g, x, y);}
	public int getX() {return x;}
	public void setX(int x) {this.x = x;}
	public int getY() {return y;}
	public void setY(int y) {this.y = y;}
	public int getB() {return b;}
	public void setB(int b) {this.b = b;}
	public int getH() {return h;}
	public void setH(int h) {this.h = h;}
	public ImageIcon getImg() {return img;}
	public void setImg(ImageIcon img) {this.img = img;}
	
}
