package WarmUp;

import java.util.Scanner;
public class Weekend {

	public static void main(String[] args) {

			System.out.println("need to bring cowbell");
			System.out.println("9th annual tournament");
			
			
			Scanner input = new Scanner (System.in);
			System.out.println ("Time of incident: ");
			int tm = input.nextInt();
			
			System.out.println ("# of participants");
			double num = input.nextDouble ();
			
			System.out.println ();
			System.out.println ("------------------");
			System.out.println ("Time " + tm);
			System.out.println ("People " + num);
			input.close();
			
	}//end main
}//end class
