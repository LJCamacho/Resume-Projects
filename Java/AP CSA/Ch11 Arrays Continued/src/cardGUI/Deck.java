package cardGUI;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.*;

import javax.imageio.ImageIO;



public class Deck  {
	public static final int MAX_SIZE = 52;
	private ArrayList<Card> cards;
	private BufferedImage sheet, cardImage;
	
		
	public Deck() throws IOException{
		sheet = ImageIO.read(ClassLoader.getSystemResource("DeckofCards.jpg"));
		
		reset();
	}
	
	public BufferedImage getImage() { return cards.get(cards.size()-1).getImage();}
	

	public void reset()throws IOException {
		cards = new ArrayList<Card>();
		addSuit(Suit.club, 0);
		addSuit(Suit.spade, 98);
		addSuit(Suit.heart, 196);
		addSuit(Suit.diamond, 294);
			
	}//end reset
	
	private void addSuit(Suit suit, int y)throws IOException {
		int n = 1;
		for (int i = 1; i <= 13; i++) {
			n = (i - 1) * 73;
			cardImage = sheet.getSubimage(n,y,73, 98);
			cards.add(new Card(suit,i, cardImage));
		}//end for
	}
	
	public boolean isEmpty() {
		return cards.isEmpty();
	}
	
	public int size() {
		return cards.size();
	}
	
	public Card deal() {
		if(isEmpty())
			return null;
		else {
			cards.get(cards.size()-1);
		
			return cards.remove(cards.size()-1);
	}}
	
	public Card[] deal(int number) {
		if (number > cards.size())
			return null;
		else {
			Card[] hand = new Card[number];
			for(int i = 0; i < hand.length; i++)
				hand[i] = deal();
			return hand;
		}
	}
	
	 public void shuffle(){
		 if (cards.size() < MAX_SIZE)
	         return;
	      Random gen = new Random();
	      Card[] array = new Card[MAX_SIZE];
	     while (cards.size() > 0){
		 Card card = cards.remove(cards.size() - 1);
		 int i = gen.nextInt(MAX_SIZE);
		 while (array[i] != null)
	            i = gen.nextInt(MAX_SIZE);
		 array[i] = card;
	      }
	      for (Card card : array)
	         cards.add(card);
	   }

	   public String toString(){
		String result = "";
		for (Card card : cards)
		    result += card + "\n";
		return result;
	   }
	
	
	
}//end Deck
