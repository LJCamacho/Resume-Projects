package contactProject;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;



public class ContactsView extends JFrame {
	//the model
	private ContactModel model;
	
	//the view
	private JButton			addButton			= new JButton("Add");
	private JButton			modifyButton		= new JButton("Modify");
	private JButton			firstButton		= new JButton("<<");
	private JButton			previousButton	= new JButton("<");
	private JButton			nextButton		= new JButton(">");
	private JButton			lastButton			= new JButton(">>");
	private JButton    		clearButton      	= new JButton("clear");
	private JButton			favoriteButton	= new JButton("Favorite");
	private JButton			leftTypeButton  = new JButton("<");
	private JButton			rightTypeButton  = new JButton(">");
	private JLabel			firstNameLabel	= new JLabel("First Name");
	private JLabel			lastNameLabel	= new JLabel("Last Name");
	private JLabel			phoneLabel		= new JLabel("Phone");
	private JLabel			emptyLabel		= new JLabel("");
	private JLabel			countLabel			= new JLabel("Number Of Contacts");
	private JLabel			emailLabel			= new JLabel("Email");
	private JLabel			indexLabel			= new JLabel("Index");
	private JLabel			phoneTypeLabel	= new JLabel("cell");
	private JTextField 	firstNameField	= new JTextField("");
	private JTextField 	lastNameField	= new JTextField("0");
	private JTextField 	numberField		= new JTextField("0");
	private JTextField 	emailField			= new JTextField("");
	private JTextField 	countField			= new JTextField("0");
	private JTextField 	indexField			= new JTextField("-1");

	
	//constructor
	public ContactsView(ContactModel m) {
		model = m;
		//set attributes of fields
		Color color = Color.white;
		countField.setEditable(false);
		indexField.setEditable(false);
		emailField.setBackground(color);
		countField.setBackground(color);
		indexField.setBackground(color);
		//set up panels to organize widgets and add them to the window
		JPanel northPanel = new JPanel();
		JPanel centerPanel = new JPanel(new GridLayout(5, 4, 10, 5));
		JPanel southPanel = new JPanel();
		Container container = getContentPane();
		container.add(northPanel, BorderLayout.NORTH);
		container.add(centerPanel, BorderLayout.CENTER);
		container.add(southPanel, BorderLayout.SOUTH);
		//navigation buttons
		northPanel.add(firstButton);
		northPanel.add(previousButton);
		northPanel.add(nextButton);
		northPanel.add(lastButton);
		//row 1
		centerPanel.add(firstNameLabel);
		centerPanel.add(firstNameField);
		centerPanel.add(countLabel);
		centerPanel.add(countField);
		//row 2
		centerPanel.add(lastNameLabel);
		centerPanel.add(lastNameField);
		centerPanel.add(indexLabel);
		centerPanel.add(indexField);
		//row 3
		centerPanel.add(phoneLabel);
		centerPanel.add(phoneTypeLabel);
		centerPanel.add(numberField);
		centerPanel.add(new JLabel(" "));
		//row 4
		centerPanel.add(new JLabel(" "));
		centerPanel.add(leftTypeButton);
		centerPanel.add(rightTypeButton);
		centerPanel.add(new JLabel(" "));
		//row 5
		centerPanel.add(emailLabel);
		centerPanel.add(emailField);
		centerPanel.add(new JLabel(" "));
		centerPanel.add(new JLabel(" "));
		//modify buttons
		southPanel.add(addButton);
		southPanel.add(modifyButton);
		southPanel.add(favoriteButton);
		 southPanel.add(clearButton);
		//attach listeners to buttons
		addButton.addActionListener(new AddListener());
		previousButton.addActionListener(new PreviousListener());
		// other attachments will go here (exercise)
		lastButton.addActionListener(new LastListener());
		nextButton.addActionListener(new NextListener());
		firstButton.addActionListener(new FirstListener());
		modifyButton.addActionListener(new ModifyListener());
		favoriteButton.addActionListener(new FavoriteListener());
		clearButton.addActionListener(new ClearListener());
		//set window attributes
		setTitle("Phonebook");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		displayInfo();
	}
	
	//updates fields with info from the model
	private void displayInfo() {
		Contact con = model.currentContact();
		if (con == null) { //no current contact, so clear fields
			firstNameField.setText(" ");
			lastNameField.setText(" ");
			numberField.setText("");
			emailField.setText("");
			countField.setText("0");
			indexField.setText("-1");
		} else {			// refresh with student's data
			firstNameField.setText(con.getNameFirst());
			lastNameField.setText(con.getNameLast());
			numberField.setText(" " + con.getPhoneNumber());
			emailField.setText(" " + con.getEmail());
			countField.setText(" " + model.size());
			indexField.setText(" " + model.currentPosition());
		}
	}
	
	//creates and returns new Student from field info
	
	private Contact getInfoFromScreen() {
		Contact con = new Contact(firstNameField.getText(), lastNameField.getText());
		if (phoneTypeLabel.getText().equals("cell")) 
			con.setPhoneNumber(i, number);
		
		
		if (leftTypeButton != null) {
			con.setPhoneNumber(1,numberField.getText());
		}
		
		con.setType(if (leftTypeButton) );
		con.setEmail( emailField.getText());
		return con;
	}
	
	// >>>>>>> The controller <<<<<<<
	
	// Responds to a click on the add button
	private class AddListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			//Get inputs, validate, and display error and quit if invalid
			Contact con = getInfoFromScreen();
			String message = con.validateData();
			if (message != null) {
				JOptionPane.showMessageDialog(ContactsView.this, message);
				return;
			}
			//attempt to add student and display error or update fields
			message = model.add(con);
			if (message != null)
				JOptionPane.showMessageDialog(ContactsView.this, message);
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
			      Contact con = getInfoFromScreen();
			      String message = con.validateData();
			      if (message != null){
			         JOptionPane.showMessageDialog(ContactsView.this, message);
			         return;
			      }
			      // Attempt to add student and display error or update fields
			      message = model.replace(con);
			      if (message != null)
			         JOptionPane.showMessageDialog(ContactsView.this, message);
			      else
			         displayInfo();
			   }
			}
			private class FavoriteListener implements ActionListener{
			   public void actionPerformed(ActionEvent e){
			      Contact con = model.getFavorite();
			      if (getFavorite == true) {
			    	  color = Color.YELLOW;
			      }
			   }
			}
			private class ClearListener implements ActionListener{
				   public void actionPerformed(ActionEvent e){
					   firstNameField.setText(" ");
					   lastNameField.setText(" ");
						numberField.setText("");
						emailField.setText("");
				   }
				}
}//end TestScoresView
