package animation;

import javax.swing.*;
import java.awt.*;

public class circle {
	//instance variables
	private int centerX, centerY, radius;
	private Color color;
	private int velocity, direction;
	private int rx = 1, ry = 1;
	
	public circle(int x, int y, int r, Color c) {
		centerX = x;
		centerY = y;
		radius = r;
		color = c;
		velocity = 0; 
		direction = 0;
	}//end constructor
	
	public int getX() {return centerX;}
	public int getY() {return centerY;}
	public int getRadius() {return radius;}
	public void setRX(int r) {rx = r;}
	public void setRY(int r) {ry = r;}
	public void reset() {
		rx = 1;
		ry = 1;
		centerX = 300;
		centerY = 100;
	}
	
	public void draw(Graphics g) {
		Color oldColor = g.getColor();
		g.setColor(color);
		g.drawOval(centerX - radius, centerY-radius, radius*2, radius*2);
		g.setColor(oldColor);			
	}//end draw
	
	public void fill(Graphics g) {
		Color oldColor = g.getColor();
		g.setColor(color);
		g.fillOval(centerX - radius, centerY-radius, radius*2, radius*2);
		g.setColor(oldColor);			
	}//end draw
	
	
	public boolean hit(rectangle r) {
		
		if(centerX-radius <= r.getX()+r.getBase() &&
		   centerX+radius >= r.getX() &&
		   centerY+radius >= r.getY() -5 &&
		   centerY+radius <= r.getY() +5)
			return true;
		return false;
		
		
	}//end hit
	
	public boolean containsPoint(int x, int y) {
		int xSquared = (x - centerX) * (x-centerX);
		int ySquared = (y - centerY) * (y - centerY);
		int radiuSquared = radius * radius;
		
		return xSquared + ySquared - radiuSquared <= 0;
		
	}//end constainsPoint
	
	public void move(int xAmount, int yAmount) {
		centerX = centerX + rx*xAmount;
		centerY = centerY + ry*yAmount;
		
		
	}//end move
	
	public void move() {
		move((int)(velocity*Math.cos(Math.toRadians(direction))),
				(int)(velocity*Math.sin(Math.toRadians(direction))));
	}//end move
	
	public void setVelocity(int v) {
		velocity = v;
	}//end 
	
	public void setDirection(int degrees) {
		
		direction = degrees % 360;
	}//end 
	
	public void turn (int degrees) {
		direction = (direction + degrees) %360;
	}//end 
	

}//end circle