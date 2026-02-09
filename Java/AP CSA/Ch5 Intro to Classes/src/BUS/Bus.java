package BUS;

public class Bus {

	public static void main(String[] args) {
		
		
		/* ---------Action 1 ------------*/
		//create a bus
		BigBus bus = new BigBus();				
		//no clue
		
		//deposit $500
		bus.deposit(500);		   
		//withdrawal $800
		bus.withdrawal(800);		
		//ATM service fee $1.50
		bus.serviceFee();
		//Monthly interest: 2%
		bus.monthlyInterest();
		
		//show busNumber
		System.out.println("Bus number: " + bus.getBusNumber());
		/* ---------Action 2 ------------*/
		
		//create another bank BigBus
		//assign Mr Banks
		//deposit $3200
		BigBus sauce = new BigBus ("Mr. Banks", 3200);
						
		
		//withdrawal $2432.16
		sauce.withdrawal(2432.16);				
		//ATM service fee $1.50
		sauce.serviceFee();
		
		//Monthly interest: 2%
		sauce.monthlyInterest();				   
		//Show Mr. Bank's balance
		System.out.println (sauce.toString());
		
	
	}//end main

}//end class