package hust.soict.dsai.aims.media;
import java.util.*;

public class CompactDisc extends Disc implements Playable {
//Add fields
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	//Generate getter
	public String getArtist() {
		return artist;
	}
//Generate constructors
	public CompactDisc(String director, int length, String artist) {
		super(director, length);
		this.artist = artist;
	}
	public CompactDisc(String director, int length, List<Track> tracks) {
		super(director, length);
		this.tracks = tracks;
	}
	public CompactDisc(String director, int length, String artist, List<Track> tracks) {
		super(director, length);
		this.artist = artist;
		this.tracks = tracks;
	}
//Create methods
	//add a track to the track list
	public void addTrack(Track newTrack) {
		for (Track i : tracks) {
			if (i != newTrack) {
				tracks.add(newTrack);
				System.out.println("The track has been added");
			}else {System.out.println("The track has already in the track list");}
		}
	}
	//remove a track from the track list
	public void removeTrack(Track inputTrack) {
		for (Track i : tracks) {
            if (i == inputTrack) {
                tracks.remove(inputTrack);
                System.out.println("The track has been removed from the list");
            }else{System.out.println("The track is not in the list");}
        }
	}
	//get the CD's length
	public void getCDLength() {
		int CDLength = 0;
		for (int i=0; i<tracks.size(); i++) {
			CDLength += tracks.get(i).getLength();
		}System.out.println("The length of the CD is: " + CDLength);
	}
//Add the play() method
	public void play() {
		for (int i=0; i<tracks.size(); i++) {
			System.out.println(tracks.get(i));
			Track track = new Track(null, 0);
			track.play();
		}
	}
}
