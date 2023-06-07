package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
//Add fields
	private int id;
	private static int nbDigitalVideoDiscs = 0;
//Generate getter & setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
//Generate constructors
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		this.id = ++ nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.id = ++ nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		this.id = ++ nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		this.id = ++ nbDigitalVideoDiscs;
	}	
//Create methods
	public String toString() {
		return "DVD - [" + title + "] - [" + category +"] - ["+director+"] - [" + length + "]: [" + cost + "] $";
	}	
	public boolean isMatch(String title) {
		return this.title.equalsIgnoreCase(title);
	}
//Add the play() method
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
		}
}
