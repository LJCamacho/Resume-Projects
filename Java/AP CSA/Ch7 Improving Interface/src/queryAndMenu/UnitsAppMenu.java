package queryAndMenu;

import java.util.Scanner;

public class UnitsAppMenu {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		MenuConvert Con = new MenuConvert();
		String menu;
		int menuOption;
		
		menu = "\n1) Convert from yards to feet"
				+ "\n2) Convert from feet to yards"
				+ "\n3) Convert yards to inches"
				+ "\n4) Convert inches to yards"
				+ "\n5) Convert feet to meters"
				+ "\n6) Quit"
				+ "\n) Enter your option: ";
		
		menuOption = 7;
		
		while(menuOption != 6) {
			
			System.out.print(menu);
			menuOption = reader.nextInt();
			
			if(menuOption == 1) {
				System.out.print("Enter number of yards: ");
				Con.setYd(reader.nextDouble());
				System.out.println("The equivalent in feet is "
										  + Con.setYardToFeet());
			}else if (menuOption == 2) {
				System.out.print("Enter number of feet: ");
				Con.setFt(reader.nextDouble());
				System.out.println("The equivalent in yards is "
						  + Con.setFeetToYard());
			}else if (menuOption == 3) {
				System.out.print("Enter number of yards: ");
				Con.setYd(reader.nextDouble());
				System.out.println("The equivalent in inches is "
						  + Con.setYardToInch());
			}else if (menuOption == 4) {
				System.out.print("Enter number of inches: ");
				Con.setIn(reader.nextDouble());
				System.out.println("The equivalent in yards is "
						  + Con.setInchToYard());
			}else if (menuOption == 5) {
				System.out.print("Enter number of feet: ");
				Con.setFt(reader.nextDouble());
				System.out.println("The equivalent in meters is "
						  + Con.setFeetToMeter());
			}else if (menuOption == 6) {
				System.out.println("Goodbye!");
			}else
				System.out.println("Invalid option");
			
			
		}//end while
		
		
	}
}
