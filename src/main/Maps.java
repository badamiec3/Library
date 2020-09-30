package main;

public class Maps extends Items {

	private int size;
	private int ageOfItem;
	private String title;
	private int mapYear;
	private String region;

	public Maps(int size, int ageOfItem, String title, int mapYear, String region) {
		super(size, ageOfItem, title);
		this.mapYear = mapYear;
		this.region = region;

	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getAgeOfItem() {
		return ageOfItem;
	}

	public void setAgeOfItem(int ageOfItem) {
		this.ageOfItem = ageOfItem;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getMapYear() {
		return mapYear;
	}

	public void setMapYear(int mapYear) {
		this.mapYear = mapYear;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

}
