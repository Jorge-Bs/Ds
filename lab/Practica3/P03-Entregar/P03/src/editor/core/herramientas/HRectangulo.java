package editor.core.herramientas;

import editor.core.Dibujo;
import editor.core.figuras.Rectangulo;
import editor.core.figuras.Vertice;

import java.util.ArrayList;

public class HRectangulo implements  Herramientas{

    private final ArrayList<Vertice> vertices = new ArrayList<>();
    private Dibujo dibujo;

    @Override
    public void registrarPinchar(Vertice vertice) {
        vertices.add(vertice);
    }

    private void crearFigura() {
        if(vertices.size()==2){
            dibujo.addFigura(new Rectangulo(vertices.get(0), vertices.get(1)));
            vertices.clear();
        }
    }

    @Override
    public void registrarMover(Vertice vertice) {

    }

    @Override
    public void registrarSoltar(Vertice vertice) {
        vertices.add(vertice);
        crearFigura();
    }

    @Override
    public void establecerDibujo(Dibujo dibujo) {
        this.dibujo=dibujo;
    }

    @Override
    public String obtenerNombre() {
        return "Rectangulo";
    }
}
