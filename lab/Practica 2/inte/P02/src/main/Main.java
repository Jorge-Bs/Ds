package main;
import java.io.*;
import machine.VirtualMachine;

public class Main {
	public static void main(String[] args) throws IOException {
		new VirtualMachine("programa.txt");
	}
}
