package instrucciones;

import machine.Wrapper;

public class Jmp implements Instruccion {
	
	int valor;
	
	public Jmp(int valor) {
		this.valor=valor;	
	}

	@Override
	public void operar(Wrapper wrap) {
		wrap.setContador(valor);
	}

}
