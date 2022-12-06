package aims.cart;
import java.util.ArrayList;

import aims.media.Media;

public class Cart {
	private static final int MAX_NUMBERS_ORDERED = 20;
	
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	
	public void addMedia(int id, String title, String category, float cost) {
		Media media = new Media(id, title, category, cost);
		if(!itemsOrdered.contains(media)){
			itemsOrdered.add(media);
		}
	}

	public void removeMedia(int id, String title, String category, float cost){
		Media media = new Media(id, title, category, cost);
		if(itemsOrdered.contains(media)){
			itemsOrdered.remove(media);
		}
	}
}
