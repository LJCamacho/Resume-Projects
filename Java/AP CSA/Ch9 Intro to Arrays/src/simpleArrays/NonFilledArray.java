package simpleArrays;

import java.util.Scanner;

public class NonFilledArray {

	public static void main(String[] args) {
		int[] abc = new int[50];
		int size = 0, sum = 0;
		
		for (int i =0; i < 10; i++) {
			abc[i] = i*2;
			size++;
			sum+= abc[i];
		}//end for loop
		
		
		//adding elements into the array variable
		Scanner reader = new Scanner(System.in);
		int num = 0;
		
		while (true) {
			System.out.println("Enter number (-1 to quit) :");
			num = reader.nextInt();
			if (num != -1 || size == 50) {
				abc[size] = num;
				size++;
			}else
				break;
			
		}
		
		
		
		//output
		for(int j = 0; j<size; j++) {
			sum+= abc[j];
			System.out.print(abc[j] + " ");
		}
		
		System.out.println(" = "+ sum);
	
}}//end main and class
