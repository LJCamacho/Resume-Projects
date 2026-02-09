package simpleArrays;

public class ArrayWarmup {

	public static void main(String[] args) {

		int[] steph = new int[8];
		
		steph[0] = -3; steph[1] = 4; steph[2] = 322; steph[3] = 5;	steph[4] = 6; 
		steph[5] = 15; steph[6] = 20; steph[7] = -64;
		
		for(int i = 0; i < steph.length; i++)
			System.out.println(i + " = " + steph[i]);
	}//end main
}//end class
