package editor.core.figuras;

public class Rectangulo implements Figuras {

    private Vertice esquinaSup;
    private Vertice esquinaInf;


    @Override
    public void dibujar() {
        StringBuilder sb = new StringBuilder();
        sb.append("\t-Rectangulo: ");
        sb.append("x= ").append(esquinaSup.getX());
        sb.append(", y= ").append(esquinaSup.getY());
        sb.append(", ancho= ").append(esquinaInf.getX() - esquinaSup.getX());
        sb.append(", alto= ").append(esquinaInf.getY() - esquinaSup.getY());
        System.out.println(sb.toString());
    }

    @Override
    public void mover() {

    }

    @Override
    public boolean contienePunto(Vertice vertice) {
        boolean pinchado = (esquinaSup.getX() <= vertice.getX() && vertice.getX() <= esquinaSup.getX() +
                (esquinaInf.getX() - esquinaSup.getX()))
                && (esquinaSup.getY() <= vertice.getY() && vertice.getY() <= esquinaSup.getY()
                + (esquinaInf.getY() - esquinaSup.getY()));
        return pinchado;
    }

    public Rectangulo(Vertice superior,Vertice inf) {
        this.esquinaSup = superior;
        this.esquinaInf = inf;
    }
}
