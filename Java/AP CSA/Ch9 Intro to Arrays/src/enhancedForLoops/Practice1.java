package enhancedForLoops;

public class Practice1 {

	public static void main(String[] args) {

		int[] abc = {2,3,4};
		int sum = 0;
		
		for(int n: abc)
			sum+=n;
		
		System.out.println("Sum = " + sum);
		
		
		String [] roster = {"J", "M", "J", "M", "R", "L", "M"};
		String str = "";
		
		for(String dummy: roster)
			str += dummy + " ";		
		System.out.println(str);
		
		
		double[] payRate = {9.00, 50.50, 15.25, 110.99, 27.42, .10, 10.01};
		
		for(double p: payRate)	
			System.out.println("$"+p);
		
		
		int [][] table = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		for(int [] row: table) {
			for(int col: row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
		
		
	}}//end main and class
