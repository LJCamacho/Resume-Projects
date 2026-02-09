package introTextFiles;

import java.util.Scanner;
import java.io.*;


public class TextFileAssignment {

	public static void main(String[] args) throws IOException{
		Scanner reader = new Scanner(new File("QuizGrade.txt"));
		File file = new File("even.txt");
		File anotherfile = new File("odd.txt");
		PrintWriter p = new PrintWriter(file);
		PrintWriter p2 = new PrintWriter(anotherfile);
		//file
		if(!file.exists()){
			file.createNewFile();
		}
		//anotherfile
		if(!anotherfile.exists()){
			anotherfile.createNewFile();
		}
		
		int number = 0, sum = 0, count = 0;
		double avg = 0;
		
		
			
		while (reader.hasNext()) {
			number = reader.nextInt();
			System.out.print(number + " ");
			sum +=number;
			count++;
			
		}//end while
		
		if (number % 2 == 0) {
			p.write(number + "\n");
		}
		else {
			p2.write(number+ "\n");
		}
			
		avg = sum/count;
		System.out.print("\nAverage: "+avg);
		reader.close();
		p.close();
		p2.close();
		reader.close();
	}//
}//
