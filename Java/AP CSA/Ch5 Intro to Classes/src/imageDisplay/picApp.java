package imageDisplay;

import javax.swing.*;
import java.awt.*;

public class picApp {

	public static void main(String[] args) {
			JFrame frame = new JFrame();
			frame.setTitle("Squidward");
			frame.setSize(300,300	);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			ImageIcon squid = new ImageIcon("Squidy.png");
			ColorPanel mySquid = new ColorPanel(Color.black, squid);
			
			
			Container pane = frame.getContentPane();
			pane.add(mySquid);
			
			frame.setVisible(true);
		
		
	}//end main
	
}//end class


	 class ColorPanel extends JPanel{
		
		//instance variable
		private ImageIcon image;
		
		public ColorPanel(Color backColor, ImageIcon i	) {
			setBackground(backColor);
			image = i;
			
		}//end constructor
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			int x = (getWidth() - image.getIconWidth()) /2;
			int y = (getHeight() - image.getIconHeight()) /2;
			
			image.paintIcon(this, g, x, y);
			
			
		}//end paintComponent
		
	}
	






