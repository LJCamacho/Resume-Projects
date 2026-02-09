package errorHandling;

import java.util.Scanner;

public class ErrorPractice {

	public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
	
	//first
	/*
	System.out.println("Enter score: ");
	int score = reader.nextInt();
	if(score < 0 || score > 100)
		throw new RuntimeException("score should be between [0,100]");
		*/
	
	
	
	//second
	/*
	try {
		setScore(2,85);
	}catch(IllegalArgumentException e) {
		System.out.println(e);
	}
	*/
	
	try {
		setScore(2,85);
	}catch(IllegalStateException e) {
		System.out.println(e);
	}catch(Exception e) {
		System.out.println(e);
	}
	}//end main

	static public void setScore(int i, int score) {
		if(i < 1 || i > 3)
			throw new IllegalArgumentException(
						"i must be >=1 or <= 3");
		if(score < 0 || score > 100)
			throw new IllegalArgumentException(
					    "0<=score<=100");
		int test[] = new int[3];
		test[i-1] = score;
		System.out.println((i-1)+ " = " + score);
	}
	
}
