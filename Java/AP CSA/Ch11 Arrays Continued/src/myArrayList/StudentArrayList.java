package myArrayList;

import java.util.Scanner;
import java.util.ArrayList;


public class StudentArrayList {

	public static void main(String[] args) {
		
		ArrayList<Student> roster = new ArrayList<Student>();
		Scanner reader = new Scanner(System.in);
		int i = 0;
		
		//enter three student
		//validate name & grades
		while (true) {
			System.out.println("\nEnter name or press Enter to quit: ");
			Student s = new Student(reader.nextLine());
			if (!(s.validateData() == null)) {
				System.out.println("Goodbye!");
				break;
			}//end if
		
		while (true) {
			try {
				System.out.println("\nEnter grade: ");
				int grade = reader.nextInt();
				
				if (grade < 0 || grade > 100)
					System.out.println("invalid");
				else {
					s.setScore(i+1, grade);
					i++;
				}//end if-else
				if (i == 3) break;
				
			} catch (Exception e) {
				System.out.println("invalid");
				reader.nextLine();
			}//end try-catch
		}//end while
			roster.add(s); i = 0;
			reader.nextLine();
	
		
		}//end while				
		
		
		
		//display roster
		//displayRoster(roster);
		
		//Add a new student: Bob 90, 80, 70
		
		
		//roster.add(new Student("bob",90, 80, 70));
		
		//display roster
		//displayRoster(roster);
		
		//remove student at index 1
		//roster.remove(1);
		
				
		//display student with highest grade
		//displayHighestGrade(roster);
		
		
		//sort the list alphabetically
		insertionSort(roster); displayRoster(roster);
		
	}//end main
	
	private static void insertionSort(ArrayList<Student> n){
		   Student itemToInsert;
		   int j;
		   boolean stillLooking;
		 
		 // On the kth pass, insert item k into its correct position among
		// the first k entries in array.
		 
		for (int k=1 ;  k < n.size(); k++){
		   // Walk backwards through list, looking for slot to insert a[k]
		 	itemToInsert =  n.get(k);  
			 j = k - 1;
		        stillLooking =  true;
		 
		   while ((j >= 0) && stillLooking )
		 	  if (  itemToInsert.getName().compareTo(n.get(j).getName()) < 0 ) {
		 		  n.set(j+1, n.get(j));
		       	 //a[j + 1] = a[j];          	
		        	 j--;
		 	 }else
		                   stillLooking = false;
		  // Upon leaving loop, j + 1 is the index
		   // where itemToInsert  belongs
		   n.set(j+1, itemToInsert);
		   //a[j + 1] =  itemToInsert   ;
		}//end for
		}//end method
	
	public static void displayHighestGrade(ArrayList<Student> n) {
		int maxScoreIndex = 0;
		for(int i = 0; i < n.size(); i++) {
			if(n.get(i).getHighScore()> n.get(maxScoreIndex).getHighScore()) {
				maxScoreIndex = i;
			}
			
		}//end for
		
		System.out.println("Highest Score = " + n.get(maxScoreIndex).getName()+
				"\nWith a score of: " + n.get(maxScoreIndex).getHighScore());
		
	}//end
	
	public static void displayRoster(ArrayList<Student> n) {
		for(Student s: n)
			System.out.println(s.toString());
		
	}
	}//end class
