package instrucciones;

import machine.Memoria;
import machine.Pila;
import machine.Wrapper;

public class Load extends EjecutaInstruccion {

	@Override
	protected void doOperation(Wrapper wrap) {
		Pila pila = wrap.getPila();
		Memoria mem = wrap.getMemoria();

		int direccion = pila.pop();
		pila.push(mem.getValor(direccion));
	}

}
