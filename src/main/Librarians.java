package main;

public class Librarians extends People {

	private String name;
	private int age;
	private int employeeForDays;
	private boolean isManagement;
	
	

	public Librarians(String name, int age, int employeeForDays, boolean isManagement) {
		this.name = name;
		this.age = age;
		this.employeeForDays = employeeForDays;
		this.isManagement = isManagement;

	}

	public void walksIn() {

		System.out.println("The librarian has entered the library.");

	}

	public void walksOut() {

		System.out.println("The librarian has left the library.");

	}

	public void sits() {

		System.out.println("The librarian is sitting down.");

	}

	public int employeeForMonths(int employeeForDays) {
		int employeeForMonths = (this.employeeForDays) / 30;
		return employeeForMonths;

	}

	// Getters and Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getEmployeeForDays() {
		return employeeForDays;
	}

	public void setEmployeeForDays(int employeeForDays) {
		this.employeeForDays = employeeForDays;
	}

	public boolean isManagement() {
		return isManagement;
	}

	public void setManagement(boolean isManagement) {
		this.isManagement = isManagement;
	}

}
