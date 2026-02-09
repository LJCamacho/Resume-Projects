package arrayMethods;

public class ExamplesArrayMethods {

	public static void main(String[] args) {

		double[] array = {3.24, 5.00, 9.01, 6.00, 4.00, .10, 0};
		double[] pennState = new double[array.length];
		
		//add the 1D array
		double Total = sum1D(array);
		System.out.println("Total = $" + Total);
		
		//search for "4.00"
		int index = search1D(array, 4);
		
		//copy the 1D array
		copy1DArray(array, pennState);
		display1DArray(pennState);
		
		//2D Methods
		int[][] numbers = {{1,2,3}, {4,5,6}};
		
		//add 2D array rows together
		int[] RS = add2DSumRows(numbers);
		System.out.println();
		display1DArray(RS);
		
		
	}//end main 
	
	public static int[] add2DSumRows(int [][] n) {
		int[]rowSum = new int[n.length];
		
		for(int r = 0; r < n.length; r++)
			for(int c = 0; c< n[r].length; c++)
				rowSum[r] += n[r][c];
		
		return rowSum;
	}
	
	public static void display1DArray(int[] n) {
		for(int x: n)
			System.out.print(x + " ");
		
	}//end display1DArray
	
	public static void display1DArray(double[] n) {
		for(double x: n)
			System.out.print(x + " ");
		
	}//end display1DArray
	
	public static void copy1DArray(double[]original, double[]copy) {

		for(int i = 0; i < original.length; i++) {
			copy[i] = original[i];
		}
		
	}//end copy1DArray
	
	
	public static int search1D(double[] n, double search) {
		int loc = -1;
		
		for(int i = 0; i < n.length; i++) {
			if(n[i] == search	) {
				loc = i;
				break;
			}//end if	
		}//end for
		
		
		return loc;
		
	}//end search1D
	
	
	public static double sum1D(double[] n) {
		double sum = 0.0;
		
		for(double x: n)
			sum+=x;
		
		return sum;
		
	}//end sum 1D
	
	
}//end class
