package recursionPack;

public class PracticeRecursion {

	public static void main(String[] args) {
		String reverse = "";
		reverse("spaghetti", 5);
		//System.out.println(sum(4));
		//	System.out.println(factorial(4));
		//for(int i = 1; i < 30; i++)
			//System.out.println(fibonacci(i));
		
	}//end main
	
	
	public static int sum(int n) {
		if (n == 1)
			return 1;
		else
			return n + sum(n-1);
		
	}
	
	
	public static int factorial(int n) {
		if (n == 1)
			return 1;
		else 
			return n*factorial(n-1);
	}
	
	public static int fibonacci(int n) {
		if (n == 1 || n == 2)
			return 1;
		else
			return fibonacci(n-1) + fibonacci(n-2);
	}
	
	public static int raise (int base, int expo){
		if (expo == 0)
			return 1;
		else
			return base * raise(base, expo-1);
	}

	
	  static void reverse(String str, int index) 
	    { 
	        if ((str==null)||(index <= 1)) 
	           System.out.println(str); 
	        else
	        { 
	            System.out.print(str.charAt(str.length()-1)); 
	            reverse(str.substring(index), index); 
	        } 
	    }

}//end class
