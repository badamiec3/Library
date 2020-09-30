package main;

import java.util.ArrayList;
import java.util.List;

public class Users extends People {

	private String name;
	private int age;
	private int memberForDays;
	private boolean isStudent;
	private List<Items> itemsInPossession;

	public Users(String name, int age, int memberForDays, boolean isStudent, List<Items> itemsInPossession) {

		super(name, age);
		this.memberForDays = memberForDays;
		this.isStudent = isStudent;
		this.itemsInPossession = itemsInPossession;
	}

	public boolean updateItemsInPossession(List<Items> itemsInPossession, Items borrowedItem) {
		return this.itemsInPossession.add(borrowedItem);

	}

	public void walksIn() {

		System.out.println("The library user has entered the library.");

	}

	public void walksOut() {

		System.out.println("The library user has left the library.");

	}

	public void sits() {

		System.out.println("The library user is sitting down.");

	}

	public int memberForMonths(int memberForDays) {
		int memberForMonths = (this.memberForDays) / 30;
		return memberForMonths;

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

	public int getMemberForDays() {
		return memberForDays;
	}

	public void setMemberForDays(int memberForDays) {
		this.memberForDays = memberForDays;
	}

	public boolean isStudent() {
		return isStudent;
	}

	public void setStudent(boolean isStudent) {
		this.isStudent = isStudent;
	}

	public List<Items> getItemsInPossession() {
		return itemsInPossession;
	}

	public void setItemsInPossession(List<Items> itemsInPossession) {
		this.itemsInPossession = itemsInPossession;
	}

}
