package instrucciones;

import machine.Pila;
import machine.Wrapper;

public class Sub extends EjecutaInstruccion{

	@Override
	protected void doOperation(Wrapper wrap) {
		Pila pila = wrap.getPila();
		int b = pila.pop();
		int a = pila.pop();
		pila.push(a - b);
	}

}
