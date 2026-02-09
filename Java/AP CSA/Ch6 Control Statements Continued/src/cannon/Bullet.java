package cannon;

import java.awt.*;

public class Bullet {
	//variables
		private int x, y,r;
		private Color c;
		private double angle;
		private boolean fire;
		
	 //constructor
		public Bullet(int x, int y) {
		this.x = x; this.y = y;
		c = Color.red;
		fire = false;
		r = 10;
		}
	//methods
		public void draw(Graphics g) {
			getCoordinates();
			g.setColor(c);
			g.fillOval(x-r/2, y-r/2, r, r);
		}//end draw
		
		public void move() {
			x+= r*Math.cos(angle);
			y+= r*Math.sin(angle);
		}
		
		public void getCoordinates() {
			
			
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
		public boolean isFire() {return fire;}
		public void setFire(boolean fire) {this.fire = fire;}
		
	
		
	
	
	
}//end bullet