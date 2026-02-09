package simpleArrays;

public class ArraypPractice {

	public static void main(String[] args) {
		//example 1 sum
		int[] abc = new int[20];
		
		//assign values to each location in the array
		for(int i = 0; i < 20; i++)
			abc[i] = i;
		
		//add the array elements
		int sum = 0;
		for(int n = 0; n < 20; n++)
			sum += abc[n];
		
		System.out.println("Sum = " + sum);
		
		//example 2 counting
		int[] hmk = new int[10];
		
		hmk[0] = 2;
		hmk[1] = 3;
		hmk[2] = 1;
		hmk[3] = 0;
		hmk[4] = 3;
		hmk[5] = 3;
		hmk[6] = 2;
		hmk[7] = 3;
		hmk[8] = 2;
		hmk[9] = 3;
		//hmk[10] = 1; range bound error
		
		int max = 3;
		int count = 0;
		for(int i = 0; i < hmk.length; i++) {
			if(hmk[i] == max)
				count++;
		}//end for
			
		
		System.out.println(count+" students completed assignment");
		
		//example 3: determine presence
		
		int search = 1;
		boolean found = false;
		
		for(int i = 0; i < 10; i++)	{
			if(hmk[i]==search)	{
				found = true;
				break;
			}//end if		
		}//end for
		
		if(found)
			System.out.println("found it");
		else
			System.out.println("bruh");
		
		//example 4: find index location
		
		search = 0;
		int loc = -1;
		
		for(int i = 0; i < 10; i++)	{
			if(hmk[i]==search) {
				loc = i;
				break;
			}//end if
		}//end for
		
		if(loc == -1)
			System.out.println("Not found");
		else
			System.out.println("Found at index " + loc);
		
		
		
	}//end main
}//end class
