package monopoly;
public class MonopolyBoard {
  public static void main (String args[]){
	  
     /*Properties
     http://www.math.yorku.ca/~zabrocki/math2042/Monopoly/prices.html*/
     Property prop1 = new Property ("Mediterranean Avenue", 60, 2);
     Property prop2 = new Property ("Baltic Avenue", 60, 4);
     Property prop3 = new Property ("Reading Railroad", 200, 25);
     Property prop4 = new Property ("Oriental Avenue", 100, 6);
     Property prop5 = new Property ("Vermont Avenue", 100, 6);
     Property prop6 = new Property ("Connecticut Avenue", 120, 8);
     Property prop7 = new Property ("St. Charles Place", 140, 10);
     Property prop8 = new Property ("Electric Company", 150, 15);
     Property prop9 = new Property ("States Avenue", 140, 10);
     Property prop10 = new Property ("Virginia Avenue", 160, 12);
     Property prop11 = new Property ("Pennsylvania Railroad", 200, 25);
     Property prop12 = new Property ("St. James Place", 180, 14);
     Property prop13 = new Property ("Tennessee Avenue", 180, 14) ;
     Property prop14 = new Property ("New York Avenue",  200, 16);
     Property prop15 = new Property ("Kentucky Avenue",  220, 18);
     Property prop16 = new Property ("Indiana Avenue", 220, 18);
     Property prop17 = new Property ("Illinois Avenue", 240, 20);
     Property prop18 = new Property ("B & O Railroad", 200, 25);
     Property prop19 = new Property ("Atlantic Avenue", 260, 22);
     Property prop20 = new Property ("Ventnor Avenue", 260, 22);
     Property prop21 = new Property ("Water Works", 150, 15);
     Property prop22 = new Property ("Marvin Gardens", 280, 22);
     Property prop23 = new Property ("Pacific Avenue", 300, 26);
     Property prop24 = new Property ("North Carolina", 300, 26);
     Property prop25 = new Property ("Pennsylvania Avenue", 320, 28);
     Property prop26 = new Property ("Short Line Railroad", 200, 25);
     Property prop27 = new Property ("Park Place", 350, 35);
     Property prop28 = new Property ("Boardwalk",  400, 50);
 
    
    //Players [Name and initial $]
	  Player p = new Player("Stanley");
	  Player p2 = new Player("Michele");
	  Player p3 = new Player("Steve");
	  
    /*
     * ------------------------Round 1 -----------------------
     */
   
    /*
     * P1 buys four properties...determine if P1 can afford each property before purchase. 
     * Connecticut Avenue, Virginia Avenue, New York Avenue, Boardwalk	    */
	  if (p.getBalance()>= prop6.getCost()) {
		  p.buyProperty(prop6);
	  }
	  if (p.getBalance()>= prop10.getCost()) {
		  p.buyProperty(prop10);
	  }
	  if (p.getBalance()>= prop14.getCost()) {
		  p.buyProperty(prop14);
	  }
	  if (p.getBalance()>= prop28.getCost()) {
		  p.buyProperty(prop28);
	  }

	  
	  
    /*
     * P2 buys four properties...determine if P2 can afford each property before purchase. 
     * Reading Railroad, Pennsylvania Railroad, Kentucky Avenue, Pennsylvania Avenue
     */
	  if (p2.getBalance()>= prop3.getCost()) {
		  p2.buyProperty(prop3);
	  }
	  if (p2.getBalance()>= prop11.getCost()) {
		  p2.buyProperty(prop11);
	  }
	  if (p2.getBalance()>= prop15.getCost()) {
		  p2.buyProperty(prop15);
	  }
	  if (p2.getBalance()>= prop25.getCost()) {
		  p2.buyProperty(prop25);
	  }
	  if (p3.getBalance()>= prop21.getCost()+prop22.getCost() +prop23.getCost()) {
		  p3.buyProperty(prop21);
		  p3.buyProperty(prop22);
		  p3.buyProperty(prop23);
	  }
    //Display each Player's toString() [name, balance, property name(s)]
	System.out.println(p.toString());
	System.out.println(p2.toString());
	System.out.println(p3.toString());

    /*
     * ------------------------Round 2 -----------------------
     *  P1 & P2 collect $200
     */
	System.out.println("**************************************");
	p.passGo();
	p2.passGo();
	p3.passGo();
      //P1 pays to get out of jail fee $150 
		p.jailFee();
      //P1 pays rent for landing on Pennsylvania Avenue to P2
		p.payRent(prop25, p2);
      //P1 pays community chest property tax of $70
		p.chest();
		p3.fee();
      //P1 lands on Park Place - can P1 purchase property
		if (p.getBalance()>= prop27.getCost()) {
			  p.buyProperty(prop27);
		}
      //P2 pays rent for landing on Boardwalk to P1
		p2.payRent(prop28, p);
		p3.payRent(prop15, p2 );
		p3.payRent(prop28, p);
		p3.fee2();

       //Display each Player's toString() [name, balance, property name(s)]
		System.out.println("**************************************");
		System.out.println(p.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());

		//*******************round 3********************
		if (p.getBalance()>= prop26.getCost()) {
			  p.buyProperty(prop26);
		  }		
		if (p3.getBalance()>= prop28.getCost()) {
			  p3.buyProperty(prop28);
		  }
		
		
  }//end main
  }//end class