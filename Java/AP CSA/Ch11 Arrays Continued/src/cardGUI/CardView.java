package cardGUI;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;

public class CardView extends JFrame {

	private JButton flipButton;
	private JLabel p1Count, p2Count;
	private CardModel m;
	private ShowCard s1,d1, s2, d2;
	private Player p1, p2;
	
	public CardView(CardModel m) throws IOException {
		this.m =m;
		p1 = new Player(); p2 = new Player();
		
		for(int i = 0; i < 26; i++) {
			p1.add(m.deal(),"hand");
			p2.add(m.deal(),"hand");
		}
		System.out.println(p1.toString());
		
		flipButton = new JButton("Flip");
		JPanel northPanel = new JPanel();
		JPanel southPanel = new JPanel();
		JPanel mainPanel = new JPanel(new GridLayout(2,4,1,1));
		JLabel outcome = new JLabel("War");
         p1Count = new JLabel("p1: "+ p1.getDiscard());
         p2Count = new JLabel("p2: "+ p2.getDiscard());

		s1 = new ShowCard();
		s1.setImage(p1.getImage("hand"));
		d1 = new ShowCard();
		
		s2 = new ShowCard();
		s2.setImage(p2.getImage("hand"));
		d2 = new ShowCard();
		
		northPanel.add(flipButton);
		//row 1
		mainPanel.add(s1); mainPanel.add(d1);
		mainPanel.add(d2); mainPanel.add(s2);
		//row 2
		mainPanel.add(new JPanel()); mainPanel.add(p1Count);
		mainPanel.add(p2Count); mainPanel.add(new JPanel());
		
		Container pane = getContentPane();
		pane.add(northPanel, BorderLayout.NORTH);
		pane.add(mainPanel, BorderLayout.CENTER);
		
		setSize(500,500);
		setTitle("Deck of Cards");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		//listener
		flipButton.addActionListener(new myButton());
		
	}//end constructor
	
	private class myButton implements ActionListener{
		public void actionPerformed (ActionEvent e) {
			if(e.getSource() == flipButton) {
				p1.transferCard();
				p2.transferCard();
				d1.setImage(p1.getImage("warpile"));
				d2.setImage(p2.getImage("warpile"));
				
				d1.repaint();d2.repaint();
				m.battle(p1, p2);
				p1Count.setText("p1 = " + p1.getDiscard());
				p2Count.setText("p2 = " + p2.getDiscard());
			}
			
		}//end actionPerformed
	}//end myButton
	
	
	public static void main(String[] args)throws IOException {
		
		new CardView(new CardModel());
	}//end main

}//end class
