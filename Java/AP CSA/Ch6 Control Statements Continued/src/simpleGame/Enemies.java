package simpleGame;

import javax.swing.*;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Enemies {
	//instance variables
	   private int x, y, b, h;
	   private ImageIcon img;
	   private Random rnd;
	
	   public Enemies(int x, int y, ImageIcon img) {
			this.x = x;this.y = y;this.img = img;
			rnd = new Random();	
			b = img.getIconWidth();
			h = img.getIconHeight();
		}//end constructor
	//methods
	   public void draw(Graphics g) {
			img.paintIcon(null, g, x, y);
		}
	   public void move(int dx, int dy) {
		   x += dx; y+=dy;
	   }//move
	   public void resetEnemy() {
			x= 1100;   y = rnd.nextInt(600-50 +1)+75;
	   }
	   public void resetEnemyHard() {
			x= 0;   y = rnd.nextInt(600-50 +1)+75;
	   }
	public int getX() {return x;}
	public void setX(int x) {this.x = x;}
	public int getY() {return y;}
	public void setY(int y) {this.y = y;}
	public int getB() {return b;}
	public void setB(int b) {this.b = b;}
	public int getH() {return h;}
	public void setH(int h) {this.h = h;}
	public ImageIcon getImg() {return img;}
	public void setImg(ImageIcon img) {this.img = img;}
	public Random getRnd() {return rnd;}
	public void setRnd(Random rnd) {this.rnd = rnd;}
	
	   
	   
	   
	   
	   
	   
}
