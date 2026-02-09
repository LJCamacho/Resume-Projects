package simpleArrays;

import java.util.Scanner;

public class Project9_2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int x = 0;
	    double sum = 0;
	    double[] numberList = new double[10]; //array to hold all numbers
	    double[] largerList = new double[10]; //array to hold numbers greater than the average

	    int numberIndex = 0;int count = 0;
	    int largerIndex = 0;




	    while(count < numberList.length) {
			System.out.println("Enter a number:  ");
			int number = reader.nextInt();
			numberList[count]=number;
			count++;
		}//end while

	    for (int i = 0; i < numberList.length; i++) {
	        sum += numberList[i];
	        double average = sum / numberList.length;
	        System.out.println("Average value of your input is: " + average);
	        System.out.println();

	        //return average;

	     
	      
	    }
	


	   
	

}}//end main and class
