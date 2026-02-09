package caseStudyStudent;

public class StudentApp {
	public static void main(String[] args) {
		Student s1, s2;
		s1 = new Student("Mary");
		
		
		//s2 = s1;
		s2 = new Student(s1);
		
		//if (s2 == s1)
		//	System.out.println("same object");
		//else
		//	System.out.println("Different objects");
		
		if(s1.equals(s2))
			System.out.println("Same object");
		else
			System.out.println("Different objects");
		
		
		
		//s2.comparePractice(s1);

	}//end main
	
	static public void practiceCompare(Object other) {
		if(other instanceof Student)
			System.out.println(other + " is a student");
	}
	
	

}
