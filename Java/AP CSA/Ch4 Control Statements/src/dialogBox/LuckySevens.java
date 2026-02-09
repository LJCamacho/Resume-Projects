package dialogBox;

import java.util.Scanner;
import java.util.Random;

public class LuckySevens {
    public static void main (String [] args)  {

        Scanner reader = new Scanner(System.in);
        Random generator = new Random();

        int die1, die2,             //two dice
            dollars,                   //initial number of dollars (input)
            count,                     //number of rolls to reach depletion
            maxDollars,            //maximum amount held by the gambler
            countAtMax;          //count when the maximum is achieved
        while (true) {
        	// request the input
        	System.out.print("How many dollars do you have? (-1 to quit): ");
        	dollars = reader.nextInt();

        	if (dollars==-1) break;
        	
        	// initialize variables
        	maxDollars = dollars;
        	countAtMax = 0;
        	count = 0;
        
        	// loop until the money is gone
        	while (dollars > 0) {
        		count++;
            
        		// roll the dice
        		die1 = generator.nextInt (6)+1; // 1-6
        		die2 = generator.nextInt (6)+1; // 1-6
            
        		System.out.print("\nd1 = " + die1 + "\td2 = " + die2 + "\tsum ="+(die1+die2));
        		// calculate the winnings or losses
        		if (die1 + die2 ==7) {
        			dollars += 4;
        			System.out.print("\twinner" + dollars);
        		}
        		else 	if (die1 + die2 == 2) {
        			dollars += 8;
        			System.out.print("\twinner" + dollars);
        		}
        		else {
        			dollars -= 1;
        			System.out.print("\tloser"+ dollars);
        		}
                
        		// if this is a new maximum, remember it
        		if (dollars > maxDollars) {
        			maxDollars = dollars;
        			countAtMax = count;
        		}
        	} 
           
        	// display the results
        	System.out.println
            	("\nYou are broke after " + count + " rolls. \n" +
            			"You should have quit after " + countAtMax + 
            			" rolls when you had $" + maxDollars + ".");
        }//end sentinel
    }//end main
 }//end class
