package ysProject;

public class MiddleSchool extends YS {
	
	public MiddleSchool() {super();}
	public MiddleSchool(String f, String l, int id, int gdlvl) {
		super(f, l, id);
		gradeLevel = gdlvl;
		phoneNumber = "Middle";
	}//end constructor
	
	
	public String specials() {
		return "Study Hall";
	}
	
	public String toString() {
		String str = super.toString() + 
						 "\nPhone: " + phoneNumber +
						 "\nGrade: " + gradeLevel +
						 "\nSpecials: " + specials();
		return str;
	}
}
