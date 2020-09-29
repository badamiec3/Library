package main;

public abstract class Items {
	
	private int size;
	private int ageOfItem;
	private String title;
	
	
	public Items(int size, int ageOfItem, String title) {
		this.size = size;
		this.ageOfItem = ageOfItem;
		this.title = title;
		
	}
	
	//Getters and Setters
	
	
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


}
