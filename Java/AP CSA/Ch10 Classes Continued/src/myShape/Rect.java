package myShape;

import TurtleGraphics.Pen;

public class Rect extends AbstractShape {
	//instance variables
	protected double height, width;
	
	public Rect() {
		super();
		height = 1;
		width = 1;
	}
	
	public Rect (double xLoc, double yLoc, double w, double h) {
		super();
		height = h;
		width = w;
	}
	
	//other methods
	public double area() {
		return height*width;
	}
	
	public void draw(Pen p) {
		p.up();
		p.move(xPos, yPos);
		p.down();
		p.setDirection(0); p.move(width);
		p.turn(-90); p.move(height);
		p.turn(-90); p.move(width);
		p.turn(-90); p.move(height);

	}//end draw
	
	public void stretchBy(double factor) {
		height *= factor;
		width *= factor;
		
	}
	public String toString() {
		String str = "CIRCLE\n"+
						  "Width & Height: "+ width + " & " + height+"\n"+
						  super.toString();
		return str;
	}
	
	
	
	

}
