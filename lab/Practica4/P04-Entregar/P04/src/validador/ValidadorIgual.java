package validador;

public class ValidadorIgual implements Validadores{

    private int tamaño;

    public ValidadorIgual(int tamaño) {
        this.tamaño=tamaño;
    }

    @Override
    public boolean isValido(String word) {
        return  word.length()==tamaño;
    }
}
