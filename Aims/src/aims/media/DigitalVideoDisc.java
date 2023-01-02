package aims.media;

public class DigitalVideoDisc extends Disc {
	private String director;
	private int length;
	private static int nbDigitalVideoDiscs = 0;
	
	public DigitalVideoDisc(String title){
		super(title);
		DigitalVideoDisc.nbDigitalVideoDiscs += 1;
		this.setId(nbDigitalVideoDiscs);
	}
	
	public DigitalVideoDisc(String title, float cost){
		super(title, cost);
		DigitalVideoDisc.nbDigitalVideoDiscs += 1;
		this.setId(nbDigitalVideoDiscs);
	}
	
	public DigitalVideoDisc(String title, String category, float cost){
		super(title, category, cost);
		DigitalVideoDisc.nbDigitalVideoDiscs += 1;
		this.setId(nbDigitalVideoDiscs);
	}
	
	public DigitalVideoDisc(String title, String category, String director, float cost){
		super(title, category, director, cost);
		DigitalVideoDisc.nbDigitalVideoDiscs += 1;
		this.setId(nbDigitalVideoDiscs);
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost){
		super(title, category, director, length, cost);
		DigitalVideoDisc.nbDigitalVideoDiscs += 1;
		this.setId(nbDigitalVideoDiscs);
	}

	public boolean equals(DigitalVideoDisc disc) {
		if (this.getTitle().equals(disc.getTitle()) && this.getCategory().equals(disc.getCategory()) &&
			this.director.equals(disc.director) && this.length == disc.length && this.getCost() == disc.getCost()) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return "DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + Integer.toString(this.getLength()) + ": " + Float.toString(this.getCost()) + "$\n" ;
	}
	
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}

	
}
