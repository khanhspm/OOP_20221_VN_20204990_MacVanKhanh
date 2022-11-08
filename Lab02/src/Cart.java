
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
		if(qtyOrdered == MAX_NUMBERS_ORDERED - 1) {
			System.out.println("The cart is almost full.");
		}else {
			this.itemOrdered[this.qtyOrdered] = disc;
			this.qtyOrdered++;
			System.out.println("The disc has been added");
		}
	}
	
	public int searchDigitalVideoDisc(DigitalVideoDisc disc) {
		int res = -1;
		for (int i=0;i<this.qtyOrdered;i++) {
			if (this.itemOrdered[i].equals(disc)) {
				res = i;
			}
		}
		if (res == -1) {
			System.out.println("Not found");
		}
		return res;
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int idx = this.searchDigitalVideoDisc(disc);
		if (idx == -1) {
			System.out.println("Can't delete!");
		}else {
			for (int j=idx;j<this.qtyOrdered-1;j++) {
				this.itemOrdered[j] = this.itemOrdered[j+1];
			}
			this.itemOrdered[this.qtyOrdered-1] = null;
			this.qtyOrdered -= 1;
			System.out.println("Delete success");
			System.out.println("Current quantity: " + this.qtyOrdered);
		}
	}
	
	public float totalCost() {
		float total = 0;
		for(int i = 0; i < this.qtyOrdered; i++) {
			total += this.itemOrdered[i].getCost();
		}
		return total;
	}

}
