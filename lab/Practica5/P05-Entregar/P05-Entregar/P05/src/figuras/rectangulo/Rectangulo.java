package figuras.rectangulo;

import java.awt.Point;

import editor.core.Figura;

public class Rectangulo implements Figura {

    private Point esquina;
    private int ancho;
    private int alto;

    public Rectangulo(Point esquina, int ancho, int alto) {
        this.esquina = new Point(esquina);
        this.ancho = ancho;
        this.alto = alto;
    }

    public Rectangulo(Point inicio, Point fin) {
        this(inicio, fin.x - inicio.x, fin.y - inicio.y);
    }

    public void dibujar() {
        System.out.println(
                "  - Rectangulo: x = " + esquina.x + ", y = " + esquina.y + ", ancho = " + ancho + ", alto = " + alto);
    }

    public boolean contiene(int x, int y) {
        return (esquina.x <= x && x <= esquina.x + ancho) && (esquina.y <= y && y <= esquina.y + alto);
    }

    public void mover(int dx, int dy) {
        esquina.translate(dx, dy);
    }

    @Override
    public String toString() {
    	return "Rectangulo: x = " + esquina.x + ", y = " + esquina.y + ", ancho = " + ancho + ", alto = " + alto;
    }
}
