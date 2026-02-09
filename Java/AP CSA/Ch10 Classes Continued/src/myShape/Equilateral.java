package myShape;

import TurtleGraphics.Pen;

public class Equilateral extends Isoceles {
	
	
	public Equilateral() {
		xPos = 0;
		yPos = 0;
		base = 1;
	}
	
	public Equilateral (double xLoc, double yLoc, double b) {
		xPos = xLoc;
		yPos = yLoc;
		base = b;
	}
	
	public double area() {
		return 0.5*base*(0.5)*base*Math.sqrt(3);
	}
	
	public void draw(Pen p) {
		p.up();
		
		p.move(xPos, yPos);
		p.setDirection(0);
		
		p.turn(120);
		p.down();
		p.move(base);
		p.turn(-120);
		p.move(base);
		p.turn(-120);
		p.move(base);
		
	}//end draw
	
	public String toString() {
		String str = "EQUILATERAL\n"+
						  "Side Lengths: "+ base + "\n"+
						  "(X,Y) Position: (" + xPos + ", "+yPos+ ")\n"+
						  "Area: "+area();
		return str;
	}
	
	
	
	

}
