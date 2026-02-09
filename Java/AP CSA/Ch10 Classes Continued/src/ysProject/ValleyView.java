package ysProject;

public class ValleyView extends ElementarySchool {

	public ValleyView() {super();}
	public ValleyView(String f, String l, int id, int gdlvl) {
		super(f, l, id);
		gradeLevel = gdlvl;
		phoneNumber = "VV";
	}//end constructor
	
	
	public String specials() {
		return super.specials() + " - New Playground";
	}
	
	public String toString() {
		String str = super.toString() +
					"\nGrade: " + gradeLevel + 
					"\nPhone: " + phoneNumber +
					"\nSpecials: " + specials();
		return str;
	}
}
