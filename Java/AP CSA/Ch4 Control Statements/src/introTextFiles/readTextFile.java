package introTextFiles;

import java.util.Scanner;
import java.io.*;


public class readTextFile {

	public static void main(String[] args) throws IOException{
		Scanner reader = new Scanner(new File("hmk.txt"));
	
		int number, sum = 0, count = 0;
		double avg = 0;
		
		while (reader.hasNext()) {
			number = reader.nextInt();
			System.out.print(number + " ");
			sum +=number;
			count++;
			
		}//end while
		avg = sum/count;
		System.out.print("\nAverage: "+avg);
	}//
}//
