package drawingShapes;

import javax.swing.*;

import java.awt.*;

public class ComicD  extends JPanel {

	public ComicD (Color backColor)   {
		setBackground (backColor);
	}//end constructor
	
	public void paintComponent (Graphics g)  {
		super.paintComponent(g);
	g.setColor(Color.BLACK);
	g.fillOval(75, 50, 250, 250);
	g.setColor(Color.WHITE);
	g.fillOval(150, 80, 50, 50);
	g.fillOval(250, 80, 50, 50);
	Font large = new Font ("Banger", Font.BOLD + Font.ITALIC, 30);
	g.setFont(large);
	g.setColor(Color.BLACK);
	g.drawString("PULL THE PLUG DOC", 10, 30);
	
	}//end method	

	}//end class
