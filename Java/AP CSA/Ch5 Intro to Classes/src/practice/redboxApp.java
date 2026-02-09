package practice;




public class redboxApp {

	
	public static void main(String[] args) {
	//Instantiate three customers
		//Customer1: Jean, $2, 18
		//Customer2: Bobby, $10, 7
		//Custormer3: Johnny, $3, 5
		customer person1 = new customer("jean", 2, 18);
		customer person2 = new customer("Bobby", 10, 7);
		customer person3 = new customer("Johnny", 3, 5);

	//Instantiate six DVD movies // Rating of 1 = 5+   Rating of 2 = 7+     Rating of 3 = 18+
		
		DVD movie1 = new DVD("Adam Plays Drums", 1);
		DVD movie2 = new DVD("Adam Tries to Play Baseball", 2);
		DVD movie3 = new DVD("Adam Quit Basketball", 3);
		DVD movie4 = new DVD("Adam + Algebra = 2A", 1);
		DVD movie5 = new DVD("Adam Banana", 3);
		DVD movie6 = new DVD("Atom", 2);	
		
	System.out.print("\n-----Action 1 ------\n");		
	//Customer1 rents DVD4 & DVD5
	if(person1.rent(movie4)) {
		person1.transaction();
		System.out.println(person1.toString());
	}
	
	//Customer2 rents DVD2
	if(person2.rent(movie2)) {
		person2.transaction();
		System.out.println(person2.toString());
	}
	//Customer3 rents DVD1
	if(person3.rent(movie1)) {
		person3.transaction();
		System.out.println(person3.toString());
	}
	//Display toStrings...
	System.out.print("\n-----Action 2 ------\n");
	
	//Determine if Customer3 is allowed to rent DVD3
	if(person3.rent(movie3)) {
		person3.transaction();
		System.out.println(person3.toString());
	}
	//Determine if Customer1 has $ to rent DVD6
	if(person1.rent(movie6)) {
		person1.transaction();
		System.out.println(person1.toString());
	}
	
	System.out.print("\n-----Action 3 ------\n");
	//Customer2 returns DVD2
	if(person2.returnDVD(movie2))
		if (person2.returnDVD(movie2))
			System.out.println("thank you");
		else
			System.out.println("I'll charge you");
	else
		System.out.println("thank you");
	//Customer2 rents DVD6
	
	//Display toStrings...
	}

}