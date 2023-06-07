package hust.soict.dsai.aims.media;

public class Track implements Playable {
//Add fields
	private String title;
	private int length;
//Generate getter 
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}
//Generate constructors
	public Track(String title, int length) {
		super();
		this.title = title;
		this.length = length;
	}
//Add the play() method
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}	
}
