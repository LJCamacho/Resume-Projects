package staticExamples;

public class HockeyPlayer {

	//instance variables
	String name, team;
	int num, height, weight;
	boolean allStar;
	
	//class/static variables
	static int count;
	
	
	public HockeyPlayer(String name, String team, int num, int height,
			int weight, boolean allStar) {
		this.name = name;
		this.team = team;
		this.num = num;
		this.height = height;
		this.weight = weight;
		this.allStar = allStar;
		count++;
	}
	//methods
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getTeam() {return team;}
	public void setTeam(String team) {this.team = team;}
	public int getNum() {return num;}
	public void setNum(int num) {this.num = num;}
	public int getHeight() {return height;}
	public void setHeight(int height) {this.height = height;}
	public int getWeight() {return weight;}
	public void setWeight(int weight) {this.weight = weight;}
	public boolean isAllStar() {return allStar;}
	public void setAllStar(boolean allStar) {this.allStar = allStar;}
	
	public static int getCount () {return count;}
	
	/* Class Method (Static Method) ... no instance variables 
	public static String getStats() {
		String str = "Name: " + name + 
						  "all-star:" + allStar;
		return str;
	}
	*/
	public String toString() {
		return "HockeyPlayer [name=" + name + ", team=" + team + ", num=" + num
				+ ", height=" + height + ", weight=" + weight + ", allStar="
				+ allStar + "]" + "\nCount = " + count;
	}


	public static void main(String[] args) {
		//object variables
		HockeyPlayer p1 = new HockeyPlayer("Justine", "Bears", 18, 72, 150, true);
		System.out.println(p1.toString());
		HockeyPlayer p2 = new HockeyPlayer("Matt", "Bears", 2, 52, 130, false);
		System.out.println(p2.toString());
		HockeyPlayer p3 = new HockeyPlayer("Mikey", "Lousiana", 72, 90, 305, true);
		System.out.println(p3.toString());
		HockeyPlayer p4 = new HockeyPlayer("Lebron", "Lakers", 23, 78, 220, false);
		System.out.println(p4.toString());
		HockeyPlayer p5 = new HockeyPlayer("Dumb Idiot", "Alabama", 99, 40, 50, false);
		System.out.println(p5.toString());
		
		System.out.println("\n1) "+ p1.getName() );
		System.out.println("\n " + HockeyPlayer.getCount());
	}//end main

}//end class
