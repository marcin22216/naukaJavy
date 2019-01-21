package ksiazka.rozdzial3;
//Wczytuje dane do momentu wprowadzenia litery "q"
public class Break2 {
    public static void main(String[] args)
        throws java.io.IOException {

        char ch;

        for (;;) {
            ch = (char) System.in.read();
            if (ch == 'q') break;
            System.out.println(ch);
        }
        System.out.println("Nacisnąłeś q!");
    }
}
