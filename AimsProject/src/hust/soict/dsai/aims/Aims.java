package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

//AIMS
public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
//        String[] dvdList= {"The Lion King", "Star Wars", "Aladin"};
        DigitalVideoDisc dvd1 = new DigitalVideoDisc
        		("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc
        		("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc
        		("Aladin", "Animation", "Ron Clements, John Musker", 90, 18.99f);
        anOrder.addMedia(dvd3);
        
    }
}
