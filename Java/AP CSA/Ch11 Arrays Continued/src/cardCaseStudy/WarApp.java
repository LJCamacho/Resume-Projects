package cardCaseStudy;

import java.util.ArrayList;

public class WarApp {

	public static void main(String[] args) {
		Deck myDeck = new Deck();
		boolean bigWinner = true;
		int pile1 = 0;
		int pile2 = 0;
		int tiePile = 0;
		ArrayList<Card> myHand = new ArrayList<Card>();
		ArrayList<Card> otherHand = new ArrayList<Card>();
		
		myDeck.shuffle();
		for (int i = (myDeck.size())/2; i>0; i--) {
			myHand.add(myDeck.deal());
			otherHand.add(myDeck.deal());
		}
		
		while(bigWinner) {
			for(int i = 0; i < 26; i++) {
				System.out.println("------Compare Cards---------------");
				System.out.println(myHand.get(i) + "       " + otherHand.get(i));
				if (myHand.get(i).compareTo(otherHand.get(i)) > 0) {
					System.out.println("my hand - has the high card");
					pile1++;
					}
				else if(myHand.get(i).compareTo(otherHand.get(i)) < 0) {
					System.out.println("other hand - has the high card");
					pile2++;
					}
				else
					System.out.println("Same");
				System.out.println();
			}
			if (pile1 > pile2) {
				System.out.println("My hand has won with "	+ pile1 + " cards!");
				System.out.println("Other hand has lost with " + pile2 + " cards");
				bigWinner = false;
				pile1+=tiePile;
				tiePile = 0;
				}
			else if (pile1 < pile2) {
				System.out.println("Other hand has won with " + pile2 + " cards!");
				System.out.println("My hand has lost with "	+ pile1 + " cards");
				bigWinner = false;
				pile2+=tiePile;
				tiePile = 0;
			}
			else {
				System.out.println("Tie");
				bigWinner = false;
				tiePile++;
			}
		}
	}

	
}
