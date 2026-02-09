package caseStudyStudent;

import java.util.Scanner;

public class MorePractice {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter word:");
		String str = reader.nextLine();
		
		//System.out.println(str == "java");
		//System.out.println(str.equals("java"));
		
		Student s1 = new Student("mary");
		Student s2 = s1;
		Student s3 = new Student("mary");
		
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		
	}

}
