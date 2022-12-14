package aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	
	public void addTrack(Track track) {
		if(!tracks.contains(track)) {
			tracks.add(track);
		}
	}
	
	public void removeTrack(Track track) {
		if(tracks.contains(track)) {
			tracks.remove(track);
		}
	}
	
	public int getLengh() {
		return tracks.size();
	}
	
	public void play() {
		for(Track item:tracks) {
			System.out.println("Playing DVD: " + this.getTitle());
			System.out.println("DVD length: " + this.getLength());
		}
	}
}
