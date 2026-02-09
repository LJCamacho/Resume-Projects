package formattedOutput;

public class NameGrade {

	public static void main(String[] args) {

		
		System.out.printf("%-8s%8s","Name", "Grade");
		System.out.printf("%n%-8s%8.2f", "Mauro", 86.5);
		System.out.printf("%n%-8s%8.2f", "Logan", 87.25);
		System.out.printf("%n%-8s%8.2f", "Mike", 85.91);
		System.out.printf("%n%-8s%8.2f", "Ryan", 88.02);
		System.out.printf("%n%-8s%8.2f", "Justin", 64.50);
		System.out.printf("%n%-8s%8.2f", "Matt", 68.68);
		
	}

}
