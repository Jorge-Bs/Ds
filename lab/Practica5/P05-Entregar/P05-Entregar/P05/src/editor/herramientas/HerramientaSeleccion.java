package editor.herramientas;

import java.awt.Point;

import cambioHerramienta.CambioMoverFigura;
import editor.core.*;

public class HerramientaSeleccion implements Herramienta {

    private EditorWindow editor;

    private Figura seleccionada;
    private Point lastPosition;

    public HerramientaSeleccion(EditorWindow editor) {
        this.editor = editor;
    }

    public void mousePressed(int x, int y) {
        seleccionada = editor.getDibujo().getFigura(x, y);
        lastPosition = new Point(x, y);
    }

    public void mouseMoved(int x, int y) {
        mueveIncremento(x, y);
    }

    public void mouseReleased(int x, int y) {
        mueveIncremento(x, y);
        seleccionada = null;
    }

    private void mueveIncremento(int x, int y) {
        if (seleccionada != null) {
            int dx = x - lastPosition.x;
            int dy = y - lastPosition.y;
            seleccionada.mover(dx, dy);
            editor.addCambio(new CambioMoverFigura(seleccionada, dx, dy));
            lastPosition = new Point(x, y);
        }
    }

	@Override
	public String toString() {
		if (seleccionada != null)
			return "Selección" + "->" + seleccionada;
		return "Selección";
	}
    
}
