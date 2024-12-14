package cambioHerramienta;

import editor.core.Figura;

public class CambioMoverFigura implements Cambio{

    private Figura figura;
    private int dx,dy;

    public CambioMoverFigura(Figura figura, int dx, int dy){
        this.figura = figura;
        this.dx = dx;
        this.dy = dy;
    }

    @Override
    public void undo() {
        figura.mover(-dx, -dy);
    }

    @Override
    public void redo() {
        figura.mover(dx,dy);
    }
}
