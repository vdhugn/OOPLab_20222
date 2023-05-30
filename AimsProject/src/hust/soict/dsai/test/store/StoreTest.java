package hust.soict.dsai.test.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

//Store Test
public class StoreTest {
	public static void main(String[] args) {
		Store store = new Store(10);
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc
        		("Avengers", "Action", "Joss Whedon", 90, 30.05f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc
        		("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc
        		("Aladin", "Animation", "Ron Clements, John Musker", 90, 18.99f);
        
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);
        store.removeDVD(dvd1);
	}
}
