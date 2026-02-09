package ysProject;

public abstract class YS {
	//instance variables
	protected String first, last;
	protected int StudentID;
	protected int gradeLevel;
	protected String phoneNumber;
	protected static int StudentCount;
	
	
	public YS() {
		first = ""; last = "";
		StudentID = 0; gradeLevel = 0;
		phoneNumber = "";
		
	}
	
	public YS(String f, String l, int id) {
		first = f; last = l; StudentID = id; 
		StudentCount++;
	}

	public final String getFirst() {return first;}
	public final void setFirst(String first) {this.first = first;}
	public final String getLast() {return last;}
	public final void setLast(String last) {this.last = last;}
	public final int getStudentID() {return StudentID;}
	public final void setStudentID(int studentID) {StudentID = studentID;}
	public final int getGradeLevel() {return gradeLevel;}
	public final void setGradeLevel(int gradeLevel) {this.gradeLevel = gradeLevel;}
	public static final int getStudentCount() {return StudentCount;}
	public static final void setStudentCount(int studentCount) {StudentCount = studentCount;}
	
	//method
	public String getPhoneNumber() {return phoneNumber;}
	public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}
	
	//abstract method
	abstract public String specials();
	
	
	public String toString() {
		String str = "\nFirst: " + first
						+ "\nLast: " + last 
						+ "\nStudent ID: " + StudentID;
		return str;
	}
	
}//end YS
