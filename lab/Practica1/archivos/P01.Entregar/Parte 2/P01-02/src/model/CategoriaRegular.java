package model;

public class CategoriaRegular extends Category {

	@Override
	public double getPrecio(Rental rental) {
		double price = 2;
		if (rental.getDays() > 2)
			price += (rental.getDays() - 2) * 1.5;
		return price;
	}
	

}
