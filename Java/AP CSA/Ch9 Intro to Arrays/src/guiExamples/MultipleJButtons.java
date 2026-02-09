package guiExamples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MultipleJButtons extends JFrame {

	JButton first = new JButton("first");
	JButton second = new JButton("second");
	JButton third = new JButton("third");
	JTextField txt = new JTextField(20);
	
	
	public MultipleJButtons() {
		//txt property
		txt.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		txt.setHorizontalAlignment(JTextField.CENTER);
		txt.setBackground(Color.gray);
		txt.setForeground(Color.white);
		
		
		
		JPanel x = new JPanel();x.setLayout(null);
		first.setBounds(10,10,100,50);
		x.add(first);
		
		JPanel y = new JPanel();
		Container c = getContentPane();
		
		 x.add(second); x.add(third);
		c.add(x);

		
		
		first.addActionListener(new Buttons());
		second.addActionListener(new Buttons());
		third.addActionListener(new Buttons());
		
	}//end constructor
	
	private class Buttons implements ActionListener{
		public void actionPerformed (ActionEvent e) {
			if(e.getSource() == first)
				txt.setText("first");
			if(e.getSource() == second)
				txt.setText("bruh");
			if(e.getSource() == third)
				txt.setText("moment");
		}
	}
	
	public static void main(String[] args) {
		MultipleJButtons n = new MultipleJButtons();
		n.setSize(400, 500);
		n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		n.setVisible(true);
		
	}//end main

}//end class
