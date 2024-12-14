package editor.core.herramientas;

import editor.core.Dibujo;
import editor.core.figuras.Vertice;

public class HSeleccion implements Herramientas{

    Dibujo dibujo;

    @Override
    public void registrarPinchar(Vertice vertice) {
        dibujo.obtenerFigura(vertice).dibujar();
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
        return "Seleccion";
    }
}
