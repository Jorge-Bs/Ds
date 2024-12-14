package machine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import instrucciones.*;


public class VirtualMachine {
	
	
	private final List<String[]> instrucciones = new ArrayList<>();


    private final Wrapper wrap;
	
	public VirtualMachine(String archivo) throws IOException {
		cargarInstrucciones(archivo);
        Pila pila = new Pila(32);
        Memoria memoria = new Memoria();
        this.wrap= new Wrapper(pila, memoria,0);
		ejecutaPrograma();
	}
	
	private void cargarInstrucciones(String file) throws IOException {
		BufferedReader fichero = new BufferedReader(new FileReader(file));

		String linea;
		while ((linea = fichero.readLine()) != null)
			cargaInstruccion(linea);
		fichero.close();
	}
	
	private  void cargaInstruccion(String linea) {
		if (linea.trim().isEmpty())
			return;

		String[] palabras = linea.split(" ");
        instrucciones.add(palabras);
	}
	
	private  void ejecutaPrograma() {
		while (wrap.getContador() < instrucciones.size()) {
			String[] instruccion = instrucciones.get(wrap.getContador());
			
			Instruccion in = switch (instruccion[0]) {
                case "push" -> new Push(Integer.parseInt(instruccion[1]));
                case "add" -> new Add();
                case "sub" -> new Sub();
                case "mul" -> new Mul();
                case "jmp" -> new Jmp(Integer.parseInt(instruccion[1]));
                case "jmpg" -> new Jmpg(Integer.parseInt(instruccion[1]));
                case "load" -> new Load();
                case "store" -> new Store();
                case "input" -> new Input();
                case "output" -> new Output();
                default -> null;
            };

            if(in!=null)in.operar(wrap);
		}
	}
}
