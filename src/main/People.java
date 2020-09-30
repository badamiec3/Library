package main;

public abstract class People {

	protected String name;
	protected int age;

	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public abstract void walksIn();

	public abstract void walksOut();

	public abstract void sits();

	// Getters and Setters

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
