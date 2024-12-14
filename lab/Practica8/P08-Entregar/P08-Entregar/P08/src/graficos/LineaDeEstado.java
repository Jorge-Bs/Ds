package graficos;

import encuesta.Pregunta;

public class LineaDeEstado implements Observador {

    @Override
    public void actualizar(Pregunta pregunta) {
        System.out.println("nº de votos SI = <x>.   nº de votos NO = <y>");
    }

}
