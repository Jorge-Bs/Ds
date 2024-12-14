package Macros;

import acciones.Accion;

import java.util.ArrayList;
import java.util.List;

public class Grabador implements Accion {

    private List<Accion> lista = new ArrayList<>();

    private String name;

    public Grabador(String name){
        this.name = name;
    }

    public void suscribir(Accion accion){
        lista.add(accion);
    }

    public StringBuilder ejecutar(StringBuilder texto){
        StringBuilder resultado = texto;
        for(Accion accion : lista){
            resultado = accion.ejecutar(resultado);
        }
        return resultado;
    }


    public String obtenerNombre(){
        return name;
    }
}
