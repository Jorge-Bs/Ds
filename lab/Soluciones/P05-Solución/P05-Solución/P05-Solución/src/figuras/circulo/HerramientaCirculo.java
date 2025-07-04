package figuras.circulo;

import java.awt.Point;

import editor.core.*;
import editor.herramientas.HerramientaCreacion;

public class HerramientaCirculo extends HerramientaCreacion {

    public HerramientaCirculo(EditorWindow editor) {
        super(editor);
    }

    protected Figura doCreaFigura(Point inicio, Point fin) {
        Point centro = new Point((inicio.x + fin.x) / 2, (inicio.y + fin.y) / 2);
        int radio = Math.max(fin.x - inicio.x, fin.y - inicio.y) / 2;
        return new Circulo(centro, radio);
    }

	@Override
	public String toString() {
		return "Círculo";
	}
    
}
