package project;

public class fractionApp {

	public static void main(String[] args) {
		fraction half = new fraction(1,2);
		fraction quarter = new fraction(1,4);
		
		//display
		fraction result = half.add(quarter);
		System.out.println(half.toString() + " + " 
									+ quarter.toString() + " = " 
									+ result.toString());
		fraction subResult = half.subtract(quarter);
		System.out.println(half.toString() + " - " 
									+ quarter.toString() + " = " 
									+ subResult.toString());
		fraction multResult = half.multiply(quarter);
		System.out.println(half.toString() + " * " 
									+ quarter.toString() + " = " 
									+ multResult.toString());	
		fraction divResult = half.divide(quarter);
		System.out.println(half.toString() + " / " 
									+ quarter.toString() + " = " 
									+ divResult.toString());
	}
}
