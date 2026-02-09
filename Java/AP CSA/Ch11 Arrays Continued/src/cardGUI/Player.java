package cardGUI;

import java.awt.image.*;
import java.util.ArrayList;

public class Player {
	
	//variable
	ArrayList<Card> hand, warpile, discard;

	public Player() {
		hand = new ArrayList<Card>();
		warpile = new ArrayList<Card>();
		discard = new ArrayList<Card>();
		
	}//end Player
	
	public void transferCard () {
		Card c = hand.remove(hand.size()-1);
		c.turn();
		add(c,"warpile");
	}
	
	
	public BufferedImage getImage (String str) {
		if (str.equals("hand"))
			return hand.get(hand.size()-1).getImage();
		else if (str.equals("warpile"))
			return warpile.get(warpile.size()-1).getImage();
		else
			return discard.get(discard.size()-1).getImage();
		
	}
	
	
	
	public void add (Card c, String str) {
		
		if(str.equals("hand"))
			hand.add(c);
		else if (str.equals("warpile"))
			warpile.add(c);
		else
			discard.add(c);
	}
	
	
	
	public String toString() {
		return hand.toString();
	}

	public Card warpileCard() {
		return warpile.get(warpile.size()-1);
	}

	public int getDiscard() { return discard.size();}
	public int getWarpileSize() {return warpile.size();}
	
	public Card transferWarpileToDiscard() {
		return warpile.remove(warpile.size()-1);
	}
	
}//end
