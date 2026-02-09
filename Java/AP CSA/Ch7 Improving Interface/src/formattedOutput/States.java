package formattedOutput;

public class States {

	public static void main(String[] args) {

		String pa = "PA", de = "DE", tx = "TX";
		double paA = 44817.00, deA = 1981.00, txA = 268597.00;
		int paC = 67, deC = 3, txC = 254;
		int paP = 12702379, deP = 952065, txP = 24695284;
		 
		System.out.printf("%-8s%-11s%-13s%-10s", "State", "Land Area", "Counties", "Population");
		System.out.printf("%n%3s%,14.2f%10d%,15d", pa, paA, paC, paP);
		System.out.printf("%n%3s%,14.2f%10d%,15d", de, deA, deC, deP);
		System.out.printf("%n%3s%,14.2f%10d%,15d", tx, txA, txC, txP);

		
		
		
	}//end main
}//end class
