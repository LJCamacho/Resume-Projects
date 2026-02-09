package caseStudyStudent;

public class TestScoreModel {

	private Student[] student;
	private int index;
	private int studentCount;
	
	public TestScoreModel() {
		index = 3;
		studentCount = 0;
		student = new Student[10];
		
		student[0] = new Student("Adam", 78, 88, 98);
		student[1] = new Student("Billy", 76, 66, 56);
		student[2] = new Student("Charles", 44, 55, 66);
		student[3]	= new Student("Drew", 90, 91, 93);
		studentCount = 4;
		
	}//end constructor
	
	
	//methods
	public String add(Student s) {
		if (studentCount == student.length)
			return "Sorry: roster is full";
		else {
			student[studentCount] = s;
			studentCount++;
			return null;
		}
	}//end add
	
	public String replace(Student s) {
		if(index == -1)
			return "Must add a student first";
		else
			student[index] = s;
		return null;
	}
	
	//navigation
	public Student first() {
		Student s = null;
		if (studentCount == 0)
			index = -1; 
		else {
			index = 0;
			s = student[studentCount];
		}
		return s;
	}//end first
	
	public Student previous () {
		Student s = null;
		if (studentCount == 0)
			index = -1;
		else {
			index = Math.max(0, index - 1);
			s = student[index];
		}
		return s;
	}//end previous
	
	public Student next() {
		Student s = null;
		if (studentCount == 0)
			index = -1;
		else {
			index = Math.min(studentCount - 1, index + 1);
			s = student[index];
		}
		return s;
	}//end next
	
	public Student last() {
		Student s = null;
		if (studentCount == 0)
			index = -1;
		else {
			index = studentCount-1;
			s = student[index];
		}
		return s;
	}//end last
	
	public Student currentStudent() {
		if (index == -1)
			return null;
		else
			return student[index];
	}//end currentStudent
	
	public int size() {
		return studentCount;
	}//end size
	
	public int currentPosition() {
		return index;
	}//end currentPosition
	
	public int getClassAverage() {
		if (studentCount == 0)
			return 0;
		int sum = 0;
		for (int i = 0; i < studentCount; i++)
			sum+=student[i].getAverage();
		return sum/studentCount;
	}//end class average
	
	public Student getHighScore() {
		if (studentCount == 0)
			return null;
		else {
			Student s = student[0];
			for (int i = 1; i < studentCount; i++)
				if (s.getHighScore() < student[i].getHighScore())
					s = student[i];
			return s;
		}
	}//end getHighScore
	
	public String toString() {
		String result = "";
		for (int i = 0; i < studentCount; i++)
			result = result + student[i] + "\n";
		return result;
	}//end toString
	
}
