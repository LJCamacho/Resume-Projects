package VolkswagenProject;

public class VWApp {

	public static void main(String[] args) {
		VW car[] = new VW[10];
		
		car[0] = new Compact     ("Jetta",  25000.00, 20.5);
		car[1] = new Sedan		 ("Bug",  55000.00, 43.7);
		car[2] = new SUV		 ("Nitro",  43000.00, 13.9);
		car[3] = new Wagons		 ("Supreme",  90000.00, 18.7);
		car[4] = new Convertible ("Jetta",  50000.00, 20.0);
		car[5] = new Compact	 ("Golf",  27000.00, 20.5);
		car[6] = new Convertible ("Zeus",  14000.00, 6.7);
		car[7] = new SUV		 ("Atlas",  30000.00, 18.3);
		car[8] = new Wagons		 ("Boogie",  15000.00, 23.5);
		car[9] = new Sedan		 ("Nissan",  12000.00, 19.7);
		
		
		System.out.print(car[0].toString());
		System.out.print(car[1].toString());
		System.out.print(car[2].toString());
		System.out.print(car[3].toString());
		System.out.print(car[4].toString());
		System.out.print(car[5].toString());
		System.out.print(car[6].toString());
		System.out.print(car[7].toString());
		System.out.print(car[8].toString());
		System.out.print(car[9].toString());
		
		
		System.out.println(VW.getCount());
		
	}

}
