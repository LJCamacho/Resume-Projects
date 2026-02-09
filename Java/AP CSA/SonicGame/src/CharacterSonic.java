
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class CharacterSonic extends Entity{

	//instance variables
	double gravity;
	
	public CharacterSonic(BufferedImage image, int x, int y, int v, int w, int h, int c) {
		super(image, x, y, v, w, h, c);
		gravity = 1;
	}//end constructor
	
	public double falling() {gravity = gravity+1; return gravity;}
	public void landed() {gravity = 0;}
	
	public void accelerateRight() {velocity +=1;}
	public void accelerateLeft() {velocity -=1;}
	
	
	public int gravityFall (ArrayList<CharacterSonic> bruh) {
		for (CharacterSonic bk: bruh) 
			if(xLoc < bk.getxLoc()+bk.getWidth() && 
				xLoc+getWidth() > bk.getxLoc() &&
				yLoc + getHeight() <= bk.getyLoc() &&
				yLoc  + getHeight() >= bk.getyLoc()-gravity) {
				setyLoc(bk.getyLoc()-getHeight());
				gravity = 0;
				return 1;
			}
		return -1;
	}
	
	public int collidesWith(CharacterSonic c) {
		if(xLoc + getWidth() >= c.getxLoc() &&xLoc <= c.getxLoc()+c.getWidth() && yLoc + getHeight() >= c.getyLoc()-gravity/2 && yLoc + getHeight() <= c.getyLoc()+gravity/2)
				return -1;
		
		if(xLoc+getWidth() >= c.getxLoc() &&
				yLoc + getHeight() >= c.getyLoc() &&
				yLoc <= c.getyLoc() + c.getHeight() &&
				xLoc <= c.getxLoc() + c.getWidth()&& !(c.isHit()))
				return 0;
		
		if(xLoc+getWidth() >= c.getxLoc() && yLoc + getHeight()>= c.getyLoc() && xLoc + getWidth() <= c.getxLoc() + c.getWidth()/2 && (c.isHit()))
				return 2;
		
		if(xLoc <= c.getxLoc()+c.getWidth() && yLoc + getHeight()>= c.getyLoc() && xLoc >= c.getxLoc() + c.getWidth()/2 && (c.isHit()))
				return 3;
		
		return 1;
	}//end 
	
	
}//end class
