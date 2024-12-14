package model;

public class CategoriaChildren extends Category {

	@Override
	public double getPrecio(Rental rental) {
		double price =1.5;
		if (rental.getDays() > 3)
			price += (rental.getDays() - 3) * 1.5;
		return price;
	}

}
