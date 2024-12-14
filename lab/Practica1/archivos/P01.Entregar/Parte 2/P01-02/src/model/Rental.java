package model;

public class Rental // Alquiler
{
	private Movie movie;
	private int days;

	public Rental(Movie movie, int days) {
		this.movie = movie;
		this.days = days;
	}

	public int getDays() {
		return days;
	}

	public Movie getMovie() {
		return movie;
	}

	/**
	 * @deprecated Use {@link model.Movie#getPoints(model.Rental)} instead
	 */
	int getPoints() {
		return movie.getPoints(this);
	}

	/**
	 * @deprecated Use {@link model.Movie#getPrice(model.Rental)} instead
	 */
	double getPrice() {
		return movie.getPrice(this);
	}
}
