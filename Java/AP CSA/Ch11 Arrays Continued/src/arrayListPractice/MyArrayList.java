package arrayListPractice;

import java.util.ArrayList;

public class MyArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i = 0; i < 5; i++)
			list.add("item" + (i+1));
			
		//display	
		for(String str: list)
			System.out.print(str + ", ");
		
		list.add("Temple");
		list.remove(1);list.remove(2);
		System.out.println();
		for(String str: list)
			System.out.print(str + ", ");
		
		System.out.println();
		
		list.set(1, "Student");
		list.set(2, "Teacher");
		for(String str: list)
			System.out.print(str + ", ");
		
	}

}
