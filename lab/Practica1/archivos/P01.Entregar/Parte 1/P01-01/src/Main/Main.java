package Main;

import model.Temperatura;

public class Main {

	public static void main(String[] args) {
		Temperatura[] temperaturas = new Temperatura[100];

		// Toma de datos
		for (int i = 0; i < temperaturas.length; i++)
			temperaturas[i] = new Temperatura(leeSensorCelsius());

		// Cálculo con los datos en Celsius
		double mediaCelsius = getMediaCelsius(temperaturas);
//		for (int i = 0; i < temperaturas.length; i++)
//			mediaCelsius += temperaturas[i];
//		mediaCelsius = mediaCelsius / temperaturas.length;
		System.out.println(mediaCelsius);

		// Cálculo con los datos en Fahrenheit
		double mediaFahrenheit = getMediaFahrenheit(temperaturas);
//		for (int i = 0; i < temperaturas.length; i++)
//			mediaFahrenheit += temperaturas[i] * 1.8 + 32;
//		mediaFahrenheit = mediaFahrenheit / temperaturas.length;
		System.out.println(mediaFahrenheit);

		// Otro cálculo con los datos en Fahrenheit
		double varianza = getVarianza(temperaturas, mediaFahrenheit);
//		for (int i = 0; i < temperaturas.length; i++)
//			varianza += Math.pow((temperaturas[i] * 1.8 + 32) - mediaFahrenheit, 2);
//		varianza = varianza / temperaturas.length;
		System.out.println(varianza);
	}
	
	public static double getMediaCelsius(Temperatura[] temperaturas) {
		double mediaCelsius = 0;
		for (int i = 0; i < temperaturas.length; i++)
			mediaCelsius += temperaturas[i].getCelsius();
		mediaCelsius = mediaCelsius / temperaturas.length;
		return mediaCelsius;
	}
	
	public static double getMediaFahrenheit(Temperatura[] temperaturas) {
		double mediaFahrenheit = 0;
		for (int i = 0; i < temperaturas.length; i++)
			mediaFahrenheit += temperaturas[i].getFahrenhit();
		mediaFahrenheit = mediaFahrenheit / temperaturas.length;
		return mediaFahrenheit;
	}
	
	public static double getVarianza(Temperatura[] temperaturas, double mediaFahrenheit) {
		double varianza = 0;
		for (int i = 0; i < temperaturas.length; i++)
			varianza += Math.pow((temperaturas[i].getFahrenhit()) - mediaFahrenheit, 2);
		varianza = varianza / temperaturas.length;
		return varianza;
	}

	public static double leeSensorCelsius() {
		return Math.random() * 30;
	}
}
