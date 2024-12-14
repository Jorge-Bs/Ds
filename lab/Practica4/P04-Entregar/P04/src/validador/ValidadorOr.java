package validador;

public class ValidadorOr implements Validadores{

    private Validadores[] validadores;

    public ValidadorOr(Validadores... validadores) {
        this.validadores = validadores;
    }



    @Override
    public boolean isValido(String word) {
        for (Validadores v : validadores) {
            if (v.isValido(word)) {return true;}
        }

        return false;
    }
}
