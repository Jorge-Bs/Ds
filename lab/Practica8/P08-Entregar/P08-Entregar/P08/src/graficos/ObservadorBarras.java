package graficos;

import encuesta.Pregunta;

public class ObservadorBarras implements Observador {

    @Override
    public void actualizar(Pregunta pregunta) {
        System.out.println("Aquí se dibujaría el gráfico circular.");
    }
}
