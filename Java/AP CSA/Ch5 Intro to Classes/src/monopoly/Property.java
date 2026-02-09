package monopoly;

public class Property {
	//instance variables
	private String name;
	private int cost, rent;
	
	//constructors
		public Property( String n, int c,int r) {
			name = n;
			cost = c;
			rent = r;
			
		}//end
		public Property () {
			this ("",  0, 0);
		}
		//end constructors
	
		public String getName() {return name;}
		public void setCost(int c) { cost=c;}
		public void setRent(int r) {rent = r;}
		public int getCost() {return cost;}
		public int getRent() {return rent;}

		
		
		
		
		
		
		public String toStringp1() {
			String str = "\nName: " + name + 
							  "\nCost: " + cost +
							  "\nRent: " + rent;
				return str;
		}//end toString
		public String toStringP2() {
			String str = "\nName: " + name + 
							  "\nCost: " + cost +
							  "\nRent: " + rent;
				return str;
		}//end toString
}
