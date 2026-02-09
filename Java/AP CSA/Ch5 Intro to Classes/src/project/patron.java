package project;

public class patron {

	//instance variables
	private String name;
	private book b1, b2, b3;
	
	//constructors
	
	public patron (String n) {
		this (n, null, null, null);
	}
	public patron() {
		this ("") ;
	}//end
	public patron (String n, book a, book b, book c) {
		name = n;
		b1=a;
		b2=b;
		b3=c;
	}//end constructors
	
	//other methods
	public String getName() {return name;}
	
	public boolean borrow(book a) {
		if (b1 == null)
			b1 = a;
		else if (b2 == null)
			b2 = a;
		else if (b3 == null)
			b3 = a;
		else
			return false;
		
		return true;		
	}//end borrow
	
	public boolean requestBook(book a)	 {
		
		if(a.getTitle().equals(b1.getTitle()))
			return true;
		else if(a.getTitle().equals(b2.getTitle()))
			return true;
		else if(a.getTitle().equals(b3.getTitle()))
			return true;
		else
			return false;
	}//end requestBook
	
	
	public boolean returnBook (book a) {
		if(a.getTitle().equals(b1.getTitle())) {
			b1 = null;return true;
		}else if(a.getTitle().equals(b2.getTitle())) {
			b2 = null;return true;
		}else if(a.getTitle().equals(b3.getTitle())) {
			b3 = null;return true;
		}else
			return false;
		
	}//end returnBook
	
	
	public String toString() {
		String str = "\nName: " + name;
		if (b1 != null) str += "\n\t" + b1.getTitle();
		if (b2 != null) str += "\n\t" + b2.getTitle();
		if (b3 != null) str += "\n\t" + b3.getTitle();
		return str;
	}
}//end class
