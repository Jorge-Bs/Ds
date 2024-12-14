package validador;

public class ValidadorAnd implements Validadores{

    private Validadores[] lista;

    public ValidadorAnd(Validadores... validadores) {
        this.lista = validadores;
    }

    @Override
    public boolean isValido(String word) {
        for (Validadores v : lista) {
            if(!v.isValido(word)) return false;
        }
        return true;
    }
}
