
public class Cart {
	private int qtyOrdered = 0;
	private static final int MAX_NUMBERS_ORDERED = 20;

	public void Cart() {
		
	}
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	private void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}

	private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full.");
		}else {
			this.itemOrdered[this.qtyOrdered] = disc;
			this.qtyOrdered++;
			System.out.println("The disc has been added");
		}
	}
	
	//public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		
	//}
	
	public float totalCost() {
		float total = 0;
		for(int i = 0; i < this.qtyOrdered; i++) {
			total += this.itemOrdered[i].getCost();
		}
		return total;
	}

}
