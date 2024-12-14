package condicion;

import encuesta.Pregunta;
import graficos.Observador;
import voto.Voto;

public class CadaLineas implements Observador {

    private int cantidad;
    private int contador=0;
    private Observador observer;

    public CadaLineas(int cantidad,Observador observer) {
        this.cantidad = cantidad;
        this.observer=observer;
    }

    @Override
    public void actualizar(Pregunta pregunta) {
        contador++;
        if(contador>cantidad){
            observer.actualizar(pregunta);
            contador=0;
        }
    }
}
