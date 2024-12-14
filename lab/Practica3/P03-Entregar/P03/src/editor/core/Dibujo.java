package editor.core;

import editor.core.figuras.Figuras;
import editor.core.figuras.Vertice;

import java.util.ArrayList;
import java.util.List;

public class Dibujo {

    List<Figuras> figuras = new ArrayList<>();

    public void addFigura(Figuras figura) {
    	figuras.add(figura);
    }


    public void dibujar() {
       figuras.forEach(Figuras::dibujar);
    }

    public Figuras obtenerFigura(Vertice vertice) {
        for(int i= figuras.size()-1;i>=0;i--) {
            Figuras figura = figuras.get(i);
            if(figura.contienePunto(vertice)) {return figura;}
        }
        return null;
    }
}
