package instrucciones;

import machine.Pila;
import machine.Wrapper;

public class Mul implements Instruccion {

	@Override
	public void operar(Wrapper wrap) {
		Pila pila = wrap.getPila();
		pila.push(pila.pop() * pila.pop());
		wrap.aumentarIp(1);
	}

}
