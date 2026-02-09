package guiTextButtonLabels;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class GUIWindow  extends JFrame{

	//**** the model ****
	
	//Declare thermometer
	private Thermometer thermo = new Thermometer();
	
	//****** the view *******
	private JLabel fahrLabel				= new JLabel("Degrees Fahrenheit");
	private JLabel celsiusLabel 			= new JLabel("Degrees Celsius");
	private JTextField fahrField			= new JTextField("32.0");
	private JTextField celsiusField		= new JTextField("0.0");
	private JButton fahrButton			= new JButton("Convert >>>");
	private JButton celsiusButton			= new JButton("<<< Convert");
	
	public GUIWindow()	{
		JPanel dataPanel = new JPanel(new GridLayout(2,2,12,6));
		//row 1
		dataPanel.add(fahrLabel); dataPanel.add(celsiusLabel);
		
		//row 2
		dataPanel.add(fahrField); dataPanel.add(celsiusField);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(fahrButton); buttonPanel.add(celsiusButton);
		
		
		Container c =  getContentPane();
		c.add(dataPanel, BorderLayout.CENTER);
		c.add(buttonPanel, BorderLayout.SOUTH);

		//the listeners
		fahrButton.addActionListener(new FahrenheitListener());
		celsiusButton.addActionListener(new CelsiusListener());
	}//end constructor
	
	//******* the controller ******
	private class FahrenheitListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String input = fahrField.getText();
			double fahr = Double.parseDouble(input);
			thermo.setFahrenheit(fahr);
			double celsius = thermo.getCelsius();
			celsiusField.setText(""+celsius);			
		}//end actionPerformed
	}//end fahrenheitListener class
	
	
	private class CelsiusListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String input = celsiusField.getText();
			double celsius = Double.parseDouble(input);
			thermo.setCelsius(celsius);
			double fahr = thermo.getFahrenheit();
			fahrField.setText(""+fahr);
			
		}//end actionPerformed
	}//end fahrenheitListener class
}//end class
