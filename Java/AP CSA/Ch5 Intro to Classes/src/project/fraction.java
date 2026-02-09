package project;

public class fraction {
	//instance variables
	private int n, d;
	
	public fraction(int num, int dem) {
		n = num;
		d = dem;
	}//end constructor
	
	public fraction( ) {
		this(0,1);
	}
	
	//other methods
	
	public int getN() {return n;	}
	public int getD()  {return d;}
	
	
		public fraction add(fraction f) {
			fraction result;
			int numerator = n*f.getD() + d*f.getN();
			int denominator = d*f.getD();
			
			result = new fraction(numerator, denominator);
			
			return result;
		}
	
	public fraction subtract(fraction f) {
		fraction subResult;
		int numerator = n*f.getD() - d*f.getN();
		int denominator = d*f.getD();		
		
		subResult = new fraction(numerator, denominator);
		
		return subResult;
	}
	public fraction multiply(fraction f) {
		fraction multResult;
		int numerator = n*f.getD() * d*f.getN();
		int denominator = d*f.getD();		
		
		multResult = new fraction(numerator, denominator);
		
		return multResult;
	}
	public fraction divide(fraction f) {
		fraction divResult;
		int numerator = n*f.getD() / d*f.getN();
		int denominator = d*f.getD();		
		
		divResult = new fraction(numerator, denominator);
		
		return divResult;
	}
		public String toString() {
			String str = n + " / " + d;
			return str;
		}		
		
}//end fraction


