package acciones;

import Macros.Grabador;

public class Insertar implements Accion{

    private String[] line;

    public Insertar(Grabador g, String ... lines){
        this.line = lines;
        if(g!=null){
            g.suscribir(this);
        }
    }


    @Override
    public StringBuilder ejecutar(StringBuilder texto) {
        for (int i = 1; i < line.length; i++) {
            texto.append(line[i] + " ");
        }
        return texto;
    }
}
