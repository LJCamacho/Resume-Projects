package introTextFiles;

import java.util.Scanner;
import java.io.*;

public class createNewfile {

	public static void main(String[] args) throws IOException{
		Scanner reader = new Scanner (new File("hmk.txt"));
		PrintWriter w = new PrintWriter(new File("newHMK.txt"));
		
		while(reader.hasNext())	{
			int number = reader.nextInt();
			if (number != 0)
				w.println(number);
			
		}//end while
		
		reader.close();
		w.close();

		
	}//end main
	
}
