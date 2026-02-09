package cardGUI;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Card {
	
	private Suit suit;
	private int rank;
	private boolean faceUp;
	private BufferedImage image, back;
	
	public Card (Suit suit, int rank, BufferedImage i) throws IOException{
		this.suit = suit;
		this.rank = rank;
		faceUp = false;
		back = ImageIO.read(ClassLoader.getSystemResource("pile.jpg"));
		back = back.getSubimage(0,0,73, 98);
		image = i;
	}//end 
	
	public BufferedImage getImage() {
		if(faceUp) return image;
		else return back;
		
		
	}//end 
	
	
	public boolean equals(Object other) {
		if (this == other) return true;
		else if ( !(other instanceof Card))
			return false;
		else {
			Card otherCard = (Card)other;
			return rank == otherCard.rank;
		}//end if
	}//end equals
	
	public int compareTo(Object other) {
		if (!(other instanceof Card)) 
			throw new IllegalArgumentException("Parameter must be a Card");
		Card otherCard = (Card)other;
		return rank - otherCard.rank;
		
	}//end compareTo
	
	public int getRank() {return rank;}
	public Suit getSuit() {return suit;}
	public boolean isFaceUp() {return faceUp;}
	
	public boolean isRed() {
		return suit == Suit.heart || suit == Suit.diamond;
	}
	
	public void turn() {faceUp =  !(faceUp);}
	
	public String toString() {
		return rankToString() + " of " + suit;
		
	}
	
	private String rankToString() {
		if (rank == 1)
			return "Ace";
		else if (rank == 11)
			return "Jack";
		else if (rank == 12)
			return "Queen";
		else if (rank == 13)
			return "King";
		else
			return "" + rank;
	}

}//end Card
