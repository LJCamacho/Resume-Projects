package simpleArrays;

public class ArrayGradesWarmup {

	public static void main(String[] args) {

		int[] hmk = {2, 2, 0, 1, 2};
		int[] quiz = {15, 18, 19};
		int[] test = {85, 92}; 
		int hmkSum = 0;
		int quizSum = 0;
		int testSum = 0;
		
		System.out.print("Homework Grades:");
		for(int i = 0; i < hmk.length; i++) {
			System.out.print("\n" + ":  " + hmk[i]);
			hmkSum += hmk[i];
		}
		double hmkGrade = ((double)hmkSum/(double)10)*.1;
		System.out.println("\nHomework grade is: " + hmkGrade);
		
		System.out.print("Quiz Grades:");
		for(int i = 0; i < quiz.length; i++) {
			System.out.print("\n" + ":  " + quiz[i]);
			quizSum += quiz[i];
		}
		double quizGrade = ((double)quizSum/(double)60)*.3;
		System.out.println("\nQuiz grade is: " + quizGrade) ;
		
		System.out.print("Test Grades:");
		for(int i = 0; i < test.length; i++) {
			System.out.print("\n" + ":  " + test[i]);
			testSum += test[i];
		}
		double testGrade = ((double)testSum/(double)200)*.6;
		System.out.println("\nTest grade is: " + testGrade);
		
		System.out.println("Overall grade is: " + (testGrade+ quizGrade + hmkGrade)*100 + "%");
	}
}
