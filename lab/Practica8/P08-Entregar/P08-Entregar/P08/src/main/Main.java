package main;
import java.io.*;

import condicion.CadaLineas;
import condicion.ConMayorCantidad;
import encuesta.*;
import graficos.LineaDeEstado;
import graficos.ObservadorBarras;
import graficos.ObservadorCircular;

public class Main {

	public static void main(String[] args) throws IOException {
		//Pregunta encuesta = new Pregunta("¿Está a favor de la energia nuclear?");

		Pregunta encuesta = new Pregunta("pregunta",
				new CadaLineas(3,new ObservadorBarras()),
				new ConMayorCantidad(2,new ObservadorCircular()));

		TextUserInterface userInterface = new TextUserInterface();
		userInterface.rellena(encuesta);
	}

}

