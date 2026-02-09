package FedExProject;

public class Package {
	//instance variables
	private String itemCode;
	private double weight;
	
	//constructors
	public Package( String iC, double w) {
		itemCode = iC;
		weight =  w;
	}//end
	public Package () {
		this ("", 0.0);
	}
	//end constructors
	
	//methods
	public String getItemCode() {return itemCode;}
	public void setWeight(double w) { weight=w;}
	public double getWeight() {return weight;}
	
	
	
	
	
	
	public String toString() {
		String str = "\nItem Code: " + itemCode + 
						  "\nWeight: " + weight;
			return str;
	}
	
	
}
