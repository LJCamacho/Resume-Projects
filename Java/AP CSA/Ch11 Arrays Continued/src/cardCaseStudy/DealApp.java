package cardCaseStudy;

import java.util.ArrayList;

public class DealApp {

	public static void main(String[] args) {
		Deck myDeck = new Deck();
		
		System.out.println(myDeck.toString());
		myDeck.shuffle();
		System.out.println("--------------------shuffled------------------");
		System.out.println(myDeck.toString());
		System.out.println("--------------------My Hand ------------------");
	
		ArrayList<Card> myHand = new ArrayList<Card>();
		myHand.add(myDeck.deal());
		myHand.add(myDeck.deal());
		myHand.add(myDeck.deal());
		myHand.add(myDeck.deal());
		myHand.add(myDeck.deal());
		
		for (Card c : myHand)
			System.out.println(c);
		
		
		
		
		ArrayList<Card> otherHand = new ArrayList<Card>();
		Card[] secondHand = myDeck.deal(5);
		
		for (int i = 0; i < secondHand.length; i++)
			otherHand.add(secondHand[i]);
		
			System.out.println("--------------------other Hand------------------");
		System.out.println(otherHand.toString());
		
		
		System.out.println("------Compare First Cards---------------");
		System.out.println(myHand.get(0) + "       " + otherHand.get(0));
		if (myHand.get(0).compareTo(otherHand.get(0)) > 0)
			System.out.println("my hand - has the high card");
		else if(myHand.get(0).compareTo(otherHand.get(0)) < 0)
			System.out.println("other hand - has the high card");
		else
			System.out.println("Same");
			
		
	}

}
