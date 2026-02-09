package myTurtle;

import TurtleGraphics.StandardPen;

public class DrawSquare {

	public static void main(String[] args) {
		StandardPen pen = new StandardPen();
		
		pen.up();
		pen.move(25);
		pen.turn(90);pen.move(25);
		pen.down();
		
		//draw the square
		pen.turn(90); pen.move(50);
		pen.turn(90); pen.move(50);
		pen.turn(90); pen.move(50);
		pen.turn(90); pen.move(50);
		
	}//end main

}//end class
