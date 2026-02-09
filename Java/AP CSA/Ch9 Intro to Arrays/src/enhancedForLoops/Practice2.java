package enhancedForLoops;

import java.util.Scanner;
public class Practice2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int [] grades = new int[10];
		/*
		for(int i = 0; i < grades.length; i++) {
			System.out.println("Enter: ");
			grades[i] = reader.nextInt();
		}//end for
		
		//display
		for(int n : grades) 
			System.out.print(n + " ");
		*/
		String [] color = {"blue", "pink", "black", "red", "green", "gray", "white", "orange"};
		
		for(String n: color)
			System.out.print(n+" ");
	
		
System.out.println();
		char [][] what = {{ 'A', 'B', 'C'}, {'C', 'C'}, {'D', 'A', 'B'}, {'E', 'E'}};
		
		
		for(char[]row : what) {
			for(char col: row)		{
				System.out.print(col + " ");
			}	
			System.out.println();
		}
		
	}

	
	//2D loops
	

	
	
	
}
