package exercitii;

public class Problema8 {

    public static void main(String[] args) {

        boolean myBoolean;
        int numarDeVerificat = 70;
        int multiplu = 7;

        myBoolean = (numarDeVerificat%multiplu==0)?true:false;

        System.out.println(!myBoolean);

        if (myBoolean) System.out.println("Numarul dumneavoastra este multiplu de " + multiplu);
        else System.out.println("Numarul dumneavoastra nu este multiplu de " + multiplu);

    }

}
