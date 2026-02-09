package practice;

import java.util.Scanner;

public class MathExample{
	   static public void main(String[] args){
	            	Scanner reader = new Scanner(System.in);
	            	double absV, cube, rd;
	            	int k;
	            	//constant PI
	            	final double PI = Math.PI; 
	            	
	       System.out.print("Enter the number");
	  	double n = reader.nextDouble();
	 	
	            	absV = Math.abs(n);
	            	cube = Math.pow(n, 3);
	            	rd = Math.round(n);
	 
	            	System.out.println("abs V =" + absV);
	            	System.out.println("power =" + cube);
	            	System.out.println("round =" + rd);
	            	System.out.println("int =" + (int)n);
	   }
	}
