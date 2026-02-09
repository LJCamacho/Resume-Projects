package cardGUI;

import java.awt.image.BufferedImage;
import java.io.*;

public class CardModel {
	Deck pile;
	
	
	public CardModel() throws IOException{
		pile = new Deck();
		pile.shuffle();
	}//end constructor
	
	public BufferedImage getImage() {return pile.getImage();}
	
	public Card deal() {
		return pile.deal();
	}

	public void battle(Player p1, Player p2) {
		
		if (p1.warpileCard().compareTo(p2.warpileCard()) > 0) {
			while(p1.getWarpileSize() > 0) {
				p1.add(p1.transferWarpileToDiscard(), "");
				p1.add(p2.transferWarpileToDiscard(), "");
			}//end
		}else if (p1.warpileCard().compareTo(p2.warpileCard()) < 0) {
			while(p2.getWarpileSize() > 0) {
				p2.add(p1.transferWarpileToDiscard(), "");
				p2.add(p2.transferWarpileToDiscard(), "");
			}
			
		}else {
			System.out.println("war");
			while(p2.getWarpileSize() > 3 && p1.getWarpileSize() > 3) {
				for(int i = 1; i < 4; i ++) {
					p1.transferCard();
					p2.transferCard();
				}//end for
			}//end while
            
		}
	}//end battle
}//end class
