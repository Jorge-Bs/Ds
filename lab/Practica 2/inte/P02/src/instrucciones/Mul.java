package instrucciones;

import machine.Pila;
import machine.Wrapper;

public class Mul extends EjecutaInstruccion {

	@Override
	protected void doOperation(Wrapper wrap) {
		Pila pila = wrap.getPila();
		pila.push(pila.pop() * pila.pop());
	}
}
