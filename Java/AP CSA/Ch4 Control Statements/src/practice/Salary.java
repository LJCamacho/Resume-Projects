package practice;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int years, count;
		double percent, salarystart, salaryend;
		
		 while (true) {
	        	// request the input
	        	System.out.print("What's your salary? (-1 to quit): ");
	        	salarystart = reader.nextInt();
	        	if (salarystart==-1) break;

	        	System.out.print("\nWhat's your percent increase? ");
	        	percent = reader.nextDouble();
	        	
	        	System.out.print("\nHow many years do you work? ");
	        	years = reader.nextInt();
	        	
	        	
	        	// initialize variables
	        	salaryend = salarystart;
	        	count = 0;
	        
	        	// loop until the years are finished
	        	while (count <= years) {
	        		System.out.print("\nYear = " + count + "\tCurrent salary = " + salaryend);	        			        		
	        		salaryend = (1+ (percent/100)) * salaryend;
	        		count++;	        		
	        	}
	        		
	    
	        		 
	                
	           
	        	// display the results
	        	System.out.println
	            	("\nYour salary is $" + salaryend + " after "+ years +" years of working at a " + percent + "% rate");
	        }//end sentinel
	    }//end main
	}//end class
