package stringPractice;

public class TestStringMethods {

	public static void main(String[] args) {
		String str = "Hello world";
		
		// search for the position of the first space
		int endPosition = str.indexOf("bye");
		
		// if there is no space, use the whole string
		if (endPosition == -1)
			endPosition = str.length();
		
		//extract the first word
		String word = str.substring(5, endPosition);
		
		//output the results
		System.out.println(endPosition); // prints 2
		System.out.println(word); 		  // prints "Hi"
		
		

	}

}
