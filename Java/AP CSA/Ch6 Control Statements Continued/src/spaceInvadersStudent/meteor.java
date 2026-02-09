package spaceInvadersStudent;

import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class meteor {
   private int x, y, r;
   private Color c;
   private ImageIcon img;
   private Random rnd;
   
   public meteor(int x, int y, int r, ImageIcon img) {
		this.x = x;this.y = y;this.img = img;
		c = Color.blue;
		this.r = r;
		rnd = new Random();	
	}//end constructor

   public void resetMeteor() {
	y= -50;   x = rnd.nextInt(600-50 +1)+50;
   }
   
   public void draw(Graphics g) {
	  // g.setColor(c);
	 //  g.fillOval(x, y, 2*r, 2*r);
	   img.paintIcon(null, g, x, y);
	   
   }//end draw
   
   public void move(int dx, int dy) {
	   x += dx; y+=dy;
   }//move
   
   
   
public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}

public int getR() {
	return r;
}

public void setR(int r) {
	this.r = r;
}

public ImageIcon getImg() {
	return img;
}

public void setImg(ImageIcon img) {
	this.img = img;
}

   
 
   
   
}//end meteor
