package aims.store;
import java.util.ArrayList;

import aims.media.DigitalVideoDisc;
import aims.media.Media;

public class Store {
	public static final int MAX_NUMBER_DVD = 100;
	private ArrayList<Media> itemsInStore= new ArrayList<Media>();
	
	public void addMedia(Media media) {
		if (this.itemsInStore.size() < MAX_NUMBER_DVD) {
			itemsInStore.add(media);
			System.out.println("Add successed!");
		}else {
			System.out.println("Max number ordered!");
		}
	}
	
	public int findDVD(DigitalVideoDisc disc) {
		int res = -1;
		for (int i=0;i<this.itemsInStore.size();i++) {
			if (this.itemsInStore.get(i) instanceof DigitalVideoDisc) {
				DigitalVideoDisc dvd = (DigitalVideoDisc) this.itemsInStore.get(i);
				if (dvd.equals(disc)) {
					res = i;
				}
			}

		}
		if (res == -1) {
			System.out.println("Not found");
		}
		return res;
	}
	public void removeMedia(Media media) {
		this.itemsInStore.remove(media);
		System.out.println("Delete success");
		System.out.println("Current quantity: " + this.itemsInStore.size());
	}

	public ArrayList<Media> getItemsInStore() {
		return itemsInStore;
	}
	
}