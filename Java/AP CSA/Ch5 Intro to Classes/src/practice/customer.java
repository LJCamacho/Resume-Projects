package practice;

import project.book;

public class customer {
	//instance variables
	private String name;
	private double balance;
	private int age;
	private DVD d1, d2, d3;
	
	//constructors
	public customer(String name, double b, int a) {
		this.name = name;
		balance = b;
		age = a;
		d1 = null; d2 = null; d3 = null;
		
	}//end constructor
	
	//methods
	public String getName() {return name;}
	public void transaction() {balance --;}
	
	public boolean storeDVD(DVD m) {
		if(d1 == null)  {
			d1 = m;
			return true;
		}
		else if(d2 == null)  {
			d2 = m;
			return true;
		}else if(d3 == null)  {
			d3 = m;
			return true;
		}else {
			
			System.out.println("Storage full!");
			return false;
		}//end if
		
		
	}
	
	
	public boolean rent (DVD movie4) {
		if(balance >= 1) {
			if(movie4.getRating() == 1) 
				if(storeDVD(movie4)) 
					return true;
				else
					System.out.println("Not appropriate for "+ name);
	
			if(movie4.getRating()==2)	
					if(age >= 7) {
						if (storeDVD(movie4))
							return true;
				}else
					System.out.println("Not appropriate for "+ name);
			if (movie4.getRating()==3)
				if (age >= 18) {
					if (storeDVD(movie4))
						return true;
				}else
					System.out.println("Not appropriate for "+ name);
		}
		return false;
			
	}//end rent
	
	
	
	public String toString() {
		String str = "\nName: " + name +
						  "\nBalance: " + balance;
		if (d1 != null) str += "\nDVD: " + d1.getTitle();
		if (d2 != null) str += "\nDVD: " + d2.getTitle();
		if (d3 != null) str += "\nDVD: " + d3.getTitle();
		return str;
	}
	public boolean returnDVD (DVD movie2) {
		if(movie2.getTitle().equals(movie2.getTitle())) {
			movie2 = null;return true;
		}else
			return false;
		
	
	}//end returnBook
	
}

	