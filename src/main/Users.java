package main;

import java.util.ArrayList;
import java.util.List;



public class Users extends People {
	
	private  String name;
	private int age;
	private int memberForDays;
	private boolean isStudent;
	
	private List<Items> itemsInPossession = new ArrayList<>();
	
	public Users(String name, int age, int memberForDays, boolean isStudent) {
		
		this.name = name;
		this.age = age;
		this.memberForDays = memberForDays;
		this.isStudent = isStudent;
		
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
		int memberForMonths = (this.memberForDays)/30;
		return memberForMonths;
		
	}
	
	

}
