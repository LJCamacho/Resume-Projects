package simpleArrays;

import java.util.Scanner;
import java.io.*;

public class MyArray {
	public static void main(String[] args) throws IOException {
	Scanner reader = new Scanner(System.in);
	int[] array = new int[10];
	int count = 0;
	
	while (count < array.length) {
		System.out.println("Enter a number (-1 to quit): ");
		int number = reader.nextInt();
		if (number == -1)
			break;
		array[count] = number;
		count++;
	}//end while
		
		//output to a file
	
		PrintWriter w = new PrintWriter(new File("number.txt"));
		for (int i = 0; i < count; i++) {
			w.println(array[i]);
		}
		
		w.close();
		
		
	}//end main
}//end class
