package myShape;

import TurtleGraphics.Pen;

public class RightTriangle extends AbstractShape{
	//instance variables
		protected double xPos, yPos;
		protected double height, base;
		
		public RightTriangle() {
			super();
			height = 1;base = 1;
		}
		
		public RightTriangle (double xLoc, double yLoc, double b, double h) {
			super(xLoc, yLoc);
			height = h;
			base = b;
		}
		
		//other methods
		public double area() {
			return height*base*.5;
		}
		
		public void draw(Pen p) {
			p.up();
			p.move(xPos, yPos);
			p.down();
			p.setDirection(0); p.move(base);
			p.turn(-90); p.move(height);
			p.move(xPos, yPos);

		}//end draw
		
		
		
		public void stretchBy(double factor) {
			height *= factor;
			base *= factor;
			
		}
		public String toString() {
			String str = "CIRCLE\n"+
							  "base & Height: "+ base + " & " + height+"\n"+
							  super.toString();
			return str;
		}
		
		
		
		

}
