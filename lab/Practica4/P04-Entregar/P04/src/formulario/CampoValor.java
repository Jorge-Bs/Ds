package formulario;

import validador.Validadores;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CampoValor implements Campo{

    protected String etiqueta;
    protected String texto;
    protected Validadores validador;

    public CampoValor(String etiqueta, Validadores validador) {
        this.etiqueta = etiqueta;
        this.validador = validador;
    }

    @Override
    public void pideDato() {
        BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));

        boolean valido;
        do {
            valido = true;
            try {
                System.out.print(etiqueta + ": ");
                texto = consola.readLine();

                valido = validador.isValido(texto);
            } catch (IOException ex) {
                System.out.println(ex);
            }
        } while (!valido);
    }

    @Override
    public  String getDato(){
        return texto;
    }

    @Override
    public String getEtiqueta() {
        return etiqueta;
    }


}
