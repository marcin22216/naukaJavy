package ksiazka.rozdzial3;
//Wykonuje pętlę do momentu wprowadzenia litery S.
public class ForTest {
    public static void main(String[] args)
        throws java.io.IOException {

        int i;

        System.out.println("Wprowadź S, aby zakończyć.");

        for (i = 0; (char) System.in.read() != 'S'; i++)
            System.out.println("Przebieg " + i);
    }
}
