package drawingShapes;

import javax.swing.*;
import java.awt.*;

public class FullComic {
	public static void main(String[] args) {
			JFrame ryan = new JFrame ();
			ryan.setTitle("Comic");
			ryan.setSize(800,600);
			ryan.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
			
			Comic panel = new Comic(Color.WHITE);
			ComicA temple = new ComicA(Color.red);
			ComicB spice = new ComicB(Color.WHITE);
			ComicC west = new ComicC(Color.red);
			ComicD south = new ComicD(Color.white);
			ComicE tea = new ComicE(Color.red);
			
			Container pane = ryan.getContentPane();
			pane.setLayout(new GridLayout (2,3));
			
			pane.add(panel);
			pane.add(temple);
			pane.add(spice);
			pane.add(west);
			pane.add(south);
			pane.add(tea);
			
			ryan.setVisible(true);
	
	
	}//end main
}//end class