package javalanguageplayground.manager;

import java.util.ArrayList;
import java.util.List;

import javalanguageplayground.beans.Book;
import javalanguageplayground.beans.Film;
import javalanguageplayground.beans.Item;

public class ItemManager {

	public List<Item> getAll() {

		List<Item> items = new ArrayList<Item>();

		items.add(new Book("1984", "George Orwell", null));
		items.add(new Book("Brave New World", "AlDoUs HuxLEY", null));
		items.add(new Book("Neuromancer", "William Gibson", null));
		items.add(new Film("Blade Runner", "Ridley Scott", "Harrison Ford"));
		items.add(new Film("The Matrix", "The Wachowkis", "Keanu Reeves"));
		items.add(new Film("Star Wars", "George Lucas", "Mark Hamill"));

		return items;
	}

}
