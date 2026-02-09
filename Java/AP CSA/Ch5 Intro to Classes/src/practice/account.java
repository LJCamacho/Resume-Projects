package practice;

public class account {

	//instance variables
	private String name;
	private double balance;
	
	//constructor
	public account() {
		this (" ", 0.0);
	}//end
	
	public account(String nm) {
		this (nm, 0.0);
	}
	
	public account(account a) {
		this(a.getName(), a.getBalance());
	}
	
	public account(String nm, double money) {
		name = nm;
		balance = money;
	}//end
	
	//Accessor Methods -- Getters --
	public String getName() {return name;}
	public double getBalance() {return balance;}
	
	//Mutator Methods -- Setters --
	public void setName (String n) {name = n;}
	public void setBalance (double n) {balance = n;}

	//other methods
	public void deposit (double m) {
		balance += m;
	}//end deposit
	
	public void withdrawal (double w) {
		balance -= w;
	}//end withdrawal
	
	public void serviceFee () {
		balance -= 1.50;
	}
	public void serviceFee (double fee)	{
		balance -= fee;
	}
	
	public void monthlyInterest () {
		balance *= 1.02;
	}
	
	//class toString
	public String toString() {
		String str = "\nName: " + name + 
						  "\nBalance: " + balance;
		return str;
	}	
	
}//end class
