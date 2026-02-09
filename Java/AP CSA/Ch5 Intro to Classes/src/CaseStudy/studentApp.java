package CaseStudy;

import java.util.Scanner;

public class studentApp {

	public static void main(String[] args) {
		//object variables: s1 and Adam
		Student s1 = new Student ();
		Student Adam = new Student();
		Scanner input = new Scanner(System.in);
		Student third = new Student();
		
		//name:
		s1.setName("Drew");
		Adam.setName("Stephen");
		
		s1.setScore(1, 90); s1.setScore(2, 91); s1.setScore(3, 98);
		Adam.setScore(1, 62); Adam.setScore(2, 62); Adam.setScore(3, 44);
		
	/*	
		//input third student data
		System.out.println("Name: ");
		String name = input.nextLine();
		third.setName(name);
		
		System.out.println("Test 1: ");
		int t1 = input.nextInt();
		third.setScore(1, t1);
		
		System.out.println("Test 2: ");
		t1 = input.nextInt();
		third.setScore(2, t1);
		
		//advance code
		System.out.println("Test 3: ");
		third.setScore(3, input.nextInt());
		*/
		
		//another student object
		Student Michael;
		
		Michael = Adam;
		Michael.setName("Mike");
		
		//display object
		//System.out.println(s1.toString());
		System.out.println("\n******************\n");
		System.out.println(Adam.toString());
		System.out.println("\n******************\n");
		//System.out.println(third.toString());
		
	}//end main
}//end class
