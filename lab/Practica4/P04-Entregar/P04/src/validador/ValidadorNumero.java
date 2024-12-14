package validador;

public class ValidadorNumero implements Validadores{



    @Override
    public boolean isValido(String word) {
        for (char ch : word.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }
}
