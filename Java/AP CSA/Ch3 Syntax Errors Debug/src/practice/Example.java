package practice;


import java.util.Scanner;
public class Example {
public static void main (String[] args){
 
           	Scanner reader = new Scanner(System.in);
           	String name;
           	int age;
           	double weight;
 

 
           	System.out.print ("Enter your age: ");
           	age = reader.nextInt ();
 
           	System.out.print ("enter your weight: ");
           	weight = reader.nextDouble();
           	
           	//consume line
           	reader.nextLine();
           	
           	System.out.print("Enter name: ");
           	name = reader.nextLine();
           	
           	System.out.print (name +" you are " + age + " years old "
                            + " and weigh "  + weight);
           	
  }
}
