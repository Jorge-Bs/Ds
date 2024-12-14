package model;

public class CategoriaNew implements Categoria {

	@Override
	public double getPrecio(Rental rental) {
		return rental.getDays() * 3;
	}

	@Override
	public int getPoints(Rental rental) {
		if(rental.getDays()>1) return 2;
		return 1;
	}

}
