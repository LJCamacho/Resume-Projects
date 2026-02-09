package cardGUI;

import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.*;
import java.io.IOException;


public class ShowCard extends JPanel{

	private BufferedImage image;
		
	public ShowCard() throws IOException {
		image = ImageIO.read(ClassLoader.getSystemResource("empty.jpg"));
		image = image.getSubimage(0, 0, 73, 98);
		
	}//end constructor
	
	public void setImage(BufferedImage i) {image = i;}
	public BufferedImage getImage() {return image;}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, null);
	}
	
	
	
	
	
	
	
}//end class
