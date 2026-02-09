package queryAndMenu;

public class Convert {
	//instance variables
	private double yd, ft;
	
	public Convert() {
		yd = 0; ft = 0;
	}//end convert

	public double getYd() {return yd;}
	public void setYd(double yd) {this.yd = yd;}
	public double getFt() {return ft;}
	public void setFt(double ft) {this.ft = ft;}
	
	public double setYardToFeet() {
		return yd * 3.0;
	}
	
	
	
	
}//end convert
