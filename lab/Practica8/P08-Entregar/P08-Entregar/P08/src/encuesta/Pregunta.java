package encuesta;

import graficos.Observador;
import voto.Voto;

public class Pregunta {

	private Voto voto = new Voto();
	private String pregunta;
	private Observador[] observadors;

	public Pregunta(String pregunta,Observador... observadors) {
		this.pregunta = pregunta;
		this.observadors = observadors;
	}

	public String getPregunta() {
		return pregunta;
	}

	public int getVotosSi() {
		return voto.getSi();
	}

	public int getVotosNo() {
		return voto.getNo();
	}

	public void incrementaSi() {
		voto.addVotoSi();
		actualizar();
	}

	public void incrementaNo() {
		voto.addVotoNo();
		actualizar();
	}

	private void actualizar() {
        for (Observador observador : observadors) {
            observador.actualizar(this);
        }
		hacerBackup();
	}


	// Parte de representar los datos
	private void actualizaGráficoCircular() {
		System.out.println("Aquí se dibujaría el gráfico circular.");
	}

	private void actualizaGráficoBarras() {
		System.out.println("Aquí se dibujaría el gráfico de barras.");
	}

	private void hacerBackup() {
		System.out.println("Aquí se guardarían los datos en disco/BD.");
	}

}
