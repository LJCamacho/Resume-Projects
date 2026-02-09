package BUS;

public class BigBus {

	//instance variables
	private String busNumber;
	private int pngr, tripMiles;
	private double cost;
	private double mpg; 
	
	final private double DriverRate = 1.5,  FUEL = 3.6;
	final private int maxCAP = 70;

	
	//constructor
	public BigBus() {
		this ("", 0, 0);
		cost = 0;
		mpg = 10;
	}//end

	public BigBus(String num, int p, int t) {
		busNumber = num;
		pngr = p;
		tripMiles = t;
		cost = 0;
		mpg = 10;
		
	}

	
	//Accessor Methods -- Getters --
	public String getbusNumber() {return busNumber;}
	public int getPngr() {return pngr;}
	public int getTripMiles() {return tripMiles;}
	public double getCost() {return cost;}

	
	//Mutator Methods -- Setters --
	public void setBusNumber (String str) {busNumber = str;}
	public void setPngr (int p) {pngr = p;}
	public void setTripMiles (int trip) {tripMiles = trip;}
	public void setCost (double c) {cost = c;}

	//other methods
	public void setMPG() {
		if (0< pngr && pngr <= 20 )
			mpg = 10;
		else if(20< pngr && pngr <= 40 )
			mpg = 9;
		else if(40< pngr && pngr <= 60 )
			mpg = 8;
		else 
			mpg = 7.5;
	
	}
	
	
	public double costOfTrip () {
		cost = tripMiles / mpg * FUEL + DriverRate * tripMiles;
		return cost;
	}
	
	
	//class toString
	public String toString() {
		String str = "\nBus #: " + busNumber + 
						  "\nPassengers: " + pngr +
						  "\nMiles: " + tripMiles +
						  "\nCost: $"+costOfTrip()+ "\n"	;
		return str;
	}	
	
}//end class
