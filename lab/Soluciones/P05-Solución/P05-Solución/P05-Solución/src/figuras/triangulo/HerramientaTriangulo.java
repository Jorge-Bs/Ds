package figuras.triangulo;

import java.awt.Point;

import editor.cambios.CambioCreacion;
import editor.core.*;

public class HerramientaTriangulo implements Herramienta {
    public HerramientaTriangulo(EditorWindow editor) {
        this.editor = editor;
    }

    public void mousePressed(int x, int y) {
        vertice[vertices++] = new Point(x, y);
        if (vertices == 3) {
            Figura figura = new Triangulo(vertice[0], vertice[1], vertice[2]);
            editor.getDibujo().addFigura(figura);
            editor.addCambio(new CambioCreacion(editor.getDibujo(), figura));
            vertices = 0;
            editor.finHerramienta();
        }
    }

    public void mouseMoved(int x, int y) {
        // No es necesario hacer nada
    }

    public void mouseReleased(int x, int y) {
        // No es necesario hacer nada
    }
    
   
    private int vertices = 0;
    private Point[] vertice = new Point[3];
    private EditorWindow editor;
    
	@Override
	public String toString() {
		return "Triángulo";
	}
}
