package editor.core.herramientas;

import editor.core.Dibujo;
import editor.core.figuras.Circulo;
import editor.core.figuras.Vertice;

public class HCirculo implements Herramientas{

    Vertice[] vertices = new Vertice[2];
    Dibujo dibujo;

    @Override
    public void registrarPinchar(Vertice vertice) {
        vertices[0] = vertice;
    }

    @Override
    public void registrarMover(Vertice vertice) {

    }

    @Override
    public void registrarSoltar(Vertice vertice) {
        vertices[1]=vertice;
        crearFigura();
    }

    private void crearFigura() {
        dibujo.addFigura(new Circulo(vertices[0], vertices[1]));
    }

    @Override
    public void establecerDibujo(Dibujo dibujo) {
        this.dibujo = dibujo;
    }

    @Override
    public String obtenerNombre() {
        return "Circulo: ";
    }
}
