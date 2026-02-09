package project;

public class libApp {

	public static void main(String[] args) {
		book drew = new book("Dr. Drew", "Uncle Drew");
		book adam = new book("I love my brother", "Steven P");
		book matt = new book("The day I cheered", "Matty");
		book mike = new book("Lights, Camera, Action", "MC Hammer");
		book ryan = new book("When its game day", "nayr");
		book logan = new book("Logan's Legos", "Logo");
		book mauro = new book("Mauro's Comics", "Mauro");
		book temple = new book(" Teacher Farmer all day", "Mr. T");
		book justin = new book("my short lived acting career", "Justin");
		
		patron p1 = new patron ("Jack");
		
		if (p1.borrow(logan)) {
			System.out.println(p1.getName() + " borrowed " + logan.getTitle());
		}else
			System.out.println("no room!");
		if (p1.borrow(ryan)) {
			System.out.println(p1.getName() + " borrowed " + ryan.getTitle());
		}else
			System.out.println("no room!");
		if (p1.borrow(justin)) {
			System.out.println(p1.getName() + " borrowed " + justin.getTitle());
		}else
			System.out.println("no room!");
		if (p1.borrow(matt)) {
			System.out.println(p1.getName() + " borrowed " + matt.getTitle());
		}else
			System.out.println("no room!");
		
		
		
		
		if (p1.requestBook(justin))
			System.out.println(p1.getName() + " has "+ justin.getTitle());
		else
			System.out.println("nope");
		if (p1.requestBook(adam))
			System.out.println(p1.getName() + " has "+ adam.getTitle());
		else
			System.out.println("nope");		
		
		
		
		if(p1.requestBook(ryan))
			if (p1.returnBook(ryan))
				System.out.println("thank you");
			else
				System.out.println("I'll charge you");
		else
			System.out.println("thank you");
		
		
		System.out.println("\n*********************\n");
		System.out.println(p1.toString());
		
	}
}
