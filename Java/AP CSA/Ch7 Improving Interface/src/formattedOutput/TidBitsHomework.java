package formattedOutput;


import java.util.Scanner;

public class TidBitsHomework {
	public static void main(String [] args) {
		final double IRATE = 0.12;
		double totalOwed, interestOwed, DPayment, principalOwed, Payment, monthlyPayment, totalOwed2 = 1;
		int monthNumber = 0;
		Scanner reader = new Scanner(System.in);

		//Inputs.
		while (true) {
			try {
				System.out.print("What was the purchase price? $");
				totalOwed = reader.nextDouble();
				break;
			}catch (Exception e) {
				System.out.println("Invalid Data");
				System.out.println(e);
				reader.nextLine();	
			}//end catch
		}//end while
		
		System.out.print("\n");

		//payment
		DPayment = 0.10 * totalOwed;
		totalOwed -= DPayment;
		monthlyPayment = totalOwed * 0.05;

		System.out.printf("%-7s %-15s %-16s %-17s %-10s %s%n%n", "Month", "Balance Owed", "Interest Owed", "Principal Owed", "Payment", "Money Remaining");
		while (totalOwed2 > 0) {
			//Increment the counter;
			monthNumber++;

			//variables
			interestOwed = totalOwed * IRATE/12;
			principalOwed = monthlyPayment - interestOwed;
			if (principalOwed > totalOwed)
				principalOwed = totalOwed;
			totalOwed2 = totalOwed - principalOwed;
			
			//out statement
			System.out.printf("%-7d$%-15.2f$%-16.2f$%-17.2f$%-10.2f$%.2f%n", monthNumber, totalOwed, interestOwed, principalOwed, monthlyPayment, totalOwed2);

			//Set Initial to final for the next loop.
			totalOwed = totalOwed2;
		}
	}
}