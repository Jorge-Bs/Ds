package instrucciones;

import machine.Pila;
import machine.Wrapper;

public class Push implements Instruccion {
	
	int parametro;
	
	public Push(int valor) {
		this.parametro=valor;
	}

	@Override
	public void operar(Wrapper wrap) {
		Pila pila = wrap.getPila();
		pila.push(parametro);
		wrap.aumentarIp(1);
	}

}
