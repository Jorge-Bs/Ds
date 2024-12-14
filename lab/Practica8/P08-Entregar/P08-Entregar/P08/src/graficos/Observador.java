package graficos;

import encuesta.Pregunta;

public interface Observador {

    public void actualizar(Pregunta pregunta);
}
