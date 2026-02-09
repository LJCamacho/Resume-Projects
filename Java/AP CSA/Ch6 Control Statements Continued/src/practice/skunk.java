package practice;

public class skunk {

	public static void main(String[] args) {

			for(int j =1; j <= 5; j++) {
				System.out.println("Someone said...");
				for(int i = 1; i <= 5; i++) {
					
					System.out.println(i+  " skunk sat on a stump and thunk the stump stunk," 
												+ "but the stump thunk the " + i +  " skunk stunk.");
		
				}//inside loop
			}//outside loop
			for(int j =1; j<=4; j++) {
				
				for(int i = 1; i<=4; i++) {
				
					System.out.println("Skunk in the barnyard, PU");
				}//inside
				System.out.println("Somebody ate it…that’s you!");
			}//outside	
	}//end main
	
}//end class
