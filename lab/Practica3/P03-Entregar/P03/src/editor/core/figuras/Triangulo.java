package editor.core.figuras;

public class Triangulo implements Figuras{

    private Vertice vertice1, vertice2, vertice3;



    public Triangulo(Vertice vertice1, Vertice vertice2, Vertice vertice3) {
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
    }

    @Override
    public void dibujar() {
        System.out.println("\t-Triangulo V1 [x= "+vertice1.getX()+" y= "+vertice1.getY()+"] V2 ["
                +"x= "+vertice2.getX()+" y= "+vertice2.getY()+"] V3 [x= "+vertice3.getX()+" y= "+vertice3.getY()+"]");
    }

    @Override
    public void mover() {

    }

    @Override
    public boolean contienePunto(Vertice vertice) {
        return false;
    }
}
