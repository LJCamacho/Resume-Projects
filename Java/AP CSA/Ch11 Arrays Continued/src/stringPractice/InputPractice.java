package stringPractice;

import java.util.Scanner;

public class InputPractice {

	public static void main(String[] args) {
		
		String str = "The rain in Spain falls mainly on the plain";
		int begin = 0;
		while (begin < str.length() ) {
			int end = str.indexOf(' ', begin);
			if (end == -1)
				end = str.length();
			String word = str.substring(begin, end);
			System.out.println(word);
			begin = end + 1;
		}
		 Scanner reader = new Scanner(str);
		 
		 while(reader.hasNext())
		     System.out.println(reader.next());

	}

}
