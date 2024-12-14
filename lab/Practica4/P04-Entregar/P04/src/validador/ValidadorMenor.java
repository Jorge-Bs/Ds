package validador;

public class ValidadorMenor implements Validadores{

    private int menor;

   public ValidadorMenor(int menor) {
       this.menor = menor;
   }

    @Override
    public boolean isValido(String word) {
        return Integer.parseInt(word) < menor;
    }
}
