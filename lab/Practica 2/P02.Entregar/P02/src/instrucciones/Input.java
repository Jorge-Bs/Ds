package instrucciones;

import java.util.Scanner;

import machine.Pila;
import machine.Wrapper;

public class Input implements Instruccion {
	
	private  Scanner console = new Scanner(System.in);

	@Override
	public void operar(Wrapper wrap) {
		Pila pila = wrap.getPila();
		System.out.println("Escriba un entero:");
		pila.push(console.nextInt());
		wrap.aumentarIp(1);
	}

}
