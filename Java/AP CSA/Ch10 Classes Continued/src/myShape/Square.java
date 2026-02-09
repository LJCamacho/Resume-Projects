package myShape;

import TurtleGraphics.Pen;

public class Square extends Rect {

		//instance variables
		
		
		
		public Square() {
			super();
		}
		
		public Square(double xLoc, double yLoc, double s) {
			super(xLoc, yLoc, s, s);
			height = s;
			width = s;
			
		}//end constructor
		
		public String toString() {
			String str = "Square\n"+
							  "Side: "+ width + " & " + height+"\n"+
							  "(X,Y) Position: (" + xPos + ", "+yPos+ ")\n"+
							  "Area: "+area();
			return str;
		}
		
}//end Square
