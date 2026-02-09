package RedBox;

import project.book;
import project.patron;

public class RedBoxApp {

	
	public static void main(String[] args) {
	//Instantiate three customers
	


	//Instantiate six DVD movies // Rating of 1 = 5+   Rating of 2 = 7+     Rating of 3 = 18+
		//DVD1: title and rating of 1
		DVD dvd1 = new DVD("Art of the Sauce", 1);
		//DVD2: title and rating of 2
		DVD dvd2 = new DVD("Art of the Sauce 2: Electric Boogaloo", 2);
		//DVD3: title and rating of 3
		DVD dvd3 = new DVD("Edgy", 3);
		//DVD4: title and rating of 1
		DVD dvd4 = new DVD("How to get rich", 1);
		//DVD4: title and rating of 1
		DVD dvd5 = new DVD("Cooking with Gordon Ramsey", 2);
		//DVD4: title and rating of 1
		DVD dvd6 = new DVD("How to get rich 2", 3);		
	//Customer1: Jean, $2, 18
	//Customer2: Bobby, $10, 7
	//Custormer3: Johnny, $3, 5	
	
	
	customer c1 = new customer ("Jean");
	customer c2 = new customer ("Bobby");
	customer c3 = new customer ("Johnny");

	
	
	System.out.print("\n-----Action 1 ------\n");		
	//Customer1 rents DVD4 & DVD5
	if (c1.rentDVD(dvd4) && c1.rentDVD(dvd5)) {
		System.out.println(c1.getName() + " rented " + dvd4.getTitle() + " and " + dvd5.getTitle());
	}
		
	//Customer2 rents DVD2
	if (c2.rentDVD(dvd2)) {
		System.out.println(c2.getName() + " rented " + dvd2.getTitle());
	}
	//Customer3 rents DVD1
	if (c3.rentDVD(dvd1)) {
		System.out.println(c3.getName() + " rented " + dvd1.getTitle());
	}
	//Display toStrings...
	System.out.print("\n-----Action 2 ------\n");
	
	//Determine if Customer3 is allowed to rent DVD3
	
	//Determine if Customer1 has $ to rent DVD6
	
	
	System.out.print("\n-----Action 3 ------\n");
	//Customer2 returns DVD2
	if(c2.rentDVD(dvd2))
		if (c2.returnDVD(dvd2))
			System.out.println("thank you");
		else
			System.out.println("I'll charge you");
	else
		System.out.println("thank you");
	
	
	System.out.println("\n*********************\n");
	
	
	//Customer2 rents DVD6
	if (c2.rentDVD(dvd6)) {
		System.out.println(c2.getName() + " rented " + dvd6.getTitle());
	}
	//Display toStrings...
	System.out.println(c1.toString());
	System.out.println(c2.toString());
	System.out.println(c3.toString());
	}

}