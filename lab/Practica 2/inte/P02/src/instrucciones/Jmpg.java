package instrucciones;

import machine.Pila;
import machine.Wrapper;

public class Jmpg implements Instruccion {
	
	int valor;
	
	public Jmpg(int valor) {
		this.valor=valor;
	}

	@Override
	public void operar(Wrapper wrap) {
		Pila pila = wrap.getPila();
		int b = pila.pop();
		int a = pila.pop();
		if (a > b)
			wrap.setContador(valor);
		else
			wrap.aumentarIp(1);
	}

}
