package simpleArrays;

import java.util.Scanner;

public class Project9_1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int[] array = new int[10];
		int [] even = new int[10], odd = new int[10], negative = new int[10];
		int count = 0, ecount = 0, ocount = 0, ncount = 0;
		
		while(count < array.length) {
			System.out.println("Enter a number:  ");
			int number = reader.nextInt();
			array[count]=number;
			count++;
		}//end while
		
		for (int i = 0; i < array.length; i++) {
			
			if(array[i] % 2 == 0) {
				even[i] = array[i];
				ecount++;
			}else {
				odd[i] = array[i];
				ocount++;
			}
			
			if(array[i]< 0) {
				negative[i] = array[i];
				ncount++;
			}
			
		}
		System.out.println("The list of negative numbers is :"); 
	    for (int x = 0; x < ncount; x++) { 
	    System.out.println( negative[x]); 
	    } 
	    System.out.println("\nThe list of even numbers is :"); 
	    for (int x = 0; x < ecount; x++) 
	    { 
	    System.out.println( even[x]); 
	    } 
	    System.out.println("The list of odd numbers is :"); 
	    for ( int x = 0; x < ocount; x++) 
	    { 
	    System.out.println( odd[x]); 
	    }
}}//end main and class
