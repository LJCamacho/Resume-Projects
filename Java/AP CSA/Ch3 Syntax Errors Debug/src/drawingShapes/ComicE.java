package drawingShapes;

import javax.swing.*;

import java.awt.*;

public class ComicE  extends JPanel {

	public ComicE (Color backColor)   {
		setBackground (backColor);
	}//end constructor
	
	public void paintComponent (Graphics g)  {
		super.paintComponent(g);
		g.setColor(Color.black);
		g.fillOval (100, 100, 35, 45);
		Font sauce = new Font("Comic Sans MS", Font.BOLD, 50);
		Font boogaloo = new Font("Times New Roman", Font.ITALIC, 25 );
		g.setColor(Color.BLACK);
		g.setFont(sauce);
		g.drawString("DANG", 20, 50);
		g.setFont(boogaloo);
		g.drawString(" it really be like that sometimes", 30, 200);
	}//end method	

	}//end class
