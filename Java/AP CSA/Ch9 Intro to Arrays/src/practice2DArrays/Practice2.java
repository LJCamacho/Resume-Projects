package practice2DArrays;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the rows: ");
		int row = reader.nextInt();
		System.out.println("Enter the columns: ");
		int col = reader.nextInt();
		int [][] joe = new int [row][col];
		int count = 1;
		int sumTotal = 0;
		int [] rowSum = new int [row];
			
		for(int j = 0; j <row; j++)
			for(int i = 0; i < col; i++) {
				joe[j][i] = count;
				count++;
				sumTotal+=joe[j][i];
				rowSum[j]+=joe[j][i];
			}//end inside
		
		//display table
		
		
		for(int j = 0; j <row; j++) {
			for(int i = 0; i<col; i++) {
				System.out.print(joe[j][i] + " ");
			}//end inside
			System.out.println(" = " + rowSum[j]);
			System.out.println();
		}//end outside
		
		System.out.println("\nSum = " + sumTotal);
		
	}//end main
}//end class
