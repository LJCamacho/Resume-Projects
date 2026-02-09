package practice;

public class DVD {
	//instance variables
	private String title;
	private int rating;
	
	//constructors
	public DVD(String t, int r) {
		title = t;
		rating = r;
	}//end
	public DVD () {
		this ("", 0	);
	}
	//end of constructors
	
	//methods
	
	public String getTitle() {return title;}
	public int getRating() {return rating;}
	
	public String toString() {
		String str = "\nTitle: " + title + 
						  "\nRating: " + rating;
			return str;
	}
	
}
