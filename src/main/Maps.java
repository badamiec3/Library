package main;

public class Maps extends Items {
	
	private int size;
	private int ageOfItem;
	private String title;
	private int mapYear;
	private String region;
	
	
	public Maps(int size, int ageOfItem, String title,  int mapYear, String region) {
		super(size, ageOfItem, title );
		this.mapYear = mapYear;
		this.region = region;
		
		
	}
	
	
	

}
