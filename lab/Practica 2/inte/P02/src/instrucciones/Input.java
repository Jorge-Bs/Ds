package instrucciones;

import java.util.Scanner;

import machine.Pila;
import machine.Wrapper;

public class Input extends EjecutaInstruccion{
	
	private final Scanner console = new Scanner(System.in);

	@Override
	protected void doOperation(Wrapper wrap) {
		Pila pila = wrap.getPila();
		System.out.println("Escriba un entero:");
		pila.push(console.nextInt());
	}

}
