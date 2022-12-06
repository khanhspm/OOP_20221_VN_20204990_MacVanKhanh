package aims.disc;

public class DigitalVideoDisc {
	
	private static int nbDigitalVideoDiscs = 0;
	
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
