package exercitii;

public class Problema3 {
    public static void main(String[] args) {

        int a = 10;
        int b = 17;
        System.out.println(a&b); //Se convertesc numerele intregi in baza 2. => a=1010, b=10001 => se compara bitii de pe fiecare pozitie cu operatorul "si" => rezultatul este 00000
        System.out.println(a|b); //Se convertesc numerele intregi in baza 2. => a=1010, b=10001 => se compara bitii de pe fiecare pozitie cu operatorul "sau" => rezultatul este 11011 adica 27

    }
}
