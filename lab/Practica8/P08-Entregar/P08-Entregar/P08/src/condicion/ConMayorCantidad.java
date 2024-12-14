package condicion;

import encuesta.Pregunta;
import graficos.Observador;

public class ConMayorCantidad implements Observador{

    private int cantidad;
    private Observador observador;

    public ConMayorCantidad(int cantidad, Observador observador) {
        this.cantidad=cantidad;
        this.observador=observador;
    }

    @Override
    public void actualizar(Pregunta pregunta) {
        if ((pregunta.getVotosNo()+ pregunta.getVotosSi()) >= cantidad){
            observador.actualizar(pregunta);
        }
    }
}
