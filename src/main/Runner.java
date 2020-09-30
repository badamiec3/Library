package main;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {

		Users studentAlice = new Users("Alice", 22, 567, false, new ArrayList<>());
		Librarians librarianJohn = new Librarians("John", 37, 234, false);
		Users userSally = new Users("Sally", 53, 1654, true, new ArrayList<>());

		System.out.println(userSally.getName());
		System.out.println(librarianJohn.getName());

		Items map = new Maps(40, 300, "1700's Map of Patagonia", 1754, "Patagonia");
		Items book = new Books(30, 20, "War and Peace", "Leo Tolstoy", 1225);
		Items cookbook = new Books(25, 5, "Cooking Basics for Dummies", " Bryan Miller", 464);
		Items sallyDiss = new Dissertations(20, 1, "Dissertation", "Chemistry");

		System.out.println(cookbook.getTitle());

		Library library = new Library();

		userSally.getItemsInPossession().add(sallyDiss);

		System.out.println(
				"The items in the possession of " + userSally.getName() + " are: " + userSally.getItemsInPossession());

		library.addItem(map);
		library.addItem(book);
		library.addItem(cookbook);

		System.out.println("The item(s) stored at the library is/are " + library.getItemsStored());

		library.registerLibrarian(librarianJohn);
		library.registerUser(userSally);
		library.registerUser(studentAlice);

		System.out.println("The registered librarian(s) is/are " + library.getRegisteredLibrarians());

		System.out.println("The registered user(s) is/are " + library.getRegisteredUsers());

		System.out.println("Alice is borrowing a cookbook.");

		library.checkOutItem(cookbook, studentAlice);

		System.out.println("The items in the possession of " + studentAlice.getName() + " are: "
				+ studentAlice.getItemsInPossession());
		System.out.println("The item(s) stored at the library is/are " + library.getItemsStored());

		System.out.println("Sally is submitting a dissertation.");
		userSally.getItemsInPossession().remove(sallyDiss);
		System.out.println(
				"The items in the possession of " + userSally.getName() + " are: " + userSally.getItemsInPossession());
		library.addItem(sallyDiss);
		System.out.println("The item(s) stored at the library is/are " + library.getItemsStored());

	}
}
