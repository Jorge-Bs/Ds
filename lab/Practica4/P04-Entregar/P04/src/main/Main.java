package main;

import formulario.CampoValor;
import formulario.Formulario;
import validador.*;

public class Main {

	public static void main(String[] args) {
		Formulario formulario = new Formulario();


		formulario.addCampo(new CampoValor("Nombre",new ValidadorTexto()));
		formulario.addCampo(new CampoValor("Apellido",new ValidadorTexto()));
		formulario.addCampo(new CampoValor("Numero",new ValidadorNumero()));
		formulario.addCampo(new CampoValor("Edad",new ValidadorNumero()));
		formulario.addCampo(new CampoValor("Ubicación",new ValidadorOr(new ValidadorPredefinido("Ciudad", "Santander", "Oviedo", "Cádiz"),
				new ValidadorAnd(new ValidadorTexto(),new ValidadorLongitud(5)))));

		formulario.addCampo(new CampoValor("Código de Producto", new ValidadorLongitud(4)));

		formulario.addCampo(new CampoValor("Código de Promocion",
				new ValidadorOr(new ValidadorTexto(), new ValidadorAnd(new ValidadorNumero(), new ValidadorLongitud(3)))));

		formulario.addCampo(new CampoValor("Sueldo",new ValidadorAnd(new ValidadorNumero(),new ValidadorMayor(800),new ValidadorMenor(1200))));
		formulario.PideDatos();
		formulario.escribeFormulario();
	}
}
