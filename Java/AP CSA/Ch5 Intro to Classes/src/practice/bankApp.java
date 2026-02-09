package practice;

public class bankApp {

	public static void main(String[] args) {
		
		/* ---------Action 1 ------------*/
		//create a bank account
		account tape = new account();				
		//assign Ray and $2000
		 tape.setName("Ray"); tape.setBalance(2000);
		//deposit $500
		tape.deposit(500);		   
		//withdrawal $800
		tape.withdrawal(800);		
		//ATM service fee $1.50
		tape.serviceFee();
		//Monthly interest: 2%
		tape.monthlyInterest();
		
		//Show Ray's balance
		System.out.println("Balance = " + tape.getBalance());
		/* ---------Action 2 ------------*/
		
		//create another bank account
		//assign Mr Banks
		//deposit $3200
		account water = new account ("Mr. Banks", 3200);
						
		
		//withdrawal $2432.16
		water.withdrawal(2432.16);				
		//ATM service fee $1.50
		water.serviceFee();
		
		//Monthly interest: 2%
		water.monthlyInterest();				   
		//Show Mr. Bank's balance
		System.out.println (water.toString());
		
		/* ---------Action 3------------*/
		
		//using an if structure determine who has more $ in the account
		if (water.getBalance() > tape.getBalance()) 
			System.out.print("Mr. Banks has a larger balance");
		else
			System.out.print("Ray has a larger balance");
		
		/* ---------Action 4------------*/
		
		//clone Ray's account 
		account door = new account (tape);
		//re - assign name to "Jeb"
		door.setName("Jeb!");
		//display Jeb's toString
		 System.out.println (door.toString()); 
	}//end main

}//end class