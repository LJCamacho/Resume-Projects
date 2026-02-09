package dialogBox;

import javax.swing.*;
import java.awt.*;

public class illusionNew {
	public static void main(String[] args) {
			JFrame f = new JFrame ();
			f.setSize(600,400);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			Container c = f.getContentPane();
			c.setLayout(new GridLayout(1, 2));
		
			ColorPanel queen = new ColorPanel(Color.black);
			ColorPanel king = new ColorPanel(Color.white);
			
			c.add(queen); c.add(king);
				
			f.setVisible(true);
			
			
	}
}


class ColorPanel extends JPanel {

	public ColorPanel (Color bk) {
		setBackground(bk);
	}//constructor

	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.gray);
		g.fillRect(100, 100, 50, 75);
		
	}//end paint component
}	
	
