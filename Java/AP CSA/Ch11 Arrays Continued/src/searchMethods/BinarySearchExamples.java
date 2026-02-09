package searchMethods;

public class BinarySearchExamples {

	public static void main(String[] args) {
		int [] n = {2, 40, 115, 133, 143, 156, 178, 249, 300 };
		
		int index = search(n, 115);
		
		if (index!= -1)
			System.out.println("Item found at index " + index);
		else
			System.out.println("Not found!");
	}//end main

	static public int search (int [] a, int searchValue) {
		int left = 0;
		int right = a.length-1;
		
		while (left <= right) {
			int midpoint = (left+right) / 2;
			if (a[midpoint] == searchValue)
				return midpoint;
			
			else if (a[midpoint] < searchValue)
				left = midpoint + 1;
			else
				right = midpoint -1;
		}//end while
		return -1;
	}
	
}
