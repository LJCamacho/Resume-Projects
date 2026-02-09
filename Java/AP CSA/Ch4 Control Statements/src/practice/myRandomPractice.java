package practice;

import java.util.Random;
public class myRandomPractice {

	public static void main(String[] args) {

		
		Random gen = new Random();
		/*
		for (int i = 0; i < 125; i++) {
			int n = gen.nextInt(8-2+1)+2;
			//gen.nextInt(Max - Min + 1) + Min
		 System.out.print(n + "  ");
		}	//end loop
		*/
	
		for (int i = 0; i < 125; i++) {
			Double n = gen.nextDouble()*10+1;

		 System.out.print(n + "  ");
		}	//end loop
		
		
		
		
	}//end main
}//end class
