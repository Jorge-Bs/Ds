package model;

public abstract class Category implements Categoria{

	public int getPoints(Rental rental) {
		return 1;
	}
}
