package yshsProject;

import java.util.Scanner;

public class YSHS {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		  student stu;    // student
	      String name;     //   name     
	      int    track;     //   track 
	      double gpa;     //   grade point average
	      int    grade;    //   grade     
	      String prompt;   // user prompt;

		
	    //main while loop
	      	while (true) {		
	   // Get the name and break if blank
	        System.out.println("Enter student data");
	        System.out.print("      name (or blank to quit): "); 
	        name = in.nextLine();
	        name = name.trim();
	        if (name.length() == 0) break;
	        stu = new student();
	        stu.setName(name);
		
	     // Get the track until valid
	         while (true){
	        	 prompt = "   Track (" + stu.getTrackRules() + "): ";
	        	 System.out.print(prompt);
	        	 track = in.nextInt();
	        	 if (stu.setTrack(track)) break;
	         }
	         
	      // Get the gpa until valid
	         while (true){
	        	prompt = "      Grade point average (" + stu.getGradePointAve() + "): ";
	        	System.out.print(prompt);
	        	gpa = in.nextDouble();
	        	if (stu.setGradePointAve(gpa)) break;
	         }
	      // Get the grade level until valid
	         while (true){
	        	prompt = "      Grade (" + stu.getGradeLevelRules() + "): ";
	        	System.out.print(prompt);
	        	grade = in.nextInt();
	        	if (stu.setGradelevel(grade)) break;
	         }

   				// Consume the trailing newline
   				in.nextLine();
		
		
   			
   				//to-string
   				System.out.println(stu.toString());
   				System.out.println("Achievements: ");
   				//if-statements
   				if (grade > 10 && gpa >= 3.5 && track == 3) {
   					System.out.println("\nNational Honor Society \nDistinguished YS Honor Roll");
   				}
   				else if (gpa >= 3.3 && gpa <= 3.49 && grade > 10 && track == 3) {
   					System.out.println("\nNational Honor Society \nYS Honor Roll");
   				}
   				else if (gpa >= 3.5) {
   					System.out.println("\nDistinguished YS Honor Roll");
   				}
   				else if (gpa >= 3.3 && grade > 10 && track == 3) {
   					System.out.println("\nNational Honor Society");
   				}
   				else if (gpa >= 3.0 && gpa <= 3.49) {
   					System.out.println("\nHonor Roll");
   				}
   				
   				System.out.println("*******************");
	      	}//end main while
	}//end main
}//end class