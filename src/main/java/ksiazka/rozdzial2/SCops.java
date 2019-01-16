package ksiazka.rozdzial2;

//Demonstruje działanie operatorów warunkowych.

public class SCops {
    public static void main(String[] args) {
        int n, d, q;

        n = 10;
        d = 2;
        if (d != 0 && (n % d) == 0)
            System.out.println(d + " jest dzielnikiem " + n);

        d = 0;

        //Skoro d jest równe zero, wartość drugiego argumentu nie jest wyznaczana.
        if (d != 0 && (n % d) == 0)
            System.out.println(d + " jest dzielnikiem " + n);

        /*
        Teraz ta sama operacja z użyciem zwykłego operatora.
        Spowoduje bład dzielenia przez zero.
         */
        if (d != 0 & (n % d) == 0)
            System.out.println(d + " jest dzielnikiem " + n);
    }
}
