package editor.core.herramientas;

import editor.core.Dibujo;
import editor.core.figuras.Vertice;

public interface Herramientas {
    public void registrarPinchar(Vertice vertice);

    public void registrarMover(Vertice vertice);

    public void registrarSoltar(Vertice vertice);

    public void establecerDibujo(Dibujo dibujo);

    public String obtenerNombre();
}
