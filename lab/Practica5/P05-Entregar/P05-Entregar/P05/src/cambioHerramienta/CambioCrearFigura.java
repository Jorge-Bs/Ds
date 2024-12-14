package cambioHerramienta;

import editor.core.Dibujo;
import editor.core.Figura;

public class CambioCrearFigura implements Cambio{
    private Dibujo d;
    private Figura f;


    public CambioCrearFigura(Dibujo d,Figura f){
        this.d=d;
        this.f=f;
    }



    @Override
    public void undo() {
        d.removeFigura(f);
    }

    @Override
    public void redo() {
        d.addFigura(f);
    }
}
