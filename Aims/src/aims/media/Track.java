package aims.media;

public class Track {
	private int length;
	private String title;
	public Track(String title, int length) {
		this.length = length;
		this.title = title;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void play() {
		System.out.println("Playing track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Track) {
			Track track = (Track) o;
			if ((this.title.equals(track.title)) && (this.length == track.length)) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
	public String toString() {
		return "Track " + this.getTitle() + " + " + this.getLength() + "\n";
	}
}