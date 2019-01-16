package ksiazka.rozdzial2;

//Demonstruję automatyczną konwersję typu long do double.

public class LtoD {

    public static void main(String[] args) {
        long L;
        double D;
        /*
        konwersja z long  do double jest możliwa,
        ponieważ liczba long mieści się w zaresie double.
         */
        L = 100123285L;
        D = L;

        System.out.println("L i D: " + L + " " + D);
    }

}
