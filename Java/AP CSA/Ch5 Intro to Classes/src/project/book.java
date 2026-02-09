package project;

public class book {
	//instance variables
	private String title, author;
	
	//constructors
	public book() {this("", ""); }
	
	public book (book b) {
		this (b.getTitle(), b.getAuthor());
	}
	public book(String t, String a) {
		title = t; author = a;
	}//end book

	//methods
	public String getTitle() {return title;}
	public String getAuthor() {return author;}
	
}//end class
