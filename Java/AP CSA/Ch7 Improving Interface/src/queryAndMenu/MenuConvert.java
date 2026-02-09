package queryAndMenu;

public class MenuConvert {
	//instance variables
	private double yd, ft, in, m;
	
	public MenuConvert() {
		yd = 0; ft = 0; in = 0; m = 0;
	}//end MenuConvert

	public double getYd() {return yd;}
	public void setYd(double yd) {this.yd = yd;}
	public double getFt() {return ft;}
	public void setFt(double ft) {this.ft = ft;}
	public double getIn() {return in;}
	public void setIn(double in) {this.in = in;}
	public double getM() {return m;}
	public void setM(double m) {this.m = m;}
	
	public double setYardToFeet() {
		return yd * 3.0;
	}
	
	public double setFeetToYard() {
		return ft / 3.0;
	}
	
	public double setYardToInch() {
		return yd * 36.0;
	}
	
	public double setInchToYard() {
		return in / 36.0;
	}
	
	public double setFeetToMeter() {
		return ft * 0.3048;
	}
}//end class
