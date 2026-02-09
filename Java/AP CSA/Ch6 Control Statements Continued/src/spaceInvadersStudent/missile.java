package spaceInvadersStudent;

import java.awt.*;

import javax.swing.*;

public class missile {
	private int x, y, b, h;
	private Color c;
	private boolean fire;
	private ImageIcon img;
	
	
	public missile(int x, int y,ImageIcon img) {
		super();
		this.x = x;
		this.y = y;
		this.img = img;
		fire = false;
		b = img.getIconWidth();
		h = img.getIconHeight();
	}
	
	public void draw(Graphics g) {
		
		//g.setColor(Color.red);
		//g.fillRect(x, y, 4, 10);
		  img.paintIcon(null, g, x, y);

	}

	public void move(int dx, int dy) {
		x+=dx; y+=dy;
	}
	
	public boolean hitMeteor(meteor m) {
		if( x-150 <= m.getX() +m.getR() &&
			x + b-100 >= m.getX() &&
			y >= m.getY() &&
			y <= m.getY()+m.getR())
			return true;
		return false;
	}//hitMeteor
	
	
	public int getX() {return x;}
	public void setX(int x) {this.x = x;}
	public int getY() {return y;}
	public void setY(int y) {this.y = y;}
	public int getB() {return b;}
	public void setB(int b) {this.b = b;}
	public int getH() {return h;}
	public void setH(int h) {this.h = h;}
	public Color getC() {return c;}
	public void setC(Color c) {this.c = c;}
	public boolean isFire() {return fire;}
	public void setFire(boolean fire) {this.fire = fire;}
	public ImageIcon getImg() {return img;}
	public void setImg(ImageIcon img) {this.img = img;}
	
	
}//end missile
