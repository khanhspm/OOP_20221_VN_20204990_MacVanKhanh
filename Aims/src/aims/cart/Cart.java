package aims.cart;
import java.util.ArrayList;

import aims.media.Media;

public class Cart {
	private static final int MAX_NUMBERS_ORDERED = 20;
	
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	
	public void addMedia(int id, String title, String category, float cost) {
		if(!itemsOrdered.contains(category)) {
			
		}
	}
}
