package FedExProject;



public class Driver {
	//instance variables
	private String name;
	private double cargoWeight;
	private Package p1, p2, p3, p4;
	
	
	//constructors
	public Driver(String name) {
		this.name = name;
		cargoWeight = 0;
		p1 = p2 = p3 = p4 = null;
		}//end constructor
	
	
	//methods
	public String getName() {return name;}

	public boolean storePackage(Package p) {
		if (p1 == null) {
			p1 = p; return true;
		}else if (p2 == null) {
			p2 = p; return true;
		}else if (p3 == null) {
			p3 = p; return true;
		}else if (p4 == null) {
			p4=p; return true;
		}else {
			System.out.println("Storage full!");
			return false;
		}			
	}//end storePackage
	
	
	
	
	
	public boolean check (Package p) {
		if(p.getWeight() +cargoWeight<= 500)  {
			if(storePackage(p))
				cargoWeight += p.getWeight();
				
			return true;
		}else
			System.out.println("weight capacity is full!");
		return false;
			
	}//end check
	
	
	
	/*
	public boolean check (Package p) {
		if(p.getWeight() +cargoWeight<= 500)  {
			storePackage(p1);
			cargoWeight += p.getWeight();
		}else
			System.out.println("weight capacity is full!");
		if(p.getWeight() + p1.getWeight()+cargoWeight<= 500)  {
			storePackage(p2);
			cargoWeight += p.getWeight();
		}else
			System.out.println("weight capacity is full!");
		if(p.getWeight() + p1.getWeight() + p2.getWeight() + cargoWeight<= 500)  {
			storePackage(p3);
			cargoWeight += p.getWeight();
		}else
			System.out.println("weight capacity is full!");
		if(p.getWeight() + p1.getWeight() + p2.getWeight() + p3.getWeight() + cargoWeight<= 500)  {
			storePackage(p4);
			cargoWeight += p.getWeight();
		}else
			System.out.println("weight capacity is full!");
		return false;
			
	}//end check
	 */
	
	
	
	
	public String toString() {
		String str = "\nName: " + name +
						  "\nCargo weight: " + cargoWeight;
		if (p1 != null) str += "\nItem Code :" + p1.getItemCode();
		if (p2 != null) str += "\nItem Code :" + p2.getItemCode();
		if (p3 != null) str += "\nItem Code :" + p3.getItemCode();
		if (p4 != null) str += "\nItem Code :" + p4.getItemCode();

		return str;
	}
}
