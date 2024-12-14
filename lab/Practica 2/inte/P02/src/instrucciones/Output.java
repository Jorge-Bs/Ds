package instrucciones;

import machine.Pila;
import machine.Wrapper;

public class Output extends EjecutaInstruccion{

	@Override
	protected void doOperation(Wrapper wrap) {
		Pila pila = wrap.getPila();
		System.out.println(pila.pop());
	}

}
