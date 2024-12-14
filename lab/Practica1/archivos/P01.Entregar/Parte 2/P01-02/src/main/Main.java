package main;

import model.CategoriaChildren;
import model.CategoriaNew;
import model.CategoriaRegular;
import model.Customer;
import model.Movie;
import model.Rental;

public class Main {

	public static void main(String[] args) {

		Customer raul = new Customer("Raúl");

		Movie hotFuzz = new Movie("Hot Fuzz", new CategoriaNew());
		Movie toyStory = new Movie("Toy Story", new CategoriaChildren());
		Movie zombiesParty = new Movie("Zombies Party", new CategoriaRegular());

		raul.addRental(new Rental(hotFuzz, 2));
		raul.addRental(new Rental(toyStory, 6));
		raul.addRental(new Rental(zombiesParty, 8));

		System.out.println(raul.status());

	}
}
