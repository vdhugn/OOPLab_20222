package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

//Store
public class Store {
	private DigitalVideoDisc[] itemsInStore;
	private int qty;
	
	public Store(int maxQty) {
		itemsInStore = new DigitalVideoDisc[maxQty];
		qty = 0;
	}
	
	//add a DVD to the cart
	public void addDVD(DigitalVideoDisc dvd) {
		if (qty < itemsInStore.length) {
			itemsInStore[qty++] = dvd;
			System.out.println(
					"The disc " + dvd.getTitle() + " has been added to the Store.");
		}else {
			System.out.println("The cart is full");
		}
	}
		
	//remove a DVD from the cart
	public void removeDVD(DigitalVideoDisc dvd) {
		for (int i = 0; i < qty; i++) {
	           if (itemsInStore[i] == dvd) {
	               for (int j = i; j < qty - 1; j++) {
	                   itemsInStore[j] = itemsInStore[j + 1];
	               }
	               itemsInStore[qty - 1] = null;
	               qty--;
	               System.out.println("The disc " + dvd.getTitle() + " has been removed from the Store.");
	           }
	       }
	       System.out.println("The disc " + dvd.getTitle() + " is not in the Store.");
	}
		
}
