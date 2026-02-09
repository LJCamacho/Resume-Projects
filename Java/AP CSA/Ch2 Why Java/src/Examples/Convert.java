package Examples;

import java.util.Scanner;

public class Convert {
 
 public static void main (String [] args) {
  	Scanner reader = new Scanner (System.in);
  	double fahrenheit;
  	double celsius;
 
  	System.out.print("Enter the degrees Fahrenheit: ");
  	fahrenheit = reader.nextDouble ();
  	
  	celsius = (fahrenheit - 32) * 5.0/9.0;
 
  	System.out.print ("the equivalent in Celsius is ");
  	System.out.println (celsius);
 
  	}
}
