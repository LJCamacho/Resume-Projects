package FedExProject;

import java.util.Random;
import java.util.Scanner;

public class FedExProject {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random rnd = new Random();
		
		/*------FedEx------ 
		 * Design a class called 'Driver' and 'Package'
		 * Driver - will have a String name, double cargoWeight, and four Packages
		 * Package - will have a double weight, String itemCode
		 * 
		 * The driver is not allowed to haul weight exceeding 500 lbs (1/4 ton)
		 * The driver is to check the weight before loading the package
		 * If the driver met his/her max cargo weight then print a 
		 * statement "weight capacity is full!"
		 */

		//initial Packages
		Package pk1 = new Package("10-26-15-1", 0.0);
		Package pk2 = new Package("10-26-15-2", 0.0);
		Package pk3 = new Package("10-26-15-3", 0.0);
		Package pk4 = new Package("10-26-15-4", 0.0);
		
		Driver d = new Driver("Drew");
		//-----------------Stop #1----------------
		System.out.println("-----Stop #1-----");
		//package 10-26-15-1
		pk1.setWeight(rnd.nextInt(300)+1);
		System.out.println(pk1.getItemCode()+" weighs "+pk1.getWeight());
		//driver pickup the package
		d.check(pk1);
		
		
		
		System.out.println("Press any key to continue...");
		input.nextLine();
		
		//-----------------Stop #2----------------
		System.out.println("-----Stop #2-----");
		//package 10-26-15-2
		pk2.setWeight(rnd.nextInt(200)+25);
		System.out.println(pk2.getItemCode()+" weigh's "+pk2.getWeight());
		//driver pickup the package
		d.check(pk2);
		System.out.println("Press any key to continue...");
		input.nextLine();
		
		//-----------------Stop #3----------------
		System.out.println("-----Stop #3-----");
		//package 10-26-15-3
		pk3.setWeight(rnd.nextInt(40)+50);
		System.out.println(pk3.getItemCode()+" weigh's "+pk3.getWeight());
		//driver pickup the package
		d.check(pk3);	
		System.out.println("Press any key to continue...");
		input.nextLine();
		
		//-----------------Stop #4----------------
		System.out.println("-----Stop #4-----");
		//package 10-26-15-4
		pk4.setWeight(rnd.nextInt(40)+50);
		System.out.println(pk4.getItemCode()+" weigh's "+pk4.getWeight());
		//driver pickup the package
		d.check(pk4);				
		System.out.println("Press any key to continue...");
		input.nextLine();
		
		//Display the cargo inventory and total weight
		System.out.println(d.toString());

		
		
	}//end main
}//end class
