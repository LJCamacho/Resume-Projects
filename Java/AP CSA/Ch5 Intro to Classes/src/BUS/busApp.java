package BUS;

import java.util.Scanner;

public class busApp {


	
	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		//input the number miles
		System.out.println("miles: ");
		int m = r.nextInt();
		
		//input the number of passengers < 70
		System.out.println("passengers: ");
		int p = r.nextInt();
		
		//create a bus with the above attributes
		BigBus soccer = new BigBus("1", p, m);
		
		//determine the cost of the bus....
		/* make adjustments for the passengers
		 * 
		 * 0 < pngr <= 20  mpg = 10
		 * 20 < pngr <= 40 mpg = 9
		 * 40 < pngr <= 60 mpg = 8
		 * 60 < pngr < 70 mpg = 7.5 
		 */
		soccer.setMPG();
		
		System.out.println(soccer.toString());
	
		
		
		//input the number of miles
		System.out.println("miles: ");
		 m = r.nextInt();
		//input the number of passengers > 100 
		System.out.println("passengers: ");
		 p = r.nextInt();
		 
		 int p2 = (p-70);
		 
		//create two buses 
		BigBus band = new BigBus("0", p, m);
		BigBus football = new BigBus("-1", p2, m);
		
		//determine the cost...
		
		band.setMPG(); football.setMPG();	

	}//end main
}//end class