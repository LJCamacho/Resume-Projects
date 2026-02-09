package VolkswagenProject;

public class SUV extends VW{

	
	public SUV() {super();}
	public SUV(String n, double p, double mpg) {
		super(n, p, mpg);
	}//end constructor
	
	
	public String characteristics() {
		return "4 Wheel Drive";
	}
	public final String TYPE = "SUV";
	public String toString() {
		String str = super.toString() +
						 "\nType: " + TYPE +
						 "\ncharacteristics: " + characteristics() +
						 "\n";
		return str;
	}
}
