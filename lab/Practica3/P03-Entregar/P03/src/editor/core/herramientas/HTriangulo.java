package editor.core.herramientas;

import editor.core.Dibujo;
import editor.core.figuras.Triangulo;
import editor.core.figuras.Vertice;

import java.util.ArrayList;
import java.util.List;

public class HTriangulo implements Herramientas {

    Dibujo dibujo;

    List<Vertice> lista = new ArrayList<Vertice>();

    @Override
    public void registrarPinchar(Vertice vertice) {
        lista.add(vertice);
        crearFigura();
    }

    private void crearFigura() {
        if(lista.size()==3){
            dibujo.addFigura(new Triangulo(lista.get(0), lista.get(1), lista.get(2)));
            lista.clear();
        }
    }

    @Override
    public void registrarMover(Vertice vertice) {

    }

    @Override
    public void registrarSoltar(Vertice vertice) {

    }

    @Override
    public void establecerDibujo(Dibujo dibujo) {
        this.dibujo = dibujo;
    }

    @Override
    public String obtenerNombre() {
        return "Triangulo";
    }
}
