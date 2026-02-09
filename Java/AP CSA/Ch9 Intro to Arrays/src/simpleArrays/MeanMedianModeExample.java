package simpleArrays;

public class MeanMedianModeExample {

	public static void main(String[] args) {
		int []	array ={ 1, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5, 6, 6, 7, 8, 9, 9};
		int [] array2 = {1, 1, 1, 2, 2, 5, 5, 7, 8, 9};
		System.out.println("Mean= " + findMean(array2));
		System.out.println("Median = " + findMedian(array2));
		System.out.println("Mode = " + findMode(array2));
		
	}//end main
	
	//add frequency table
	
	public static int findMode(int[] n)  {
		int count = 0;
		int m = -1; int max = -1;
		int [] tally = new int [n.length];
		
		for (int j = 0; j < n.length; j++) {
			for(int i = 0; i < n.length; i++) {
				if(n[j] == n[i]) {
					count++;
				}//end if
			}//end inside
			tally[j] = count;
			count = 0;
		}//end outside
		
		for (int i = 0; i < tally.length; i++) {
			if(tally[i] >= m) {
				m = tally[i];
				max = i;
			}//end if
		}//end for
		if (m == -1) {
			System.out.println("No mode");
			return  -1;
		}else
			return n[max];

	}//end findMode
	
	
	
	public static double findMedian(int [] n) {
		if (n.length %2 == 0) {
			return (n[n.length/2] + n[n.length/2-1])/2.0;
		}else {
			return n[(n.length) /2];
		}
		
		
	}
	
	
	
	
	public static double findMean(int[] n) {
		int sum = 0;
		for (int element : n)
			sum+= element;
		
		return (double)sum/n.length;
	}
	
	
	
}//end class
