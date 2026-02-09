package introTextFiles;

import java.util.Scanner;
import java.io.*;

public class quizGradeEvenOdd {
//look over this for review
	public static void main(String[] args) throws IOException {
			File quiz = new File("QuizGrade.txt");
			Scanner read = new Scanner(quiz);
			FileWriter even = new FileWriter("even.txt", true);
			FileWriter odd = new FileWriter("odd.txt", true);
			BufferedWriter evenGrd = new BufferedWriter(even);
			BufferedWriter oddGrd = new BufferedWriter(odd);
			
			double sum = 0,  avg = 0;
			int count = 0; 		
			
			while (read.hasNext()) {
				int number = read.nextInt();
				
				if (number % 2==0)
					evenGrd.write(number + "\n");
				else
					oddGrd.write(number + "\n");
				
				sum+=number; count++;
				System.out.print(number + " ");
			}//end while
			avg = sum / count;
			System.out.println("\nAverage =" + avg);
			
			evenGrd.close(); oddGrd.close();even.close(); odd.close(); read.close();
	}//end main
}//end class
