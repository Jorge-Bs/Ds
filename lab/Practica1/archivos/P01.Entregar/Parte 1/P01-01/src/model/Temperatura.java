package model;

public class Temperatura {

	private double celsius;
	private double fahrenhit;
	
	public Temperatura(double celsius) {
		this.celsius=celsius;
		setFahrenhit(celsius);
	}
	
	private void setFahrenhit(double celsius) {
		this.fahrenhit=celsius * 1.8 + 32;
	}

	public double getCelsius() {
		return celsius;
	}
	
	public double getFahrenhit() {
		return fahrenhit;
	}
}
