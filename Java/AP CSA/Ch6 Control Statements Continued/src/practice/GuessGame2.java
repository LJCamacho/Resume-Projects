package practice;

import java.util.Random;
import java.util.Scanner;

public class GuessGame2 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

		
        while (true) {
        Random rnd = new Random();
        int  counter = 0, userInput, guess; 
        int min = 1, max = 100;
       
        while (true) {
        System.out.println("\nenter your number between 1 and 100: ");        
        userInput = in.nextInt();     
		if(userInput >= 1 && userInput <= 100) break;
        System.out.println("Try again");
        } 
        
        guess = rnd.nextInt(max-min+1)+min;
        while(guess != userInput){
            if(guess < userInput){
                System.out.println("Computer guess: " + guess);
                System.out.println("Too low!");  
                counter++;
                min = guess+1;
                guess = rnd.nextInt(max-min+1)+min;
            }
            else if (guess > userInput){
                System.out.println("Computer guess: " + guess);
            	System.out.println("Too high!"); 
                counter++;
                max = guess-1;
                guess = rnd.nextInt(max-min+1)+min;
              }
            
        }
        System.out.println("The computer guessed correctly! the number was: " + userInput);
        System.out.println("Number of computer guesses: " + counter);
        in.nextLine();
        System.out.println("Play again?(s to quit): ");
        String exit = in.nextLine();
        if (exit.equals("s") ) break;
        }
        
	}//end main
}//end class
