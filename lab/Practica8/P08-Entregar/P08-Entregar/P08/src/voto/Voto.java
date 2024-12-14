package voto;

public class Voto {

    private int si =0;
    private int no =0;

    public void addVotoSi(){
        si++;
    }

    public void addVotoNo(){
        no++;
    }


    public int getSi() {
        return si;
    }

    public int getNo() {
        return no;
    }

    public int getCantidad(){
        return si+no;
    }

}
