package ksiazka.rozdzial3;
//Zgadywanka
public class Guess {
    public static void main(String[] args)
        throws java.io.IOException {

        char ch, answer = 'K';

        System.out.println("Pomyślałem literę z przedziału od A do Z.");
        System.out.print("Spróbuj ją odgadnąć: ");

        ch = (char) System.in.read(); //Wczytywanie znaku z klawiatury.

        if (ch == answer) System.out.println("** Dobrze! **");

    }
}
