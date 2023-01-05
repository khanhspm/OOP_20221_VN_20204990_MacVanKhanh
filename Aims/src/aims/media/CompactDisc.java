package aims.media;

import aims.exception.PlayerException;
import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	
	public CompactDisc(String title, float cost){
		super(title, cost);
	}
	
	public CompactDisc(String title, String category, String director, int length, float cost){
		super(title, category, director, length, cost);
	}
	
	public CompactDisc(String title, String category, String director, int length, float cost, String artist, List<Track> tracks) {
        super(title, category, director, length, cost);
        this.artist = artist;
        this.tracks = tracks ;
    }
	
	public CompactDisc(String title, String category, String director, float cost, String artist) {
		super(title, category, director, cost);
        this.artist = artist;

    }

	public String getArtist() {
		return artist;
	}
	
	public void addTrack(Track track) {
		if (tracks.contains(track)) {
			return;
		}else {
			tracks.add(track);
		}
	}
	
	public void removeTrack(Track track) {
		if (tracks.contains(track)) {
			tracks.remove(track);
		}else {
			System.out.println("Not contain that track!!!");
		}
	}
	
	public int getLength() {
		int totalLength = 0;
		for (Track tr: tracks) {
			totalLength += tr.getLength();
		}
		return totalLength;
	}
	
	@Override
    public void play() throws PlayerException {
        System.out.println("Playing : " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
        for (Track s:
             tracks) {
            s.play();
        }
    }

	public String toString() {
		StringBuilder res =  new StringBuilder();
		res.append("CD - ");
		res.append(this.getTitle());
		res.append(" - ");
		res.append(this.artist);
		res.append("\n");
		for (Track track: this.tracks) {
			res.append(track.toString());
		}
		res.append(Float.toString(this.getCost()) + "$\n");
		String s = res.toString();
		return s;
	}
}