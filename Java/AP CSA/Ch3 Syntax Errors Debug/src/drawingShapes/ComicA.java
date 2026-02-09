package drawingShapes;

import javax.swing.*;

import java.awt.*;

public class ComicA  extends JPanel {

	public ComicA (Color backColor)   {
		setBackground (backColor);
	}//end constructor
	
	public void paintComponent (Graphics g)  {
		super.paintComponent(g);
		
		
		


		
		g.setColor(Color.black);
		g.fillOval (100, 100, 35, 45);
		

		
		Font header = new Font("Sans", Font.BOLD, 16);
		Font body = new Font("Courier", Font.ITALIC +Font.BOLD, 20 );
		Font sauce = new Font("Comic Sans MS", Font.PLAIN, 14);
		
		
		g.setFont(header); g.setColor (Color.black);
		//wrote the header
		g.drawString("Hey bud. I'm your mind", 30, 50);
		g.drawString("He is not real", 30, 65);
		g.setFont(sauce);
		g.drawString("By the way you left", 30, 200);
		g.drawString("the milk open in the", 30, 215);
		g.drawString("fridge brodie", 30, 230);
		
		//body

		
	}//end method	

	}//end class
