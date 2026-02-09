package yshsProject;

public class student {
	//instance variables
	private String name;
	private int track;
	private int gradeLevel;
	private double gradePointAverage;
	private int gradYear;
	
	

	//public method
	
	public String getNameRules() {
		return "nonblank";
	}
	public String getTrackRules() {
		return "1, 2, or 3 for General, CP, or Honors respectively";
	}
	public String getGradeLevelRules() {
		return "9 to 12 inclusive";
	}
	public String getGradePointAve() {
		return "0.0 to 4.0 inclusive";
	}
	public boolean setName(String nm) {
		if (nm.equals(""))
	    	 return false;
	     else
	    	 name = nm;
	     return true;
	}//end setName
	public boolean setTrack(int tr) {
		if (tr != 1 && tr != 2 && tr != 3)
	    	  return false;
	      else
	    	  track = tr;
	      return true;
	}
	public boolean setGradelevel(int g) {
		if (!(9 <= g && g <= 12))
	    	 return false;
	     else
	    	 gradeLevel = g;
			if (gradeLevel == 9) {
				gradYear = 2022;
			}
			if (gradeLevel == 10) {
				gradYear = 2021;
			}
			if (gradeLevel == 11) {
				gradYear = 2020;
			}
			if (gradeLevel == 12) {
				gradYear = 2019;
			}
	     	return true;    	
	}
	public boolean setGradePointAve(double gpa) {
		if (!(0.0 <= gpa && gpa <= 4.0))
	    	  return false;
	      else 
	    	  gradePointAverage = gpa;
	    	  return true;
	}
	public String toString() {
		String str = "name: " + name +
				"\nGrade: " + gradeLevel +
				"\nGraduation: " + gradYear +
				"\nGPA: " + gradePointAverage;
				
		return str;
	}
	
}
