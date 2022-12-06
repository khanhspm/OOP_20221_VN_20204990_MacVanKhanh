package aims.media;

public class Disc extends Media{
	public Disc(int id, String title, String category, float cost) {
		super(id, title, category, cost);
		// TODO Auto-generated constructor stub
	}
	public Disc(String title, String category, String director, int lenght, float cost) {
		// TODO Auto-generated constructor stub
		super(title, category, cost);
	}
	protected String director;
	protected int length;
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	
}
