package myShape;

import TurtleGraphics.Pen;

abstract public class AbstractShape implements Shape {
	//variables
	protected double xPos;
	protected double yPos;
	
	public AbstractShape() {
		xPos = 0;yPos = 0;
	}
	
	public AbstractShape(double xLoc, double yLoc) {
		xPos = xLoc; yPos = yLoc;
	}
	
	//abstract methods
	abstract public double area();
	abstract public void draw(Pen p);
	
	//final methods
	public final double getXPos() {return xPos;}
	public final double getYPos() {return yPos;}
	public final void move(double xLoc, double yLoc) {
		xPos = xLoc; yPos = yLoc;
	}
	
	abstract public void stretchBy(double factor);
	
	public String toString() {
		String str = "(X,Y) Position: (" + xPos + ", "+yPos+ ")\n"+
				  		  "Area: "+area();
		return str;
	}
	
	
	
	
}
