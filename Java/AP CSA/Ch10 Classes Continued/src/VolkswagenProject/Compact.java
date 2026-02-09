package VolkswagenProject;

public class Compact extends VW {
	
	public Compact() {super();}
	public Compact(String n, double p, double mpg) {
		super(n, p, mpg);
	}//end constructor
	
	
	public String characteristics() {
		return "2 Doors";
	}
	public final String TYPE = "Compact";
	public String toString() {
		String str = super.toString() +
						 "\nType: " + TYPE +
						 "\ncharacteristic: " + characteristics() +
						 "\n";
		return str;
	}
}
