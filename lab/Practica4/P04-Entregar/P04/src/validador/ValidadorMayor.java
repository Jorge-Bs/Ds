package validador;

public class ValidadorMayor implements Validadores{

    private int mayor;

    public ValidadorMayor(int mayor) {
        this.mayor = mayor;
    }

    @Override
    public boolean isValido(String word) {

        return Integer.parseInt(word) > mayor;
    }
}
