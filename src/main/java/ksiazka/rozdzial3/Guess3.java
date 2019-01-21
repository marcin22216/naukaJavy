package ksiazka.rozdzial3;
//Zgadywanka - wersja trzecia.
public class Guess3 {
    public static void main(String[] args)
        throws java.io.IOException {

        char ch, ag, answer = 'K', answer2 = 'Y';

        System.out.println("Aby zagrać potwierdź, że jesteś pełnoletni naciskając Y");

        ag = (char) System.in.read();

        if (ag == answer2) System.out.println("Zaczynamy");
        else System.out.println("Nie możesz zagrać, jesteś zbyt młody");

        System.out.println("Pomyślałem literę z przedziału od A do Z.");
        System.out.print("Spróbuj ją odgadnąć: ");

        ch = (char) System.in.read();

        if (ch == answer) System.out.println("**Dobrze!**");
        else {
            System.out.print("...Niestety, trafiłeś ");
            if (ch < answer) System.out.println("zbyt nisko");
            else System.out.println("za wysoko");
        }
    }
}
