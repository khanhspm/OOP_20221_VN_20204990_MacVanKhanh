package aims;
import aims.cart.Cart;
import aims.disc.DigitalVideoDisc;

public class Aims {

	public static void main(String[] args) {
		Cart anOrder = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation",
														"Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction",
														"Geoger Lucas", 87, 24.95f);
		//anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
	//	anOrder.addDigitalVideoDisc(dvd3);
		
		anOrder.addDigitalVideoDisc(dvd2, dvd3);
		
		System.out.println("Total cost is: " + anOrder.totalCost());
		anOrder.removeDigitalVideoDisc(dvd1);
		System.out.println("Total cost after remove is: " + anOrder.totalCost());
	}

}
