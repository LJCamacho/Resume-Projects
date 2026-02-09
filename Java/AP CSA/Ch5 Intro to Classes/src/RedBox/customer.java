package RedBox;

import project.book;

public class customer {
	
	//instance variables
	private String name;
	private DVD dvd1, dvd2, dvd3, dvd4, dvd5, dvd6;
	private int age, cash;
	
	//constructors
	
	public customer (String n, int a, int c) {
		this (n, a, c);
	}
	public customer() {
		this (n, a, c) ;
	}//end
	public void customer () {
		name = n;
		cash = c;
		age = a;
		
	}//end constructors
	
	//other methods
	public String getName() {return name;}
	
	
	public boolean rentDVD(DVD a)	 {
		
		if(a.getTitle().equals(dvd1.getTitle()))
			return true;
		else if(a.getTitle().equals(dvd2.getTitle()))
			return true;
		else if(a.getTitle().equals(dvd3.getTitle()))
			return true;
		else if(a.getTitle().equals(dvd4.getTitle()))
			return true;
		else if(a.getTitle().equals(dvd5.getTitle()))
			return true;
		else if(a.getTitle().equals(dvd6.getTitle()))
			return true;
		else
			return false;
	}//end rentDVD
	
	
	public boolean returnDVD (DVD a) {
		if(a.getTitle().equals(dvd1.getTitle())) {
			dvd1 = null;return true;
		}else if(a.getTitle().equals(dvd2.getTitle())) {
			dvd2 = null;return true;
		}else if(a.getTitle().equals(dvd3.getTitle())) {
			dvd3 = null;return true;
		}else if(a.getTitle().equals(dvd4.getTitle())) {
			dvd4 = null;return true;
		}else if(a.getTitle().equals(dvd5.getTitle())) {
			dvd5 = null;return true;
		}else if(a.getTitle().equals(dvd6.getTitle())) {
			dvd6 = null;return true;
		}else
			return false;
		
	}//end returnDVD
	
	
	public String toString() {
		String str = "\nName: " + name;
		if (dvd1 != null) str += "\n\t" + dvd1.getTitle();
		if (dvd2 != null) str += "\n\t" + dvd2.getTitle();
		if (dvd3 != null) str += "\n\t" + dvd3.getTitle();
		if (dvd4 != null) str += "\n\t" + dvd1.getTitle();
		if (dvd5 != null) str += "\n\t" + dvd2.getTitle();
		if (dvd6 != null) str += "\n\t" + dvd3.getTitle();
		return str;
	}
}//end class
