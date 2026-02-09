package VolkswagenProject;

public class Convertible extends Compact {

	public Convertible() {super();}
	public Convertible(String n, double p, double mpg) {
		super(n, p, mpg);
	}//end constructor
	
	
	public String characteristics() {
		return super.characteristics() + " - No roof";
	}
	
	public String toString() {
		String str = super.toString() +
					 "\ncharacteristics: " + characteristics() +
					 "\n";
		return str;
	}
}
