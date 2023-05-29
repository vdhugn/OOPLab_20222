//Cart
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered;
	
//see the name of the DVDs in the cart
	public void seeCurrentCart() {
		for (int i=0; i<qtyOrdered; i++) {
			System.out.print(
					itemsOrdered[i].getTitle()+"; ");
		}
	}
	
//add a DVD to the cart
	public void addDigitalVideoDisc(DigitalVideoDisc dvd) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered++] = dvd;
			System.out.println(
					"The disc " + dvd.getTitle() + " has been added.");
		}else {
			System.out.println("The cart is full");
		}
	}
	
//remove a DVD from the cart
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
	
//calculate the total cost 
	public float totalCost() {
        float totalCost = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            totalCost += itemsOrdered[i].getCost();
        }
        return totalCost;
    }
	
//overloading method addDigitalVideoDisc
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
			for (DigitalVideoDisc dvd: dvdList  ) {
				addDigitalVideoDisc(dvd);
			}
		}
	}
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		addDigitalVideoDisc(dvd1);
		addDigitalVideoDisc(dvd2);
	}
}