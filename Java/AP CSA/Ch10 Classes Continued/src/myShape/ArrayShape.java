package myShape;

import TurtleGraphics.*;

public class ArrayShape {

	public static void main(String[] args) {
		Pen p = new WiggleRainbowPen();
		AbstractShape[] s = new AbstractShape[7];
		s[0] = new Circle(0, 0, 25);
		s[1] = new Rect(30, 0, 25, 50);
		s[2] = new RightTriangle(50, 0, 60, 80);
		int size = 3;
		
		for(int i = 0; i < size; i++) {
			s[i].draw(p);
			System.out.println(s[i].toString());
		}
		
		
		
	}

}
