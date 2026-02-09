package practice;

import java.util.Scanner;
public class Sphere {

	public static void main(String[] args) {
	
		
		Scanner reader = new Scanner (System.in);
		double r, sa, d, v, c;
		
		System.out.println ("Enter the radius:" );
		r=reader.nextDouble();
		
		
		sa = 4*Math.PI*(r*r);
		d = r*2;
		v = (4.0/3)*Math.PI*(r*r*r);
		c= 2*Math.PI*r;
		System.out.println("surface area of sphere is: "+ sa);
		System.out.println("Volume of sphere is: "+v);
		System.out.println("Diameter of sphere: "+d);
		System.out.println("Circumference of sphere: "+ c);
	
	
	
	
	}
}