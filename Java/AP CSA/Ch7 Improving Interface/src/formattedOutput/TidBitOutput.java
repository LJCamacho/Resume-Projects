package formattedOutput;

import java.util.Scanner;

public class TidBitOutput {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String m = "Month#", c = "Current", bal = "balance", i = "Interest", o = "Owed",
				aM = "Amount", p = "Principal", pay = "Payment", r = "remaining";
		
		
		//System.out.println("Enter purchase price: ");
		//double pPrice = reader.nextDouble();
		
		System.out.printf("%-15s%-15s%-15s%-15s%-15s  %-15s", "", c, i, aM, "", bal);
		System.out.printf("\n%-15s%-15s%-15s%-15s  %-15s%-15s", m, bal, o, p, pay, r);
		System.out.printf("\n%-15s%-15s%-15s%-15s  %-15s%-15s", "------", "-------", "--------", "---------", "-------", "---------");
		
	}//end main
}//end class
