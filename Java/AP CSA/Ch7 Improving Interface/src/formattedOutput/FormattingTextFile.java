package formattedOutput;

import java.util.Scanner;
import java.io.*;

public class FormattingTextFile {
	public static void main(String[] args) throws IOException{
		Scanner name = new Scanner(new File("Name.txt"));
		Scanner salary = new Scanner(new File("salary.txt"));
		Scanner years = new Scanner(new File("years.txt"));
		
		System.out.printf("%-10s%12s%15s%18s", "Name", "Salary", "Years", "Taxes");
		System.out.printf("%n%-10s%12s%15s%18s%n", "----", "------", "-----", "-----");
		while(name.hasNext()) {
			String n = name.nextLine();
			double s = salary.nextDouble();
			int y = years.nextInt();
			double t = s*.22;
			System.out.printf("%-10s  $%,13.2f%10d        $%,12.2f%n", n, s, y, t);

			
			
		}//end while
		
		name.close(); salary.close(); years.close();
		
		
		
		
	}//end main
}//end class
