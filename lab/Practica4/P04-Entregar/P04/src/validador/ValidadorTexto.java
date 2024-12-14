package validador;

public class ValidadorTexto implements Validadores{

    @Override
    public boolean isValido(String word) {
        for (char ch : word.toCharArray()) {
            if (!Character.isLetter(ch)) {
                return false;
            }
        }
        return true;
    }
}
