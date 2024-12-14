package machine;

public class Wrapper {
	Pila pila;

	Memoria memoria;
	
	int ip;
	
	public Wrapper(Pila pila,Memoria memoria,int ip) {
		this.pila=pila;
		this.memoria=memoria;
		this.ip=ip;
	}
	
	public Pila getPila() {
		return pila;
	}

	public Memoria getMemoria() {
		return memoria;
	}
	
	public void aumentarIp(int cantidad) {
		this.ip+=cantidad;
	}
	
	public void reducirIp(int cantidad) {
		this.ip-=cantidad;
	}
	
	public int getContador() {
		return ip;
	}
	
	public void setContador(int valor) {
		this.ip=valor;
	}
	
}
