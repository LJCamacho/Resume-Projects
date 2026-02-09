package ysProject;

public class IndianRock extends ElementarySchool {
	public IndianRock() {super();}
	public IndianRock(String f, String l, int id, int gdlvl) {
		super(f, l, id);
		gradeLevel = gdlvl;
		phoneNumber = "ROCK";
	}//end constructor
	
	
	public String toString() {
		String str = super.toString() +
					"\nGrade: " + gradeLevel + 
					"\nPhone: " + phoneNumber +
					"\nSpecials: " + specials();
		return str;
	}
}
