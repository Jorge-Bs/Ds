package validador;

public class ValidadorLongitud implements Validadores{

    private int longitud;

    public ValidadorLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public boolean isValido(String word) {
        return word.length() == longitud;
    }
}
