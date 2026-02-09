package caseStudyStudent;

import java.util.Scanner;

public class TestScoresView {

	private TestScoreModel java;
	
	public TestScoresView (TestScoreModel m) {
		java = m;
		run();
	}//end constructor
	
	
	//menu-driven
	private void run() {
		while(true) {
			System.out.println("Number of students: " + java.size());
			System.out.println("Index of current student: " + 
										 java.currentPosition());
			displayMenu();
			int command = getCommand("\nEnter a number [1-11]: ", 1, 11);
			if (command == 11)
				break;
			runCommand(command);
		}//end while
	}//end run
	
	private void displayMenu() {
		String str = "\n1) Add " +
						  "\n2) Replace"+
						  "\n3) First"+
						  "\n4) Previous"+
						  "\n5) Next"+
						  "\n6) Last"+
						  "\n7) Current"+
						  "\n8) Class Average"+
						  "\n9) High Score"+
						  "\n10) Roster"+
						  "\n11) Quit";
		
		System.out.print(str);
	}//end displayMenu
	
	private int getCommand(String prompt, int low, int high) {
		Scanner reader = new Scanner(System.in);
		System.out.print(prompt);
		return reader.nextInt();
	}//end getCommand
	
	
	private void runCommand (int command) {
		Scanner reader = new Scanner(System.in);
		//add student
		if(command == 1) {
			Student s;
			System.out.println("Name: ");
			String nm = reader.nextLine();
			int [] tests = new int[3];
			for (int i = 0; i < tests.length; i++) {
				System.out.println("Enter test(" + (i+1) + "):");
				tests[i] = reader.nextInt();
			}//end for
			s = new Student (nm, tests);
			if(s.validateData()== null)
				java.add(s);
			else System.out.print(s.validateData());
		}//end add
		
		if (command == 2) {
			Student s;
			System.out.println("Name: ");
			String nm = reader.nextLine();
			int [] tests = new int[3];
			for (int i = 0; i < tests.length; i++) {
				System.out.println("Enter test(" + (i+1) + "):");
				tests[i] = reader.nextInt();
			}//end for
			s = new Student (nm, tests);
			if(s.validateData()== null)
				java.replace(s);
			else System.out.println(s.validateData());
		}

		if(command == 3) {
			System.out.println(java.first());
		}
		if(command == 4) {
			System.out.println(java.previous());
		}
		if(command == 5) {
			System.out.println(java.next());
		}
		if(command == 6) {
			System.out.println(java.last());
		}
		if(command == 7) {
			System.out.println(java.currentStudent());
		}
		if(command == 8) {
			System.out.println("\nClass Average = " + java.getClassAverage()+"\n");
		}
		if(command == 9) {
			System.out.println("\nHigh Score = " + java.getHighScore()+"\n");
		}
		if(command == 10) {
			System.out.println(java.toString());
		}
		
		
	}//end runCommand
	
}//end TestScoresView
