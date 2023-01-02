package aims.media;

import java.util.List;
import java.util.ArrayList;

public class Book extends Media {
	private static int QUANTITY = 0;
	private List<String> authors = new ArrayList<String>();
	
	public Book(String title, float cost, String category, List<String> authors) {
		super(title, category, cost);
		Book.QUANTITY += 1;
		this.setId(Book.QUANTITY);
		this.authors = authors;
	}
	
	public Book(String title, float cost, String category) {
		super(title, category, cost);
		Book.QUANTITY += 1;
		this.setId(Book.QUANTITY);
		List<String> authors = new ArrayList<String>();
		authors.add("Unknown");
		this.authors = authors;
	}	
	
	public Book(String title, float cost) {
		super(title, cost);
		Book.QUANTITY += 1;
		this.setId(Book.QUANTITY);
		List<String> authors = new ArrayList<String>();
		authors.add("Unknown");
		this.authors = authors;
	}
	
	
	public void addAuthor(String authorName) {
		if (authors.contains(authorName)) {
			return;
		}else {
			authors.add(authorName);
		}
	}
	
	public void removeAuthor(String authorName) {
		if (authors.contains(authorName)) {
			authors.remove(authorName);
		}else {
			System.out.println("Not contain that author!!!");
		}
	}

}
