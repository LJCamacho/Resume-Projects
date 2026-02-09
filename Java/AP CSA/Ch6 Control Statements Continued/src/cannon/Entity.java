package cannon;

import javax.swing.*;

import java.awt.*;

public class Entity {
	//variables
	private int x,y,r;
	private Color c;
	private double angle, tx, ty;
	private Bullet b1;
	
	public Entity(int x, int y, Color c) {
		this.x = x; this.y = y; this.c = c;
		r = 100;
		angle = 3*Math.PI/2;
		b1 = new Bullet(x, y);
				
	}//end constructor
	
	public void getFiringCoordinates() {
		
		b1.setX((int)(x+tx));
		b1.setY((int) (y+ty)	);		
		b1.setAngle(getAngle());
		b1.setFire(true);
	}
	public boolean getFiring() {return b1.isFire();}
	public void fireBullet() {b1.move();}
	
	public void move (int dx, int dy) {
		x+= dx;
		y+=dy;
	}
	
	public void drawBullet(Graphics g) {b1.draw(g);}
	
	public void draw(Graphics g) {
		
		
		g.setColor(Color.white);
		getCoordinates();
		g.drawLine(x, y, (int)(tx+x),(int) (ty+y));
		g.setColor(c);
		g.fillOval(x-r/2, y-r/2, r, r);
	}//end draw
	
	public void getCoordinates() {
		tx = r*Math.cos(angle); 
		ty = r*Math.sin(angle);		
	}
	
	public int getX() {return x;}
	public void setX(int x) {this.x = x;}
	public int getY() {return y;}
	public void setY(int y) {this.y = y;}
	public int getR() {return r;}
	public void setR(int r) {this.r = r;}
	public Color getC() {return c;}
	public void setC(Color c) {this.c = c;}
	public double getAngle() {return angle;}
	public void setAngle(double angle) {this.angle = angle;}
	public double getTx() {return tx;}
	public void setTx(double tx) {this.tx = tx;}
	public double getTy() {return ty;}
	public void setTy(double ty) {this.ty = ty;}
	public Bullet getB1() {return b1;}
	public void setB1(Bullet b1) {this.b1 = b1;}
	
	
	
	
}//end Entity