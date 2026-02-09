package queryAndMenu;

import java.util.Scanner;

public class QueryTempApp {

	
	public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
	Thermometer thermo = new Thermometer();
	String doItAgain = "y";
	
	while(doItAgain.equalsIgnoreCase("y") || doItAgain.equalsIgnoreCase("Y")) {
		while (true)
			try	{
					System.out.println("\nEnter degrees Fahrenheit: ");
					thermo.setFahrenheit(reader.nextDouble());
					break;
			}catch(Exception e)	{
				System.out.println("Invalid: try again");
				reader.nextLine();
			}//end try catch
					
					
		//consume line
		reader.nextLine();
		System.out.println("The equivalent to Celsius is " +
										thermo.getCelsius());
		
		System.out.print("\nDo it again (y/n)? ");
		doItAgain = reader.nextLine();
		
		
	}//end while
		
	}//end main

}//end class
