package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

//Cart
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered;
	
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

//print the list of ordered items of a cart	
	public void printCart() {
		System.out.println("***********************CART***********************");
		for (int i=0; i<qtyOrdered; i++) {
			DigitalVideoDisc dvd = itemsOrdered[i];
			System.out.println(
					"DVD - ["+dvd.getTitle()+"] - ["+dvd.getCategory()+"] - ["+dvd.getDirector()+"] - ["+dvd.getLength()+"]: ["+dvd.getCost()+"] $");
		}
		System.out.println("Total cost: " + totalCost());
		System.out.println("***************************************************");
	}

//Search for DVDs in the cart by ID
	public void searchByID(int id) {
        boolean found = false;
        System.out.println("Results for ID " + id);    
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getId() == id) {
                System.out.println(itemsOrdered[i].toString());
                found = true;
            }
        }if (!found) {
            System.out.println("No DVD matches the ID: " + id);
        }
    }
 
//Search for DVDs in the cart by title
    public void searchByTitle(String title) {
        boolean found = false;    
        System.out.println("Search Results for Title: " + title);    
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(title)) {
                System.out.println(itemsOrdered[i].toString());
                found = true;
            }
        } if (!found) {
            System.out.println("No DVD matches the title: " + title);
        }
	}
}