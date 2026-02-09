package VolkswagenProject;

public class Wagons extends Sedan {
	public Wagons() {super();}
	public Wagons(String n, double p, double mpg) {
		super(n, p, mpg);
	}//end constructor
	
	
	public String characteristics() {
		return super.characteristics() + " - Large trunk";
	}
	
	public String toString() {
		String str = super.toString() +
					"\ncharacteristics: " + characteristics() +
					 "\n";
		return str;
	}
}
