
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public abstract class Entity {
	//instance variables
	protected int xLoc, yLoc, velocity, width, height, c;
	protected boolean hit;
	protected BufferedImage image;
	
	public Entity (BufferedImage image, int x, int y, int v, int w, int h, int c ) {
		this.image = image;
		xLoc =x; yLoc = y; velocity = v; width = w; height = h; this.c = c;
		hit = false;
	}//end constructor

	public abstract int collidesWith(CharacterSonic c);
	
	public void move(double dx, double dy) {
		xLoc += dx; yLoc += dy;
	}
	
	
	public final int getxLoc() {return xLoc;}
	public final void setxLoc(int xLoc) {this.xLoc = xLoc;}
	public final int getyLoc() {return yLoc;}
	public final void setyLoc(int yLoc) {this.yLoc = yLoc;}
	public final int getVelocity() {return velocity;}
	public final void setVelocity(int velocity) {this.velocity = velocity;}
	public final int getWidth() {return width;}
	public final void setWidth(int width) {this.width = width;}
	public final int getHeight() {return height;}
	public final void setHeight(int height) {this.height = height;}
	public final BufferedImage getImage() {return image;}
	public final void setImage(BufferedImage image) {this.image = image;}
	
	
	public final int getC() {return c;}
	public final void setC(int c) {this.c = c;}
	public final boolean isHit() {return hit;}
	public final void setHit(boolean hit) {this.hit = hit;}
	
	
	
}//end class
