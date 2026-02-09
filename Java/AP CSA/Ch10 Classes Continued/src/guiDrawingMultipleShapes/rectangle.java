package guiDrawingMultipleShapes;

import java.awt.*;
import java.util.Random.*;

public class rectangle implements Shape {
	//instance variables
	private int base, height;
	private int x, y;
	private Color color;
	
	//constructor
	public rectangle(int x, int y, int base, int height, Color color ) {
		this.x = x;
		this.y = y;
		this.base = base;
		this.height = height;
		this.color = color;	
	}//end rectangle
	
	public int getX() {return x;}
	public int getY() {return y;}
	public int getBase() {return base;}
	public int getHeight() {return height;}
	
	public void setBase(int base) {this.base = base;}
	public void setHeight(int height) {this.height = height;}
	public void setX(int x) {this.x = x;}
	public void setY(int y) {this.y = y;}
	
	public void draw(Graphics g) {
		Color oldColor = g.getColor();
		g.setColor(color);
		g.drawRect(x,y,base,height);
		g.setColor(oldColor);			
	}//end draw
	
	public void fill(Graphics g) {
		Color oldColor = g.getColor();
		g.setColor(color);
		g.fillRect(x,y,base,height);
		g.setColor(oldColor);			
	}//end draw
	
	public void fillBorder(Graphics g) {
		Color oldColor = g.getColor();
		g.setColor(Color.blue);
		for(int i = 1; i <= 10; i++) 
			g.drawRect(x+i,y+i,base-i,height-i);
		g.setColor(oldColor);			
	}//end draw
	public boolean containsPoint(int x, int y) {
		
		if(x >= this.x && x<= this.x+base 
				 && y >= this.y && y <= this.y+height)
			return true;
		return false;
		
	}//end containsPoint
	
	public void move(int xAmount, int yAmount) {
		x = x + xAmount;
		y = y + yAmount;		
	}//end move

	
	
}//end rectangle