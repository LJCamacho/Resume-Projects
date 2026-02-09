package VolkswagenProject;

public abstract class VW {
	//instance variables
	protected String Name;
	protected double Price;
	protected double MPG;
	protected static int count;
	
	
	public VW() {
		Name = "";
		Price = 0.0; MPG = 0.0;		
	}
	
	public VW(String n, double p, double mpg) {
		Name = n; Price = p; MPG = mpg;
		count++;
	}

	public final String getName() {return Name;}
	public final void setName(String Name) {this.Name = Name;}
	public final double getPrice() {return Price;}
	public final void setPrice(double price) {Price = price;}
	public final double getMPG() {return MPG;}
	public final void setMPG(double mPG) {MPG = mPG;}
	public static final int getCount() {return count;}
	public static final void setCount(int c) {count = c;}
	

	
	//abstract method
	abstract public String characteristics();
	
	
	public String toString() {
		String str = "\nModel: " + Name
						+ "\nPrice: " + Price 
						+ "\nMPG: " + MPG;
		return str;
	}
	
}//end YS
