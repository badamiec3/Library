package main;

public class Dissertations extends Items {
	
	

	private int size;
	private int ageOfItem;
	private String title;
	private String subject;
	
	
	public Dissertations(int size, int ageOfItem, String title, String subject) {
		super(size, ageOfItem, title );
		this.subject = subject;
		
		
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


}

