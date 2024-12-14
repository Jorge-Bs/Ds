package acciones;

import Macros.Grabador;

import java.util.regex.Pattern;

public class Reemplazar implements Accion {

    private String buscar;
    private String reemplazo;

    public Reemplazar(String buscar, String reemplazo, Grabador grabador) {
        this.buscar = buscar;
        this.reemplazo = reemplazo;
        if(grabador != null){
            grabador.suscribir(this);
        }
    }

    @Override
    public StringBuilder ejecutar(StringBuilder texto) {
        return texto = new StringBuilder(texto.toString().replaceAll(Pattern.quote(buscar), reemplazo));
    }
}
