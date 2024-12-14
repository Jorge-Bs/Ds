package instrucciones;

import machine.Memoria;
import machine.Pila;
import machine.Wrapper;

public class Store implements Instruccion {

	@Override
	public void operar(Wrapper wrap) {
		Pila pila = wrap.getPila();
		Memoria mem = wrap.getMemoria();
		
		int valor = pila.pop();
		int direccion = pila.pop();
		mem.setValor(direccion, valor);
		wrap.aumentarIp(1);
	}

}
