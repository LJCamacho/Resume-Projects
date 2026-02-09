package VolkswagenProject;

public class Sedan extends VW {

	public Sedan() {super();}
	public Sedan(String n, double p, double mpg) {
		super(n, p, mpg);
	}//end constructor
	
	
	public String characteristics() {
		return "4 Doors";
	}
	public final String TYPE = "Sedan";
	
	public String toString() {
		return super.toString()  +
				 "\nType: " + TYPE +
				 "\ncharacteristics: " + characteristics() +
				 "\n";
	}
}
