package editor.core.figuras;

public class Circulo implements Figuras{

    private final Vertice pinchar;

    private final int radio;

    public Circulo(Vertice pinchar, Vertice soltar) {
        this.pinchar = pinchar;
        radio = (int) Math.sqrt(Math.pow((soltar.getX()-pinchar.getX()),2)+Math.pow((soltar.getY()-pinchar.getY()),2));
    }

    @Override
    public void dibujar() {
        System.out.println("\t-Circulo: x=" + pinchar.getX() + ", y=" + pinchar.getY() + ", radio=" + radio);
    }

    @Override
    public void mover() {
    }

    @Override
    public boolean contienePunto(Vertice vertice) {
        double distancia = Math.sqrt(Math.pow(vertice.getX() - pinchar.getX(), 2)
                + Math.pow(vertice.getY() -pinchar.getY(), 2));
        return  distancia < radio;
    }
}
