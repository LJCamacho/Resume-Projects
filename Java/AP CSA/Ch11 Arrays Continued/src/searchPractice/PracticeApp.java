package searchPractice;

public class PracticeApp {
	
	
	public static int search(Object[] a, Object searchValue) {
		int left = 0;
		int right = a.length-1;
		while (left <= right) {
			int midpoint = (left + right) / 2;
			int result = ((Comparable)a[midpoint]).compareTo(searchValue);
			if (result == 0)
				return midpoint;
			else if (result < 0)
				left = midpoint + 1;
			else
				right = midpoint - 1;
		}
		return -1;
	}
	public static int search(int[] a, int searchValue) {
		int left = 0;
		int right = a.length-1;
		while (left <= right) {
			int midpoint = (left + right) / 2;
			if (a[midpoint]== searchValue)
				return midpoint;
			else if (a[midpoint] < searchValue)
				left = midpoint + 1;
			else
				right = midpoint - 1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int [] beans = {2, 4, 6, 7, 8, 10, 12, 14, 15, 18};
		Object [] greens = {"Adam", "Drew", "Justine", "Logan", "Matt", "Mauro", "Mike", "Ryan"};
		System.out.println(search(greens, "Logan"));
		//System.out.println(search(beans, 7));
		
	}

}
