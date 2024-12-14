package instrucciones;

import machine.Pila;
import machine.Wrapper;

public class Push extends EjecutaInstruccion {
	
	int parametro;
	
	public Push(int valor) {
		this.parametro=valor;
	}

	@Override
	protected void doOperation(Wrapper wrap) {
		Pila pila = wrap.getPila();
		pila.push(parametro);
	}

}
