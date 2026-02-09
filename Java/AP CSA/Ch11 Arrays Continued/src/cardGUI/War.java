package cardGUI;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class War {

	public static void main(String[] args) throws IOException {
		ArrayList<Card> p1 = new ArrayList<Card>();
		ArrayList<Card> p1Discard = new ArrayList<Card>();
		ArrayList<Card> p1War = new ArrayList<Card>();
		
		ArrayList<Card> p2 = new ArrayList<Card>();
		ArrayList<Card> p2Discard = new ArrayList<Card>();
		ArrayList<Card> p2War = new ArrayList<Card>();
		
		
		Deck deck = new Deck(); deck.shuffle();
		System.out.println(deck.toString());
		//deal cards...
		for(int i = (deck.size())/2; i>0; i--) {
			p1.add(deck.deal());
			p2.add(deck.deal());
		}
		System.out.println("-----P1-----");
		System.out.println(p1.toString());
		System.out.println("-----P2-----");
		System.out.println(p2.toString());
		System.out.println("-----P1-----");
		
		Scanner reader = new Scanner(System.in);
		
		while((p1.size() > 0)) {
			System.out.println("Begin turn:" + (p1.size()-1));
			p1War.add(p1.remove(p1.size()-1));
			p2War.add(p2.remove(p2.size()-1));
			System.out.println(p1War.get(p1War.size()-1) + " vs "+p2War.get(p2War.size()-1));
			
			
			if(p1War.get(p1War.size()-1).compareTo(p2War.get(p2War.size()-1)) > 0 ) {
				System.out.println("Player 1 wins");
				while(!(p1War.isEmpty())) {
					p1Discard.add(p1War.remove(p1War.size()-1));
					p1Discard.add(p2War.remove(p2War.size()-1));
				}//end 
			}
			else if(p1War.get(p1War.size()-1).compareTo(p2War.get(p2War.size()-1)) < 0 ) {
				System.out.println("Player 2 wins");
				while(!p2War.isEmpty()) {
					p2Discard.add(p1War.remove(p1War.size()-1));
					p2Discard.add(p2War.remove(p2War.size()-1));
				}//end 
			}
			else {
				System.out.println("War...I Declare War");
				int n = 0;
				
				while(p1.size()-1 > 0 && p2.size()-1 > 0 && n < 3 ) {
					p1War.add(p1.remove(p1.size()-1));
					p2War.add(p2.remove(p2.size()-1));
					System.out.println(p1War.get(p1War.size()-1) + " vs "+p2War.get(p2War.size()-1));
					n++;
				}//end while
				
				}//end if
				
				
				
				
			
				
				
			
			System.out.println("Press any key to continue..."); reader.nextLine();	
		}//end while
		System.out.println("-----P1-----");
		System.out.println(p1.toString());
		System.out.println(p1Discard.toString());
		System.out.println("-----P2-----");
		System.out.println(p2.toString());
		System.out.println(p2Discard.toString());
		
		if(p1Discard.size() > p2Discard.size())
			System.out.println("P1 Wins with " +p1Discard.size()+ " cards!!!");
		else if (p1Discard.size() < p2Discard.size())
			System.out.println("P2 Wins " +p2Discard.size()+ " cards!!!");
		else
			System.out.println("Tie!");
		reader.close();
	}//end main

}//end class
