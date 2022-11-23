package aims.disc;

public class DigitalVideoDisc {
	private String title;
	private String catelory; 
	private String director;
	private int length;
	private float cost;
	private static int nbDigitalVideoDiscs = 0;
	public String getTitle() {
		return title;
	}
	public String getCatelory() {
		return catelory;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	public DigitalVideoDisc(String title, String catelory, float cost) {
		super();
		this.title = title;
		this.catelory = catelory;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String catelory, String director, float cost) {
		super();
		this.title = title;
		this.catelory = catelory;
		this.director = director;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String catelory, String director, int length, float cost) {
		super();
		this.title = title;
		this.catelory = catelory;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	public void set(String title2) {
		// TODO Auto-generated method stub
		this.title = title2;
	}

	public String toString() {
		return title + " " + catelory + " " + director + " " + length + " " + cost;
	}
	
	public boolean isMatch(String title) {
		if(this.title == title) {
			return true;
		}
		else return false;
	}
	
}
