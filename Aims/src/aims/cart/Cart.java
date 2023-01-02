package aims.cart;
import java.util.ArrayList;
import java.util.Scanner;

import aims.media.Book;
import aims.media.CompactDisc;
import aims.media.DigitalVideoDisc;
import aims.media.Media;

public class Cart {
	public static final int MAX_NUMBER_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	public ArrayList<Media> getItemsOrdered() {
		return itemsOrdered;
	}

	public void addMedia(Media media) {
		if (this.itemsOrdered.size() < MAX_NUMBER_ORDERED) {
			if (this.itemsOrdered.contains(media)) {
				System.out.println("Item existed in cart!");
			}else {
				this.itemsOrdered.add(media);
				System.out.println("Add successed!");
			}
		}else {
			System.out.println("Max number ordered!");
		}
	}
	
	public void removeMedia(Media media) {
		this.itemsOrdered.remove(media);
		System.out.println("Delete success");
		System.out.println("Current quantity: " + this.itemsOrdered.size());

	}
	public float totalCost() {
		float res = 0.0f;
		for (int i=0;i<this.itemsOrdered.size();i++) {
			res += this.itemsOrdered.get(i).getCost();
		}
		return res;
	}
	
	public void printCart() {
		System.out.println("***********************CART***********************\nOrdered Items:\n");
		for (int i=0;i<this.itemsOrdered.size();i++) {
			if (this.itemsOrdered.get(i) instanceof DigitalVideoDisc) {
				DigitalVideoDisc media = (DigitalVideoDisc)this.itemsOrdered.get(i);
				System.out.println(Integer.toString(media.getId())+". "+media.toString());
			}
			if (this.itemsOrdered.get(i) instanceof Book) {
				Book media = (Book)this.itemsOrdered.get(i);
				System.out.println(Integer.toString(media.getId())+". "+media.toString());
			}
			if (this.itemsOrdered.get(i) instanceof CompactDisc) {
				CompactDisc media = (CompactDisc)this.itemsOrdered.get(i);
				System.out.println(Integer.toString(media.getId())+". "+media.toString());
			}

		}
		System.out.println("Total cost: " + Float.toString(this.totalCost())+"\n");
		System.out.println("**************************************************\n");
	}
	
	public void searchTitle() {
		Scanner sc= new Scanner(System.in);    
		System.out.print("Enter the title: ");  
		String title = sc.nextLine(); 
		for (int i=0;i<this.itemsOrdered.size();i++) {
			if (this.itemsOrdered.get(i) instanceof DigitalVideoDisc) {
				DigitalVideoDisc media = (DigitalVideoDisc)this.itemsOrdered.get(i);
				if (media.isMatch(title)) {
					System.out.println(media.toString());
				}
			}
			if (this.itemsOrdered.get(i) instanceof Book) {
				Book media = (Book)this.itemsOrdered.get(i);
				if (media.isMatch(title)) {
					System.out.println(media.toString());
				}
			}
			if (this.itemsOrdered.get(i) instanceof CompactDisc) {
				CompactDisc media = (CompactDisc)this.itemsOrdered.get(i);
				if (media.isMatch(title)) {
					System.out.println(media.toString());
				}
			}
		}
	}
	
	public void searchId() {
		Scanner sc= new Scanner(System.in);   
		System.out.print("Enter the Id: ");  
		int id = sc.nextInt();  
		for (int i=0;i<this.itemsOrdered.size();i++) {
			if (this.itemsOrdered.get(i) instanceof DigitalVideoDisc) {
				DigitalVideoDisc dvd = (DigitalVideoDisc)this.itemsOrdered.get(i);
				if (dvd.getId() == id) {
					System.out.println(dvd.toString());
					break;
				}
			}
			if (this.itemsOrdered.get(i) instanceof Book) {
				Book book = (Book)this.itemsOrdered.get(i);
				if (book.getId() == id) {
					System.out.println(book.toString());
					break;
				}
			}
			if (this.itemsOrdered.get(i) instanceof CompactDisc) {
				CompactDisc cd = (CompactDisc)this.itemsOrdered.get(i);
				if (cd.getId() == id) {
					System.out.println(cd.toString());
					break;
				}
			}
		}
		sc.close();
	}
	
	public void sortCartByTitleCost() {
		this.itemsOrdered.sort(Media.COMPARE_BY_TITLE_COST);
	}

	public void sortCartByCostTitle() {
		this.itemsOrdered.sort(Media.COMPARE_BY_COST_TITLE);
	}
}