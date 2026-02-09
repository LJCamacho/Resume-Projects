package myTurtle;

import TurtleGraphics.*;

public class TestPens {

	
	static private void drawSquare (Pen p) {
		for(int i = 1; i <= 4; i++) {
			p.move(50);
			p.turn(90);
		}//end for
	}//end static drawSquare
	
	
	
	
	public static void main(String[] args) {
		Pen p1, p2, p3;
		
		p1  = new StandardPen();
		p2  = new WigglePen();
		p3 = new RainbowPen();
		
		drawSquare(p1);
		drawSquare(p2);
		drawSquare(p3);
		
		
		/*
		for(int i = 1; i <= 4; i++) {
			p1.move(50);
			p1.turn(90);
		}
		
		for(int i = 1; i <= 4; i++) {
			p2.move(50);
			p2.turn(90);
		}
		
		for(int i = 1; i <= 4; i++) {
			p3.move(50);
			p3.turn(90);
		}
		*/
	}//end main

}//end class
