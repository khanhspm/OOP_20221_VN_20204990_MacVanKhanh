package aims.media;

import java.util.Comparator;

public abstract class Media {
	private int id;
	private String title;
	private String category;
	private float cost;
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = 
			new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = 
			new MediaComparatorByCostTitle();
	
	public Media(String title){
		this.setTitle(title);
		this.setCategory("Unknown");
		this.setCost(0.0f);
	}
	
	public Media(String title, float cost){
		this.setTitle(title);
		this.setCategory("Unknown");
		this.setCost(cost);
	}
	
	public Media(String title, String category, float cost){
		this.setTitle(title);
		this.setCategory(category);
		this.setCost(cost);
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Media(int id, String title, String category, float cost) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public float getCost() {
		return cost;
	}
	
	public boolean isMatch(String title) {
		if (this.getTitle().contains(title)) {
			return true;
		}
		return false;
	}
	
	public boolean isMatch(int id) {
        return (this.id == id);
    }
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Media) {
			Media media = (Media) o;
			if (this.title.equals(media.title)) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
}
	