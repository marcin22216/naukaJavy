package ksiazka.rozdzial3;
//Zgadywanka - wersja druga.
public class Guess2 {
    public static void main(String[] args)
        throws java.io.IOException {

        char ch, answer = 'K';

        System.out.println("pomyślałem literę z przedziału od A do Z.");
        System.out.print("Spróbuj ją odgadnąć: ");

        ch = (char) System.in.read();

        if (ch == answer) System.out.println("**Dobrze!**");
        else System.out.println("...Niestety, nie trafiłeś.");
    }
}
