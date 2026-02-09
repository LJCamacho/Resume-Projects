package myShape;

import TurtleGraphics.*;
import java.awt.Color;
import java.util.Scanner;


public class TestShape {

	
	static private Circle makeCircleFromRectangle  (Rect  rectangle){
	      double area = rectangle.area();
	      double radius = Math.sqrt(area/Math.PI);
	     Circle circle = new Circle(rectangle.xPos, rectangle.yPos, radius);
	    return circle;
}
	
	
	
	
	
	
	static private Circle makeCircleFromShape  (Shape  shape){
	      double area = shape.area();
	      double radius = Math.sqrt(area/Math.PI);
	     Circle circle = new Circle(shape.getXPos(), shape.getYPos(), radius);
	    return circle;
}
	
	static private Shape makeOneShapeFromAnother  (Shape  inShape, String type){
	      Shape outShape;
	      double area, radius, width, height;
	      double x = inShape.getXPos();
	      double y = inShape.getYPos();

	      area = inShape.area();

	     if (type.equals("circle")){
	           radius = Math.sqrt(area/Math.PI);
	           outShape = new Circle(x ,y, radius);
	     }

	     else if (type.equals("rectangle")){
	           width = height = Math.sqrt(area);
	           outShape = new Rect(x ,y, width, height);
	     }
	     else if (type.equals("square")){
	           width = Math.sqrt(area);
	           outShape = new Square(x ,y, width);
	     }
	     else if (type.equals("right triangle")) {
	    	 width = height = Math.sqrt(area);
	    	 outShape = new RightTriangle(x, y, width, height);
	     }
	     else if (type.equals("isoceles")) {
	    	 width = height = Math.sqrt(area);
	    	 outShape = new Isoceles(x, y, width, height);
	     }
	     else if (type.equals("equilateral")) {
	    	 width = Math.sqrt(area);
	    	 outShape = new Equilateral(x, y, width);
	     }
	     
	   //  else if (type.equals("wheel")) {
	     else {
	    	 radius = Math.sqrt(area/Math.PI);
	          outShape = new Wheel(x ,y, radius, 6);
	     }
	     
	          return outShape;

	}

	

	public static void main(String[] args) {
		Pen p = new StandardPen();
		Shape s1 = new Circle(20,20,20);
		Shape s2 = new Wheel(-20,-20, 20, 16);
		Shape s3 = new Rect(-40, 40, 25, 45);
		Shape s4 = new Square(40, -40, 25);
		Shape s5 = new RightTriangle(70, 70, 50, 50);
		Shape s6 = new Isoceles(0, 0, 30, 40);
		Shape s7 = new Equilateral(0, 90, 30);
		
		
		
		
		s3.draw(p);
		
		Shape s8 = makeOneShapeFromAnother(s2, "wheel" );
		s8.draw(p);
		
		/*
		Shape s9 = makeOneShapeFromAnother(s7, "right triangle");
		s9.draw(p);
		Shape s10 = makeOneShapeFromAnother(s6, "rectangle");
		s10.draw(p);
		Shape s11 = makeOneShapeFromAnother(s5, "circle");
		s11.draw(p);
		Shape s12 = makeOneShapeFromAnother(s4, "square");
		s12.draw(p);
		Shape s13 = makeOneShapeFromAnother(s1, "isoceles");
		s13.draw(p);
		Shape s14 = makeOneShapeFromAnother(s4, "equilateral");
		s14.draw(p);
		*/
		//s1.draw(p);
		//s2.draw(p);
	
		//p.setColor(Color.red);
		
		//s4.draw(p);
		//s5.draw(p);
		//s6.draw(p);
		//s7.draw(p);
		
		//System.out.println(s1);
		//System.out.println(s2);
		//System.out.println(s3);
		//System.out.println(s4);
		//System.out.println(s6);
		//System.out.println(s7);
		
		
	}//end main

}//end class
