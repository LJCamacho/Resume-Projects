package guiDrawingMultipleShapes;
import java.awt.*;
import java.util.Random.*;

public class RightTriangle implements Shape {
	//instance variables
	private int base, height;
	private int x, y;
	private Color color;
	
	private int [] xPoints = new int[3];
	private int [] yPoints = new int[3];
	
	//constructor
	public RightTriangle(int x, int y, int base, int height, Color color ) {
		this.x = x;
		this.y = y;
		this.base = base;
		this.height = height;
		this.color = color;	
		xPoints[0] = x; xPoints[1] = x; xPoints[2] = x+base;
		yPoints[0] = y; yPoints[1] = y+height; yPoints[2] = y+height;
	}//end right triangle
	
	public int getX() {return x;}
	public int getY() {return y;}
	public int getBase() {return base;}
	public int getHeight() {return height;}
	
	public void setBase(int base) {this.base = base;}
	public void setHeight(int height) {this.height = height;}
	public void setX(int x) {this.x = x;}
	public void setY(int y) {this.y = y;}
	
	public void draw(Graphics g) {
		Color oldColor = g.getColor();
		g.setColor(color);
		g.drawLine(x, y, x, y+height);
		g.drawLine(x, y+height, x+base, y+height);
		g.drawLine(x+base, y+height, x, y);
		g.setColor(oldColor);			
	}//end draw
	
	public void fill(Graphics g) {
		Color oldColor = g.getColor();
		g.setColor(color);
		g.fillPolygon(xPoints,yPoints,3);
		g.setColor(oldColor);			
	}//end draw
	
	public void fillBorder(Graphics g) {
		Color oldColor = g.getColor();
		g.setColor(Color.blue);
		for(int i = 1; i <= 10; i++) {
			g.drawLine(x+i, y+i, x+base+i, y+i);
			g.drawLine(x+base+i, y+i, x+base+i, y+height+i);
			g.drawLine(x+base+i, y+height+i, x+i, y+i);
		}
		g.setColor(oldColor);			
	}//end draw
	public boolean containsPoint(int x, int y) {
		Polygon p = new Polygon(xPoints, yPoints, 3);
		
		if(p.contains(x,y)) {
			return true;
		}
		return false;
		
	}//end containsPoint
	
	public void move(int xAmount, int yAmount) {
		x = x + xAmount;
		y = y + yAmount;		
		
		xPoints[0] = x; xPoints[1] = x; xPoints[2] = x + base;
		yPoints[0] = y; yPoints[1] = y+height; yPoints[2] = y+height;
	}//end move

	
	
}//end rectangle