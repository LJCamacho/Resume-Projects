package sortingMethods;
import java.util.Random;
public class SortingApp {

	public static void main(String[] args) {
		Random gen = new Random();
		int[] a = new int[20];
		
		for(int i = 0; i < a.length; i++)
			a[i] = gen.nextInt(100);
		
		printArray(a);
		bubbleSort(a);
		
		printArray(a);
		
		
	}
	public static void printArray(int[] a) {
		for(int i: a)
			System.out.print(i + " ");
		System.out.println();
	}//end print array
	
	public static void selectionSort (int [ ] a) {
	 	for ( int i = 0; i < a.length-1; i++) {
	     	       int minIndex = findMinimum(a, i) ;
	     	if (minIndex != i )
	  	      swap(a, i, minIndex) ;
	 	}//end for
	}//end method
	
	static public  int findMinimum( int [ ] a, int first){
		int minIndex = first;
		for ( int i = first+1; i < a.length; i++)
	   	      if(a[i] < a[minIndex] )
	                           minIndex =  i   ;
		return  minIndex  ;
	}//end method
	
	static public void swap (int [ ] a, int x, int y) {
     	int temp =a[x];  
     	a[x] =a[y] ;
     	a[y] = temp;
}//end method

	public static void bubbleSort (int[] a){
   	 int k = 0;
   	boolean exchangeMade =  true ;

   	while(k < a.length - 1 && exchangeMade    ){
   	     	exchangeMade = false ;
   	     	k++;
           	for(int j = 0 ; j <a.length-k; j++)
                  	 if( a[j] > a[j+1]) {
                                 	swap( a, j, j+1);
                                 	exchangeMade =  true;
                   	   }//end if
   	}//end while
}//end method 
	
	private static void insertionSort(int[] a){
		   int itemToInsert,  j;
		   boolean stillLooking;
		 
		 // On the kth pass, insert item k into its correct position among
		// the first k entries in array.
		 
		for (int k=1 ;  k < a.length; k++){
		   // Walk backwards through list, looking for slot to insert a[k]
		 	itemToInsert =  a[k]  ;  
			 j = k - 1;
		        stillLooking =  true;
		 
		   while ((j >= 0) && stillLooking )
		 	  if (  itemToInsert<a[j] ) {
		       	 a[j + 1] = a[j];          	
		        	 j--;
		 	 }else
		                   stillLooking = false;
		  // Upon leaving loop, j + 1 is the index
		   // where itemToInsert  belongs
		   a[j + 1] =  itemToInsert   ;
		}//end for
		}//end method

}
