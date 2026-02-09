package practice;

import java.util.Random;
import java.util.Scanner;

	public class GuessingGame {
		
		    public static void main(String [] args){
		        Scanner in = new Scanner(System.in);
		        
		        while (true) {
		        int counter = 0;
		        double randNum = Math.random();
		        int randNumRange = (int)(randNum * 100.0);
		        
		        System.out.println("Your guess between 1 and 100(0 to end): ");
		        if (in.nextInt()==0) break;
		        int guess = in.nextInt();
		        
		     
		        while(guess != randNumRange){
		            if(guess < randNumRange){
		                System.out.println("Too low!");  
		                System.out.print("Guess again: ");
		                counter++;
		                guess = in.nextInt();
		            }
		            else{
		                System.out.println("Too high!");  
		                System.out.print("Guess again: ");
		                counter++;
		                guess = in.nextInt();    
		            }
		        }
		   
		        System.out.println("Congratulations! The randomly generated number was: " + randNumRange);
		        System.out.println("Number of guesses: " + counter);
		    }
		   }
		}