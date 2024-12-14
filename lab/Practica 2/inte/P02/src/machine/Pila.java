package machine;

public class Pila {
	private static int[] pila;
	private static int sp = 0;
	
	public Pila(int value) {
		pila= new int[value];
	}
	
	public void push(int valor) {
		pila[sp] = valor;
		sp++;
	}

	public int pop() {
		sp--;
		return pila[sp];
	}
}
