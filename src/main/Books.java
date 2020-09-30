package main;

public class Books extends Items {

	private int size;
	private int ageOfItem;
	private String title;
	private int nOfPages;
	private String author;

	public Books(int size, int ageOfItem, String title, String author, int nOfPages) {
		super(size, ageOfItem, title);
		this.nOfPages = nOfPages;
		this.author = author;
	}

	// Getters and Setters

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

	public int getnOfPages() {
		return nOfPages;
	}

	public void setnOfPages(int nOfPages) {
		this.nOfPages = nOfPages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
