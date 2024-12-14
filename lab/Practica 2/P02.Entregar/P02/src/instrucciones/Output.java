package instrucciones;

import machine.Pila;
import machine.Wrapper;

public class Output implements Instruccion {

	@Override
	public void operar(Wrapper wrap) {
		Pila pila = wrap.getPila();
		System.out.println(pila.pop());
		wrap.aumentarIp(1);
	}

}
