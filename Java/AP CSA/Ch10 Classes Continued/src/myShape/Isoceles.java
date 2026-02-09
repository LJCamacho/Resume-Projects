package myShape;

import TurtleGraphics.Pen;

public class Isoceles extends RightTriangle {
		
	
			public Isoceles() {
				xPos = 0;
				yPos = 0;
				height = 1;
				base = 1;
			}
			
			public Isoceles (double xLoc, double yLoc, double b, double h) {
				xPos = xLoc;
				yPos = yLoc;
				height = h;
				base = b;
			}
			
			
			public void draw(Pen p) {
				p.up();
				
				p.move(xPos, yPos);
				p.setDirection(0);
				
				p.turn(270);
				p.move(height);
				
				p.turn(-90);
				p.move(1*base);
				p.down();
				p.setDirection(0);
				 p.move(base*2);
				 p.move(xPos, yPos);
				p.move(xPos-base, yPos-height);

			}//end draw
			
			public String toString() {
				String str = "ISOCELES\n"+
								  "base & Side Lengths: "+ base + " & " + height+"\n"+
								  "(X,Y) Position: (" + xPos + ", "+yPos+ ")\n"+
								  "Area: "+area();
				return str;
			}
			
			
			
			

}
