package spaceInvadersStudent;

import java.awt.*;

import javax.swing.*;

public class ship {
  //instance variable
	private int x, y, b, h;
	private missile m1;
	private ImageIcon img;
	
	public ship(int x, int y, ImageIcon img) {
		this.x = x;
		this.y = y;
		this.img = img;
		b = img.getIconWidth();
		h = img.getIconHeight();
		m1 = new missile((int) (x+b/2),y, new ImageIcon((ClassLoader.getSystemResource("missile.png"))));
	}//end constructor
	
	public boolean hitMeteor(meteor m) {
		return m1.hitMeteor(m);
	}
	
	public void moveMissile() {m1.move(0, -15);}
	
	public void getMissileCoordinates(int mx, int my) {
		m1.setX(mx);
		m1.setY(my);
	}
	public boolean getLaunch() {return m1.isFire();}
	public void launchMissile(boolean b) {
		m1.setFire(b);
	}
	public void drawMissile(Graphics g) {
		m1.draw(g);
	}
	
	public void draw(Graphics g) {
		img.paintIcon(null, g, x, y);
	}
	
	public void move (int dx, int dy) {
		x = x + dx;
		y = y + dy;
	}//end move
	
	
	public int getX() {return x;}
	public void setX(int x) {this.x = x;}
	public int getY() {return y;}
	public void setY(int y) {this.y = y;}
	public int getB() {return b;}
	public void setB(int b) {this.b = b;}
	public int getH() {return h;}
	public void setH(int h) {this.h = h;}
	public missile getM1() {return m1;}
	public void setM1(missile m1) {this.m1 = m1;}
	public ImageIcon getImg() {return img;}
	public void setImg(ImageIcon img) {this.img = img;}
	
	public int getYMissile() {return m1.getY();}
    
    public void resetMissile() {
    	m1.setX(x+b/2); m1.setY(y);m1.setFire(false);
    }//reset
    
    
    
  
    
    
}//end ship

