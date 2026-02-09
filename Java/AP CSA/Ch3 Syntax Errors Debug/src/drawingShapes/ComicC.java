package drawingShapes;

import javax.swing.*;

import java.awt.*;

public class ComicC  extends JPanel {

	public ComicC (Color backColor)   {
		setBackground (backColor);
	}//end constructor
	
	public void paintComponent (Graphics g)  {
		super.paintComponent(g);
		
		
		


		
		g.setColor(Color.black);
		g.fillOval (100, 100, 35, 45);
		

		
		g.setColor(Color.red);
		g.fillRoundRect(200, 75, 80, 40, 20, 20);
		
		Font header = new Font("Sans", Font.BOLD, 21);
		Font body = new Font("Courier", Font.ITALIC +Font.BOLD, 25 );
		Font sauce = new Font("Comic Sans MS", Font.PLAIN, 20);
		
		
		g.setFont(header); g.setColor (Color.black);
		//wrote the header
		g.drawString("You've actually been in a coma", 30, 50);
		g.drawString("for about 10 years. ", 30, 65);
		g.setFont(sauce);
		g.drawString("And you never", 30, 200);
		g.drawString("had milk in the", 30, 215);
		g.drawString("fridge or had a friend.", 30, 230);
		
		
	}//end method	

	}//end class
