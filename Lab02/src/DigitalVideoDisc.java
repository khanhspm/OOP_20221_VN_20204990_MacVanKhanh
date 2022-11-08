
public class DigitalVideoDisc {
	private String title;
	private String catelory; 
	private String director;
	private int length;
	private float cost;
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
	public DigitalVideoDisc(String title, String catelory, String director, int length, float cost) {
		super();
		this.title = title;
		this.catelory = catelory;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	
}
