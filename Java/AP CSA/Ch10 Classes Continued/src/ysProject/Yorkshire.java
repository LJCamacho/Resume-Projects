package ysProject;

public class Yorkshire extends ElementarySchool {
	public Yorkshire() {super();}
	public Yorkshire(String f, String l, int id, int gdlvl) {
		super(f, l, id);
		gradeLevel = gdlvl;
		phoneNumber = "YORK";
	}//end constructor
	
	
	public String toString() {
		String str = super.toString() +
					"\nGrade: " + gradeLevel + 
					"\nPhone: " + phoneNumber +
					"\nSpecials: " + specials();
		return str;
	}
}
