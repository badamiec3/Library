package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Library {

	private List<Librarians> registeredLibrarians = new ArrayList<>();

	private List<Users> registeredUsers = new ArrayList<>();

	private List<Items> itemsStored = new ArrayList<>();
	
	public Library() {
		super();
		this.registeredLibrarians = registeredLibrarians;
		this.registeredUsers = registeredUsers;
		this.itemsStored = itemsStored;
	}

	public boolean checkInItem(Items returnedItem, Users user) {
		user.getItemsInPossession().remove(returnedItem);
		return this.itemsStored.add(returnedItem);

	}

	public boolean checkOutItem(Items borrowedItem, Users user) {
		user.getItemsInPossession().add(borrowedItem);
		return this.itemsStored.remove(borrowedItem);

	}

	public boolean addItem(Items newItem) {
		return this.itemsStored.add(newItem);

	}

	public boolean removeItem(Items toremoveItem) {
		return this.itemsStored.remove(toremoveItem);

	}

	public Items updateItem(Items item, int size, int ageOfItem, String title) {
		item.setSize(size);
		item.setAgeOfItem(ageOfItem);
		item.setTitle(title);
		return item;

	}

	public boolean registerUser(Users user) {
		return this.registeredUsers.add(user);

	}

	public boolean deleteUser(Users user) {
		return this.registeredUsers.remove(user);

	}

	public boolean registerLibrarian(Librarians librarian) {
		return this.registeredLibrarians.add(librarian);

	}

	public boolean deleteLibrarian(Librarians librarian) {
		return this.registeredLibrarians.remove(librarian);

	}

	public People updatePerson(People person, String name, int age) {
		person.setName(name);
		person.setAge(age);
		return person;

	}

	// Getters and Setters

	public List<Librarians> getRegisteredLibrarians() {
		return registeredLibrarians;
	}

	public void setRegisteredLibrarians(List<Librarians> registeredLibrarians) {
		this.registeredLibrarians = registeredLibrarians;
	}

	public List<Users> getRegisteredUsers() {
		return registeredUsers;
	}

	public void setRegisteredUsers(List<Users> registeredUsers) {
		this.registeredUsers = registeredUsers;
	}

	public List<Items> getItemsStored() {
		return itemsStored;
	}

	public void setItemsStored(List<Items> itemsStored) {
		this.itemsStored = itemsStored;
	}
}
