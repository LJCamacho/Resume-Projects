package insertRemovalArrays;

import java.util.Random;
import java.util.Scanner;


public class RemovePractice {

	public static void main(String[] args) {
		Random gen = new Random();
		String []	str = new String[20];
		int size = 0;
			
		str [0] =	"Drew" ;	str [1] =		"Adam" ; size+= 2;
		str [2] =	 "Matt" ;	str [3] =	"Justin" ;size+= 2;
		str [4] =	"Mike" ;		str [5] =	"Logan";size+= 2;
		str [6] =	"Ryan" ;		str [7] =	"Mauro" ; size+= 2;
		str [8] = "Temple"; size++;
		
		Scanner reader = new Scanner(System.in);
		
		for (int i = 0; i < 9; i++) {
			int target = gen.nextInt(size);
			System.out.println(str[target].toUpperCase() + " HAS BEEN REMOVED FROM THE CLASS.");
			if(removeStudent(str, target, size));
				size--;
			displayRoster(str, size);
			System.out.println("...press any key to continue");
			reader.nextLine();
		}
		
	}//end main
	
	public static void displayRoster(String [] roster, int logicSize) {
		for(int i = 0; i < logicSize; i++)
			System.out.print(roster[i] + ", ");
		System.out.println();
	}
	public static boolean removeStudent(String [] roster, int targetIndex, int logicSize) {
			//check for valid target index and return false
			if (targetIndex < 0|| targetIndex >= logicSize)
				return false;
		 
			//shift items up by one position
			for (int i = targetIndex; i <logicSize-1 ;i++ )
				roster[i] = roster[i+1];
		 
			//Decrement logical size, and return true
			logicSize--;
			return true;
	}
	
	
	
	
}//end class
