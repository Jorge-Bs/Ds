package machine;

public class Memoria {

	private int[] memoria = new int[1024];
	
	public int getValor(int index){
		return memoria[index];
	}
	
	public void setValor(int index,int valor){
		memoria[index]=valor;
	}
}
