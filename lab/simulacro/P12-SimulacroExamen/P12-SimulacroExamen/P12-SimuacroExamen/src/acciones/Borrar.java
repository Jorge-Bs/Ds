package acciones;

import Macros.Grabador;

public class Borrar implements Accion {


    public Borrar(Grabador g){
        if(g != null){
            g.suscribir(this);
        }
    }


    @Override
    public StringBuilder ejecutar(StringBuilder texto) {
        int indexOfLastWord = texto.toString().trim().lastIndexOf(" ");
        if (indexOfLastWord == -1)
            texto = new StringBuilder("");
        else
            texto.setLength(indexOfLastWord + 1);

        return texto;
    }
}
