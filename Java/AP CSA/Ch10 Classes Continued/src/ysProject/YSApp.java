package ysProject;

public class YSApp {

	public static void main(String[] args) {

		YS s1 = new HighSchool      ("Drew", "Dunker", 007, 9);
		YS s2 = new MiddleSchool  ("Adam", "Bench", 222, 6);
		YS s3 = new MiddleSchool  ("Logan", "Lazer", 0, 8);
		YS s4 = new ValleyView      ("Matt", "Mountain", 444, 1);
		YS s5 = new IndianRock     ("Michael", "Phelps", 555, 5);
		YS s6 = new Yorkshire       ("Justine", "GameWinner", 333, 3);
		YS s7 = new IndianRock     ("Ryan", "Ready", 777, 4);
		
		System.out.print(s1.toString());
		System.out.print(s2.toString());
		System.out.print(s3.toString());
		System.out.print(s4.toString());
		System.out.print(s5.toString());
		System.out.print(s6.toString());
		System.out.print(s7.toString());
		
		
		System.out.println(YS.getStudentCount());
		
	}

}
