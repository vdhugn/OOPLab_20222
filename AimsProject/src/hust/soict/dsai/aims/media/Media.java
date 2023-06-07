package hust.soict.dsai.aims.media;

public class Media {
//Add fields
    protected String title;
    protected String category;
    protected float cost;
//Generate getter & setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
    
}
