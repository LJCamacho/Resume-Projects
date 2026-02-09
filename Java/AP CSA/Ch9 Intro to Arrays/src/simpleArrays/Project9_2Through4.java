package simpleArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Project9_2Through4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int x = 0;
	    double sum = 0;
	    double[] numberList = { 1, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5, 6, 6, 7, 8, 9, 9}; //array to hold all numbers
	    double[] largerList = new double[17]; //array to hold numbers greater than the average
	    double[] medianList = new double[10]; //array for median
	    
	    int numberIndex = 0, count = 0, maxCount = 0,  largerIndex = 0;
		double maxValue = 0; 
	    double average = 0;
	    double median = 0;



	    

	    for (int i = 0; i < numberList.length; i++) {
	        sum += numberList[i];
	        average = sum / numberList.length;
	        System.out.println();   
	    }
	    
	    for (int i = 0; i < numberList.length; ++i) {
	        for (int j = 0; j < numberList.length; ++j) {
	            if (numberList[j] == numberList[i]) ++count;
	        }
	        if (count > maxCount) {
	            maxCount = count;
	             maxValue = numberList[i];
	        }
	    }
	  
	    Arrays.sort(numberList);
	    if (numberList.length % 2 == 0)
	        median = ((double)numberList[numberList.length/2] + (double)numberList[numberList.length/2 - 1])/2;
	    else
	        median = (double) numberList[numberList.length/2];

	  //return average, larger than and mode;
	    System.out.println("Average value of your input is: " + average); 
	    System.out.println("Numbers larger than the average is/are: "); 
	     for(int i = 0; i < numberList.length; i++) {
	        if(numberList[i] > average) {
	          System.out.println(numberList[i]);
	        }
	    }
	     System.out.println("The mode of the input was: " );
	     System.out.println(maxValue);
	     System.out.println("The median of the input was: " + median);

}}//end main and class
