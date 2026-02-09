package dialogBox;

import javax.swing.JOptionPane;

public class circleArea {
	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("enter the radius", "0");
		if (str == null)
			return;
		double radius = Double.parseDouble(str);
		
		if (radius < 0)
			JOptionPane.showMessageDialog (null, "Error: radius >= 0");
		else {
			double area = Math.PI * Math.pow(radius, 2);
			JOptionPane.showMessageDialog(null, "The area is " + area);
		}//end if
		
		
	}//end main
}//end class
