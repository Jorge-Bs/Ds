package figuras.triangulo;

import java.awt.*;

import editor.core.Figura;

public class Triangulo implements Figura {

    private Point v1, v2, v3;

    public Triangulo(Point v1, Point v2, Point v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public void dibujar() {
        System.out.println("  - Triangulo: v1 = " + v1 + ", v2 = " + v2 + ", v3 = " + v3);
    }

    public boolean contiene(int x, int y) {

        Point posicion = new Point(x, y);
        return posicion.equals(v1) || posicion.equals(v2) || posicion.equals(v3);
    }

    public void mover(int dx, int dy) {
        v1.translate(dx, dy);
        v2.translate(dx, dy);
        v3.translate(dx, dy);
    }

    @Override
    public String toString() {
    	return "Triangulo: v1 = " + v1 + ", v2 = " + v2 + ", v3 = " + v3;
    }
}
