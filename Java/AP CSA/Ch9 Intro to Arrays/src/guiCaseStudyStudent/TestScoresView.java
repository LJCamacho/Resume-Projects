package guiCaseStudyStudent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class TestScoresView extends JFrame {
	//the model
	private TestScoreModel model;
	
	//the view
	private JButton			addButton			= new JButton("Add");
	private JButton			modifyButton		= new JButton("Modify");
	private JButton			firstButton		= new JButton("<<");
	private JButton			previousButton	= new JButton("<");
	private JButton			nextButton		= new JButton(">");
	private JButton			lastButton			= new JButton(">>");
	private JButton    		clearButton      	= new JButton("clear");
	private JButton			highScoreButton= new JButton("Highest score");
	private JButton			aveScoreButton = new JButton("Class Average");
	private JLabel			nameLabel			= new JLabel("Name");
	private JLabel			test1Label			= new JLabel("Test 1");
	private JLabel			test2Label			= new JLabel("Test 2");
	private JLabel			test3Label			= new JLabel("Test 3");
	private JLabel			countLabel			= new JLabel("Count");
	private JLabel			averageLabel		= new JLabel("Average");
	private JLabel			indexLabel			= new JLabel("Index");
	private JTextField 	nameField			= new JTextField("");
	private JTextField 	test1Field			= new JTextField("0");
	private JTextField 	test2Field			= new JTextField("0");
	private JTextField 	test3Field			= new JTextField("0");
	private JTextField 	averageField		= new JTextField("0");
	private JTextField 	countField			= new JTextField("0");
	private JTextField 	indexField			= new JTextField("-1");
	
	
	//constructor
	public TestScoresView(TestScoreModel m) {
		model = m;
		//set attributes of fields
		averageField.setEditable(false);
		countField.setEditable(false);
		indexField.setEditable(false);
		averageField.setBackground(Color.WHITE);
		countField.setBackground(Color.white);
		indexField.setBackground(Color.white);
		//set up panels to organize widgets and add them to the window
		JPanel northPanel = new JPanel();
		JPanel centerPanel = new JPanel(new GridLayout(5, 4, 10, 5));
		JPanel southPanel = new JPanel();
		Container container = getContentPane();
		container.add(northPanel, BorderLayout.NORTH);
		container.add(centerPanel, BorderLayout.CENTER);
		container.add(southPanel, BorderLayout.SOUTH);
		//data access buttons
		northPanel.add(addButton);
		northPanel.add(modifyButton);
		northPanel.add(highScoreButton);
		northPanel.add(aveScoreButton);
		//row 1
		centerPanel.add(nameLabel);
		centerPanel.add(nameField);
		centerPanel.add(countLabel);
		centerPanel.add(countField);
		//row 2
		centerPanel.add(test1Label);
		centerPanel.add(test1Field);
		centerPanel.add(indexLabel);
		centerPanel.add(indexField);
		//row 3
		centerPanel.add(test2Label);
		centerPanel.add(test2Field);
		centerPanel.add(new JLabel(" ")); 	//for empty cell in grid
		centerPanel.add(new JLabel(" "));
		//row 4
		centerPanel.add(test3Label);
		centerPanel.add(test3Field);
		centerPanel.add(new JLabel(" "));
		centerPanel.add(new JLabel(" "));
		//row 5
		centerPanel.add(averageLabel);
		centerPanel.add(averageField);
		centerPanel.add(new JLabel(" "));
		centerPanel.add(new JLabel(" "));
		//Navigation buttons
		southPanel.add(firstButton);
		southPanel.add(previousButton);
		southPanel.add(nextButton);
		southPanel.add(lastButton);
		 southPanel.add(clearButton);
		//attach listeners to buttons
		addButton.addActionListener(new AddListener());
		previousButton.addActionListener(new PreviousListener());
		// other attachments will go here (exercise)
		lastButton.addActionListener(new LastListener());
		nextButton.addActionListener(new NextListener());
		firstButton.addActionListener(new FirstListener());
		modifyButton.addActionListener(new ModifyListener());
		highScoreButton.addActionListener(new HighScoreListener());
		aveScoreButton.addActionListener(new AveScoreListener());
		clearButton.addActionListener(new ClearListener());
		//set window attributes
		setTitle("Student Test Scores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		displayInfo();
	}
	
	//updates fields with info from the model
	private void displayInfo() {
		Student s = model.currentStudent();
		if (s == null) { //no current student, so clear fields
			nameField.setText(" ");
			test1Field.setText("0");
			test2Field.setText("0");
			test3Field.setText("0");
			averageField.setText("0");
			countField.setText("0");
			indexField.setText("-1");
		} else {			// refresh with student's data
			nameField.setText(s.getName());
			test1Field.setText(" " + s.getScore(1));
			test2Field.setText(" " + s.getScore(2));
			test3Field.setText(" " + s.getScore(3));
			averageField.setText(" " + s.getAverage());
			countField.setText(" " + model.size());
			indexField.setText(" " + model.currentPosition());
		}
	}
	
	//creates and returns new Student from field info
	private Student getInfoFromScreen() {
		Student s = new Student(nameField.getText());
		s.setScore(1, Integer.parseInt(test1Field.getText()));
		s.setScore(2, Integer.parseInt(test2Field.getText()));
		s.setScore(3, Integer.parseInt(test3Field.getText()));
		return s;
	}
	
	// >>>>>>> The controller <<<<<<<
	
	// Responds to a click on the add button
	private class AddListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			//Get inputs, validate, and display error and quit if invalid
			Student s = getInfoFromScreen();
			String message = s.validateData();
			if (message != null) {
				JOptionPane.showMessageDialog(TestScoresView.this, message);
				return;
			}
			//attempt to add student and display error or update fields
			message = model.add(s);
			if (message != null)
				JOptionPane.showMessageDialog(TestScoresView.this, message);
			else
				displayInfo();
		}
	}
	
	//Responds to a click on the < button
	private class PreviousListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			model.previous();
			displayInfo();
		}
	}
	

		private class LastListener implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				model.last();
				displayInfo();
			}
		}
		
		private class FirstListener implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				model.first();
				displayInfo();
			}
		}
	
		private class NextListener implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				model.next();
				displayInfo();
			}
		}
		private class ModifyListener implements ActionListener{
			   public void actionPerformed(ActionEvent e){
			      // Get inputs, validate, and display error and quit if invalid
			      Student s = getInfoFromScreen();
			      String message = s.validateData();
			      if (message != null){
			         JOptionPane.showMessageDialog(TestScoresView.this, message);
			         return;
			      }
			      // Attempt to add student and display error or update fields
			      message = model.replace(s);
			      if (message != null)
			         JOptionPane.showMessageDialog(TestScoresView.this, message);
			      else
			         displayInfo();
			   }
			}

			private class AveScoreListener implements ActionListener{
			   public void actionPerformed(ActionEvent e){
			      int ave = model.getClassAverage();
			      JOptionPane.showMessageDialog(TestScoresView.this, "The average is " + ave);
			   }
			}

			private class HighScoreListener implements ActionListener{
			   public void actionPerformed(ActionEvent e){
			      Student s = model.getHighScore();
			      JOptionPane.showMessageDialog(TestScoresView.this, s.toString());
			   }
			}
			private class ClearListener implements ActionListener{
				   public void actionPerformed(ActionEvent e){
					   nameField.setText(" ");
						test1Field.setText("0");
						test2Field.setText("0");
						test3Field.setText("0");
						averageField.setText("0");
				   }
				}
}//end TestScoresView
