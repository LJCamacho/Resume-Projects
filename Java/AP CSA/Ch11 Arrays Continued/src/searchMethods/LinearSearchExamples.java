package searchMethods;

public class LinearSearchExamples {

	public static void main(String[] args) {

		int [] n = {143, 2, 178, 115, 249, 40, 156, 133, 300};
		String [] str = {"Suzanne", "Claire", "Kendall", "Brian", "Samantha", "Belynda", "Stephany", "Jenn"};
		
		Student [] java = new Student[8];
		for(int i = 0; i < java.length; i++)
			java[i] = new Student("name"+(i+1));
		
		
		int index = search(n, 115);
		
		int indexName = searchName(str, "Brian");
		
		int indexStudent = searchStudent(java, "name3");
		
		if (indexStudent != -1)
			System.out.println("Item found at index " + indexStudent);
		else
			System.out.println("Not found!");
		
	}//end main

	
	static public int search(int[] array, int target) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == target) {
				return i;
			}//end if
			
		}//end for
		
		return -1;
		
	}
	static public int searchName(String[] name, String target) {
		for(int i = 0; i < name.length; i++) {
			if(name[i].equals(target)) {
				return i;
			}//end if
			
		}//end for
		
		return -1;
		
	}
	static public int searchStudent(Student[] student, String target) {
		for(int i = 0; i < student.length; i++) {
			if(student[i].getName().equals(target)) {
				return i;
			}//end if
			
		}//end for
		
		return -1;
		
	}
	
}//end class
