package simpleArrays;

public class ArrayWarmup2 {

	public static void main(String[] args) {
		String [] nm = {"Mauro", "Logan", "Mike", "Ryan", "Drew", "Adam", "Matt", "Justin"};
		int [] age = {15, 15, 18, 16, 17, 12, 17, 17};
		String[] x = new String[age.length];
		
		String str = "";
		for (int i = 0; i < nm.length; i++) {
			x[i] = nm[i]+ " "+age[i];
			str += nm[i]+" ";
		}
		
		
		
		//output
		for (int j = 0; j < x.length; j++)
			System.out.println(x[j]);
		
		
		System.out.println(str);
	}
}
