package practice2DArrays;

public class GymClass {

	public static void main(String[] args) {
		//initialize 2d array
		int [][]wolf = { {1,2,2} , {0, 1}, {2,2,3,4} , {0, 2} , {4,4,4}};
		int [] rowS = new int [wolf.length];
		int total = 0;
		
		for(int r = 0; r < wolf.length; r++) {
			for(int c = 0; c < wolf[r].length; c++) {
				rowS[r] += wolf[r][c];
				total += wolf[r][c];
				System.out.print(wolf[r][c] + " ");
			}//end inside
			System.out.println(" = " + rowS[r]);
		}
		
		
		System.out.println("Total = " + total	);
		
		
		
} }//end main and class
