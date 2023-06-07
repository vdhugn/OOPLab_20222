package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.media.Media;
import java.util.*;

//Cart
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new
			ArrayList<Media>();

//add media to the cart
	public void addMedia(Media med) {
		if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
			itemsOrdered.add(med);
			System.out.println("The media " + med.getTitle() + " has been added to the cart");
		}else {System.out.println("The cart is full");}
	}
//remove media from the cart
	public void removeMedia(Media med) {
		for (Media element : itemsOrdered) {
            if (element == med) {
                itemsOrdered.remove(med);
                System.out.println("The media " + med.getTitle() + " has been removed from the cart");
            }else{System.out.println("The media is not in the cart");}
        }
	}
//calculate the total cost
	public float totalCost() {
		float totalCost = 0;
      for (int i = 0; i < itemsOrdered.size(); i++) {
          totalCost += itemsOrdered.get(i).getCost();
      }
      return totalCost;
	}
}