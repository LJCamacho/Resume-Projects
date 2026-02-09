package insertRemovalArrays;
import java.util.Random;

public class InsertPractice {

	public static void main(String[] args) {
		Random gen = new Random();
		String []	str = new String[20];
		int size = 0;
			
		str [0] =	"Drew" ;	str [1] =		"Adam" ; size+= 2;
		str [2] =	 "Matt" ;	str [3] =	"Justin" ;size+= 2;
		str [4] =	"Mike" ;		str [5] =	"Logan";size+= 2;
		str [6] =	"Ryan" ;		str [6] =	"Mauro" ; size+= 2;
				
		if(insertStudent(str, 4, size))
			displayRoster(str, size);
		
	}//end main
	public static void displayRoster(String [] roster, int logicSize) {
		for(int i = 0; i <= logicSize; i++)
			System.out.print(roster[i] + ", ");
		System.out.println();
	}
	public static boolean insertStudent(String [] roster, int target, int logicSize) {
		//check if array is full
		if (logicSize==roster.length)
		 	return false;
		 
		//check for valid target index and return false
		if (target <= 0|| target > logicSize)
		 	return false;
		 
		//shift items down by one position
		for (int i = logicSize; i > target;i-- )
		 	roster[i] = roster[i-1];
		 
		//add new item, increment logical size, and return true
		roster[target] = "Sean";
		logicSize++;
		return true;

	}
}//end class
