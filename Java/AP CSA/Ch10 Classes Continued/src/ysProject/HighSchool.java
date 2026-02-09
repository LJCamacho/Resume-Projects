package ysProject;

public class HighSchool extends YS{

	
	public HighSchool() {super();}
	public HighSchool(String f, String l, int id, int gdlvl) {
		super(f, l, id);
		gradeLevel = gdlvl;
		phoneNumber = "High";
	}//end constructor
	
	
	public String specials() {
		return "open-campus lunch";
	}
	
	public String toString() {
		String str = super.toString() + 
						 "\nPhone: " + phoneNumber +
						 "\nGrade: " + gradeLevel +
						 "\nSpecials: " + specials();
		return str;
	}
}
