package queryAndMenu;

import java.util.Scanner;

public class MenuTempApp {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Thermometer thermo = new Thermometer();
		String menu;
		int menuOption;
		
		menu = "\n1) Convert from Fahrenheit to Celsius"
				+ "\n2) Convert from Celsius to Fahrenheit"
				+ "\n3) Quit"
				+ "\nEnter your option: ";
		
		menuOption = 4;
		
		while(menuOption != 3) {
			while(true) {
				try	{
						System.out.print(menu);
						menuOption = reader.nextInt();
				}catch(Exception e) {
					System.out.println("Invalid: try again");
					reader.nextLine();
					break;
				}//end try catch
				if(menuOption == 1) {
					try	{
							System.out.print("Enter degrees Fahrenheit: ");
							thermo.setFahrenheit(reader.nextDouble());
					}catch(Exception e)	{
						System.out.println("Invalid: try again");
						reader.nextLine();
						break;
					}//end try catch
					System.out.println("The equivalent in Celsius is "
										  	+ thermo.getCelsius());
				}else if (menuOption == 2) {
					try	{
							System.out.print("Enter degrees Celsius: ");
							thermo.setCelsius(reader.nextDouble());
					}catch(Exception e)	{
						System.out.println("Invalid: try again");
						reader.nextLine();
						break;
					}//end try catch
					System.out.println("The equivalent in Fahrenheit is "
						  + thermo.getFahrenheit());
				}else if (menuOption == 3) {
					System.out.println("Goodbye!");
				}else
					System.out.println("Invalid option");
			}//end while
			
		}//end while
		
	}//end main

}//end class
