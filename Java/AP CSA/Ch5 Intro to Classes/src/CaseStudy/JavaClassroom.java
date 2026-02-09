package CaseStudy;

public class JavaClassroom {

	public static void main(String[] args) {
		Student s1 = new Student("Mauro", 70, 80, 90);
		Student s2 = new Student("Logan", 71, 81, 91);
		Student s3 = new Student("Mike", 72, 82, 92);
		Student s4 = new Student(s2);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3.toString());
		System.out.println(s4);
		
	}//end main
}//end class
