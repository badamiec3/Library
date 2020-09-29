package main;

import java.util.ArrayList;
import java.util.List;



public class Library {

	private List<People> registeredUsers = new ArrayList<>();

	private List<Items> itemsStored = new ArrayList<>();

	public boolean checkInItem(Items returnedItem) {
		return this.itemsStored.add(returnedItem);

	}
	
	public boolean checkOutItem(Items borrowedItem) {
		return this.itemsStored.remove(borrowedItem);

	}
	
	public boolean addItem(Items newItem) {
		return this.itemsStored.add(newItem);

	}
	
	public boolean removeItem(Items toremoveItem) {
		return this.itemsStored.remove(toremoveItem);

	}
	

	public void updateItemAge(Items item) {
		//int initAge =  ;
		//int updatedAge = 
		

	}

}
