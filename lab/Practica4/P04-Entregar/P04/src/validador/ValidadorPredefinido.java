package validador;

public class ValidadorPredefinido implements Validadores{

    private String[]  lista;

    public ValidadorPredefinido(String... lista){
        this.lista = lista;
    }


    @Override
    public boolean isValido(String word) {
        for (String valor : lista) {
            if (word.toLowerCase().equals(valor.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}
