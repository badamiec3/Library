package main;

public abstract class People {

	private String name;
	private int age;

	
	public abstract void walksIn();

	public abstract void walksOut();

	public abstract void sits();
	
	
	
	//Getters and Setters
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	

}
