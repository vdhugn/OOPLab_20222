//Cart
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered;
	public void addDigitalVideoDisc(DigitalVideoDisc dvd) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered] = dvd;
			qtyOrdered++;
			System.out.println(
					"The disc " + dvd.getTitle() + " has been added.");
		}else {
			System.out.println("The cart is full");
		}
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc dvd) {
		for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == dvd) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The disc " + dvd.getTitle() + " has been removed.");
            }
        }
        System.out.println("The disc " + dvd.getTitle() + " is not in the cart.");
	}
	public float totalCost() {
        float totalCost = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            totalCost += itemsOrdered[i].getCost();
        }
        return totalCost;
    }
}