package stringPractice;

import java.util.Scanner;
import java.io.*;

public class Project11_3 {

	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		int number = 0;
		
		System.out.println("Enter name of text file: ");
		File file = new File((reader.next()+".txt"));
		Scanner textFile = new Scanner(file);
		System.out.println("Enter target word: ");
		String target = reader.next();
		/*
		 while (textFile.hasNextLine()) {
		        String line = textFile.nextLine();
		        if(line.equals(target)) { 
		            break;
		        }
		    }
		    */
		
		  int lineNum = 0;
		    while (textFile.hasNextLine()) {
		        String line = textFile.nextLine();
		        lineNum++;
		        if(line.equals(target)) { 
		            System.out.println("Target found on line " +lineNum);
		        }
		    }
		
		if(lineNum > 0)
			System.out.println(target + " was found in the text file " + lineNum + " times.");
		else
			System.out.println(target + " was not found in the text file");
		
		/*
		System.out.println("Bruh: ");
		String nice = reader.nextLine()+ ".txt";
		System.out.println(nice);
		*/
	}
	public static int search(String[] a, String searchValue) {
		int left = 0;
		int right = a.length-1;
		while (left <= right) {
			int midpoint = (left + right) / 2;
			int result = ((Comparable)a[midpoint]).compareTo(searchValue);
			if (result == 0)
				return midpoint;
			else if (result < 0)
				left = midpoint + 1;
			else
				right = midpoint - 1;
		}
		return -1;
	}
}
