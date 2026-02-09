package practice2DArrays;

public class PracticeOne {

	public static void main(String[] args) {

		//make a 3x5 table
		int [][] eagles = new int[3][5];
		int num = 1;
		
		for(int r = 0; r <3; r++)
			for(int c = 0; c < 5; c++) {
				eagles[r][c] = num;
				num++;
			}
		
		//display table
		for(int r = 0; r <3; r++) {
			for(int c = 0; c<5; c++) {
				System.out.print(eagles[r][c] + " ");
			}//end inside
			System.out.println();
		}//end outside
		
		System.out.println(eagles.length);//length = row length
		System.out.println(eagles[2].length);//length = column length
		
		
	}//end main
}//end class
