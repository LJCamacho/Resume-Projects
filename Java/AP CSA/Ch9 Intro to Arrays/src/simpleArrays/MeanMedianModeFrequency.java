package simpleArrays;

import java.io.PrintStream;

public class MeanMedianModeFrequency {

	public static void main(String[] args) {
		int []	array ={ 1, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5, 6, 6, 7, 8, 9, 9};
		int [] array2 = {1, 1, 1, 2, 2, 5, 5, 7, 8, 9};

		System.out.println("Mean= " + findMean(array));
		System.out.println("Median = " + findMedian(array));
		System.out.println("Mode = " + findMode(array));

			
		int [] tally = frequency(array);
		int [] [] freqTable = freqTable(array, tally);
		displayFreqTable(freqTable);
		
		
	}//end main
	
	public static void displayFreqTable(int [][] freqT) {
		String str = "";
		
		for(int i = 0; i < freqT.length; i++) {
			System.out.print(freqT[i][0] + "");
			for (int j = 0; j < freqT[i][1]; j++) {
				str += "|";
				
			}//end inside
			System.out.print(str + "\n");
			str = "";
		}//end outside
		
		
	}
	
	
	public static int [] [] freqTable (int [] n, int [] freq) {
		int [] [] freqT = new int[n.length][2];
		int size = 0;
		
		for(int i = 1; i < n.length; i++) {
			if(n[i-1] != n[i]) {
				freqT[size][0] = n[i-1];
				freqT[size][1] = freq[i-1];
				size++;
			}//end if
			if(i == n.length-1 && n[i-1] != n[i]) {
				freqT[size][0] = n[i];
				freqT[size][1] = freq[i];
				size++;			
			}//end if
		}//end for loop
			return freqT;
		
	}//end freqTable
	//add frequency table
	public static int[] frequency(int[] n) {
		
		int[] freq = new int [n.length];
		int count = 0;
		
		for(int j = 0; j < n.length; j++) {
			for(int i = 0; i < n.length; i++) {
				if(n[j]==n[i])
					count++;
			}//end inside
			freq[j] = count;
			count = 0;
		}//end outside
		
		return freq;
	}//end frequency
	
	/*
	public static int findFrequency(int[] n) {
		int count = 0;
		int m = -1, max = -1;
		int [] tally = new int [n.length];
		String [] tallyMark = new String [n.length];
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
		
	}
	*/
	
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
