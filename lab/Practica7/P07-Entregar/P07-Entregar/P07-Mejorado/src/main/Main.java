package main;
import java.io.*;

import fileSystem.FileSystem;
import org.w3c.dom.css.Counter;
import outputs.*;

public class Main {

	public static void main(String[] args) throws IOException {

		FileSystem fs = new FileSystem();

		fs.copy("privado.txt", new NormalizadorOutput(new EncripterOutput(new FileOutput("copia.txt"))));
		fs.copy("privado.txt", new NormalizadorOutput(new EncripterOutput(new InternetOutput("1.1.1.1"))) );
		fs.copy("privado.txt", new BifurcadorOutput(new BluetoothOutput("iPhone"),new InternetOutput("12")));

		CounterOutput inicio;
		CounterOutput fin;

		fs.copy("privado.txt", fin=new CounterOutput(new NormalizadorOutput
				(new EncripterOutput(inicio=new CounterOutput(new FileOutput("copia.txt"))))));

		System.out.println("Inicio: " + inicio.getCounter());
		System.out.println("Fin: " + fin.getCounter());
	}

}
