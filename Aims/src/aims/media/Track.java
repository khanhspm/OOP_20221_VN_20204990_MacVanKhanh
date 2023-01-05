package aims.media;

import aims.exception.PlayerException;
import javax.swing.*;
import java.awt.*;

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
	

    public void play() throws PlayerException {
        if(this.getLength() > 0){
            System.out.println("Playing DVD: " + this.getTitle());
            System.out.println("DVD length: " + this.getLength());
            JFrame f = new JFrame();
            f.setSize(400, 400);
            JDialog d = new JDialog(f, "Playing disc...");
            d.setLayout(new FlowLayout());
            d.add(new JLabel("Playing DVD: " + this.getTitle()));
            d.add(new JLabel("DVD length: " + this.getLength()));
        }
        else {
            throw new PlayerException("ERROR: DVD length is non-positive!");
        }
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