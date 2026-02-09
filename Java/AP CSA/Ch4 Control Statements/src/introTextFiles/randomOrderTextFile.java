package introTextFiles;

import java.io.*;
import java.util.*;


public class randomOrderTextFile {

	public static void main(String[] args) throws IOException {
		Random gen = new Random();
		File file = new File("number.txt");
		PrintWriter p = new PrintWriter(file);
		Scanner readThisFile = new Scanner(file);
		
		
		
		//generate 3 random numbers
		for (int i = 0; i<3; i++) {
			int n = gen.nextInt(5)+1;
			p.write(n+"\n");
		}//end for loop
		
		//write numbers to the file
		
		//read the numbers and assign in order
		
		
		
		//write ordered numbers to the file
	
		
		
		readThisFile.close();
		p.close();
	}
	
}
