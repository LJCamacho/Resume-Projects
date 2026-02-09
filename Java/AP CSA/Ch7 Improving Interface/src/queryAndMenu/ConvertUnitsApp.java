package queryAndMenu;

import java.util.Scanner;

public class ConvertUnitsApp {

	public static void main(String[] args) {

		Scanner reader = new Scanner (System.in);
		Convert Ruler = new Convert();
		String again = "y";
		
		while(again.equals("y") || again.equals("Y")) {
			System.out.println("Enter yards: ");
			double n = reader.nextDouble();
			Ruler.setYd(n);
			System.out.println(n + "yards = " 
										+ Ruler.setYardToFeet());
			//consume line
			reader.nextLine();
			System.out.println("Quit (y/n)? ");
			again = reader.nextLine();
			
		}//end while

		
	}// end main
}// end class
