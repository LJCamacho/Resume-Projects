package RedBox;

public class DVD {
	//instance variables
		private String title;
		private int rating;
		private double cost;
		
		//constructors
		public DVD() {this("", 0); }
		
		public DVD (DVD d) {
			this (d.getTitle(), d.getRating());
		}
		public DVD(String t, int r) {
			title = t; rating = r;
		}//end DVD

		//methods
		public String getTitle() {return title;}
		public int getRating() {return rating;}
		
	}//end class
