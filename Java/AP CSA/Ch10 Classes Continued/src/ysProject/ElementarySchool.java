package ysProject;

public class ElementarySchool extends YS {

	public ElementarySchool() {super();}
	public ElementarySchool(String f, String l, int id) {
		super(f, l, id);
	}//end constructor
	
	
	public String specials() {
		return "Recess";
	}
	
	public String toString() {
		return super.toString();
	}
}
